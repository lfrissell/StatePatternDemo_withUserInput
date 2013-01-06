/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statepatterndemo;

/**
 *
 * @author DAD
 */
public class ContinueCurrentJob implements State  {
private Scanner scanner;

    public ContinueCurrentJob(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void sendto() {
     System.out.println(" Waiting for decision on current job");
           
    }
    
}
