import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { AccessToken } from '../models/accessToken.model';

@Injectable({
  providedIn: 'root'
})
export class ZoomService {
  
  private url = environment.baseUrl;

  constructor(private http: HttpClient) { }

  getAccessToken(code:string) {
    return this.http.get(this.url+'/api/access-token/' + code);
  }

  getUserDetails(accessToken:string) {
    return this.http.get(this.url+'/user/me/' + accessToken);
  }

  getMeetingDetails(accessToken:string) {
    return this.http.get(this.url+'/meeting/scheduled/' + accessToken);
  }

  createMeeting(meeting:any, accessToken:string) {
    return this.http.post(this.url+'/meeting/create/' + accessToken, meeting);
  }
}
