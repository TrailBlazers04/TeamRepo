import { Component, OnInit, ViewChild } from '@angular/core';
import { FormGroup, FormControl, FormArray, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { ModalDirective } from 'ngx-bootstrap';
import { QuestionClass } from '../exam/question-class';
import { AddQuestionServiceService } from '../services/add-question-service.service';

@Component({
  selector: 'app-setquestion',
  templateUrl: './setquestion.component.html',
  styleUrls: ['./setquestion.component.css']
})
export class SetquestionComponent implements OnInit {
  questionObj = new QuestionClass();
	@ViewChild('addQuestionModal', { static: true }) addQuestionModal : ModalDirective;
  constructor(private addQ : AddQuestionServiceService) {
    
   }
   addQuestion(){
		this.addQuestionModal.show();
	}
   
  submitAddQuestion(){
		let quesTemp = JSON.parse(JSON.stringify(this.questionObj));
		
    this.addQuestionModal.hide();
    console.log(this.questionObj);

    this.addQ.communicateObject(this.questionObj);



	}
   
 
   
 

  ngOnInit() {


  }

}
