import { Component, OnInit } from '@angular/core';
import { Option, Question, Quiz, QuizConfig } from '../models/index';
@Component({
  selector: 'app-exam',
  templateUrl: './exam.component.html',
  styleUrls: ['./exam.component.css']
})
export class ExamComponent implements OnInit {
  options:Option[]
  public name="";
  constructor() { 
      this.options=[
        {id: 1,name: "Java"},
        {id: 2,name: "Sql"},
        {id: 3,name: "JQuery"},
        {id: 4,name: "Angular 8"}
      ]
  }

  ngOnInit() {
  }

}
