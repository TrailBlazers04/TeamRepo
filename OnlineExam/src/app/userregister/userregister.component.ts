import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-userregister',
  templateUrl: './userregister.component.html',
  styleUrls: ['./userregister.component.css']
})
export class UserregisterComponent implements OnInit {

  states = [ "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar",  "Chhattisgarh",
              "Goa",  "Gujarat",  "Haryana", "Himachal Pradesh" ];
  
  cities = ["Delhi", "Agra", "Kolkata", "Mumbai", "Bangalore", "Hyderabad", "Patna", "Jaipur",
             "Chennai"  ];

  qualifications = ["S.S.C", "H.S.C", "Diploma", "B.Tech", "B.E", "B.Sc", "M.Sc", "B.A", "M.A", "B.B.A", "M.B.A", "Ph.D."];
                 
  constructor() { }

  ngOnInit() {
  }

}
