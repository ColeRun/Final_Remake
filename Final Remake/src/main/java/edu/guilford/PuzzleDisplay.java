/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.guilford;

import java.util.ArrayList;

import java.lang.String;
import javax.swing.JLabel;

/**
 *
 * @author -p
 */
public class PuzzleDisplay extends javax.swing.JFrame {
// OK OK SO
    //Set the top 2/3 section with the crossword if possible make it the background
    //then create methods that will be called if the user enters the right words
    //methods will reveal words
    //very simple

    /**
     * Creates new form PuzzleDisplay
     */
    private ArrayList<JLabel> anchor = new ArrayList<JLabel>();
    private ArrayList<JLabel> anxiety = new ArrayList<JLabel>();
    private ArrayList<JLabel> flax = new ArrayList<JLabel>();
    ;
    private ArrayList<JLabel> holidays = new ArrayList<JLabel>();
    ;
    private ArrayList<JLabel> imports = new ArrayList<JLabel>();
// I am keepimg these here because I want to figure
    //out why it wouldnt work in Advanced Programming
    ;
    
    
    public PuzzleDisplay() {
        initComponents();
        clearboard();
        anchor.add(AnchorA);
        anchor.add(AnchorN);
        anchor.add(AnchorC);
        anchor.add(AnchorH);
        anchor.add(AnchorO);
        anchor.add(AnchorR);
        flax.add(FlaxF);
        flax.add(FlaxL);
        flax.add(FlaxA);
        flax.add(AnxietyX);
        holidays.add(HolidaysH);
        holidays.add(HolidaysO);
        holidays.add(HolidaysL);
        holidays.add(HolidaysI);
        holidays.add(HolidaysD);
        holidays.add(HolidaysA);
        holidays.add(AnxietyY);
        holidays.add(HolidaysS);
        anxiety.add(AnchorA);
        anxiety.add(AnxietyN);
        anxiety.add(AnxietyX);
        anxiety.add(AnxietyI);
        anxiety.add(AnxietyE);
        anxiety.add(AnxietyT);
        anxiety.add(AnxietyY);
        imports.add(ImportI);
        imports.add(ImportM);
        imports.add(ImportP);
        imports.add(AnchorO);
        imports.add(ImportR);
        imports.add(ImportT);
        imports.add(ImportS);
// this was all for what was supposed to be my array based-project. so many issues came up i became overwhelmed
    }

    public void clearboard() {

        clearanchor();
        clearflax();
        clearholidays();
        clearanxiety();
        clearimports();

    }

    public void clearanchor() {
        AnchorA.setVisible(false);
        AnchorN.setVisible(false);
        AnchorC.setVisible(false);
        AnchorH.setVisible(false);
        AnchorO.setVisible(false);
        AnchorR.setVisible(false);
    }

    public void showanchor() {
        AnchorA.setVisible(true);
        AnchorN.setVisible(true);
        AnchorC.setVisible(true);
        AnchorH.setVisible(true);
        AnchorO.setVisible(true);
        AnchorR.setVisible(true);
    }

    public void clearanxiety() {
        AnchorA.setVisible(false);
        AnxietyN.setVisible(false);
        AnxietyX.setVisible(false);
        AnxietyI.setVisible(false);
        AnxietyE.setVisible(false);
        AnxietyT.setVisible(false);
        AnxietyY.setVisible(false);
    }

    public void showanxiety() {
        AnchorA.setVisible(true);
        AnxietyN.setVisible(true);
        AnxietyX.setVisible(true);
        AnxietyI.setVisible(true);
        AnxietyE.setVisible(true);
        AnxietyT.setVisible(true);
        AnxietyY.setVisible(true);
    }

    public void clearholidays() {
        HolidaysH.setVisible(false);
        HolidaysO.setVisible(false);
        HolidaysL.setVisible(false);
        HolidaysI.setVisible(false);
        HolidaysD.setVisible(false);
        HolidaysA.setVisible(false);
        AnxietyY.setVisible(false);
        HolidaysS.setVisible(false);
    }

    public void showholidays() {
        HolidaysH.setVisible(true);
        HolidaysO.setVisible(true);
        HolidaysL.setVisible(true);
        HolidaysI.setVisible(true);
        HolidaysD.setVisible(true);
        HolidaysA.setVisible(true);
        AnxietyY.setVisible(true);
        HolidaysS.setVisible(true);
    }

    public void clearflax() {
        FlaxF.setVisible(false);
        FlaxL.setVisible(false);
        FlaxA.setVisible(false);
        AnxietyX.setVisible(false);
    }

    public void showflax() {
        FlaxF.setVisible(true);
        FlaxL.setVisible(true);
        FlaxA.setVisible(true);
        AnxietyX.setVisible(true);
    }

    public void clearimports() {
        ImportI.setVisible(false);
        ImportM.setVisible(false);
        ImportP.setVisible(false);
        AnchorO.setVisible(false);
        ImportR.setVisible(false);
        ImportT.setVisible(false);
        ImportS.setVisible(false);
    }

    public void showimports() {
        ImportI.setVisible(true);
        ImportM.setVisible(true);
        ImportP.setVisible(true);
        AnchorO.setVisible(true);
        ImportR.setVisible(true);
        ImportT.setVisible(true);
        ImportS.setVisible(true);
    }

    /*public void makevisible(ArrayList List) {
        int count = 0;
        int index = 0;
        int answerlength = List.size();
        while (answerlength > count) {
            //  List.get(index).setVisible(true);
            // setVisible refuses to work. it takes the
            //indexed variable and makes it an object rather than a JLabel. so i cannot make it visible
            //this has taken my entire day trying to resolve, I am going to manually create methods to display the words
        }
    */

    /**
     *
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userAnswer = new javax.swing.JTextField();
        AnchorA = new javax.swing.JLabel();
        AnchorN = new javax.swing.JLabel();
        AnchorC = new javax.swing.JLabel();
        AnchorH = new javax.swing.JLabel();
        AnchorO = new javax.swing.JLabel();
        AnchorR = new javax.swing.JLabel();
        Hint1 = new javax.swing.JLabel();
        backgroundicon = new javax.swing.JLabel();
        AnxietyI = new javax.swing.JLabel();
        AnxietyE = new javax.swing.JLabel();
        AnxietyT = new javax.swing.JLabel();
        AnxietyY = new javax.swing.JLabel();
        ImportI = new javax.swing.JLabel();
        ImportM = new javax.swing.JLabel();
        ImportP = new javax.swing.JLabel();
        ImportR = new javax.swing.JLabel();
        ImportT = new javax.swing.JLabel();
        ImportS = new javax.swing.JLabel();
        FlaxF = new javax.swing.JLabel();
        FlaxL = new javax.swing.JLabel();
        FlaxA = new javax.swing.JLabel();
        HolidaysH = new javax.swing.JLabel();
        HolidaysO = new javax.swing.JLabel();
        HolidaysL = new javax.swing.JLabel();
        HolidaysI = new javax.swing.JLabel();
        HolidaysD = new javax.swing.JLabel();
        HolidaysA = new javax.swing.JLabel();
        HolidaysS = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AnxietyN = new javax.swing.JLabel();
        AnxietyX = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        resetbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Crossword Puzzle");

        userAnswer.setText("Enter Answer");
        userAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAnswerActionPerformed(evt);
            }
        });

        AnchorA.setText("A");

        AnchorN.setText("N");

        AnchorC.setText("C");

        AnchorH.setText("H");

        AnchorO.setText("O");

        AnchorR.setText("R");

        Hint1.setText("1: Ships Drop these to stop");

        backgroundicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Final_Puzzle.jpg"))); // NOI18N

        AnxietyI.setText("I");

        AnxietyE.setText("E");

        AnxietyT.setText("T");

        AnxietyY.setText(" Y");

        ImportI.setText("I");

        ImportM.setText("M");

        ImportP.setText("P");

        ImportR.setText("R");

        ImportT.setText("T");

        ImportS.setText("S");

        FlaxF.setText("F");

        FlaxL.setText("L");

        FlaxA.setText("A");

        HolidaysH.setText("H");

        HolidaysO.setText("O");

        HolidaysL.setText("L");

        HolidaysI.setText("I");

        HolidaysD.setText("D");

        HolidaysA.setText("A");

        HolidaysS.setText("S");

        jLabel1.setText("2: Plant harvested for its fibers,  ____seed is the primary product from it");

        jLabel2.setText("3:Happy _______!");

        jLabel3.setText("4: Mental Disorder tied to panic attacks and nervousness");

        jLabel4.setText("5: Rob always says, FIX YOUR _____!");

        AnxietyN.setText("N");

        AnxietyX.setText("X");

        jLabel5.setText("Note adventurous letters will fix themselves once the crossword is completed");

        resetbutton.setText("Reset");
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(Hint1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(AnxietyN, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AnchorA)
                                        .addGap(18, 18, 18)
                                        .addComponent(AnchorN)
                                        .addGap(28, 28, 28)
                                        .addComponent(AnchorC)
                                        .addGap(23, 23, 23)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(ImportM)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(AnchorH)
                                                        .addGap(28, 28, 28)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(ImportI, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(AnchorO))))
                                                .addGap(18, 18, 18)
                                                .addComponent(AnchorR))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ImportP, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(ImportR, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(79, 79, 79)
                                                        .addComponent(resetbutton))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(ImportS, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(ImportT, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(userAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AnxietyT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AnxietyE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(HolidaysH, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HolidaysO, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HolidaysL, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FlaxF, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(FlaxL, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(HolidaysI, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(HolidaysD, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(HolidaysA, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AnxietyY)
                                .addGap(28, 28, 28)
                                .addComponent(HolidaysS, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FlaxA, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AnxietyI, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AnxietyX, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(481, 481, 481))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(171, 171, 171))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(backgroundicon)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(ImportI)
                .addGap(28, 28, 28)
                .addComponent(ImportM)
                .addGap(11, 11, 11)
                .addComponent(ImportP)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnchorO)
                    .addComponent(AnchorA)
                    .addComponent(AnchorC)
                    .addComponent(AnchorH)
                    .addComponent(AnchorR)
                    .addComponent(AnchorN))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ImportR)
                                    .addComponent(AnxietyN)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(resetbutton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ImportT))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FlaxL)
                            .addComponent(FlaxF)
                            .addComponent(FlaxA)
                            .addComponent(AnxietyX))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addComponent(ImportS)
                        .addGap(18, 18, 18)
                        .addComponent(AnxietyE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AnxietyI)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(AnxietyT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hint1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HolidaysH)
                            .addComponent(HolidaysO)
                            .addComponent(HolidaysL)
                            .addComponent(HolidaysI)
                            .addComponent(HolidaysD)
                            .addComponent(HolidaysA)
                            .addComponent(AnxietyY)
                            .addComponent(HolidaysS))
                        .addGap(92, 92, 92)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(63, 63, 63))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(backgroundicon)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAnswerActionPerformed
        String answer = userAnswer.getText();
        if (answer.length() > 8) {

        } else if ("anchor".equalsIgnoreCase(answer)) {
            showanchor();
        } else if ("anxiety".equalsIgnoreCase(answer)) {
            showanxiety();
        } else if ("holidays".equalsIgnoreCase(answer)) {
            showholidays();
        } else if ("imports".equalsIgnoreCase(answer)) {
            showimports();

        } else if ("flax".equalsIgnoreCase(answer)) {
            showflax();
        }
    }//GEN-LAST:event_userAnswerActionPerformed

    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbuttonActionPerformed
        
        clearboard();
    }//GEN-LAST:event_resetbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PuzzleDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuzzleDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuzzleDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuzzleDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuzzleDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnchorA;
    private javax.swing.JLabel AnchorC;
    private javax.swing.JLabel AnchorH;
    private javax.swing.JLabel AnchorN;
    private javax.swing.JLabel AnchorO;
    private javax.swing.JLabel AnchorR;
    private javax.swing.JLabel AnxietyE;
    private javax.swing.JLabel AnxietyI;
    private javax.swing.JLabel AnxietyN;
    private javax.swing.JLabel AnxietyT;
    private javax.swing.JLabel AnxietyX;
    private javax.swing.JLabel AnxietyY;
    private javax.swing.JLabel FlaxA;
    private javax.swing.JLabel FlaxF;
    private javax.swing.JLabel FlaxL;
    private javax.swing.JLabel Hint1;
    private javax.swing.JLabel HolidaysA;
    private javax.swing.JLabel HolidaysD;
    private javax.swing.JLabel HolidaysH;
    private javax.swing.JLabel HolidaysI;
    private javax.swing.JLabel HolidaysL;
    private javax.swing.JLabel HolidaysO;
    private javax.swing.JLabel HolidaysS;
    private javax.swing.JLabel ImportI;
    private javax.swing.JLabel ImportM;
    private javax.swing.JLabel ImportP;
    private javax.swing.JLabel ImportR;
    private javax.swing.JLabel ImportS;
    private javax.swing.JLabel ImportT;
    private javax.swing.JLabel backgroundicon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton resetbutton;
    private javax.swing.JTextField userAnswer;
    // End of variables declaration//GEN-END:variables
}
