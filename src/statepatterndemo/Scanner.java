/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package statepatterndemo;

import java.util.Observable;

/**
 *
 * @author DAD
 */
public class Scanner extends Observable{
    Document doc;
    int documentDispostion;

  State insertDocState;
       State acceptState;
       State dispositionState;
       State saveToDiskState;
       State toPrinterState;
       State toEmailState;
       State doneState;
       State rejectDocState;
       State continueCurrentJob;
       State waitState;
       State state;
     UserInputButton userinput;
       public Scanner(){
       userinput = new UserInputButton(this);
      acceptState = new AcceptDoc(this);
      rejectDocState = new RejectDoc(this);
      dispositionState = new Disposition(this);
      saveToDiskState = new Disk(this);
      toPrinterState = new Print(this);
      toEmailState = new Email(this);
      doneState = new Done(this);
      insertDocState = new InsertDoc(this);
      continueCurrentJob= new ContinueCurrentJob(this);
      waitState = new Wait(this);
      this.setState( waitState);
    //  this.setDoc(_doc);
           
       }

    public Document getDoc() {
        return doc;
    }

    public final void setDoc(Document doc) {
        this.doc = doc;
    }
    
 
    public int getDocumentDispostion() {
        return documentDispostion;
    }

    public void setDocumentDispostion(int _documentDispostion) {
       
        this.documentDispostion = _documentDispostion;
         switch(this.documentDispostion){
             case 0:System.out.println("Print"); break;
             case 1:System.out.println("Email"); break;
             case 2:System.out.println("Save to disk"); break;
              default: System.out.println("Invalid Disposition Option.");break;


         }
             
    }   

    public State getRejectDocState() {
        return rejectDocState;
    }
/*
    public void setRejectDoc(State rejectDocState) {
        this.rejectDocState = rejectDocState;
    }
 */      
    public void sendto(){
        state.sendto();
    }   
    public State getAcceptDocState() {
        return acceptState;
    }

    public State getSaveToDiskState() {
        return saveToDiskState;
    }

    public State getDispositionState() {
        return dispositionState;
    }

    public State getWaitState() {
        return waitState;
    }

    public State getDoneState() {
        return doneState;
    }

    public State getEmailState() {
        return toEmailState;
    }

    public State getInsertState() {
        return insertDocState;
    }

    public State getPrintState() {
        return toPrinterState;
    }

    public State getContinueCurrentJob() {
        return continueCurrentJob;
    }

    public State getState() {
        return state;
    }
     final void setState(State _state) {
		 this.state= _state;
                setChanged();
             notifyObservers(this.state);
     }

  
     
}
