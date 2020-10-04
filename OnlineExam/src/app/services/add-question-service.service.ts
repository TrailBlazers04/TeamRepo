import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';
import { QuestionClass } from '../exam/question-class';

@Injectable({
  providedIn: 'root'
})
export class AddQuestionServiceService {
 private sendObject =new Subject;
 sendobj=this.sendObject.asObservable();
  constructor() { }

  communicateObject(obj:QuestionClass)
  {
    this.sendObject.next(obj);

  }
}
