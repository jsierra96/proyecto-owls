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
        btn1.setBorder(null);
        btn2.setBorder(null);
        btn3.setBorder(null);
        btn4.setBorder(null);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn1.setBounds(30, 70, 300, 120);
        jPanel2.add(btn1);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        btn2.setBounds(360, 70, 300, 120);
        jPanel2.add(btn2);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        btn3.setBounds(30, 230, 300, 120);
        jPanel2.add(btn3);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        btn4.setBounds(360, 230, 300, 120);
        jPanel2.add(btn4);
        jLabel3.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Unidad 2 Raices");
        jLabel3.setBounds(210, 10, 250, 50);
        jPanel2.add(jLabel3);
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
