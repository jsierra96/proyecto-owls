//Paquete donde se ubica
package unidad2;
//Importación de librerias
import java.awt.*;
import javax.swing.*;
import LibreriasLion.*;
import java.awt.Color;
import java.awt.MouseInfo;
import java.io.*;
import clases.window;
public class secante{ //Clase
  // Variables declaration - do not modify//GEN-BEGIN:variables
  JButton btn1 = new JButton();
  JButton btn2 = new JButton();
  JButton btn3 = new JButton();
  JLabel fun = new JLabel();
  JButton jButton1 = new JButton();
  JLabel jLabel1 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel4 = new JLabel();
  JLabel jLabel5 = new JLabel();
  JLabel jLabel8 = new JLabel();
  JPanel jPanel1 =new JPanel();
  JScrollPane jScrollPane1 = new JScrollPane();
  JButton min1 = new JButton();
  JTextArea textarea = new JTextArea();
  JTextField tx1 = new JTextField();
  JTextField tx2 = new JTextField();
  JTextField tx3 = new JTextField();
  JTextField tx4 = new JTextField();
  JTextField tx5 = new JTextField();
  window ventana;
  String ruta=System.getProperty("user.dir");       //ruta de sistema para archivo ayuda
  public secante() { //Metodo constructor
        initComponents(); //Inicializacion de componentes
        ImageIcon img=new ImageIcon(getClass().getResource("/funcion.png"));         //se crea una variable de tipo ImageIcon que contiene la direccion del recurso imagen que sera un icono
        fun.setIcon(new ImageIcon(img.getImage().getScaledInstance(fun.getWidth(), fun.getHeight(), Image.SCALE_DEFAULT)) ); //se aplica sobre el componente la configuracion del icono importado
        btn1.setEnabled(false);     //Deshabilitar boton calcular                                               //se configura el color de fondo del componente

    }
    private void initComponents() {
    	fun.setBounds(20, 63, 50, 18); //configuracion de tamaño y posicion al componente
        jPanel1.add(fun); //añade el componente al panel
        tx1.setBackground(new java.awt.Color(178, 235, 242));   //se configura el color de fondo del componente
        tx1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107))); //Se configura y personaliza el borde del componente
        tx1.setBounds(80, 60, 120, 25); //configuracion de tamaño y posicion al componente
        jPanel1.add(tx1);   //añade el componente al panel
        tx2.setBackground(new java.awt.Color(178, 235, 242));   //se configura el color de fondo del componente
        tx2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107))); //Se configura y personaliza el borde del componente
        tx2.setBounds(80, 120, 120, 25);    //configuracion de tamaño y posicion al componente
        jPanel1.add(tx2);   //añade el componente al panel
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));  // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel1.setText("Tolerancia:"); //se configura el texto a mostrar
        jLabel1.setBounds(170, 180,100,30); //configuracion de tamaño y posicion al componente
        jPanel1.add(jLabel1);   //añade el componente al panel
        tx3.setBackground(new java.awt.Color(178, 235, 242));   //se configura el color de fondo del componente
        tx3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107))); //Se configura y personaliza el borde del componente
        
        tx3.setBounds(350, 60, 90, 30); //configuracion de tamaño y posicion al componente
        jPanel1.add(tx3);   //añade el componente al panel
        tx4.setBackground(new java.awt.Color(178, 235, 242));   //se configura el color de fondo del componente
        tx4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107))); //Se configura y personaliza el borde del componente
        tx4.setBounds(350, 100, 90, 30);    //configuracion de tamaño y posicion al componente
        jPanel1.add(tx4);  //añade el componente al panel
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2)); //Se configura y personaliza el borde del componente
        textarea.setEditable(false);
        textarea.setBackground(new java.awt.Color(178, 235, 242));  //se configura el color de fondo del componente
        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea); //muesta el componente sobre el scroll
        jScrollPane1.setBounds(80, 230, 390, 150);  //configuracion de tamaño y posicion al componente
        jPanel1.add(jScrollPane1);  //añade el componente al panel
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));  // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel3.setText("xn-1:");   //se configura el texto a mostrar
        jLabel3.setBounds(300, 60,50,30);   //configuracion de tamaño y posicion al componente
        jPanel1.add(jLabel3);   //añade el componente al panel
        btn1.setText("Calcular");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn1ActionPerformed(evt);
            }
        });
        btn1.setBounds(470, 100, 100,  30);
        jPanel1.add(btn1);  //añade el componente al panel
        btn2.setText("Regresar");   //se configura el texto a mostrar
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn2ActionPerformed(evt);
            }
        });
        btn2.setBounds(480, 350, 100, 30);  //configuracion de tamaño y posicion al componente
        jPanel1.add(btn2);  //añade el componente al panel
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));  // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel4.setText("Raiz =");  //se configura el texto a mostrar
        jLabel4.setBounds(20, 120,60,30);   //configuracion de tamaño y posicion al componente
        jPanel1.add(jLabel4);   //añade el componente al panel
        tx5.setBackground(new java.awt.Color(178, 235, 242));   //se configura el color de fondo del componente
        tx5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107))); //Se configura y personaliza el borde del componente
        tx5.setBounds(290, 180, 90, 30);    //configuracion de tamaño y posicion al componente
        jPanel1.add(tx5);   //añade el componente al panel
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));  // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel5.setText("xn:"); //se configura el texto a mostrar
        jLabel5.setBounds(320,100,30,30);   //configuracion de tamaño y posicion al componente
        jPanel1.add(jLabel5);   //añade el componente al panel
        jLabel8.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102)); // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel8.setText("Secante"); //se configura el texto a mostrar
        jLabel8.setBounds(230,0,120,50);   //configuracion de tamaño y posicion al componente
        jPanel1.add(jLabel8);   //añade el componente al panel
        btn3.setText("Validar");    //se configura el texto a mostrar
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn3ActionPerformed(evt);
            }
        });
        btn3.setBounds(470, 50, 100, 30);   //configuracion de tamaño y posicion al componente
        jPanel1.add(btn3);  //añade el componente al panel
        jButton1.setText("Limpiar");    //se configura el texto a mostrar
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(470, 150, 100, 30);  //configuracion de tamaño y posicion al componente
        jPanel1.add(jButton1);  //añade el componente al panel
        min1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                min1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                min1MouseExited(evt);
            }
        });
        min1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                min1ActionPerformed(evt);
            }
        });
        ventana=new window(600,450,jPanel1,min1,true);
    }

//Boton para el menu unidad 2                                                       //Evento al hacer clic en el boton
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        menu_uni2 obj=new menu_uni2();
        ventana.dispose();
    }//GEN-LAST:event_btn2ActionPerformed
//Algoritmo para resolver Raiz por metodo de secante                                //Evento al hacer clic en el boton
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        double xn1,xn,xn2=0,tol,e=258; //Variables para almacenar los valores necesarios para la formula
        String ms=""; //vaiable ms para creacion de una cadena de texto
        xn1=Double.parseDouble(tx3.getText()); //asigna el valor de la caja de texto txt3 convertido en un valor double
        xn=Double.parseDouble(tx4.getText());//asigna el valor de la caja de texto txt4 convertido en un valor double
        tol=Double.parseDouble(tx5.getText());//asigna el valor de la caja de texto txt5 convertido en un valor double
        int c=1;//varible que funcionara como un contador
        while(tol<e){//Mientras la tolerancia sea menor que el error, segir haciendo iteraciones ejecutando el componente evaluador
            xn2=xn-(  (  (avaluaexpre.Posfija(tx1.getText(),String.valueOf(xn))  ) *
                    (xn1-xn)) / (avaluaexpre.Posfija(tx1.getText(),String.valueOf(xn1))-
                    avaluaexpre.Posfija(tx1.getText() ,String.valueOf(xn)) )  );
            e=Math.abs((xn2-xn)/xn2); // intruccion que realiza una operacion con la estructura e((a * b)/(c-d)) la cual envia ala libreria evaluador para la clase evaluaexpre en el metodo posfija pasandole la funcion y el valor de la caja de texto txt1
            ms=ms+"\n\nValores en la iteracion "+c+"\nXn: "+xn+"\nXn-1"+xn1+"\nXn+1: "+xn2;
            if(e<=tol)
                break;  //Fin del método por secante
            else{
                xn1=xn;
                xn=xn2;

            }
            c++;
        }
        ms=ms+"\n\n\n -----------La raiz tiende a ser:-------\n Raiz ≈"+xn2;
        textarea.setText(ms);
        tx2.setText(String.valueOf(xn2));
    }//GEN-LAST:event_btn1ActionPerformed
              
//Metodo para validar que no haya campos vacios y los valores introducidos sean del tipo de dato correcto
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if(tx1.getText().equals("")&&tx5.getText().equals("")&&tx3.getText().equals("")&&tx4.getText().equals("")){  //valida que las cajas de Xn-1, Xn,la raiz y funcion no esten vacias
            JOptionPane.showMessageDialog(null,"Algun campo esta vacio");
        }else{
            try {                                       //Excepcion para parsear tipo de dato
		Float.parseFloat(tx5.getText());
                Float.parseFloat(tx3.getText());
                Float.parseFloat(tx4.getText());
                btn1.setEnabled(true);
	    } catch (NumberFormatException nfe){
		JOptionPane.showMessageDialog(null,"El valor de Xn-1, Xn, la tolerancia o la raiz, no es un numero");  //Mensaje de error
	    }
        }
    }//GEN-LAST:event_btn3ActionPerformed
                                                                                    //Evento al entrar al componente el puntero el mouse
    private void min1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min1MouseEntered
        min1.setBackground(new Color(153, 202, 253));
    }//GEN-LAST:event_min1MouseEntered
                                                                                    //Evento al salir del componente el puntero del mouse
    private void min1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min1MouseExited
        min1.setBackground(new Color(33, 97, 140));
    }//GEN-LAST:event_min1MouseExited
//Método para abrir el documento de ayuda                                               //Evento al hacer clic en el boton
    private void min1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min1ActionPerformed
        String ruta = System.getProperty("user.dir"); //Variable para almacenar ruta del sistema
        String fileLocal = ruta + "/docu/RAÍCES-DE-UNA-FUNCIÓN-SECANTE.docx"; //ubicacion y nombre del archivo ayuda
        try                             //Excepción para abrir el archivo sin problemas
        {
            File path = new File(fileLocal);        //Abre el documento
            Desktop.getDesktop().open(path);
        }
        catch (IOException e)                       //Excepción
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_min1ActionPerformed
//Método para limpiar                                                               //Evento al hacer clic en el boton
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
tx1.setText("");                                                                    //Limpia cuadros de texto
tx2.setText("");                                                                    //
tx3.setText("");                                                                    //
tx4.setText("");                                                                    //
tx5.setText("");                                                                    //
textarea.setText("");                                                               //
    }
}
