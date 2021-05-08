import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AccessToken } from '../models/accessToken.model';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ZoomService {
  
  constructor(private http: HttpClient) { }

  //postTokenRequest(code:any): Observable<any> {
    //let url: string = 'https://zoom.us/oauth/token?grant_type=authorization_code&code=' + code + '&redirect_uri=' + environment.redirectURL;
    //return this.http.post<AccessToken>(url,);
  //}

  getAccessToken(): Observable<any>{
    return this.http.get<any>('localhost:8080/auth/token');
  }
}
