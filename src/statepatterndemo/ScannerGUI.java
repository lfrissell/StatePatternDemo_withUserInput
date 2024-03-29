/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statepatterndemo;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;

/**
 *
 * @author DAD
 */
public class ScannerGUI extends javax.swing.JFrame {

    /**
     * Creates new form ScannerGUI
     */
    public ScannerGUI() {
        initComponents();
        this.continueButton.addActionListener(dispositionButton);
        
    }


public void addInsertListener(ActionListener mal){
  this.insertButton.addActionListener(mal);
}

 
public void addContinueListener(ActionListener mal){
  this.continueButton.addActionListener(mal);
}
   

public void addDispositionListener(ActionListener mal){
  this.dispositionButton.addActionListener(mal);
}

public void addShutdownListener(ActionListener mal){
  this.shutdownButton.addActionListener(mal);
}

    public JComboBox getDispositionButton() {
        return dispositionButton;
    }

    public JButton getContinueButton() {
        return continueButton;
    }

    public JButton getInsertButton() {
        return insertButton;
    }

    public JButton getJobComplete() {
        return jobComplete;
    }

    public JButton getShutdownButton() {
        return shutdownButton;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel = new javax.swing.JPanel();
        continueButton = new javax.swing.JButton();
        shutdownButton = new javax.swing.JButton();
        dispositionButton = new javax.swing.JComboBox();
        insertButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jobComplete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 420));
        setResizable(false);

        jpanel.setBackground(new java.awt.Color(0, 102, 153));
        jpanel.setBorder(new javax.swing.border.MatteBorder(null));
        jpanel.setPreferredSize(new java.awt.Dimension(500, 420));

        continueButton.setText("Start");
        continueButton.setEnabled(false);
        continueButton.setFocusable(false);

        shutdownButton.setText("Off");

        dispositionButton.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Print", "Email", "Save to disk", " " }));
        dispositionButton.setEnabled(false);
        dispositionButton.setFocusable(false);

        insertButton.setText("Insert");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jobComplete.setText("Job Complete");
        jobComplete.setEnabled(false);
        jobComplete.setFocusable(false);

        org.jdesktop.layout.GroupLayout jpanelLayout = new org.jdesktop.layout.GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpanelLayout.createSequentialGroup()
                .add(121, 121, 121)
                .add(insertButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(shutdownButton)
                .add(33, 33, 33))
            .add(jpanelLayout.createSequentialGroup()
                .add(17, 17, 17)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 423, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jpanelLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(dispositionButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jpanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jobComplete, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(continueButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(115, 115, 115))
        );
        jpanelLayout.setVerticalGroup(
            jpanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpanelLayout.createSequentialGroup()
                .add(15, 15, 15)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 18, Short.MAX_VALUE)
                .add(jpanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(continueButton)
                    .add(dispositionButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jobComplete)
                .add(32, 32, 32)
                .add(jpanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(shutdownButton)
                    .add(insertButton))
                .add(52, 52, 52))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jpanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jpanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueButton;
    private javax.swing.JComboBox dispositionButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jobComplete;
    private javax.swing.JPanel jpanel;
    private javax.swing.JButton shutdownButton;
    // End of variables declaration//GEN-END:variables
}
