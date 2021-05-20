import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './core/navbar/navbar.component';
import { CreateMeetingComponent } from './feature/create-meeting/create-meeting.component';
import { LoginComponent } from './core/login/login.component';
import { HttpClientModule } from '@angular/common/http';
import { ViewUserComponent } from './feature/view-user/view-user.component';
import { ViewMeetingsComponent } from './feature/view-meetings/view-meetings.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    CreateMeetingComponent,
    LoginComponent,
    ViewUserComponent,
    ViewMeetingsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
