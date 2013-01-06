/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package statepatterndemo;

/**
 * InsertDoc handles the functions of getting a document and determining if it meets the size requirements.
 * This function is simply to demonstrate many functions of  Inserting documentation could be handled 
 * @author DAD
 */
public class InsertDoc implements State {
Scanner scanner;
InputSimulator inputDoc;

    public InsertDoc(Scanner scanner) {
        this.scanner = scanner;
        inputDoc = new InputSimulator();
    }

    @Override
    public void sendto() {
        
        System.out.println("Welcome to SuperDuper Scanner 1000 ");   
        System.out.println("Please insert document ");   
        System.out.println("Thank you");
        this.scanner.setDoc(inputDoc.getUserInput()); //get document from the Input Simulator and hand it off to the scanner
        if((this.scanner.getDoc().width == 8) && (this.scanner.getDoc().hieght ==11)){
        scanner.setState(scanner.getAcceptDocState());
        scanner.state.sendto();
        }else{
             scanner.setState(scanner.rejectDocState);
        scanner.state.sendto();
        }
       
    }

}
