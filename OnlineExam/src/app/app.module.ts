import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule, routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
<<<<<<< HEAD

=======
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
>>>>>>> ca4d3873f7fb3796332a931a3c97c5e95ac62268

@NgModule({
  declarations: [
    AppComponent,
    routingComponents,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
<<<<<<< HEAD
    FormsModule,
    NgbModule.forRoot()
=======
    NgbModule.forRoot(),
    FormsModule
>>>>>>> ca4d3873f7fb3796332a931a3c97c5e95ac62268
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
