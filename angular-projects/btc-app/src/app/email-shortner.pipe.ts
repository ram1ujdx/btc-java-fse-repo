import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'emailShortner'
})
export class EmailShortnerPipe implements PipeTransform {

  transform(value: string, ...args: any[]): string {
    if(value.length>args[0]){
    return value.substr(0,args[0])+'...';
    }
    return value;
  }

}
