/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statepatterndemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JComboBox;

/**
 *
 * @author DAD
 */
public class Controller implements Observer{
    ScannerGUI view;
    Scanner scan;
    State currentScannerState;

    public Controller(ScannerGUI _view) {
        this.scan = new Scanner();
        this.setCurrentScannerState(scan.getState());
        this.view = _view;
        this.view.addInsertListener(new InsertListener());
        this.view.addContinueListener(new ContinueListener());
        this.view.addDispositionListener(new DispositionListener());
       this.view.addShutdownListener(new ShutdownListener());
        this.view.getDispositionButton().getSelectedIndex();
        this.startGUI();
      
    }
    
 private void startGUI(){
 
   /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               view.setVisible(true);
            }
        });
 }   

    @Override
    public void update(Observable o, Object o1) {
     this.currentScannerState =(State)o1;
    }

    private void setCurrentScannerState(State _currentScannerState) {
        this.currentScannerState = _currentScannerState;
    }
 
    
 public class InsertListener  implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("AcionPreformed InsertListener");
          scan.setState(scan.getInsertState());
          view.getDispositionButton().setEnabled(true);
          view.getContinueButton().setEnabled(true);
          view.getInsertButton().setEnabled(false);
          scan.sendto();
        }
    
}
 public class ContinueListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(view.getContinueButton().getText().equals("Start")){
            view.getContinueButton().setText("Continue");
            view.getJobComplete().setEnabled(true);}
            scan.setState(scan.getDispositionState());
            scan.sendto();
        }
     
 }
 public class DispositionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           JComboBox cb = (JComboBox)e.getSource();
     String dispositionString= (String)cb.getSelectedItem();
     int sel = cb.getSelectedIndex();
     System.out.println("Selected index is " +sel );
     System.out.println("Selected word is : "+ (String) cb.getSelectedItem());
     if(dispositionString.equals("Print")){scan.setDocumentDispostion(0);}
     else if(dispositionString.equals("Email")){scan.setDocumentDispostion(1);}
     else if(dispositionString.equals("Save to disk")){scan.setDocumentDispostion(2);}
     else {System.out.println("error in Dispostion Listener");}
     


      
        }
     
 }
 public class ShutdownListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
     
 }
}
