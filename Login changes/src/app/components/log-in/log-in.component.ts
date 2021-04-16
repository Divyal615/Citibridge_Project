import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginServiceService } from 'src/app/login-service.service';
import { UserKey } from 'src/app/user-key';

@Component({
  selector: 'app-log-in',
  templateUrl: './log-in.component.html',
  styleUrls: ['./log-in.component.css']
})
export class LogInComponent implements OnInit {

  user = new UserKey();
  msg='';

  constructor(private service :LoginServiceService, private router: Router) { }

  ngOnInit(): void {
  }

  loginUser(){
    this.service.loginUser(this.user).subscribe(
      data => {
        console.log("response received");
        this.router.navigate(['/homepage']);
    },
      error => {
        console.log("exception occurred");
        this.msg='invalid userId or password';
      }
    )
  }

}
