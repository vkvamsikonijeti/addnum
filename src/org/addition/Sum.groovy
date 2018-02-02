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
   def num1 = this.config.num1
      def num2 = this.config.num2
      
 
       this.script.sh('echo' + ((num1+num2)))
     }
   }
}
