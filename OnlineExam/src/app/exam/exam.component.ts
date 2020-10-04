import { Component, OnInit, ViewChild } from '@angular/core';
import { Observable } from 'rxjs';
import { ModalDirective } from 'node_modules/ngx-bootstrap';
import { QuestionClass } from './question-class';
import { ToastrService } from 'ngx-toastr';
import { AddQuestionServiceService } from '../services/add-question-service.service';
@Component({
  selector: 'app-exam',
  templateUrl: './exam.component.html',
  styleUrls: ['./exam.component.css']
})

export class ExamComponent implements OnInit {
  isQuestionCardShow: boolean = false;
	totalAnswered: number = 0;
	rightAnswer: number;
	questionObj = new QuestionClass();
	@ViewChild('submitModal', { static: true }) submitModal: ModalDirective;
	@ViewChild('addQuestionModal', { static: true }) addQuestionModal : ModalDirective;
	@ViewChild('answerModal', { static: true }) answerModal : ModalDirective;
	@ViewChild('questionForm', { static: true }) questionForm: any;
  @ViewChild('questionTest', { static: true }) questionTest : any;
  @ViewChild('staticModal', { static: true }) public staticModal:ModalDirective;

	constructor( private toastr: ToastrService, private addQ: AddQuestionServiceService) { }

	answerArray = [];

	allQuestions: any = [{
		"id": 1,
		"question": "What is the capital of Belgium?",
		"a": "Vienna",
		"b": "Berlin",
		"c": "Brussels",
		"d": "Prague",
		"answer": "c"
	},
	{
		"id": 2,
		"question": "What is the capital of Australia?",
		"a": "Vienna",
		"b": "Canberra",
		"c": "Brussels",
		"d": "Prague",
		"answer": "b"
	},
	{
		"id": 3,
		"question": "What is the capital of Bulgaria?",
		"a": "Vienna",
		"b": "Sofia",
		"c": "Brussels",
		"d": "Prague",
		"answer": "b"
	}
	];

	/**Method call on submit the test */
	submitTest() {
		this.rightAnswer = 0;
		this.totalAnswered = 0;
		for (let i = 0; i < this.allQuestions.length; i++) {
			if ("selected" in this.allQuestions[i] && (this.allQuestions[i]["selected"] != null)) {
				this.totalAnswered++;
				if (this.allQuestions[i]["selected"] == this.allQuestions[i]["answer"]) {
					this.rightAnswer++;
				}
			}

		}
		this.submitModal.show();

	}

	startQuiz() {
		for (let i = 0; i < this.allQuestions.length; i++) {
			if ("selected" in this.allQuestions[i]) {
				delete this.allQuestions[i]["selected"];
			}

		}
		this.questionTest.reset();
		this.isQuestionCardShow = true;

	}
	HomePage() {
		this.isQuestionCardShow = false;
	}
	addQuestion(){
		this.addQuestionModal.show();
	}
	submitAddQuestion(){
		let quesTemp = JSON.parse(JSON.stringify(this.questionObj));
		quesTemp["id"] = this.allQuestions.length+1;
		this.allQuestions.push(quesTemp);
		this.questionForm.reset();
		this.toastr.success("Question Added Successfully!!");
		this.addQuestionModal.hide();

	}
	checkAnswers(){
		this.submitModal.hide();
		this.answerModal.show();
	}

	ngOnInit() {

  //  this.addQ.communicateObject.subscribe()
  //  });

	}

}
