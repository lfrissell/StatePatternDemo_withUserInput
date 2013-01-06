/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package statepatterndemo;

/**
 *
 * @author DAD
 */
public class Email implements State  {
private Scanner scanner;
    public Email(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void sendto() {
         System.out.println(" Sending Document via email to your friends");
           scanner.setState(scanner.getContinueCurrentJob() );
        scanner.state.sendto();
    }

}
