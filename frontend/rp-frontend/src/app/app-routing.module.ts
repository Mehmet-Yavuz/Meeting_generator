import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './core/login/login.component';
import { CreateMeetingComponent } from './feature/create-meeting/create-meeting.component';
import { ViewMeetingsComponent } from './feature/view-meetings/view-meetings.component';
import { ViewUserComponent } from './feature/view-user/view-user.component';

const routes: Routes = [
  {
    path: '',
    component: LoginComponent,
  },
  {
    path: 'view-user',
    component: ViewUserComponent,
  },
  {
    path: 'view-meetings',
    component: ViewMeetingsComponent,
  },
  {
    path: 'create-meeting',
    component: CreateMeetingComponent,
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
  
 }
