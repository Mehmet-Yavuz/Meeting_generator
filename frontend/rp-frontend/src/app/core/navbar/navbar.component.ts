import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ZoomService } from 'src/app/services/zoom.service';
import { environment } from 'src/environments/environment';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  loggedIn = false;

  constructor(private route:ActivatedRoute, private zoomService:ZoomService, private http: HttpClient) { }

  ngOnInit(): void {
    this.route.queryParams.subscribe(params => {
      if(params['code'] != null){
        this.loggedIn = true;
        this.zoomService.getAccessToken(params['code']);
      }
    })
  }

  redirect(): void{
    window.location.href = "https://zoom.us/oauth/authorize?response_type=code&client_id="+ environment.clientId +"&redirect_uri="+ environment.redirectUrl;
  }
}
