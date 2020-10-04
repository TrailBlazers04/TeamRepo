import { Component, OnInit } from '@angular/core';
import { DropDownListComponent } from '@syncfusion/ej2-angular-dropdowns';
import { FormGroup, FormControl, Validators} from '@angular/forms';
import { User } from '../user';
import { AdminService } from '../services/admin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  technologies = [ "JAVA", "SQL", "JQuery" ];
  
  states = [ "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar",  "Chhattisgarh",
              "Goa",  "Gujarat",  "Haryana", "Himachal Pradesh" ];
  
  cities = ["Delhi", "Agra", "Kolkata", "Mumbai", "Bangalore", "Hyderabad", "Patna", "Jaipur",
              "Chennai"  ];
 
  user = new User();

  constructor(private _service : AdminService, private _router : Router) { }

  ngOnInit() {
  }
  
   form(){
    this._service.searchUserFromRemote(this.user).subscribe(data => this.user = data);
      }
     
    
  }
  

