/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package statepatterndemo;

/**
 *
 * @author DAD
 */
public class Done implements State{
    private Scanner scanner;
    public Done(Scanner scanner) {
        this.scanner = scanner;
    }

    public void sendto() {
     System.out.println(" Done with scanning ");
      
    }


}
