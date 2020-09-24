import { Component, OnInit } from '@angular/core';
import { ExamModel } from '../exam.model';

@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.css']
})
export class QuizComponent implements OnInit {
  exam= new ExamModel;
  flag: boolean;
  exams : string[];

  constructor() {
    this.exams = ['JAVA','SQL','Python']
   }

  ngOnInit() {
  }

  loggedIn(){
    this.flag = true;
  }

}
