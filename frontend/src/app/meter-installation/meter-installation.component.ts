import { HttpClient, HttpClientJsonpModule } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { CIandMIService } from '../ciand-mi.service';
import { MeterInstallation } from '../meterInstallation.model';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-meter-installation',
  standalone:true,
  imports: [HttpClientJsonpModule,CommonModule],
  templateUrl: './meter-installation.component.html',
  styleUrl: './meter-installation.component.css'
})
export class MeterInstallationComponent implements OnInit {

  miDetails:MeterInstallation[]=[];
  constructor(private http:HttpClient, private ciandmiservice:CIandMIService){

  }

  ngOnInit(): void {
      this.getMI();
  }

  getMI(){
    
    this.ciandmiservice.getAllMI().subscribe(
      data=>{
        this.miDetails=data;
      }
    );
   // this.miDetails=this.ciandmiservice.getAllMI();
  }
}
