/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package statepatterndemo;

/**
 *
 * @author LarryFrissell
 */
class RejectDoc implements State{
    private Scanner scanner;

    public RejectDoc(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void sendto() {

           System.out.println(" The User has Rejected this Document");
           scanner.setState(scanner.getWaitState());
           scanner.state.sendto();

    }

}
