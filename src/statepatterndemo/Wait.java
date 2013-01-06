/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package statepatterndemo;

/**
 *
 * @author DAD
 */
public class Wait implements State{
private Scanner scanner;


    public Wait(Scanner scanner) {
        this.scanner = scanner;
    }


    @Override
    public void sendto() {
           System.out.println(" Scanner waiting for next action");
           // Listeners in the controller will determine next action, shutdown or insert new document
  
    }

}
