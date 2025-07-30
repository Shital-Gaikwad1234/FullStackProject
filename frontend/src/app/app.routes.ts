import { Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { PersonComponent } from './person/person.component';
import { ConsumerIndexingComponent } from './consumer-indexing/consumer-indexing.component';
import { MeterInstallationComponent } from './meter-installation/meter-installation.component';

export const routes: Routes = [

    {path: '', redirectTo: 'login', pathMatch: 'full' },
    {path:'login',component:LoginComponent}, 
     {path:'person/:id',component:PersonComponent},
    {path:'sidebar',component:SidebarComponent ,
      children:[
        {path:'dashboard' , component:DashboardComponent},
        {path:'consumerIndexing' , component:ConsumerIndexingComponent},
        {path:'meterInstallation', component:MeterInstallationComponent},
        {path:'', redirectTo:'dashboard', pathMatch:'full'}
       
      ]
    },
   


];
