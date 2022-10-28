/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package weka_ult1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File; 
import java.io.FileReader; 
import java.io.PrintWriter;
import java.util.ArrayList; 
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; 
import weka.classifiers.trees.J48;
import weka.core.Instances; 
import weka.gui.treevisualizer.PlaceNode2;
import weka.gui.treevisualizer.TreeVisualizer;
 

/**
 *
 * @author ASUS
 */

public class Frame1  extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     * @throws java.lang.Exception
     */    
    Metodos a = new Metodos();
    ArrayList<String> Lista = new ArrayList<>();
    DefaultTableModel dtml = new DefaultTableModel(); 
    DefaultTableModel dtml2 = new DefaultTableModel();
    DefaultTableModel dtml3 = new DefaultTableModel();
    public Frame1()  {
        initComponents(); 
                
        this.setTitle("Predictor Con Weka");
        setLocationRelativeTo(null);
        dtml.addColumn("N°");
        dtml2.addColumn("El Predictor Indica ");        
        dtml3.addColumn("Detalle");
    }
    public String validarTor(){ 
        String descision = ""; 
        if (edad.getText().equals("") && num_parto.getText().equals("") && hr_parto.getText().equals("") && problem_cardi.getText().equals("") && pre_sangu.getText().equals("")) {    
            validateFalse(); 
            JOptionPane.showMessageDialog(null, "Existen campss vacios", "Ventana de Error", JOptionPane.ERROR_MESSAGE); 
            descision = "deten";
        }
        
        ArrayList<String> edades = new ArrayList<String>();
        edades.add("22");
        edades.add("26");
        edades.add("28");
        edades.add("27");
        edades.add("32");
        edades.add("36");
        edades.add("33");
        edades.add("23");
        edades.add("20");
        edades.add("29");
        edades.add("25");
        edades.add("37");
        edades.add("24");
        edades.add("18");
        edades.add("30");
        edades.add("40");
        edades.add("31");
        edades.add("19");
        edades.add("21");
        edades.add("35");
        edades.add("17");
        edades.add("38");
        ArrayList<String> numeroparto = new ArrayList<>();
        numeroparto.add("1");
        numeroparto.add("2");
        numeroparto.add("3");
        numeroparto.add("4");
        ArrayList<String> Hor_Part = new ArrayList<>();
        Hor_Part.add("0");
        Hor_Part.add("1");
        Hor_Part.add("2"); 
        ArrayList<String> Problema_Cardiaco = new ArrayList<>();
        Problema_Cardiaco.add("0"); 
        Problema_Cardiaco.add("1");  
        ArrayList<String> Precion_Sanguinea = new ArrayList<>();
        Precion_Sanguinea.add("0");
        Precion_Sanguinea.add("1");
        Precion_Sanguinea.add("2");  
        
        if (edades.contains(edad.getText()) && numeroparto.contains(num_parto.getText()) && Hor_Part.contains(hr_parto.getText())&& Problema_Cardiaco.contains(problem_cardi.getText()) && Precion_Sanguinea.contains(pre_sangu.getText())) { 
            validateTrue();
            descision = ""; 
        } else {
            validateFalse(); 
            descision = "deten";
        }
        return descision;
    }
    public void validateFalse(){
        edad.setBackground(Color.red);
        problem_cardi.setBackground(Color.red);
        pre_sangu.setBackground(Color.red);
        problem_cardi.setBackground(Color.red);
        hr_parto.setBackground(Color.red);
        num_parto.setBackground(Color.red);
    }
    public void validateTrue(){
        edad.setBackground(Color.white);
        problem_cardi.setBackground(Color.white);
        pre_sangu.setBackground(Color.white);
        problem_cardi.setBackground(Color.white);
        hr_parto.setBackground(Color.white);
        num_parto.setBackground(Color.white);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        ruta1 = new javax.swing.JTextField();
        ruta2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_clases = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        CARGARDATASET = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        edad = new javax.swing.JTextField();
        problem_cardi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        num_parto = new javax.swing.JTextField();
        hr_parto = new javax.swing.JTextField();
        pre_sangu = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        predi = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        INFO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 160, 160)));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 100, -1, 31));

        ruta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruta1ActionPerformed(evt);
            }
        });
        jPanel1.add(ruta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 33, 255, 31));
        jPanel1.add(ruta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 100, 255, 31));

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel2.setText("Archivo de aprendizaje");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, -1, -1));

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel3.setText("Archivo evaluativo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 77, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 160, 160)));
        jPanel3.setAutoscrolls(true);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("  Valor de Clases");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 348, 31));

        tabla_clases.setModel(dtml);
        jScrollPane1.setViewportView(tabla_clases);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 39, 261, 77));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 350, 130));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 33, -1, 31));

        CARGARDATASET.setText("CARGAR DATASET'S");
        CARGARDATASET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARGARDATASETActionPerformed(evt);
            }
        });
        jPanel1.add(CARGARDATASET, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 230, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 1050, 170));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 1050, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 160, 160)));
        jPanel2.setAutoscrolls(true);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 160, 160)));
        jPanel4.setAutoscrolls(true);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });
        jPanel4.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 140, -1));
        jPanel4.add(problem_cardi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 140, -1));

        jLabel6.setText("Edad");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 70, 23));

        jLabel7.setText("Parto Numero?");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 23));

        jLabel8.setText("Tipo de Parto");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 23));

        jLabel9.setText("Precion Sanguinea");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 120, 23));

        jLabel10.setText("Problema Cardiaco");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 120, 23));

        jButton3.setText("Predecir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 130, 30));
        jPanel4.add(num_parto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 140, -1));
        jPanel4.add(hr_parto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 140, -1));
        jPanel4.add(pre_sangu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 140, -1));

        jButton4.setText("Ver Arbol");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 90, 30));

        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, 23));

        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, 23));

        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, 23));

        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, 23));

        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, 23));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 360));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 160, 160)));
        jPanel5.setAutoscrolls(true);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("ALGORITMO");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 550, 30));

        predi.setColumns(20);
        predi.setRows(5);
        jScrollPane4.setViewportView(predi);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 640, 220));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 670, 260));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 160, 160)));
        jPanel6.setAutoscrolls(true);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Prediccion");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 660, 40));

        jTable1.setModel(dtml2);
        jScrollPane2.setViewportView(jTable1);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 640, 50));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 670, 90));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 1050, 380));

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PREDICCION DE CESAREA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 70));
        getContentPane().add(INFO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 1050, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        try{
        // muestra el cuadro de diálogo de archivos, para que el usuario pueda elegir el archivo a abrir
        JFileChooser selectorArchivos = new JFileChooser();
        selectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        int resultado = selectorArchivos.showOpenDialog(this);
        File archivo = selectorArchivos.getSelectedFile(); // obtiene el archivo seleccionado
        
        ruta2.setText(archivo.getPath());      
    
        //load training dataset   
        while (dtml2.getRowCount()>0){ //PARA REFRESAR
            dtml2.removeRow(0);
        }
        
        
        try {
            
            Lista = (a.Precision(ruta1.getText()));
            for(int i =0; i<Lista.size();i++){ 
                predi.setText(Lista.get(i));
             //   dtml3.addRow(new Object [] {Lista.get(i)}); 
            } 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Ventana de Error", JOptionPane.ERROR_MESSAGE); 
        } 
        try {
            
            Lista = (a.MostrarPrediccion(ruta1.getText(),archivo.getPath()));
            for(int i =0; i<Lista.size();i++){ 
                dtml2.addRow(new Object [] {Lista.get(i)}); 
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Ventana de Error", JOptionPane.ERROR_MESSAGE); 
        }
            }
        catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex, "Ventana de Error", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ruta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruta1ActionPerformed
   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     // muestra el cuadro de diálogo de archivos, para que el usuario pueda elegir el archivo a abrir
        try{ 
            JFileChooser selectorArchivos = new JFileChooser();
            selectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

            int resultado = selectorArchivos.showOpenDialog(this);
            File archivo = selectorArchivos.getSelectedFile(); // obtiene el archivo seleccionado
        
            ruta1.setText(archivo.getPath());       
        //load training dataset   
        while (dtml.getRowCount()>0){ //PARA REFRESAR
            dtml.removeRow(0);
        }
        try { 
            Lista = (a.BuscarDocumento(archivo.getPath())); 
            for(int i =0; i<Lista.size();i++){ 
                dtml.addRow(new Object [] {Lista.get(i)}); 
            } 
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex, "Ventana de Error", JOptionPane.ERROR_MESSAGE); 
        } 
           }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex, "Ventana de Error", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed

    private void CARGARDATASETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARGARDATASETActionPerformed
      
        File arch1 = new File("caesarian.arff");
        File arch2 = new File("caesarian-test.arff");
        
        ruta1.setText(arch1.getAbsolutePath());
        ruta2.setText(arch2.getAbsolutePath());
        //load training dataset   
        while (dtml.getRowCount()>0){ //PARA REFRESAR
            dtml.removeRow(0);
        }
        try { 
            Lista = (a.BuscarDocumento(ruta1.getText())); 
            for(int i =0; i<Lista.size();i++){ 
                dtml.addRow(new Object [] {Lista.get(i)}); 
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Ventana de Error", JOptionPane.ERROR_MESSAGE); 
        } 
        
        //load training dataset   
        while (dtml2.getRowCount()>0){ //PARA REFRESAR
            dtml2.removeRow(0);
        }
        
        
        try {
            
            Lista = (a.Precision(ruta1.getText()));
            for(int i =0; i<Lista.size();i++){ 
                predi.setText(Lista.get(i));
             //   dtml3.addRow(new Object [] {Lista.get(i)}); 
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Ventana de Error", JOptionPane.ERROR_MESSAGE); 
        }
        
        try {
            
            Lista = (a.MostrarPrediccion(ruta1.getText(),ruta2.getText()));
            for(int i =0; i<Lista.size();i++){ 
                dtml2.addRow(new Object [] {Lista.get(i)}); 
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Ventana de Error", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_CARGARDATASETActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 
        
        File arch1 = new File("caesarian.arff");
        File arch2 = new File("caesarian-test.arff");
 
        String descision = validarTor();
          
        if ("deten".equals(descision) || "deten".equals(descision) ||"deten".equals(descision) ||"deten".equals(descision) ||"deten".equals(descision) ){   
            int op = JOptionPane.showConfirmDialog(rootPane, "Ha ingresado datos errornes, Desea cerrar el programa? ");
            if(op == 0){
                dispose();
            }
        }else {
         
            try {
                    try (PrintWriter writer = new PrintWriter(arch2.getAbsolutePath(), "UTF-8")) {
                            writer.println(
                                        "@relation Cesaria \n" +
                                        "\n" +
                                        " \n" +
                                        "@attribute 'Edad' { 22,26,28,27,32,36,33,23,20,29,25,37,24,18,30,40,31,19,21,35,17,38 } \n" +
                                        "@attribute 'Numero de Parto' { 1,2,3,4 }\n" +
                                        "@attribute 'Hora de Parto' { 0,1,2 }\n" +
                                        "@attribute 'Precion Sanguinea' { 2,1,0 } \n" +
                                        "@attribute 'Problema Cardiaco' { 1,0 } \n" +
                                        "@attribute Cesaria { no_necesita_cesarea,necesita_cesarea }\n" +
                                        "\n" +
                                        "\n" +
                                        "@data");
                            writer.println(
                                        edad.getText()+","+
                                        problem_cardi.getText()+","+
                                        pre_sangu.getText()+","+
                                        hr_parto.getText()+","+
                                        num_parto.getText()+",?"
                                );
                        }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex, "Ventana de Error", JOptionPane.ERROR_MESSAGE);
                }



            arch1.getAbsolutePath();
            ruta1.setText(arch1.getAbsolutePath());
            ruta2.setText(arch2.getAbsolutePath());
            //load training dataset
            while (dtml.getRowCount()>0){ //PARA REFRESAR
                    dtml.removeRow(0);
                }
            try {
                    Lista = (a.BuscarDocumento(ruta1.getText()));
                    for(int i =0; i<Lista.size();i++){
                            dtml.addRow(new Object [] {Lista.get(i)});
                        }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex, "Ventana de Error", JOptionPane.ERROR_MESSAGE);
                }

            //load training dataset
            while (dtml2.getRowCount()>0){ //PARA REFRESAR
                    dtml2.removeRow(0);
                }
  
            try {
                    
                    Lista = (a.MostrarPrediccion(ruta1.getText(),ruta2.getText()));
                  
                    for(int i =0; i<Lista.size();i++){
                            dtml2.addRow(new Object [] {Lista.get(i)}); 
                        }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex, "Ventana de Error", JOptionPane.ERROR_MESSAGE);
            }    
            try {
                    Lista = (a.MostrarPrediccion(ruta1.getText(),ruta2.getText()));
                    try (PrintWriter writer = new PrintWriter(arch2.getAbsolutePath(), "UTF-8")) {
                          writer.println(
                                      "@relation Cesaria \n" +
                                      "\n" +
                                      " \n" +
                                      "@attribute 'Edad' { 22,26,28,27,32,36,33,23,20,29,25,37,24,18,30,40,31,19,21,35,17,38 } \n" +
                                      "@attribute 'Numero de Parto' { 1,2,3,4 }\n" +
                                      "@attribute 'Hora de Parto' { 0,1,2 }\n" +
                                      "@attribute 'Precion Sanguinea' { 2,1,0 } \n" +
                                      "@attribute 'Problema Cardiaco' { 1,0 } \n" +
                                      "@attribute Cesaria {no_necesita_cesarea,necesita_cesarea}\n" +
                                      "\n" +
                                      "\n" +
                                      "@data");
                          writer.println(
                                      edad.getText()+","+
                                              problem_cardi.getText()+","+
                                              pre_sangu.getText()+","+
                                              hr_parto.getText()+","+
                                              num_parto.getText()+","+
                                              Lista.get(0));
                      }
                    predi.setText("");
                    Lista = (a.Precision(ruta1.getText()));
                    for(int i =0; i<Lista.size();i++){
                            predi.setText(Lista.get(i));
                         //   dtml3.addRow(new Object [] {Lista.get(i)});
                        } 
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex, "Ventana de Error", JOptionPane.ERROR_MESSAGE);
                }

       

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
        J48 cls = new J48();
        Instances data = new Instances(new BufferedReader(new FileReader("D:\\caesarian.arff")));
        data.setClassIndex(data.numAttributes()-1);
        cls.buildClassifier(data); 
            // display classifier
        final javax.swing.JFrame jf = 
            new javax.swing.JFrame("Weka Classifier Tree Visualizer: J48");
            jf.setSize(500,400);
            jf.getContentPane().setLayout(new BorderLayout());
            TreeVisualizer tv = new TreeVisualizer(null,
                cls.graph(),
                new PlaceNode2());
            jf.getContentPane().add(tv, BorderLayout.CENTER);
            jf.addWindowListener(new java.awt.event.WindowAdapter() {
              public void windowClosing(java.awt.event.WindowEvent e) {
                jf.dispose();
              }
            });

            jf.setVisible(true);
            tv.fitToScreen();
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Ventana de Error", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
          INFO.setText("INFORMATIVO: EN ESTE CAMPO LOS VALORES VALIDOS SON}: \n"
                  + "1 - "
                  + "0"); 
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
         INFO.setText("INFORMATIVO: LAS EDADES QUE ESTE PROGRAMA PUEDE PREDECIR SON: \n"
                 + "\nENTRE 35 Y 38"
                 + "\nY 40"
                 + "\nENTRE 17 Y 33"); 
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        INFO.setText("INFORMATIVO: EN ESTE CAMPO LOS VALORES VALIDOS SON}: \n"
                 + "\n1 -"
                 + "\n2 -"
                 + "\n3 -"
                 + "\n4 "); 
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
           INFO.setText("INFORMATIVO: EN ESTE CAMPO LOS VALORES VALIDOS SON}: \n"
                 + "{0 = oportuno, 1 = prematuro, 2 = retrasado}"); 
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
          INFO.setText("INFORMATIVO: EN ESTE CAMPO LOS VALORES VALIDOS SON}: \n"
                 + "\n{0 = bajo , 1 = normal , 2 = alto }" ); 
    }//GEN-LAST:event_jRadioButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CARGARDATASET;
    private javax.swing.JLabel INFO;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField hr_parto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField num_parto;
    private javax.swing.JTextField pre_sangu;
    private javax.swing.JTextArea predi;
    private javax.swing.JTextField problem_cardi;
    private javax.swing.JTextField ruta1;
    private javax.swing.JTextField ruta2;
    public javax.swing.JTable tabla_clases;
    // End of variables declaration//GEN-END:variables
}
