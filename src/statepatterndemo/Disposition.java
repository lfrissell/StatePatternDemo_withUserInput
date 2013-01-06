/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package statepatterndemo;

/**
 *
 * @author DAD
 */
public class Disposition implements State {
 private Scanner scanner;
 State s;
//InputSimulator inputsim;
    public Disposition(Scanner scanner) {
        this.scanner = scanner;
       //  inputsim = new InputSimulator(this.scanner);
        
    }
    @Override
    public void sendto() {

               switch (scanner.getDocumentDispostion()) {   
  
   case 0: scanner.setState(scanner.getPrintState()); break;
   case 1: scanner.setState(scanner.getEmailState()); break;
   case 2:  scanner.setState(scanner.getSaveToDiskState());  break;
   default: System.out.println("Invalid State. In the Dispostion State");break;
  }
        scanner.state.sendto();
    }
}
