import { Component, OnInit } from '@angular/core';
import { StudentModel } from '../login.model';
import { Router } from '@angular/router';
import { StudentService } from '../services/student.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  list: StudentModel[] = [];
  constructor(private router : Router, private service : StudentService) { }

  ngOnInit() {
    this.list = this.service.getList();
  }
  delete(index : number){
    var ans = confirm("are you surre, you want to delete?");
    if(ans){
      this.service.deleteAlbum(index);
    }
    
  }
}
