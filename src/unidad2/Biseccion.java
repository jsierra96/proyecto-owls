//Nombre del paquete
package unidad2;
//Importación de las librerias java
import java.awt.*;
import javax.swing.*;
import java.io.*;
import clases.*;
//clase
public class Biseccion{


  // Variables declaration - do not modify//GEN-BEGIN:variables
  JButton btn1 = new JButton();
  JButton btn2 = new JButton();
  JButton btn3 = new JButton();
  JButton btn4 = new JButton();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel4 = new JLabel();
  JLabel jLabel5 = new JLabel();
  JLabel jLabel8 = new JLabel();
  JPanel jPanel2 = new JPanel();
  JScrollPane jScrollPane1 = new JScrollPane();
  JButton min1 = new JButton();
  JTextField tx1 = new JTextField();
  JTextField txt1 = new JTextField();
  JTextField txt2 = new JTextField();
  JTextField txt3 = new JTextField();
  JTextArea txtarea = new JTextArea();
  JLabel fun=new JLabel();
  window ventana;
  // End of variables declaration//GEN-END:variables
   double a;  //variable que almacena el valor de Xi
   double b;  //Variable que almacena el valor de Xs
   double error;  //Variable para almacenar el margen de error

    public Biseccion() {                //Método constructor
        initComponents();               //Inicializar y configurar componentes
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        min1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {   //Evento al entrar al componente el puntero el mouse
                min1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {     //Evento al salir del componente el puntero del mouse   
                min1MouseExited(evt);
            }
        });
        min1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                min1ActionPerformed(evt);
            }
        });
        jLabel8.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); //Personaliza la fuente
        jLabel8.setForeground(new java.awt.Color(0, 102, 102)); // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel8.setText("Biseccion");   //Configura el texto a mostrar
        jLabel8.setBounds(239, 0, 150, 50); //configuracion de tamaño y posicion al componente
        jPanel2.add(jLabel8);   //Se alade el componente al panel
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 97, 140, 2))); //Modificar el borde
        txtarea.setEditable(false);
        txtarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 97, 140), 2));
        txtarea.setBackground(new java.awt.Color(178, 235, 242));   //se configura el color de fondo del componente
        txtarea.setColumns(20); //Configuracion de la columna
        txtarea.setRows(5); //Configuracion de la fila
        jScrollPane1.setViewportView(txtarea); //mostrar componente Scroll
        jScrollPane1.setBounds(400, 60, 230, 230);  //configuracion de tamaño y posicion al componente
        jPanel2.add(jScrollPane1);  //Se alade el componente al panel
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); //Personaliza la fuente
        jLabel3.setForeground(new java.awt.Color(0, 102, 102)); // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel3.setText("Xs:"); //Configura el texto a mostrar
        jLabel3.setBounds(95, 160, 30, 30); //configuracion de tamaño y posicion al componente
        jPanel2.add(jLabel3);   //Se alade el componente al panel
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); //Personaliza la fuente
        jLabel4.setForeground(new java.awt.Color(0, 102, 102)); // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel4.setText("Xi:"); //Configura el texto a mostrar
        jLabel4.setBounds(95, 110, 30,30);  //configuracion de tamaño y posicion al componente
        jPanel2.add(jLabel4);   //Se alade el componente al panel
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); //Personaliza la fuente
        jLabel5.setForeground(new java.awt.Color(0, 102, 102)); // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel5.setText("Tolerancia:"); //Configura el texto a mostrar
        jLabel5.setBounds(30, 230, 100,30); //configuracion de tamaño y posicion al componente
        jPanel2.add(jLabel5);   //Se alade el componente al panel
        btn1.setText("Calcular");   //Configura el texto a mostrar
        btn1.setToolTipText("");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn1ActionPerformed(evt);
            }
        });
        btn1.setBounds(240, 100, 100, 30);  //configuracion de tamaño y posicion al componente
        jPanel2.add(btn1); //Se alade el componente al panel
        btn2.setText("Limpiar");    //Configura el texto a mostrar
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn2ActionPerformed(evt);
            }
        });
        btn2.setBounds(240, 150, 100, 30);  //configuracion de tamaño y posicion al componente
        jPanel2.add(btn2);  //Se alade el componente al panel
        btn3.setText("Regresar");   //Configura el texto a mostrar
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn3ActionPerformed(evt);
            }
        });
        btn3.setBounds(530, 300, 100, 30);  //configuracion de tamaño y posicion al componente
        jPanel2.add(btn3);  //Se alade el componente al panel
        txt1.setBackground(new java.awt.Color(178, 235, 242));  //se configura el color de fondo del componente
        txt1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 97, 140, 2)));
        txt1.setBounds(130, 110, 60, 30);   //configuracion de tamaño y posicion al componente
        jPanel2.add(txt1);  //Se alade el componente al panel
        txt2.setBackground(new java.awt.Color(178, 235, 242));  //se configura el color de fondo del componente
        txt2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); //Configuracion de la fuente de letra
        txt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 97, 140), 2));
        txt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 97, 140), 2));
        txt2.setBounds(130, 160, 60, 30);   //configuracion de tamaño y posicion al componente
        jPanel2.add(txt2);  //Se alade el componente al panel
        txt3.setBackground(new java.awt.Color(178, 235, 242));  //se configura el color de fondo del componente
        txt3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 97, 140), 2));
        txt3.setBounds(130, 230, 60, 30);   //configuracion de tamaño y posicion al componente
        jPanel2.add(txt3);  //Se alade el componente al panel
        btn4.setText("Validar");    //Configura el texto a mostrar
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn4ActionPerformed(evt);
            }
        });
        btn4.setBounds(100, 270, 100, 30);  //configuracion de tamaño y posicion al componente
        tx1.setBackground(new java.awt.Color(178, 235, 242));
        tx1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 97, 140), 2));
        fun.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); //Personaliza la fuente
        fun.setForeground(new java.awt.Color(0, 102, 102)); // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        fun.setText("Funcion:"); //Configura el texto a mostrar
        tx1.setBounds(100, 60, 120, 25);
        fun.setBounds(18, 68, 90, 18);
        jPanel2.add(tx1);
        jPanel2.add(fun);
        jPanel2.add(btn4);  //Se alade el componente al panel
        ventana=new window(650,370,jPanel2,min1,true);
    }
        //Botón calcular                                                             //Evento al hacer clic en el boton
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
       Datos();
    }//GEN-LAST:event_btn1ActionPerformed
//evento para abrir el menu de unidad 2                                              //Evento al hacer clic en el boton
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        menu_uni2 obj=new menu_uni2();
        ventana.dispose();
    }//GEN-LAST:event_btn3ActionPerformed
          //Boton limpiar                                                             //Evento al hacer clic en el boton
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        txt1.setText("");       //se limpian los componentes de entrada de datos
        txt2.setText("");       //
        txt3.setText("");       //
        txtarea.setText("");    //Se limpia el area donde se muestra el resultado
    }//GEN-LAST:event_btn2ActionPerformed
                //Boton Validar                                                         //Evento al hacer clic en el boton
    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if(txt1.getText().equals("")&&txt2.getText().equals("")&&txt3.getText().equals("")){  //valida que las cajas de Xi, Xs y la tolerancia no esten vacias
            JOptionPane.showMessageDialog(null,"Hay al gun campo vacio");
        }else{
            try {                                       //Se valida con una excepcion que lo campos en los txt1,2,3 sean numericos y no interrumpir la ejecucion
		Float.parseFloat(txt1.getText());
                Float.parseFloat(txt2.getText());
                Float.parseFloat(txt2.getText());
                btn1.setEnabled(true);                  //habilita el botón para calcular
	    } catch (NumberFormatException nfe){
		JOptionPane.showMessageDialog(null,"El valor de X o X0 no es un numero");
	    }
        }
    }//GEN-LAST:event_btn4ActionPerformed
                                                                                        //Evento al entrar al componente el puntero el mouse
    private void min1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min1MouseEntered
        min1.setBackground(new Color(153, 202, 253));
    }//GEN-LAST:event_min1MouseEntered
                                                                                    //Evento al salir del componente el puntero del mouse
    private void min1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min1MouseExited
        min1.setBackground(new Color(33, 97, 140));
    }//GEN-LAST:event_min1MouseExited
 //Evento del boton Ayuda, para el enlace desde el boton hacia el documento propio del metodo       //Evento al hacer clic en el boton
    private void min1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min1ActionPerformed
        String ruta = System.getProperty("user.dir"); //Variable para almacenar la ruta del sistema
        String fileLocal = ruta + "/src/docu/EXTRAPOLACION.docx"; //Variable para almacenar el nombre del documento de ayuda y la carpeta donde se encuentra
        try                             //excepcion para abrir sin problema el archivo de ayuda
        {
            File path = new File(fileLocal);
            Desktop.getDesktop().open(path);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    //Metodo con formula para el resultado programada
    public double funcion(double x) {
      double resultado =x*Math.sin(x)-1;  //Variable que guardara el resultado
      return resultado;
   }
    //Metodo para resolver la raiz por el metodo de Biseccion
   public void solucion() {
       String ms="";
       ms=ms+"Intervalo :\n"+"Xi: [" + a + "], Xs: [" + b + "]\n"+"Error : " + error+"\n------------------------------------------------ \n";
      double c = 0;  //
      double fa = 0; //Variables para controlar las iteracciones de la ejecucion de la formula
      double fb = 0; //
      double fc = 0; //
      int iteracion = 1;
      do {
         c = (a + b) / 2;
         //System.out.println("Iteracion " + iteracion + " :  Punto Medio: " + c );
                                    //Interacciones para controlar el punto medio
         fa = funcion(a);
         fb = funcion(b);
         fc = funcion(c);
         if (fc * fa < 0) {
            b = c;
            fa = funcion(a);
            fb = funcion(b);
            c = (a + b) / 2;
            fc = funcion(c);
         } else {
            a = c;
            fa = funcion(a);
            fb = funcion(b);
            c = (a + b) / 2;
            fc = funcion(c);
         }
         iteracion++;                                                       //Obtencion del porcentaje de error respecto al punto medio buscado
         if(Math.abs(fc) <= error)
            ms=ms+"\nIteracion " + iteracion + " :  Punto Medio: " + c + " \nError: "+ Math.abs(fc)+"\nRaiz: "+ c;
         if(iteracion >500){                                            //Si las iteracciones superan las 500 vueltas, el metodo no es el mas preciso
              ms=ms+"\n\n��ATENCION!!\nVerificar la funcion por otro metodo, existe "
                      + "una posible sucesion infinita (Calculo Ciclado)"+"\n\nIteracion " + iteracion + " : "
                      + " Punto Medio: " + c + " Error: "+ Math.abs(fc);
              break;
         }
      } while (Math.abs(fc) >= error);                              //Condición del ciclo
      txtarea.setText(ms);
   }
   //Método para Validar los valores ingresados
   public void Datos() {
       boolean ban1=false,ban2=false;               //Variables boleanas para el control de las validaciones de los valores numericos introducidos
       if(ban1==false){
           try{
               a=Double.parseDouble(txt1.getText());                                                    //Validación para que los datos ingresados sean numeros para txt1 y txt2
               ban1=true;                                                                               //
               if(ban1==true && ban2==false){                                                           //
                   try{                                                                                 //
                       b=Double.parseDouble(txt2.getText());                                            //
                       ban2=true;                                                                       //
                       if(ban1==true && ban2==true)                                                     //
                           Error();                                                                     //
                   }catch(NumberFormatException e){                                                     //
                       JOptionPane.showMessageDialog(null,"El valor ingresado como Xs\n no es numero"); //
                   }                                                                                    //
               }                                                                                        //
            }catch(NumberFormatException e){                                                            //
                JOptionPane.showMessageDialog(null,"El valor ingresado como Xi\n no es un Numero");     //
            }                                                                                           //
       }
    }
   //Método para validar la tolerancia de error (Menor a 1)
   public void Error() {
      boolean ban=false;  //Variable boleana para controlar la validacion de la tolerancia de error introducida
      try{
          error=Double.parseDouble(txt3.getText());
          ban=true;
          if(ban==true){
              if(error>1)                                                                       //Validación para el valor de la tolerancia de error
                JOptionPane.showMessageDialog(null,"Verificar la toleancia del error");
              else
                solucion();
          }
      }catch(NumberFormatException e){                                                          //Excepción
      JOptionPane.showMessageDialog(null,"La tolerancia no es un numero\n o no a ingresado una.");
      }
    }
}
