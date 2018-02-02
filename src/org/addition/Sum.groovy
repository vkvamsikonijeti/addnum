package org.addition

class Sum {
   def config
   def script

 
  Sum (script,config) {
   this.config= config
   this.script= script
 }

void addition(){
this.script.stage('adding'){
   def sum = this.config.num1 + this.config.num2
this.script.sh('echo' + $sum)
 }
}
}
