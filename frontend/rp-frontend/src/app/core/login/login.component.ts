import { HttpClient } from '@angular/common/http';
import { Component, OnInit, TestabilityRegistry } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ZoomService } from 'src/app/services/zoom.service';
import { environment } from 'src/environments/environment';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  url:string = '';
  constructor(private route:ActivatedRoute, private zoomService:ZoomService, private http: HttpClient) { }

  ngOnInit(): void {
  }

  redirect(): void {
    console.log(this.url);
    window.location.href= this.url;
  }

  test(): void {
    console.log("tabiii");
    console.log(this.zoomService.getAccessToken);
  }
}
