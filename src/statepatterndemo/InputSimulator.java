/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package statepatterndemo;

    
/**
 *
 * @author DAD
 */
public class InputSimulator {
    private static int test = 0;
    Document doc;


    public InputSimulator() {

    }
  /* Input  Simulator Tests muliple paths using a switch statement
   *  The switch statement selects path. 
   * 
   */

  

    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public Document getUserInput(){
test=test+1;
 switch(test){
     case 1: doc= new Document(8,11);  break;
      case 2: doc= new Document(11,14);   break;
      default:new Document(8,11); test=0; break;
 } return doc;
}

}
