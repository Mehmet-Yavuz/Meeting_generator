import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { User } from '../models/user.model';
import { AccessToken } from '../models/accessToken.model';

@Injectable({
  providedIn: 'root'
})
export class ZoomService {
  
  private url = environment.baseUrl;

  constructor(private http: HttpClient) { }

  getAccessToken(code:string): Observable<AccessToken>{
     return this.http.get<AccessToken>(this.url+'/api/access-token/' + code);
  }

}
