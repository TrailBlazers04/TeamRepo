import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddquestionComponent } from './addquestion/addquestion.component';
import { AdminComponent } from './admin/admin.component';
import { AdminhomeComponent } from './adminhome/adminhome.component';
import { HomeComponent } from './home/home.component';
import { ListComponent } from './list/list.component';
import { QuizComponent } from './quiz/quiz.component';
import { SearchComponent } from './search/search.component';
import { UserComponent } from './user/user.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { UserregistorComponent } from './userregistor/userregistor.component';


const routes: Routes = [
  {path: "", component: HomeComponent},
  {path: "home", component: HomeComponent},
  {path: "user", component: UserComponent},
  {path: "user/userlogin", component: UserloginComponent},
  {path: "user/userregistor", component: UserregistorComponent},
  {path: "user/userlogin/quiz", component: QuizComponent},
  {path: "admin", component: AdminComponent},
  {path: "admin/adminhome", component: AdminhomeComponent},
  {path: "admin/adminhome/addquestion", component: AddquestionComponent},
  {path: "admin/adminhome/list", component: ListComponent},
  {path: "admin/adminhome/search", component: SearchComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

export const routingComponents = [HomeComponent, UserComponent, AdminComponent,
              UserloginComponent, UserregistorComponent,
              AdminhomeComponent, AddquestionComponent,
              ListComponent, SearchComponent, QuizComponent]
