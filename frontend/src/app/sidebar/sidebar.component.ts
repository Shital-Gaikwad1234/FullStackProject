import { CommonModule, NgIf, NgOptimizedImage } from '@angular/common';
import { Component } from '@angular/core';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatIconModule} from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';
import { MatListModule } from '@angular/material/list';
import { DashboardComponent } from "../dashboard/dashboard.component";
import { ActivatedRoute, Router, RouterModule, RouterOutlet } from '@angular/router';
import { PersonComponent } from "../person/person.component";
import { FieldUser } from '../FieldUser.model';

@Component({
  selector: 'app-sidebar',
  standalone:true,
  imports: [
    MatToolbarModule,
    MatSidenavModule,
    MatIconModule,
    MatButtonModule,
    MatListModule,
    NgOptimizedImage,
    RouterModule,
    CommonModule
],
  templateUrl: './sidebar.component.html',
  styleUrl: './sidebar.component.css'
})
export class SidebarComponent {


  user:FieldUser | undefined;
  currentLink:any;
  userid:string='';
  constructor(private router : Router , private route: ActivatedRoute){
      const navigation=this.router.getCurrentNavigation();
      this.user= navigation?.extras.state?.['data'];
  }
  ngOnInit(){
     this.userid =this.route.snapshot.paramMap.get('id') || '';
   // console.log('user id :' , userid);
  }

MenuList:Menu[]=[{Id:1,MenuName:'Dashboard',Description:'',MenuUrl:'dashboard',IsActive:true,icon:'home'},
{Id:2,MenuName:'Consumer Indexing',Description:'',MenuUrl:'consumerIndexing',IsActive:true,icon:'person_add'},
{Id:3,MenuName:'Meter Installation',Description:'',MenuUrl:'meterInstallation',IsActive:true,icon:'/assets/images/smart-meter.png'}
];

  isSidenavOpen=false;
  consumerList(){
          // this.router.navigate(['/dashboard']);
  }

  onLinkClick(menu:any){
     this.currentLink = menu;
    localStorage.setItem('currentLink', JSON.stringify(menu));
  }

  toggleUserMenu(){
 
   this.router.navigate(['login']);
  }

  
 
}

export interface Menu{
  Id:number;
  MenuName: string;
  Description:string;
  MenuUrl?:string;
  IsActive:boolean;
  icon?:string;

}