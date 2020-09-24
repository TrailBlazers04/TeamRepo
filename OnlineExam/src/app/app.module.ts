import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule, routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { SetquestionComponent } from './setquestion/setquestion.component';
import { ListComponent } from './list/list.component';
import { SearchComponent } from './search/search.component';
import { UserComponent } from './user/user.component';
import { UserregisterComponent } from './userregister/userregister.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { UserhomeComponent } from './userhome/userhome.component';
import { ExamComponent } from './exam/exam.component';
import { UserreportComponent } from './userreport/userreport.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    routingComponents,
    SetquestionComponent,
    ListComponent,
    SearchComponent,
    UserComponent,
    UserregisterComponent,
    UserloginComponent,
    UserhomeComponent,
    ExamComponent,
    UserreportComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule.forRoot(),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
