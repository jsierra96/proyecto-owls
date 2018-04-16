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
  int x,y;                                          //Variables para evento de posicionamiento del mouse
    public secante() { //Metodo constructor
        initComponents(); //Inicializacion de componentes
        ImageIcon img=new ImageIcon(getClass().getResource("/funcion.png"));         //se crea una variable de tipo ImageIcon que contiene la direccion del recurso imagen que sera un icono
        fun.setIcon(new ImageIcon(img.getImage().getScaledInstance(fun.getWidth(), fun.getHeight(), Image.SCALE_DEFAULT)) ); //se aplica sobre el componente la configuracion del icono importado
        btn1.setEnabled(false);     //Deshabilitar boton calcular                                               //se configura el color de fondo del componente

    }
    private void initComponents() {
    	fun.setBounds(20, 63, 50, 18);
        jPanel1.add(fun);
        tx1.setBackground(new java.awt.Color(178, 235, 242));
        tx1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107)));
        tx1.setBounds(80, 60, 120, 25);
        jPanel1.add(tx1);
        tx2.setBackground(new java.awt.Color(178, 235, 242));
        tx2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107)));
        tx2.setBounds(80, 120, 120, 25);
        jPanel1.add(tx2);
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Tolerancia:");
        jLabel1.setBounds(170, 180,100,30);
        jPanel1.add(jLabel1);
        tx3.setBackground(new java.awt.Color(178, 235, 242));
        tx3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107)));
        tx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx3ActionPerformed(evt);
            }
        });
        tx3.setBounds(350, 60, 90, 30);
        jPanel1.add(tx3);
        tx4.setBackground(new java.awt.Color(178, 235, 242));
        tx4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107)));
        tx4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx4ActionPerformed(evt);
            }
        });
        tx4.setBounds(350, 100, 90, 30);
        jPanel1.add(tx4);
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));
        textarea.setEditable(false);
        textarea.setBackground(new java.awt.Color(178, 235, 242));
        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);
        jScrollPane1.setBounds(80, 230, 390, 150);
        jPanel1.add(jScrollPane1);
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("xn-1:");
        jLabel3.setBounds(300, 60,50,30);
        jPanel1.add(jLabel3);
        btn1.setText("Calcular");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn1.setBounds(470, 100, 100, 30);
        jPanel1.add(btn1);
        btn2.setText("Regresar");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        btn2.setBounds(480, 350, 100, 30);
        jPanel1.add(btn2);
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Raiz =");
        jLabel4.setBounds(20, 120,60,30);
        jPanel1.add(jLabel4);
        tx5.setBackground(new java.awt.Color(178, 235, 242));
        tx5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107)));
        tx5.setBounds(290, 180, 90, 30);
        jPanel1.add(tx5);
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("xn:");
        jLabel5.setBounds(320,100,30,30);
        jPanel1.add(jLabel5);
        jLabel8.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Secante");
        jLabel8.setBounds(230,0,120,50);
        jPanel1.add(jLabel8);
        btn3.setText("Validar");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        btn3.setBounds(470, 50, 100, 30);
        jPanel1.add(btn3);
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(470, 150, 100, 30);
        jPanel1.add(jButton1);
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

    private void tx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx3ActionPerformed

    private void tx4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx4ActionPerformed
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
         
//Boton cerrar y para abrir el menu unidad 2                                        //Evento al hacer clic en el boton
    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        menu_uni2 m=new menu_uni2();
        ventana.dispose();
    }//GEN-LAST:event_cerrarActionPerformed
                       
//Metodo para validar que no haya campos vacios y los valores introducidos sean del tipo de dato correcto
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if(tx1.getText().equals("")&&tx5.getText().equals("")&&tx3.getText().equals("")&&tx4.getText().equals("")){  //valida que las cajas de Xn-1, Xn,la raiz y funcion no esten vacias
            JOptionPane.showMessageDialog(null,"Hay aungun campo vacio");
        }else{
            try {                                       //Excepcion para parsear tipo de dato
		Float.parseFloat(tx5.getText());
                Float.parseFloat(tx3.getText());
                Float.parseFloat(tx4.getText());
                btn1.setEnabled(true);
	    } catch (NumberFormatException nfe){
		JOptionPane.showMessageDialog(null,"El valor de X o X0 no es un numero");  //Mensaje de error
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
        String fileLocal = ruta + "/src/docu/EXTRAPOLACION.docx"; //ubicacion y nombre del archivo ayuda
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
