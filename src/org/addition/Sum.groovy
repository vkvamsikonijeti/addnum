package org.addition

class Sum{
   def num1
   def num2
 
  Sum (num1,num2){
   this.num1=num1
   this.num2=num2
}

addition(){
this.script.stage('adding'){
this.script.echo this.num1 + this.num2 
}
}
}

