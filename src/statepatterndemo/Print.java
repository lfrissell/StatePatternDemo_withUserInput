/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package statepatterndemo;

/**
 *
 * @author DAD
 */
public class Print implements State {
    private Scanner scanner;

    Print(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void sendto() {
        System.out.println(" Sending Document to default printer");
           scanner.setState(scanner.getContinueCurrentJob());
        scanner.state.sendto();
    }

}
