//Paquete en donde se encuentra la clase
package unidad2;
//Importacion de las librerias utilizar
import LibreriasLion.avaluaexpre;
import evaluador.prueba;
import clases.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
public class Newton_Rhapson{
      // Variables declaration - do not modify//GEN-BEGIN:variables
      JButton btn1 = new JButton();
      JButton btn2 = new JButton();
      JButton btn3 = new JButton();
      JButton btn4 = new JButton();
      JButton btn5 = new JButton();
      JLabel eti1=new JLabel();
      JLabel eti2=new JLabel();
      principal.grafica grafica1= new principal.grafica();
      JLabel jLabel3=new JLabel();
      JLabel jLabel4=new JLabel();
      JLabel jLabel5=new JLabel();
      JLabel jLabel6=new JLabel();
      JLabel jLabel7=new JLabel();
      JPanel jPanel2=new JPanel();
      JPanel jPanel3=new JPanel();
      JPanel jPanel4=new JPanel();
      JButton min1=new JButton();
      JTextField txt1=new JTextField();
      JTextField txt10=new JTextField();
      JTextField txt11=new JTextField();
      JTextField txt12=new JTextField();
      JTextField txt13=new JTextField();
      JTextField txt14=new JTextField();
      JTextField txt15=new JTextField();
      JTextField txt16=new JTextField();
      JTextField txt2=new JTextField();
      JTextField txt3=new JTextField();
      JTextField txt4=new JTextField();
      JTextField txt5=new JTextField();
      JTextField txt6=new JTextField();
      JTextField txt7=new JTextField();
      JTextField txt8=new JTextField();
      JTextField txt9=new JTextField();
      JTextField txtf=new JTextField();
      JTextField txtf1=new JTextField();
      window ventana;
      // End of variables declaration//GEN-END:variables
    public Newton_Rhapson() { //Método constructor

        initComponents();  
        btn1.setEnabled(false);                                                         //Se deshabilita le boton1
        btn2.setEnabled(false);                                                         //Se deshabilita el boton2
        ImageIcon img1=new ImageIcon(getClass().getResource("/funcion.png"));       //se crea una variable de tipo ImageIcon que contiene la direccion del recurso imagen que sera un icono
        Icon ico1=new ImageIcon(img1.getImage().getScaledInstance(eti1.getWidth(), eti1.getHeight(),Image.SCALE_DEFAULT));  //Se define el tamaño del icono respecto al componente al que se aplicara
        eti1.setIcon(ico1);     //se aplica sobre el componente la configuracion del icono importado                                                     //Configuracion de componente
        ImageIcon img2=new ImageIcon(getClass().getResource("/derivada1.png"));     //se crea una variable de tipo ImageIcon que contiene la direccion del recurso imagen que sera un icono
        Icon ico2=new ImageIcon(img2.getImage().getScaledInstance(eti2.getWidth(), eti2.getHeight(),Image.SCALE_DEFAULT));//Se define el tamaño del icono respecto al componente al que se aplicara
        eti2.setIcon(ico2);     //se aplica sobre el componente la configuracion del icono importado                                                     //Configuracion de componente
    }
    private void initComponents() {
        min1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {      //Evento al entrar al componente el puntero el mouse
                min1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {    //Evento al salir del componente el puntero del mouse
                min1MouseExited(evt);
            }
        });
        min1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                min1ActionPerformed(evt);
            }
        });
        jPanel3.setBackground(new java.awt.Color(22, 160, 133));    //se configura el color de fondo del componente
        jPanel3.setOpaque(false);   //configura la transparencia del componente
        jPanel3.setLayout(new java.awt.GridLayout(8, 2)); //establece el lienzo sobre el panel
        jLabel3.setBackground(new java.awt.Color(79, 195, 247));    //se configura el color de fondo del componente
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));   // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); //Aliniamiento central
        jLabel3.setText("x");   //Configura el texto a mostrar
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 2, 2, new java.awt.Color(19, 141, 117)));   //Se configura el borde del componente
        jLabel3.setOpaque(true);    //configura la transparencia del componente
        jPanel3.add(jLabel3);   //Añade el componente al panel

        jLabel4.setBackground(new java.awt.Color(79, 195, 247));    //se configura el color de fondo del componente
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));   // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);  //Aliniamiento central
        jLabel4.setText("F ( x )"); //Configura el texto a mostrar
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 2, 2, 4, new java.awt.Color(19, 141, 117)));    //Se configura el borde del componente
        jLabel4.setOpaque(true);    //configura la transparencia del componente
        jPanel3.add(jLabel4);   //Añade el componente al panel

        txt1.setBackground(new java.awt.Color(178, 235, 242));  //se configura el color de fondo del componente
        txt1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 4, 2, 2, new java.awt.Color(19, 141, 117)));   //Se configura el borde del componente
        jPanel3.add(txt1);  //Añade el componente al panel

        txt2.setBackground(new java.awt.Color(178, 235, 242));  //se configura el color de fondo del componente
        txt2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 4, new java.awt.Color(19, 141, 117)));   //Se configura el borde del componente
        jPanel3.add(txt2);  //Añade el componente al panel

        txt2.setEditable(false);
        txt4.setEditable(false);
        txt6.setEditable(false);
        txt8.setEditable(false);
        txt10.setEditable(false);
        txt12.setEditable(false);
        txt14.setEditable(false);
        txt16.setEditable(false);
        txt3.setBackground(new java.awt.Color(178, 235, 242));  //se configura el color de fondo del componente
        txt3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 4, 2, 2, new java.awt.Color(19, 141, 117)));   //Se configura el borde del componente
        jPanel3.add(txt3);  //Añade el componente al panel

        txt4.setBackground(new java.awt.Color(178, 235, 242));  //se configura el color de fondo del componente
        txt4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 4, new java.awt.Color(19, 141, 117)));   //Se configura el borde del componente
        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                txt4ActionPerformed(evt);
            }
        });
        jPanel3.add(txt4);  //Añade el componente al panel

        txt5.setBackground(new java.awt.Color(178, 235, 242));  //se configura el color de fondo del componente
        txt5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 4, 2, 2, new java.awt.Color(19, 141, 117)));   //Se configura el borde del componente
        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                txt5ActionPerformed(evt);
            }
        });
        jPanel3.add(txt5);  //Añade el componente al panel

        txt6.setBackground(new java.awt.Color(178, 235, 242));  //se configura el color de fondo del componente
        txt6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 4, new java.awt.Color(19, 141, 117)));   //Se configura el borde del componente
        jPanel3.add(txt6);  //Añade el componente al panel

        txt7.setBackground(new java.awt.Color(178, 235, 242));  //se configura el color de fondo del componente
        txt7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 4, 2, 2, new java.awt.Color(19, 141, 117)));   //Se configura el borde del componente
        jPanel3.add(txt7);  //Añade el componente al panel

        txt8.setBackground(new java.awt.Color(178, 235, 242));  //se configura el color de fondo del componente
        txt8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 4, new java.awt.Color(19, 141, 117)));   //Se configura el borde del componente
        jPanel3.add(txt8);  //Añade el componente al panel

        txt9.setBackground(new java.awt.Color(178, 235, 242));  //se configura el color de fondo del componente
        txt9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 4, 2, 2, new java.awt.Color(19, 141, 117)));   //Se configura el borde del componente
        jPanel3.add(txt9);  //Añade el componente al panel

        txt10.setBackground(new java.awt.Color(178, 235, 242)); //se configura el color de fondo del componente
        txt10.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 4, new java.awt.Color(19, 141, 117)));  //Se configura el borde del componente
        jPanel3.add(txt10); //Añade el componente al panel

        txt11.setBackground(new java.awt.Color(178, 235, 242)); //se configura el color de fondo del componente
        txt11.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 4, 2, 2, new java.awt.Color(19, 141, 117)));  //Se configura el borde del componente
        jPanel3.add(txt11);//Añade el componente al panel

        txt12.setBackground(new java.awt.Color(178, 235, 242)); //se configura el color de fondo del componente
        txt12.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 4, new java.awt.Color(19, 141, 117)));  //Se configura el borde del componente
        jPanel3.add(txt12); //Añade el componente al panel

        txt13.setBackground(new java.awt.Color(178, 235, 242)); //se configura el color de fondo del componente
        txt13.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 4, 4, 2, new java.awt.Color(19, 141, 117)));  //Se configura el borde del componente
        jPanel3.add(txt13); //Añade el componente al panel

        txt14.setBackground(new java.awt.Color(178, 235, 242)); //se configura el color de fondo del componente
        txt14.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 4, 4, new java.awt.Color(19, 141, 117)));  //Se configura el borde del componente
        jPanel3.add(txt14); //Añade el componente al panel
        jPanel3.setBounds(49, 193, 128, 164);   //configuracion de tamaño y posicion al componente
        eti1.setBounds(15, 32, 70, 25); //configuracion de tamaño y posicion al componente
        eti2.setBounds(30, 100, 50, 45);    //configuracion de tamaño y posicion al componente
        jPanel2.add(jPanel3);   //Añade el componente al panel
        jPanel2.add(eti1);  //Añade el componente al panel
        jPanel2.add(eti2);  //Añade el componente al panel  
        txtf.setBackground(new java.awt.Color(178, 235, 242));  //se configura el color de fondo del componente
        txtf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));  //Se configura el borde del componente
        txtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfKeyPressed(evt);
            }
        });
        txtf.setBounds(90, 30, 120, 28);    //configuracion de tamaño y posicion al componente
        jPanel2.add(txtf);  //Añade el componente al panel
        txtf1.setBackground(new java.awt.Color(178, 235, 242)); //se configura el color de fondo del componente
        txtf1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));     //Se configura el borde del componente
        txtf1.setBounds(90, 110, 120, 28);  //configuracion de tamaño y posicion al componente
        jPanel2.add(txtf1); //Añade el componente al panel
        btn1.setText("Graficar");   //Configura el texto a mostrar
        btn1.setBorder(null);    //Se configura el borde del componente
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn1ActionPerformed(evt);
            }
        });
        btn1.setBounds(90, 70, 100, 30);    //configuracion de tamaño y posicion al componente
        jPanel2.add(btn1);  //Añade el componente al panel
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));  //Se configura el borde del componente
        javax.swing.GroupLayout grafica1Layout = new javax.swing.GroupLayout(grafica1);
        grafica1.setLayout(grafica1Layout);  //establece el lienzo sobre la grafic
        grafica1Layout.setHorizontalGroup(
            grafica1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );
        grafica1Layout.setVerticalGroup(
            grafica1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);    //establece el lienzo sobre el panel
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grafica1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grafica1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4.setBounds(280, 50, 500, 380);   //configuracion de tamaño y posicion al componente
        jPanel2.add(jPanel4);   //Añade el componente al panel
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));   // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel5.setText("Tolerancia:"); //Configura el texto a mostrar
        jLabel5.setBounds(50, 390, 100,30); //configuracion de tamaño y posicion al componente
        jPanel2.add(jLabel5);   //Añade el componente al panel
        txt15.setBackground(new java.awt.Color(178, 235, 242)); //se configura el color de fondo del componente
        txt15.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txt15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));     //Se configura el borde del componente
        txt15.setBounds(150, 390, 70, 30);  //configuracion de tamaño y posicion al componente
        jPanel2.add(txt15); //Añade el componente al panel
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));   // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel6.setText("Raiz =");  //Configura el texto a mostrar
        jLabel6.setBounds(230, 450,60,30);  //configuracion de tamaño y posicion al componente
        jPanel2.add(jLabel6);   //Añade el componente al panel
        txt16.setBackground(new java.awt.Color(178, 235, 242)); //se configura el color de fondo del componente
        txt16.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txt16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));     //Se configura el borde del componente
        txt16.setBounds(300, 450, 110, 30); //configuracion de tamaño y posicion al componente
        jPanel2.add(txt16); //Añade el componente al panel
        btn2.setText("Calcular");   //Configura el texto a mostrar
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn2ActionPerformed(evt);
            }
        });
        btn2.setBounds(450, 450, 100, 30);  //configuracion de tamaño y posicion al componente
        jPanel2.add(btn2);  //Añade el componente al panel
        btn3.setText("Limpiar");    //Configura el texto a mostrar
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn3ActionPerformed(evt);
            }
        });
        btn3.setBounds(590, 450, 100, 30);  //configuracion de tamaño y posicion al componente
        jPanel2.add(btn3);  //Añade el componente al panel
        jLabel7.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102)); // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel7.setText("Newton Rhapson");  //Configura el texto a mostrar
        jLabel7.setBounds(240, 0, 260,50);  //configuracion de tamaño y posicion al componente
        jPanel2.add(jLabel7);   //Añade el componente al panel
        btn4.setText("Validar");   //Configura el texto a mostrar
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn4ActionPerformed(evt);
            }
        });
        btn4.setBounds(100, 450, 100, 30);  //configuracion de tamaño y posicion al componente
        jPanel2.add(btn4);  //Añade el componente al panel
        btn5.setText("Regresar");   //Configura el texto a mostrar
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn5ActionPerformed(evt);
            }
        });
        btn5.setBounds(720, 450, 100, 30);  //configuracion de tamaño y posicion al componente
        jPanel2.add(btn5);  //Añade el componente al panel
       ventana=new window(850,530,jPanel2,min1,true);
    }
         
        //Metodo para abrir el menu de unidad 2 y cerrar esta ventana de este metodo    //Evento al hacer clic en el boton

//evento para tecla precionada                                                          //Evento al presionar clic sobre el componente
    private void txtfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfKeyPressed
        if(evt.getKeyCode()==10){
            grafica1.setFuncion(txtf.getText());
        }
    }
    //Metodo para graficar la funcion                                                       //Evento al hacer clic en el boton
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {
       grafica1.setFuncion(txtf.getText());
    }
    //Metodo para limpiar los valores introducidos                                  //Evento al hacer clic en el boton
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed

        grafica1.setFuncion("");                        //Valor en blanco para los componentes
        txtf.setText("");                               //
       txtf1.setText("");                               //
       txt1.setText("");                                //
       txt2.setText("");                                //
       txt3.setText("");                                //
       txt4.setText("");                                //
       txt5.setText("");                                //
       txt6.setText("");                                //
       txt7.setText("");                                //
       txt8.setText("");                                //
       txt9.setText("");                                //
       txt10.setText("");                               //
       txt11.setText("");                               //
       txt12.setText("");                               //
       txt13.setText("");                               //
       txt14.setText("");                               //
       txt15.setText("");                               //
       txt16.setText("");                               //
       btn1.setEnabled(false);                                                         //Se deshabilita le boton1
       btn2.setEnabled(false);   
    }//GEN-LAST:event_btn3ActionPerformed
    //Metodo para evaluar la funcion enviando los valores introducidos en la tabla al componente evaluador      //Evento al hacer clic en el boton
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

                txt2.setText(String.valueOf(prueba.Posfija(txtf.getText(),txt1.getText())));//introduce un valor a la caja de texto txt2, dicho valor es retornado de la libreria evaluador ala cual se le manda la funcion y el valor de x, en este caso txt1
                txt4.setText(String.valueOf(prueba.Posfija(txtf.getText(),txt3.getText())));//introduce un valor a la caja de texto txt4, dicho valor es retornado de la libreria evaluador ala cual se le manda la funcion y el valor de x, en este caso txt3
                txt6.setText(String.valueOf(prueba.Posfija(txtf.getText(),txt5.getText())));//introduce un valor a la caja de texto txt6, dicho valor es retornado de la libreria evaluador ala cual se le manda la funcion y el valor de x, en este caso txt5
                txt8.setText(String.valueOf(prueba.Posfija(txtf.getText(),txt7.getText())));//introduce un valor a la caja de texto txt8, dicho valor es retornado de la libreria evaluador ala cual se le manda la funcion y el valor de x, en este caso txt7
                txt10.setText(String.valueOf(prueba.Posfija(txtf.getText(),txt9.getText())));//introduce un valor a la caja de texto txt10, dicho valor es retornado de la libreria evaluador ala cual se le manda la funcion y el valor de x, en este caso txt9
                txt12.setText(String.valueOf(prueba.Posfija(txtf.getText(),txt11.getText())));//introduce un valor a la caja de texto txt12, dicho valor es retornado de la libreria evaluador ala cual se le manda la funcion y el valor de x, en este caso txt11
                txt14.setText(String.valueOf(prueba.Posfija(txtf.getText(),txt13.getText())));//introduce un valor a la caja de texto txt14, dicho valor es retornado de la libreria evaluador ala cual se le manda la funcion y el valor de x, en este caso txt13
                double [] valores=new double[7];//crea un areglo de datos de tipo double  de tamaño 7 con nombre vectores
                valores[0]=Double.parseDouble(txt2.getText());//asigna el valor de txt2 en la primera posicion del arreglo antes creado
                valores[2]=Double.parseDouble(txt6.getText());//se asigna el valor que se encuentra en la caja de texto txt6 en la tercera posicion del vector
                valores[1]=Double.parseDouble(txt4.getText());//se asigna el valor de la caja de texto txt4 a la segunda posicion del vector
                valores[3]=Double.parseDouble(txt8.getText());//asigna el valor de txt8 a la cuarta posicion de nuestro vector
                valores[4]=Double.parseDouble(txt10.getText());//asigna el valor que se encuentra en txt10 a la quinta posicion de nuestro vector
                valores[5]=Double.parseDouble(txt12.getText());//asigna el valor de la caja de texto txt12 a la sexta posicion del vector
                valores[6]=Double.parseDouble(txt14.getText());//asigna el valor de la caja de texto txt12 a la septima posicion del vector
                double xn=0; //Variable para almacenar el valor de Xn en la funcion
                int c=0; //incremento del ciclo
                for(int i=0;i<7;i++){  //Aplicacion del algoritmo para resolver las iteraciones del metodo

                    if(i+1 !=7){
                       if(valores[i]<0 ){
                          if(valores[i]<0 && valores[i+1]>0 ){
                           xn=valores[i];
                           break;
                       }
                       }else if(valores[i]>0){
                           if(valores[i]>0 && valores[i+1]<0 ){
                                  xn=valores[i];
                                  break;
                           }
                       }
                    }
                    c++; //asignacion del valor c que se ocupara para averiguar que valor ocupara x
                }
                double x=0; //creacion de la variable x de tipo double.
                //secuencia de condiciones if anidados para determinar el valor de x.
        if(c==0)
                x=Double.parseDouble(txt1.getText());
        else if(c==1)
                x=Double.parseDouble(txt3.getText());
        else if(c==2)
                x=Double.parseDouble(txt5.getText());
        else if(c==3)
                x=Double.parseDouble(txt7.getText());
        else if(c==4)
                x=Double.parseDouble(txt9.getText());
        else if(c==5)
                x=Double.parseDouble(txt11.getText());
        else if(c==6)
                x=Double.parseDouble(txt13.getText());
                Newton(x);  //Envio de valor al metodo Newton

    }//GEN-LAST:event_btn2ActionPerformed

    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5ActionPerformed
  //Método para validar los datos introducidos                                      //Evento al hacer clic en el boton
    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if(txtf.getText().equals("")&&txtf1.getText().equals("")&&txt1.getText().equals("")&&txt3.getText().equals("")
                &&txt5.getText().equals("")&&txt7.getText().equals("")&&txt9.getText().equals("")
                &&txt11.getText().equals("")&&txt13.getText().equals("")&&txt15.getText().equals("")){  //valida que las cajas de texto necesarias esten llenas
            JOptionPane.showMessageDialog(null,"Algun campo esta vacio");
        }else{
            try {                         //Excepcion para validar que los datos introducidos no sean letras y evitar que el programa se detenga
		Float.parseFloat(txt1.getText());
                Float.parseFloat(txt3.getText());
                Float.parseFloat(txt5.getText());
                Float.parseFloat(txt7.getText());
                Float.parseFloat(txt9.getText());
                Float.parseFloat(txt11.getText());
                Float.parseFloat(txt13.getText());
                Float.parseFloat(txt15.getText());
                btn1.setEnabled(true);
                btn2.setEnabled(true);
	    } catch (NumberFormatException nfe){                                    //Excepción
		JOptionPane.showMessageDialog(null,"Un dato en la columna de X o la tolerancia no es un numero");       //Mensaje de error
	    }
        }
    }//GEN-LAST:event_btn4ActionPerformed
//Método para regresar al menu de unidad 2 en el boton regresar                     //Evento al hacer clic en el boton
    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        menu_uni2 obj=new menu_uni2();
        ventana.dispose();
    }//GEN-LAST:event_btn5ActionPerformed
                                                                                    //Evento al entrar al componente el puntero el mouse
    private void min1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min1MouseEntered
        min1.setBackground(new Color(153, 202, 253));
    }//GEN-LAST:event_min1MouseEntered
                                                                                    //Evento al salir del componente el puntero del mouse
    private void min1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min1MouseExited
        min1.setBackground(new Color(33, 97, 140));
    }//GEN-LAST:event_min1MouseExited
        //Método para el enlace al archivo de ayuda del método                      //Evento al hacer clic en el boton
    private void min1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min1ActionPerformed
        String ruta = System.getProperty("user.dir"); //Variable que almacena la ruta del sistema
        String fileLocal = ruta + "/docu/RAÍCES-DE-UNA-FUNCIÓN-NEWTON.pdf"; //Variable que almacena el nombre del archivo y la carpeta donde se encuentra
        try
        {                       //Excepcion para abrir el archivo sin problemas
            File path = new File(fileLocal);
            Desktop.getDesktop().open(path);
        }
        catch (IOException e)               //Excepción lanzada
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_min1ActionPerformed
                                                                                    //Evento al hacer clic en el boton
    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4ActionPerformed
        //Método con el algoritmo para resolver el método newton Rhapson
    public void Newton(double aux){
        double tol = Double.parseDouble(txt15.getText());  //Variable para la tolerancia de error
        double error=710;  //Valor definido para limite de error antes de dar el metodo por ciclado
        double xn=aux; //Variable para almacenar el valor de xn debido a las iteraciones

        double xn1=0;
        while(error>tol){  //Iteraciones para encontrar el porcentaje de error
            xn1 = xn - avaluaexpre.Posfija(txtf.getText(), String.valueOf(xn)) / prueba.Posfija(txtf1.getText(), String.valueOf(xn));
            error = Math.abs((xn1 - xn) / xn1);
            if(error>tol){                                  //Comparacion por cada iteración del valor respecto a la tolerancia
                xn=xn1;
            }
        }
        txt16.setText(String.valueOf(xn1));                  //Mostrar raiz encontrada
    }
}
