/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package statepatterndemo;

/**
 *
 * @author DAD
 */
public class ScannerDemoMain {
    /**
     * The State Pattern will allow an object to process
     * from one point to another with decision points built-in to
     * the process.  This is an ideal pattern to use when an object must
     * be in one of a small number of known states.
     *
     * For this example a document will be place into a scanner.
     * then it will be accepted or rejected, at the Disposition state
     * The InputSimulator, will select each of the possible states
     *  of the machine, an alternate would be to use the Boolean[]
     *  with true or false for each alternative path selected.
     *
     * 
     *
     */
    public static void main(String[] args) {
        
       ScannerGUI view = new ScannerGUI();
       Controller controller =new Controller(view);
        
        
     /*   Document doc = new Document(8,11);
       Scanner scan= new Scanner(doc);
      scan.sendto();
      System.out.println(" new Document ");
      Document doc1 = new Document(11,14);
      scan.setDoc(doc1);
      scan.setState(scan.getInsertDoc());
      scan.sendto();
     System.out.println(" GoodBye ");     */
    }

}
