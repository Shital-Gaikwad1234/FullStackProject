import { Component, OnInit } from '@angular/core';
import { ConsumerIndexing } from '../consumerIndexing.model';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { CIandMIService } from '../ciand-mi.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-consumer-indexing',
  standalone:true,
  imports: [HttpClientModule,CommonModule],
  templateUrl: './consumer-indexing.component.html',
  styleUrl: './consumer-indexing.component.css'
})
export class ConsumerIndexingComponent implements OnInit {

  cidetails:ConsumerIndexing[]=[];
  constructor(private http:HttpClient,private cidetail:CIandMIService){
  }

  ngOnInit(): void {
      this.ciAllDetails();
  }

  ciAllDetails(){
       this.cidetail.getAllCI().subscribe(
        data=>{
          this.cidetails =data;
        }
       );
  }

}
