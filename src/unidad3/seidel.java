//Nombre del paquete
package unidad3;
//Importacion de librerias
import java.awt.*;
import javax.swing.*;

import clases.window;

import java.io.File;
import java.io.IOException;
public class seidel{ //Clase

  // Variables declaration - do not modify//GEN-BEGIN:variables
  JButton btn1=new JButton();
  JButton btn2=new JButton();
  JButton btn3=new JButton();
  JButton min1=new JButton();
  JButton jButton1=new JButton();
  JLabel jLabel1=new JLabel();
  JLabel jLabel10=new JLabel();
  JLabel jLabel11=new JLabel();
  JLabel jLabel12=new JLabel();
  JLabel jLabel13=new JLabel();
  JLabel jLabel16=new JLabel();
  JLabel jLabel17=new JLabel();
  JLabel jLabel18=new JLabel();
  JLabel jLabel3=new JLabel();
  JLabel jLabel4=new JLabel();
  JLabel jLabel5=new JLabel();
  JLabel jLabel6=new JLabel();
  JLabel jLabel7=new JLabel();
  JLabel jLabel8=new JLabel();
  JLabel jLabel9=new JLabel();
  JPanel jPanel1=new JPanel();
  JPanel jPanel3=new JPanel();
  window ventana;
  JScrollPane jScrollPane1=new JScrollPane();
  JTextArea jTextArea1=new JTextArea();
  JTextField jTextField1=new JTextField();
  JTextField jTextField10=new JTextField();
  JTextField jTextField11=new JTextField();
  JTextField jTextField12=new JTextField();
  JTextField jTextField13=new JTextField();
  JTextField jTextField2=new JTextField();
  JTextField jTextField3=new JTextField();
  JTextField jTextField4=new JTextField();
  JTextField jTextField5=new JTextField();
  JTextField jTextField6=new JTextField();
  JTextField jTextField7=new JTextField();
  JTextField jTextField8=new JTextField();
  JTextField jTextField9=new JTextField();
  float x11,x12,x13,e1x1,e1x2,e1x3,c1x1,c1x2,c1x3,i1x1,c2x1,c2x2,c2x3,i2x1,c3x1,c3x2,c3x3,i3x1; //Variables para recibir los valores
  double tol; //tolerancia de error
  private int c=1; //Contador
  private boolean ban=false,ban2= false; //Banderas para validaciones
  // End of variables declaration//GEN-END:variables

    public seidel() { //Constructor
        initComponents(); //Inicializacion de componentes
        btn2.setEnabled(false);
    }

    private void initComponents() {

        jLabel10.setText("X3");jTextArea1.setBackground(new java.awt.Color(178, 235, 242)); //configura el texto a mostrar
        jTextArea1.setColumns(20); //configura columnas
        jTextArea1.setRows(5);  //configura filas
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2)); //configuracion del borde del componente
        jScrollPane1.setViewportView(jTextArea1); //muestra el txtarea en el scrollpanle
        jScrollPane1.setBounds(550, 96, 320, 296);  //configuracion de tamaño y posicion al componente
        jPanel1.add(jScrollPane1);  //añade el componente al panel
        btn2.setText("Calcular");       //Configura el texto a mostrar
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn2ActionPerformed(evt);
            }
        });
        btn2.setBounds(420, 470, 100, 30);  //configuracion de tamaño y posicion al componente
        jPanel1.add(btn2);//añade el componente al panel
        btn3.setText("Limpiar");    //Configura el texto a mostrar
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn3ActionPerformed(evt);
            }
        });
        btn3.setBounds(550, 470, 100, 30);  //configuracion de tamaño y posicion al componente
        jPanel1.add(btn3);//añade el componente al panel
        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 121, 107));    // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel13.setText("Tolerancia:");    //Configura el texto a mostrar
        jLabel13.setBounds(44, 425, 100,30);    //configuracion de tamaño y posicion al componente
        jPanel1.add(jLabel13);  //añade el componente al panel
        jTextField13.setBackground(new java.awt.Color(178, 235, 242));//se configura el color de fondo del componente
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));//configuracion del borde del componente
        jTextField13.setBounds(150, 430, 70, 30);   //configuracion de tamaño y posicion al componente
        jPanel1.add(jTextField13);  //añade el componente al panel
        btn1.setText("Validar");    //Configura el texto a mostrar
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn1ActionPerformed(evt);
            }
        });
        btn1.setBounds(290, 470, 100, 30);  //configuracion de tamaño y posicion al componente
        jPanel1.add(btn1);//añade el componente al panel
        jPanel3.setBackground(new java.awt.Color(174, 214, 241));//se configura el color de fondo del componente
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2), "Ecuaciones depejadas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(0, 121, 107))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout()); //Cofigura el lienzo

        jLabel16.setText("__________________________________");     //Configura el texto a mostrar
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 20));//añade el componente al panel

        jLabel1.setText("__________________________________");  //Configura el texto a mostrar
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 255, -1, -1));//añade el componente al panel

        jLabel17.setText("__________________________________"); //Configura el texto a mostrar
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, 20));//añade el componente al panel

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 121, 107)); // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel7.setText("X3");  //Configura el texto a mostrar
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 40, -1, -1));//añade el componente al panel

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 121, 107)); // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel6.setText("X2");  //Configura el texto a mostrar
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 40, -1, -1));//añade el componente al panel

        jTextField4.setBackground(new java.awt.Color(178, 235, 242));//se configura el color de fondo del componente
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));//configuracion del borde del componente
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 40, 30));//añade el componente al panel

        jTextField2.setBackground(new java.awt.Color(178, 235, 242));//se configura el color de fondo del componente
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));//configuracion del borde del componente
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 40, 28));//añade el componente al panel

        jTextField1.setBackground(new java.awt.Color(178, 235, 242));//se configura el color de fondo del componente
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));//configuracion del borde del componente
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 40, 30));//añade el componente al panel

        jTextField3.setBackground(new java.awt.Color(178, 235, 242));//se configura el color de fondo del componente
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));//configuracion del borde del componente
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 40, 30));//añade el componente al panel

        jTextField12.setBackground(new java.awt.Color(178, 235, 242));//se configura el color de fondo del componente
        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));//configuracion del borde del componente
        jPanel3.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 40, 30));//añade el componente al panel

        jTextField5.setBackground(new java.awt.Color(178, 235, 242));//se configura el color de fondo del componente
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));//configuracion del borde del componente
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 40, 30));//añade el componente al panel

        jTextField6.setBackground(new java.awt.Color(178, 235, 242));//se configura el color de fondo del componente
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));//configuracion del borde del componente
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 40, 30));//añade el componente al panel

        jTextField7.setBackground(new java.awt.Color(178, 235, 242));
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));//configuracion del borde del componente
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 40, 30));//añade el componente al panel

        jTextField9.setBackground(new java.awt.Color(178, 235, 242));//se configura el color de fondo del componente
        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));//configuracion del borde del componente
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 40, 30));//añade el componente al panel

        jTextField10.setBackground(new java.awt.Color(178, 235, 242));//se configura el color de fondo del componente
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));//configuracion del borde del componente
        jPanel3.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 40, 30));//añade el componente al panel

        jTextField11.setBackground(new java.awt.Color(178, 235, 242));//se configura el color de fondo del componente
        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));//configuracion del borde del componente
        jPanel3.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 40, 30));//añade el componente al panel

        jTextField8.setBackground(new java.awt.Color(178, 235, 242));//se configura el color de fondo del componente
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));//configuracion del borde del componente
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 40, 30));//añade el componente al panel

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 121, 107));    // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel12.setText("X2"); //Configura el texto a mostrar
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));//añade el componente al panel

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 121, 107));// se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel11.setText("X1"); //Configura el texto a mostrar
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 230, -1, -1));//añade el componente al panel

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 121, 107));// se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel9.setText("X3");  //Configura el texto a mostrar
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));//añade el componente al panel

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 121, 107));// se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel8.setText("X1");  //Configura el texto a mostrar
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));//añade el componente al panel

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 121, 107));// se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel5.setText("X3="); //Configura el texto a mostrar
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));//añade el componente al panel

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 121, 107));// se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel3.setText("X1="); //Configura el texto a mostrar
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));    //añade el componente al panel

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 121, 107));// se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel4.setText("X2="); //Configura el texto a mostrar
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));   //añade el componente al panel
        jPanel3.setBounds(30, 70, 320, 330);    //configuracion de tamaño y posicion al componente
        jPanel1.add(jPanel3);   //añade el componente al panel
        jLabel18.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));// se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel18.setText("Gauss Seidel");   //Configura el texto a mostrar
        jLabel18.setBounds(310, 10, 200, 50);   //configuracion de tamaño y posicion al componente
        jPanel1.add(jLabel18);  //añade el componente al panel
        jLabel18.getAccessibleContext().setAccessibleDescription("");
        jButton1.setText("Regresar");   //Configura el texto a mostrar
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(850, 510, 100,30);   //configuracion de tamaño y posicion al componente
        jPanel1.add(jButton1); //añade el componente al panel

        min1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {       //Evento al entrar al componente el puntero el mouse
                min1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {    //Evento al salir del componente el puntero del mouse
                min1MouseExited(evt);
            }
        });
        min1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                min1ActionPerformed(evt);
            }
        });
        ventana=new window(990,590,jPanel1,min1,true);
    }// </editor-fold>//GEN-END:initComponents
//Boton para calcular el metodo                                                     //Evento al hacer clic en el boton
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
     if(ban==true && ban2==true){ //variables que validan que haya diagonal fuerte antes de poder calcular
     calcular(); //entra al metodo
     ban=false;     //regresa a falso las banderas
     ban2=false;    //
     }
     else
         JOptionPane.showMessageDialog(null,"Verifica primero los datos");      //mensaje de advertencia
     // imprime();
    }//GEN-LAST:event_btn2ActionPerformed
//boton limpiar                                                                    //Evento al hacer clic en el boton
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
      jTextArea1.setText(" ");
      btn2.setEnabled(false);
      this.jTextArea1.setText(" ");
    this.jTextField1.setText(" ");
    this.jTextField2.setText(" ");
    this.jTextField3.setText(" ");
    this.jTextField4.setText(" ");
    this.jTextField5.setText(" ");
    this.jTextField6.setText(" ");
    this.jTextField7.setText(" ");
    this.jTextField8.setText(" ");
    this.jTextField9.setText(" ");
    this.jTextField10.setText(" ");
    this.jTextField11.setText(" ");
    this.jTextField12.setText(" ");
    this.jTextField13.setText(" ");
    }//GEN-LAST:event_btn3ActionPerformed
//Captura de valores en las variables                                               //Evento al hacer clic en el boton
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        ban=false;  //Variables para validacion de datos
        ban2=false; //Variables para validacion de datos
        try{                                                        //recibe los valores capurados en los cuadros de texto para X
     i1x1=Float.parseFloat(jTextField1.getText());                  //resultado para la primera ecuacion
     c1x2=Float.parseFloat(jTextField2.getText());                  //valor para x2 en la primera ecuacion
     c1x3=Float.parseFloat(jTextField3.getText());                  //valor para x3 en la primera ecuacion
     c1x1=Float.parseFloat(jTextField4.getText());                  //Valor para x1 en la primera ecuacion y valor que contiene primer elemento de diagonal fuerte
     i2x1=Float.parseFloat(jTextField5.getText());                  //resultado para la segunda ecuacion
     c2x2=Float.parseFloat(jTextField6.getText());                  //valor para x1 en la segunda ecuacion
     c2x3=Float.parseFloat(jTextField7.getText());                   //valor para x3 en la segunda ecuacion
     c2x1=Float.parseFloat(jTextField8.getText());                  //Valor para x2 en la segunda ecuacion y valor que contiene segundo elemento de diagonal fuerte
     i3x1=Float.parseFloat(jTextField9.getText());                  //resultado para la tercera ecuacion
     c3x1=Float.parseFloat(jTextField10.getText());                 //valor para x2 en la tercera ecuacion
     c3x2=Float.parseFloat(jTextField11.getText());                 //valor para x1 en la tercera ecuacion
     c3x3=Float.parseFloat(jTextField12.getText());                 //Valor para x3 en la tercera ecuacion y valor que contiene tercer elemento de diagonal fuerte
     tol=Double.parseDouble(jTextField13.getText());                    //Captura valor de la tolerancia
     btn2.setEnabled(true);
     if(tol>1)
         JOptionPane.showMessageDialog(null,"Verificar la tolerancia");  //Validacion de la tolerancia
     else
    ban=true;       //Dato correcto, bandera en true
        }
         catch(NumberFormatException e){        //Excepcion
         JOptionPane.showMessageDialog(null, "Ha ingresado un valor invalido para el sistema"); //Mensaje de error
             }
verificar(); //Una vez los datos introducidos sean correctos, ejecucion del metodo verificar que verifica la condicion del metodo, la diagonal fuerte


    }//GEN-LAST:event_btn1ActionPerformed
                                                                                  //Evento al salir del componente el puntero del mouse
                                                                                        //Evento al entrar al componente el puntero el mouse
    private void min1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min1MouseEntered
        min1.setBackground(new Color(153, 202, 253));
    }//GEN-LAST:event_min1MouseEntered
                                                                                    //Evento al salir del componente el puntero del mouse
    private void min1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min1MouseExited
        min1.setBackground(new Color(33, 97, 140));
    }//GEN-LAST:event_min1MouseExited
//Abrir el documento de ayuda                                                       //Evento al hacer clic en el boton
    private void min1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min1ActionPerformed
        String ruta = System.getProperty("user.dir"); //Ruta del sistema
        String fileLocal = ruta + "/docu/ECUACIONES-SIMULTÁNEAS-GAUSS-SEIDEL.pdf"; //Ruta y nombre del archivo
        try                     //Abre  el archivo
        {
            File path = new File(fileLocal);
            Desktop.getDesktop().open(path);
        }
        catch (IOException e)           //Excepcion
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_min1ActionPerformed
                                                                                    //Evento al hacer clic en el boton
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        menu_uni3 m=new menu_uni3();
        ventana.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
   //Verificación de la condición del método (condición: Diagonal fuerte)
    public void verificar(){
        try{
            if(Math.abs(c1x1)<Math.abs(c1x2) || Math.abs(c1x1)<Math.abs(c1x3) || Math.abs(c1x1)<Math.abs(c2x2) || Math.abs(c1x1)<Math.abs(c3x1)||           //Condicion para diagonal fuerte
                Math.abs(c2x1)<Math.abs(c1x2)|| Math.abs(c2x1)<Math.abs(c2x2) || Math.abs(c2x1)<Math.abs(c2x3) || Math.abs(c2x1)<Math.abs(c3x2)||           //
                Math.abs(c3x3)<Math.abs(c1x3)|| Math.abs(c3x3)<Math.abs(c3x3) || Math.abs(c3x3)<Math.abs(c1x1) ||Math.abs(c3x3)<Math.abs(c1x2)              //

               )
                throw new Exception("Verificar diagonal fuerte");   //Advertencia de condicion del metodo
            else{
                ban2=true;              //La variable bandera se pone en Verdadero
              //  JOptionPane.showMessageDialog(null,"Correcto");
            }

        }
        catch(Exception e){}
    }
    //Calculo de iteraciones en matriz de 3x3
    public void calcular(){

        float v1x1=0,v1x2=0,v1x3=0;  // variables para almacenar resultados por iteracion en X1, X2, X3
        c=1;                            //Variable para incrementar ciclo
x11=(i1x1+c1x2*x12+c1x3*x13)/c1x1;      //variable que almacena el resultado de la ecuacion X1 ya despejada
x12=(i2x1+c2x2*x11+c2x3*x13)/c2x1;      //variable que almacena el resultado de la ecuacion X2 ya despejada
x13=(i3x1+c3x1*x11+c3x2*x12)/c3x3;      //variable que almacena el resultado de la ecuacion X3 ya despejada
e1x1=Math.abs((x11-v1x1)/x11);          //Variable que almacena el resultado del primer error (para x1)
e1x2=Math.abs((x12-v1x2)/x12);          //Variable que almacena el resultado del segundo error (para x2)
e1x3=Math.abs((x13-v1x3)/x13);          //Variable que almacena el resultado del tercer error   (para x3)
jTextArea1.append("------------------------------\nNúmero de iteraciónes: "+c+"\n Valor de X1: "+x11+"\n Valor de X2: "+x12+"\n Valor de X3: "+ x13+"\n Error de X1: "+e1x1+"\n Error de X2: "+e1x2+"\n Error de X3: "+e1x3+"\n"); //Imprime el resultado de cada X en el sistema de ecuaciones
for(;;){ //Ciclo indefinido                                                                                                                                                                                                        // asi como el error obtenido por cada una de estas (x)
    c++;                //Incremento
 v1x1=x11;v1x2=x12;v1x3=x13;            //variables almacenando el resultado de la anterior interacion  en X1, X2, X3
x11=(i1x1+c1x2*v1x2+c1x3*v1x3)/c1x1;    //variable que almacena el resultado de la ecuacion X1 ya despejada
x12=(i2x1+c2x2*x11+c2x3*v1x3)/c2x1;     //variable que almacena el resultado de la ecuacion X2 ya despejada
x13=(i3x1+c3x1*x11+c3x2*x12)/c3x3;      //variable que almacena el resultado de la ecuacion X3 ya despejada
e1x1=Math.abs((x11-v1x1)/x11);          //Variable que almacena el resultado del primer error (para x1)
e1x2=Math.abs((x12-v1x2)/x12);          //Variable que almacena el resultado del segundo error (para x2)
e1x3=Math.abs((x13-v1x3)/x13);           //Variable que almacena el resultado del tercer error   (para x3)
jTextArea1.append("\nNúmero de iteraciónes: "+c+"\n Valor de X1: "+x11+"\n Valor de X2: "+x12+"\n Valor de X3: "+ x13+"\n Error de X1: "+e1x1+"\n Error de X2: "+e1x2+"\n Error de X3: "+e1x3+"\n");    //Imprime el resultado de cada X en el sistema de ecuaciones
if(e1x1<=tol&&e1x2<=tol&&e1x3<=tol)  //si el porcentaje de error de las 3 X es menor o igual a la tolerancia dada;                                                                                      // asi como el error obtenido por cada una de estas (x)
    break;    //rompe el ciclo
}

    }

}
