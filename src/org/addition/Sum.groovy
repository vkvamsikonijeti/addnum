package org.addition

class Sum {
   def config
   def script

 
  Sum (script,config) {
   this.config= config
   this.script= script
 }
}
addition(){
this.script.stage('adding'){
this.script.echo this.config.num1 + this.config.num2 
 }
}

