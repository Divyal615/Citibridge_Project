import { Timestamp } from "rxjs";

export class stocks{
    symbol : string;
    price : number;
    time : string;

    constructor(){
        this.symbol='';
        this.price=0;
        this.time='';
    }
}