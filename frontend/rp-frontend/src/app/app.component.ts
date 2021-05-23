import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ZoomService } from './services/zoom.service';
import { environment } from 'src/environments/environment';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Meeting } from './models/meeting.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'Proof of Concept Mehmet';
  loggedIn = false;
  bodyNotNull = false;
  meetingNotNull = false;
  meetingsNotNull = false;

  accessToken: any;
  postMeeting: any;
  body: any;
  meeting: any;
  meetings: any;
  JSONResponse: any;
  meetingJSONResponse: any;
  meetingsJSONResponse: any;

  form: FormGroup;

  constructor(private route:ActivatedRoute, private zoomService:ZoomService) { 
    this.form = new FormGroup({
      'topic' : new FormControl(null, [Validators.required, Validators.maxLength(200)]),
      'description' : new FormControl(null),
      'when1' : new FormControl(null, [Validators.required]),
      'when2' : new FormControl(null, [Validators.required]),
      'duration' : new FormControl(null, [Validators.required]),
      'security' : new FormControl(null, [Validators.required]),
    })
  }

  ngOnInit(): void {
    this.route.queryParams.subscribe(params => {
      if(params['code'] != null){
        this.zoomService.getAccessToken(params['code']).subscribe(data => {
          console.log(data);
          this.accessToken = data;
        });

        this.loggedIn = true;
      }
    })
  }

  redirect(): void {
    window.location.href = "https://zoom.us/oauth/authorize?response_type=code&client_id="+ environment.clientId +"&redirect_uri="+ environment.redirectUrl;
  }

  retrieveUserInfo(): void {
    if(this.accessToken != null) {
      this.zoomService.getUserDetails(this.accessToken.access_token).subscribe(data => {
        this.body = data;
        this.fillUserInfo();
      });
    }
  }

  fillUserInfo(): void {
    if(this.body != null) {
      this.JSONResponse = JSON.stringify(this.body, null, 2);
      this.bodyNotNull = true;
    }
  }

  retrieveMeetingInfo(): void {
    if(this.accessToken != null) {
      this.zoomService.getMeetingDetails(this.accessToken.access_token).subscribe(data => {
        this.meetings = data;
        this.fillMeetingsInfo();
      });
    }
  }

  fillMeetingsInfo(): void {
    if(this.meetings != null) {
      this.meetingsJSONResponse = JSON.stringify(this.meetings, null, 2);
      this.meetingsNotNull = true;
    }
  }

  createMeeting(form: FormGroup): void {
    if(this.accessToken != null) {
      this.postMeeting = new Meeting(
        form.value.topic,
        form.value.description,
        form.value.when1 + "T" + form.value.when2 + ":00Z",
        form.value.duration,
        form.value.security,
      );
      this.zoomService.createMeeting(this.postMeeting, this.accessToken.access_token).subscribe(data => {
        this.meeting = data;
        this.fillMeetingInfo();
      });
    }
  }

  fillMeetingInfo(): void {
    if(this.meeting != null) {
      this.meetingJSONResponse = JSON.stringify(this.meeting, null, 2);
      this.meetingNotNull = true;
    }
  }
}
