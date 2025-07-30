import { Injectable } from '@angular/core';
import { Employee } from './employee.model';
import { Observable } from 'rxjs';
import { HttpClient, HttpParams } from '@angular/common/http';
import { FieldUser } from './FieldUser.model';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseURL="http://localhost:8080/api";

  // private employees:Employee[]=[
  //   {id:1,firstName:'Shweta',lastName:'Shivsharan',salary:50000},
  //    {id:2,firstName:'Shweta',lastName:'Shivsharan',salary:50000},
  //     {id:3,firstName:'Shweta',lastName:'Shivsharan',salary:50000},
  //      {id:4,firstName:'Shweta',lastName:'Shivsharan',salary:50000},
  //       {id:5,firstName:'Shweta',lastName:'Shivsharan',salary:50000}
  //   // {id:1,name:'shreya',department:'IT' , address:'Pune' , emailid:'shreya@gmail.com', password:'1234'},
  //   // {id:2,name:'Shweta',department:'IT' , address:'Delhi' , emailid:'shweta@gmail.com', password:'1234'},
  //   // {id:3,name:'Pinky',department:'IT' , address:'Gurugram' , emailid:'pinky@gmail.com', password:'1234'},
  //   // {id:4,name:'Sameer',department:'IT' , address:'Gurugram' , emailid:'sameer@gmail.com', password:'1234'},
  //   // {id:5,name:'Deepak',department:'IT' , address:'Mumbai' , emailid:'deepak@gmail.com', password:'1234'},
  //   // {id:6,name:'Preety',department:'IT' , address:'Pune' , emailid:'preety@gmail.com', password:'1234'},
  // ]

  constructor(private http:HttpClient) { }

  getAllEmployees():Observable<FieldUser[]>{
    return this.http.get<FieldUser[]>(`${this.baseURL}/fieldusers`);
  }

  // getAllEmployees():Employee[]{
  //   return this.employees;

  // }

  //uservalidation

  private employees=[{email:'admin@gmail.com',password:'1234'}];
  useridValidation(email:string,password:string):boolean{
       return this.employees.some((emp)=>emp.email===email && emp.password===password);
  }

//  GetAllField UserDetails 
  private fieldUser:FieldUser[]=[
    {id:1,name:'shweta',mobile_Number:9898765789,email_Id:'shweta@gmail.com',role:'Field User', contractor:'Contractor Manager',subdivision:'Surat',password:'1234'},
     {id:2,name:'Snehal',mobile_Number:9898765890,email_Id:'snehal@gmail.com',role:'Field User', contractor:'Contractor Manager',subdivision:'gujrat',password:'1234'},
     {id:3,name:'shweta',mobile_Number:9898765789,email_Id:'shweta@gmail.com',role:'Field User', contractor:'Contractor Manager',subdivision:'noida',password:'1234'},
     {id:4,name:'shweta',mobile_Number:9898765789,email_Id:'shweta@gmail.com',role:'Field User', contractor:'Contractor Manager',subdivision:'gurugram',password:'1234'},
     {id:5,name:'shweta',mobile_Number:9898765789,email_Id:'shweta@gmail.com',role:'Field User', contractor:'Contractor Manager',subdivision:'bihar',password:'1234'},
     {id:6,name:'shweta',mobile_Number:9898765789,email_Id:'shweta@gmail.com',role:'Field User', contractor:'Contractor Manager',subdivision:'Surat',password:'1234'},
     {id:7,name:'shweta',mobile_Number:9898765789,email_Id:'shweta@gmail.com',role:'Field User', contractor:'Contractor Manager',subdivision:'Surat',password:'1234'},
     {id:8,name:'shweta',mobile_Number:9898765789,email_Id:'shweta@gmail.com',role:'Field User', contractor:'Contractor Manager',subdivision:'noida',password:'1234'},
     {id:9,name:'shweta',mobile_Number:9898765789,email_Id:'shweta@gmail.com',role:'Field User', contractor:'Contractor Manager',subdivision:'gurugram',password:'1234'},
     {id:10,name:'shweta',mobile_Number:9898765789,email_Id:'shweta@gmail.com',role:'Field User', contractor:'Contractor Manager',subdivision:'lakhanau',password:'1234'},

  ]

 // GetAllFieldUsers 
  getAllFieldusers():FieldUser[]{
          return this.fieldUser ;
  }
  
  // filterDataByNameAndSubdivision
  filterByNameAndSubdivision(searchText:String , selectedSubdivision:String):Observable<FieldUser[]>{

      let params= new HttpParams();
     return this.http.get<FieldUser[]>(`${this.baseURL}/search`,{params:params});
    // searchText=searchText.toLowerCase().trim();
    // selectedSubdivision=selectedSubdivision.toLowerCase().trim();

    // if(searchText!=null && selectedSubdivision!=null){
    // return this.fieldUser.filter(user=>user.name.toLowerCase().trim() === searchText && user.subdivision.toLowerCase().trim()===selectedSubdivision);
    // }
    // else if( searchText ==='' && selectedSubdivision == 'All') {
    //   return this.getAllFieldusers();
    // } 
    // else if(searchText=='' ){
    //   return this.fieldUser.filter(user=>user.subdivision===selectedSubdivision);
    // }
    // else if(selectedSubdivision==='All'){
    //   return this,this.fieldUser.filter(user=>user.name.toLowerCase().trim() === searchText.toLowerCase().trim());
    // }
    // else{
    //   return this.getAllFieldusers();
    // }
}

// GetAllSubdivision 
getAllSubdivision():Observable<String[]>{
 // return [...new Set(this.fieldUser.map(sub=> sub.subdivision))];
   return this.http.get<String[]>(`${this.baseURL}/getAllSubdivision`);
}



}
