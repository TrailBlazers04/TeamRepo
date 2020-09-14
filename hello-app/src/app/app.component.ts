import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    
    <div style="text-align:center" class="content">
      <h1>
        Welcome to {{title}}!
      </h1>
      <h2>First Angular App on Jenkins</h2>
      <h2>Hello World!!!!</h2>
      <h3>New Commit on Hello app</h3>
      </div>
  `,
  styles: [
    `h1{
      font-family: verdana;
      color: red;
      
    }
    h2{
      font-family: verdana;
      color: red;
    }`
  ]
})
export class AppComponent {
  title = 'hello-app';
}
