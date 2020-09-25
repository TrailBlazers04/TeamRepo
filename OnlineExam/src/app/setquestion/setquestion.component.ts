import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormArray, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-setquestion',
  templateUrl: './setquestion.component.html',
  styleUrls: ['./setquestion.component.css']
})
export class SetquestionComponent implements OnInit {
  name = 'Angular';
  
  productForm: FormGroup;

  constructor(private fb:FormBuilder) {
    this.productForm = this.fb.group({
      name: '',
      quantities: this.fb.array([]) ,
    });
   }
   quantities() : FormArray {
    return this.productForm.get("quantities") as FormArray
  }
   
  newQuantity(): FormGroup {
    return this.fb.group({
      qty: '',
      price: '',
    })
  }
   
  addQuantity() {
    this.quantities().push(this.newQuantity());
    
  }
   
  removeQuantity(i:number) {
    this.quantities().removeAt(i);
  }

  ngOnInit() {
  }

}
