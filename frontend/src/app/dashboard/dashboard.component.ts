import { CommonModule, NgOptimizedImage } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { FieldUser } from '../FieldUser.model';
import { Router } from '@angular/router';
import{MatFormFieldModule} from '@angular/material/form-field';
import{MatSelectModule} from '@angular/material/select';
import{MatInputModule}from '@angular/material/input';
import { FormsModule } from '@angular/forms';
import {MatSort, Sort, MatSortModule} from '@angular/material/sort';
import { MatList } from "@angular/material/list";
import { MatListItem } from "../../../node_modules/@angular/material/list/index";
import { f } from "../../../node_modules/@angular/material/icon-module.d-COXCrhrh";
import { MatIconModule } from '@angular/material/icon';


@Component({
  selector: 'app-dashboard',
  standalone:true,
  imports: [CommonModule, HttpClientModule, FormsModule, MatFormFieldModule, MatSelectModule, MatInputModule,MatIconModule,MatSortModule],
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.css'
})
export class DashboardComponent implements OnInit{
   
  searchText:string='';
  selectedSubdivision:string='';
   totalCI=12;
  totalMI=8;
  fieldUser:FieldUser[]=[];
  subdivisions: String[]=[];
  constructor(private employeeService:EmployeeService,private http:HttpClient, private router:Router){

  }

  ngOnInit(): void {
      this.getAllUsers();
      this.loadSubdivisions();
  }

  private getAllUsers(){
  // this.fieldUsers = this.employeeService.getAllFieldusers();
    this.employeeService.getAllEmployees().subscribe(data=>{
      this.fieldUser =data;
    })
  }

  //getAllsubdivision
  private loadSubdivisions():void{
      this.employeeService.getAllSubdivision().subscribe(
        subs=>{
          this.subdivisions = ['All', ...subs];
        }
      )
  }

   userDetails(user:FieldUser):void{
    this.router.navigate(['person' , user.id],{
      state:{data:user}
    });
  }

  
  search() :void{
    if(this.searchText==='' && this.selectedSubdivision==='All'){
      this.employeeService.getAllEmployees().subscribe(data=>{
       this.fieldUser=data;
     });
    }
    else{
    this.employeeService.filterByNameAndSubdivision(this.searchText, this.selectedSubdivision).subscribe(
      data=>{
        this.fieldUser=data;
      }
    );
  }
}

}


