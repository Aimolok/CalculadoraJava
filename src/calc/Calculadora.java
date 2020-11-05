
package calc;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;


public class Calculadora extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
            
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        textoOperacion = new javax.swing.JLabel();
        textoResultado = new javax.swing.JLabel();
        botonmas = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonpunto = new javax.swing.JButton();
        botondel = new javax.swing.JButton();
        botonigual = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        botonDivision = new javax.swing.JButton();
        botonmulti = new javax.swing.JButton();
        botonmenos = new javax.swing.JButton();
        BotonC = new javax.swing.JButton();

        jButton3.setBackground(new java.awt.Color(255, 252, 249));
        jButton3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 252, 249));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button1.jpg"))); // NOI18N
        jButton3.setText("C");
        jButton3.setFocusPainted(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonhover.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(280, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(128, 161, 212));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 252, 249));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(128, 161, 212), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoOperacion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        textoOperacion.setForeground(new java.awt.Color(38, 35, 34));
        textoOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(textoOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 238, 40));

        textoResultado.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        textoResultado.setForeground(new java.awt.Color(38, 35, 34));
        textoResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoResultado.setText("0");
        jPanel1.add(textoResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 238, 47));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 300, 160));

        botonmas.setBackground(new java.awt.Color(255, 252, 249));
        botonmas.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        botonmas.setForeground(new java.awt.Color(255, 252, 249));
        botonmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button1.jpg"))); // NOI18N
        botonmas.setText("+");
        botonmas.setFocusPainted(false);
        botonmas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonmas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonhover.jpg"))); // NOI18N
        botonmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmasActionPerformed(evt);
            }
        });
        jPanel2.add(botonmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 70, 60));

        boton7.setBackground(new java.awt.Color(255, 252, 249));
        boton7.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        boton7.setForeground(new java.awt.Color(255, 252, 249));
        boton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button1.jpg"))); // NOI18N
        boton7.setText("7");
        boton7.setFocusPainted(false);
        boton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonhover.jpg"))); // NOI18N
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        jPanel2.add(boton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 70, 60));

        boton4.setBackground(new java.awt.Color(255, 252, 249));
        boton4.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        boton4.setForeground(new java.awt.Color(255, 252, 249));
        boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button1.jpg"))); // NOI18N
        boton4.setText("4");
        boton4.setFocusPainted(false);
        boton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonhover.jpg"))); // NOI18N
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        jPanel2.add(boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 70, 60));

        boton1.setBackground(new java.awt.Color(255, 252, 249));
        boton1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        boton1.setForeground(new java.awt.Color(255, 252, 249));
        boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button1.jpg"))); // NOI18N
        boton1.setText("1");
        boton1.setFocusPainted(false);
        boton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonhover.jpg"))); // NOI18N
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        jPanel2.add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 70, 60));

        boton0.setBackground(new java.awt.Color(255, 252, 249));
        boton0.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        boton0.setForeground(new java.awt.Color(255, 252, 249));
        boton0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button1.jpg"))); // NOI18N
        boton0.setText("0");
        boton0.setFocusPainted(false);
        boton0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonhover.jpg"))); // NOI18N
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });
        jPanel2.add(boton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 70, 60));

        botonpunto.setBackground(new java.awt.Color(255, 252, 249));
        botonpunto.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        botonpunto.setForeground(new java.awt.Color(255, 252, 249));
        botonpunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button1.jpg"))); // NOI18N
        botonpunto.setText(".");
        botonpunto.setFocusPainted(false);
        botonpunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonpunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonhover.jpg"))); // NOI18N
        botonpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonpuntoActionPerformed(evt);
            }
        });
        jPanel2.add(botonpunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 70, 60));

        botondel.setBackground(new java.awt.Color(255, 252, 249));
        botondel.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        botondel.setForeground(new java.awt.Color(255, 252, 249));
        botondel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button1.jpg"))); // NOI18N
        botondel.setText("DEL");
        botondel.setFocusPainted(false);
        botondel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botondel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonhover.jpg"))); // NOI18N
        botondel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondelActionPerformed(evt);
            }
        });
        jPanel2.add(botondel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 70, 60));

        botonigual.setBackground(new java.awt.Color(255, 252, 249));
        botonigual.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        botonigual.setForeground(new java.awt.Color(255, 252, 249));
        botonigual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/igual2.jpg"))); // NOI18N
        botonigual.setText("=");
        botonigual.setFocusPainted(false);
        botonigual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonigual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/igual.jpg"))); // NOI18N
        botonigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonigualActionPerformed(evt);
            }
        });
        jPanel2.add(botonigual, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 210, 60));

        boton2.setBackground(new java.awt.Color(255, 252, 249));
        boton2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        boton2.setForeground(new java.awt.Color(255, 252, 249));
        boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button1.jpg"))); // NOI18N
        boton2.setText("2");
        boton2.setFocusPainted(false);
        boton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonhover.jpg"))); // NOI18N
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        jPanel2.add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 70, 60));

        boton3.setBackground(new java.awt.Color(255, 252, 249));
        boton3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        boton3.setForeground(new java.awt.Color(255, 252, 249));
        boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button1.jpg"))); // NOI18N
        boton3.setText("3");
        boton3.setFocusPainted(false);
        boton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonhover.jpg"))); // NOI18N
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        jPanel2.add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 70, 60));

        boton5.setBackground(new java.awt.Color(255, 252, 249));
        boton5.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        boton5.setForeground(new java.awt.Color(255, 252, 249));
        boton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button1.jpg"))); // NOI18N
        boton5.setText("5");
        boton5.setFocusPainted(false);
        boton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonhover.jpg"))); // NOI18N
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        jPanel2.add(boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 70, 60));

        boton6.setBackground(new java.awt.Color(255, 252, 249));
        boton6.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        boton6.setForeground(new java.awt.Color(255, 252, 249));
        boton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button1.jpg"))); // NOI18N
        boton6.setText("6");
        boton6.setFocusPainted(false);
        boton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonhover.jpg"))); // NOI18N
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        jPanel2.add(boton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 70, 60));

        boton8.setBackground(new java.awt.Color(255, 252, 249));
        boton8.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        boton8.setForeground(new java.awt.Color(255, 252, 249));
        boton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button1.jpg"))); // NOI18N
        boton8.setText("8");
        boton8.setFocusPainted(false);
        boton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonhover.jpg"))); // NOI18N
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        jPanel2.add(boton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 70, 60));

        boton9.setBackground(new java.awt.Color(255, 252, 249));
        boton9.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        boton9.setForeground(new java.awt.Color(255, 252, 249));
        boton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button1.jpg"))); // NOI18N
        boton9.setText("9");
        boton9.setFocusPainted(false);
        boton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonhover.jpg"))); // NOI18N
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        jPanel2.add(boton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 70, 60));

        botonDivision.setBackground(new java.awt.Color(255, 252, 249));
        botonDivision.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        botonDivision.setForeground(new java.awt.Color(255, 252, 249));
        botonDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button1.jpg"))); // NOI18N
        botonDivision.setText("/");
        botonDivision.setFocusPainted(false);
        botonDivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonDivision.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonhover.jpg"))); // NOI18N
        botonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivisionActionPerformed(evt);
            }
        });
        jPanel2.add(botonDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 70, 60));

        botonmulti.setBackground(new java.awt.Color(255, 252, 249));
        botonmulti.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        botonmulti.setForeground(new java.awt.Color(255, 252, 249));
        botonmulti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button1.jpg"))); // NOI18N
        botonmulti.setText("X");
        botonmulti.setFocusPainted(false);
        botonmulti.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonmulti.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonhover.jpg"))); // NOI18N
        botonmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmultiActionPerformed(evt);
            }
        });
        jPanel2.add(botonmulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 70, 60));

        botonmenos.setBackground(new java.awt.Color(255, 252, 249));
        botonmenos.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        botonmenos.setForeground(new java.awt.Color(255, 252, 249));
        botonmenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button1.jpg"))); // NOI18N
        botonmenos.setText("-");
        botonmenos.setFocusPainted(false);
        botonmenos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonmenos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonhover.jpg"))); // NOI18N
        botonmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmenosActionPerformed(evt);
            }
        });
        jPanel2.add(botonmenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 70, 60));

        BotonC.setBackground(new java.awt.Color(255, 252, 249));
        BotonC.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        BotonC.setForeground(new java.awt.Color(255, 252, 249));
        BotonC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button1.jpg"))); // NOI18N
        BotonC.setText("C");
        BotonC.setFocusPainted(false);
        BotonC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonhover.jpg"))); // NOI18N
        BotonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCActionPerformed(evt);
            }
        });
        jPanel2.add(BotonC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 70, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void addNumber(String digito){
        textoOperacion.setText(textoOperacion.getText()+digito);
    }
        public static String removeLastChar(String str) {
        return removeLastChars(str, 1);
    }
 
    public static String removeLastChars(String str, int chars) {
        return str.substring(0, str.length() - chars);
    }
    private void botonmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmasActionPerformed
        addNumber("+");
    }//GEN-LAST:event_botonmasActionPerformed

    private void BotonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCActionPerformed
textoOperacion.setText("");
textoResultado.setText("0");
    }//GEN-LAST:event_BotonCActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        addNumber("7");
        botonigual.doClick();
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        addNumber("4");
         botonigual.doClick();
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        addNumber("1");  
         botonigual.doClick();
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
            addNumber("0"); 
             botonigual.doClick();
    }//GEN-LAST:event_boton0ActionPerformed

    private void botonpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonpuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonpuntoActionPerformed

    private void botonigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonigualActionPerformed
        try {
            String resultado = se.eval(textoOperacion.getText()).toString();
                    textoResultado.setText(resultado);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_botonigualActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        addNumber("2"); 
         botonigual.doClick();
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        addNumber("3"); 
         botonigual.doClick();
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        addNumber("5");
         botonigual.doClick();
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        addNumber("6");
         botonigual.doClick();
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        addNumber("8");
         botonigual.doClick();
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        addNumber("9");
         botonigual.doClick();
    }//GEN-LAST:event_boton9ActionPerformed

    private void botonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDivisionActionPerformed
        addNumber("/"); 
    }//GEN-LAST:event_botonDivisionActionPerformed

    private void botonmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmultiActionPerformed
        addNumber("*"); 
    }//GEN-LAST:event_botonmultiActionPerformed

    private void botonmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmenosActionPerformed
        addNumber("-"); 
    }//GEN-LAST:event_botonmenosActionPerformed

    private void botondelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botondelActionPerformed
       textoOperacion.setText(removeLastChar(textoOperacion.getText()));
       botonigual.doClick();
    }//GEN-LAST:event_botondelActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonC;
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonDivision;
    private javax.swing.JButton botondel;
    private javax.swing.JButton botonigual;
    private javax.swing.JButton botonmas;
    private javax.swing.JButton botonmenos;
    private javax.swing.JButton botonmulti;
    private javax.swing.JButton botonpunto;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel textoOperacion;
    private javax.swing.JLabel textoResultado;
    // End of variables declaration//GEN-END:variables
}
