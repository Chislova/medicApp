import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LoginPageComponent} from "./login-page/login-page.component";
import {DoctorPageComponent} from "./doctor-page/doctor-page.component";
import {NursePageComponent} from "./nurse-page/nurse-page.component";
import {NotFoundComponent} from "./not-found/not-found.component";


const appRoutes: Routes = [
  {path: '', component: LoginPageComponent},
  {path: 'doctor', component: DoctorPageComponent},
  {path: 'nurse', component: NursePageComponent},
  {path: '**', component: NotFoundComponent},
]

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
