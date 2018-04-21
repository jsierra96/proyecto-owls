//Paquete
package unidad2;
//Importacion de librerias
import javax.swing.*;
import java.awt.*;
import clases.*;
public class menu_uni2{  //Clase
    // Variables declaration - do not modify//GEN-BEGIN:variables
    JButton btn1 = new JButton();
    JButton btn2 = new JButton();
    JButton btn3 = new JButton();
    JButton btn4 = new JButton();
    JLabel jLabel3 = new JLabel();
    JPanel jPanel2 = new JPanel();
    window ventana;
    // End of variables declaration//GEN-END:variables
    public menu_uni2() { //Metodo constructor 
        initComponents();  //Inicializacion de componentes 
        botones();          //Ejecuta metodo botones
    }
        //Metodo para la configuracion de los botones
   public void botones(){
       btn1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnpasivos/btn9.png")).getImage().getScaledInstance(btn1.getWidth(),btn1.getHeight(),Image.SCALE_DEFAULT)));                       //se aplica sobre el componente la configuracion del icono importado
       btn1.setRolloverIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnactivos/btn9.png")).getImage().getScaledInstance(btn1.getWidth(),btn1.getHeight(),Image.SCALE_DEFAULT)));               //Se configuran una opcion de multiples iconos sobre el componente (bontes activos y pasivos)
       btn1.setOpaque(false);   //configura la transparencia del componente                                                                                                                                                                             //Configuración de icono de botón
       btn1.setContentAreaFilled(false);        //Se configuran areas de contenido llenas en sobre el componente
       btn2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnpasivos/btn7.png")).getImage().getScaledInstance(btn1.getWidth(),btn1.getHeight(),Image.SCALE_DEFAULT)));                       //se aplica sobre el componente la configuracion del icono importado
       btn2.setRolloverIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnactivos/btn7.png")).getImage().getScaledInstance(btn1.getWidth(),btn1.getHeight(),Image.SCALE_DEFAULT)));               //Se configuran una opcion de multiples iconos sobre el componente (bontes activos y pasivos)
       btn2.setOpaque(false);  //configura la transparencia del componente                                                                                                                                                                             //Configuración de icono de botón
       btn2.setContentAreaFilled(false);        //Se configuran areas de contenido llenas en sobre el componente                                                                                                                                                                 //Configuración de icono de botón
       btn3.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnpasivos/btn10.png")).getImage().getScaledInstance(btn1.getWidth(),btn1.getHeight(),Image.SCALE_DEFAULT)));                      //se aplica sobre el componente la configuracion del icono importado
       btn3.setRolloverIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnactivos/btn11.png")).getImage().getScaledInstance(btn1.getWidth(),btn1.getHeight(),Image.SCALE_DEFAULT)));              //Se configuran una opcion de multiples iconos sobre el componente (bontes activos y pasivos)
       btn3.setOpaque(false);   //configura la transparencia del componente                                                                                                                                                                            //Configuración de icono de botón
       btn3.setContentAreaFilled(false);        //Se configuran areas de contenido llenas en sobre el componente                                                                                                                                                                 //Configuración de icono de botón
       btn4.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnpasivos/btnsalir.png")).getImage().getScaledInstance(btn4.getWidth(),btn4.getHeight(),Image.SCALE_DEFAULT)));                   //se aplica sobre el componente la configuracion del icono importado
       btn4.setRolloverIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnactivos/btnsalir.png")).getImage().getScaledInstance(btn4.getWidth(),btn4.getHeight(),Image.SCALE_DEFAULT)));           //Se configuran una opcion de multiples iconos sobre el componente (bontes activos y pasivos)
       btn4.setOpaque(false);   //configura la transparencia del componente                                                                                                                                                                            //Configuración de icono de botón
       btn4.setContentAreaFilled(false);    //Se configuran areas de contenido llenas en sobre el componente                                                                                                                                                                 //Configuración de icono de botón
   }
    private void initComponents() {
        btn1.setBorder(null);   //deshabilita el borde al boton
        btn2.setBorder(null);   //deshabilita el borde al boton
        btn3.setBorder(null);   //deshabilita el borde al boton
        btn4.setBorder(null);   //deshabilita el borde al boton
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn1ActionPerformed(evt);
            }
        });
        btn1.setBounds(30, 70, 300, 120);   //configuracion de tamaño y posicion al componente
        jPanel2.add(btn1);  //se añade el componente al panel
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn2ActionPerformed(evt);
            }
        });
        btn2.setBounds(360, 70, 300, 120);  //configuracion de tamaño y posicion al componente
        jPanel2.add(btn2);  //se añade el componente al panel
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn3ActionPerformed(evt);
            }
        });
        btn3.setBounds(30, 230, 300, 120);  //configuracion de tamaño y posicion al componente
        jPanel2.add(btn3);  //se añade el componente al panel
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        btn4.setBounds(360, 230, 300, 120); //configuracion de tamaño y posicion al componente
        jPanel2.add(btn4); //se añade el componente al panel
        jLabel3.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Unidad 2 Raices"); //se configura el texto a mostrar
        jLabel3.setBounds(210, 10, 250, 50);   //configuracion de tamaño y posicion al componente
        jPanel2.add(jLabel3);   //se añade el componente al panel
        ventana=new window(700,400,jPanel2,btn4,false);
    }

//Boton para abrir el metodo bisección                                              //Evento al hacer clic en el boton
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        Biseccion obj=new Biseccion();
        ventana.dispose();
    }//GEN-LAST:event_btn1ActionPerformed
//Boton para el método Newton Rhapson                                               //Evento al hacer clic en el boton
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       Newton_Rhapson obj=new Newton_Rhapson();
       ventana.dispose();
    }//GEN-LAST:event_btn2ActionPerformed
//Boton para el método secante                                                          //Evento al hacer clic en el boton
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        secante sec=new secante();
        ventana.dispose();
    }//GEN-LAST:event_btn3ActionPerformed
//Boton para regresar al menú principal                                             //Evento al hacer clic en el boton
    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        menuprincipal obj=new menuprincipal();
        ventana.dispose();
    }
}
