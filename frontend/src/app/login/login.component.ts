import { Component } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { CommonModule, NgOptimizedImage } from '@angular/common';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  standalone:true,
  selector: 'app-login',
  imports: [CommonModule,FormsModule,NgOptimizedImage],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})

export class LoginComponent {
  email:string='';
  password:string='';
  error:string ='';
  constructor(private router:Router, private employeeservice:EmployeeService){}

  login(){

    if(this.employeeservice.useridValidation(this.email,this.password)){
       console.log();
      // this.router.navigate(['/home']);
       this.router.navigate(['/sidebar']);
     
    }
    else{
      this.error="Invalid Email and Password ";
    }

  }
}
