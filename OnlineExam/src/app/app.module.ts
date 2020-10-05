import { BrowserModule } from '@angular/platform-browser';
import { NgModule} from '@angular/core';

import { ReactiveFormsModule } from '@angular/forms';


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
import { AboutComponent } from './about/about.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ToastrModule } from 'ngx-toastr';
import { ModalModule } from 'ngx-bootstrap';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    routingComponents,
    AboutComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ToastrModule.forRoot(),
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    NgbModule.forRoot(),
    ReactiveFormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    ModalModule.forRoot()
  ],
  
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
