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

  getAccessToken(code:string): string{
      this.http.get<AccessToken>(this.url+'/api/access-token/' + code).subscribe(data =>{
        console.log(data);
      });
      return 'null';
  }

}
