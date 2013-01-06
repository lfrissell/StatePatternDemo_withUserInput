/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statepatterndemo;

/**
 *
 * @author DAD
 * 
 * UserInputButton allows the user to select the Disposition path for the controller
 */
public final class UserInputButton {
      private Scanner scanner;
    int defaultButton=1;

    public UserInputButton(Scanner scanner) {
        this.scanner = scanner;
        this.setUserInput(defaultButton);
    }

    public int getUserInput() {
        return defaultButton;
    }

    public void setUserInput(int _defaultButton) {
        this.defaultButton = _defaultButton;
          switch (this.defaultButton) {   
   case 1:  scanner.setState(scanner.getSaveToDiskState());  break;
   case 2: scanner.setState(scanner.getPrintState()); break;
   case 3: scanner.setState(scanner.getEmailState()); break;
   case 4:  scanner.setState(scanner.getDoneState());break; 
   default: System.out.println("Invalid State.");break;
  }
    }
    
}
