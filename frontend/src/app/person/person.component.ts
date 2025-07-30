import { Component } from '@angular/core';
import { FieldUser } from '../FieldUser.model';
import { Router } from '@angular/router';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from "@angular/material/list";
import { MatToolbar } from "@angular/material/toolbar";
import { NgOptimizedImage } from '@angular/common';

@Component({
  selector: 'app-person',
  standalone:true,
  imports: [MatIconModule, MatListModule, MatToolbar],
  templateUrl: './person.component.html',
  styleUrl: './person.component.css'
})
export class PersonComponent {
    user:FieldUser | undefined;
    
    constructor(private router:Router){
      
      const navigation=this.router.getCurrentNavigation();
      this.user= navigation?.extras.state?.['data'];
    }
  
    goBack():void{
      this.router.navigate(['/sidebar']);
    }
}
