import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {

  li:any;
  lis=[];
  constructor(private http : HttpClient) {}

  ngOnInit(): void {
    this.http.get('http://localhost:8081/user/stocks')
    .subscribe(Response => {
  
      // If response comes hideloader() function is called
      // to hide that loader 
      if(Response){  
        hideloader();
      }
      console.log(Response)
      this.li=Response;
      this.lis=this.li;
    });
    function hideloader(){
      //document.getElementById('loading').style.display = 'none';
    }
  }

}
