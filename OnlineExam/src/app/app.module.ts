import { BrowserModule } from '@angular/platform-browser';
import { NgModule} from '@angular/core';

import { ReactiveFormsModule } from '@angular/forms';


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
import { AboutComponent } from './about/about.component';
>>>>>>> 1162ce10fde9693e04737330b934addeeece2bea


@NgModule({
  declarations: [
    AppComponent,
    routingComponents,
    AboutComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
<<<<<<< HEAD
    FormsModule,
    NgbModule.forRoot()
=======
    ReactiveFormsModule,
<<<<<<< HEAD
    NgbModule.forRoot(),

>>>>>>> 1162ce10fde9693e04737330b934addeeece2bea
=======
    NgbModule.forRoot()
    
    
    
>>>>>>> b1d691f3b2e4ce360782deee2cb92a8a294af081
  ],
  
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
