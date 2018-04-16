//nombre del paquete
package unidad3;
//Importacion de librerias
import java.awt.*; //Libreria contiene metodos para el diseño del modo grafico a componentes
import javax.swing.Icon;
import javax.swing.ImageIcon;
import clases.*;

public class menu_uni3{
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    window ventana;
    // End of variables declaration//GEN-END:variables

    public menu_uni3() { //Metodo constructor
        initComponents(); //Inicialización de componentes 
        botones();                                                        //ejecucion del metodo botones que configura iconos
    }
                                                                                    //personalizacion de los botones
   public void botones(){
       btn1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnpasivos/btn6.png")).getImage().getScaledInstance(btn1.getWidth(),btn1.getHeight(),Image.SCALE_DEFAULT)));               //se aplica sobre el componente la configuracion del icono importado
       btn1.setRolloverIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnactivos/btn6.png")).getImage().getScaledInstance(btn1.getWidth(),btn1.getHeight(),Image.SCALE_DEFAULT)));       //Se configuran una opcion de multiples iconos sobre el componente (bontes activos y pasivos)
       btn1.setOpaque(false);                    //configura la transparencia del componente
       btn1.setContentAreaFilled(false);         //Se configuran areas de contenido llenas en sobre el componente
       btn2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnpasivos/btn11.png")).getImage().getScaledInstance(btn1.getWidth(),btn1.getHeight(),Image.SCALE_DEFAULT)));              //se aplica sobre el componente la configuracion del icono importado
       btn2.setRolloverIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnactivos/btn10.png")).getImage().getScaledInstance(btn1.getWidth(),btn1.getHeight(),Image.SCALE_DEFAULT)));      //Se configuran una opcion de multiples iconos sobre el componente (bontes activos y pasivos)
       btn2.setOpaque(false);                        //configura la transparencia del componente
       btn2.setContentAreaFilled(false);             //Se configuran areas de contenido llenas en sobre el componente
       btn3.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnpasivos/btn8.png")).getImage().getScaledInstance(btn1.getWidth(),btn1.getHeight(),Image.SCALE_DEFAULT)));               //se aplica sobre el componente la configuracion del icono importado
       btn3.setRolloverIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnactivos/btn8.png")).getImage().getScaledInstance(btn1.getWidth(),btn1.getHeight(),Image.SCALE_DEFAULT)));       //Se configuran una opcion de multiples iconos sobre el componente (bontes activos y pasivos)
       btn3.setOpaque(false);                            //configura la transparencia del componente
       btn3.setContentAreaFilled(false);                //Se configuran areas de contenido llenas en sobre el componente
       btn4.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnpasivos/btnsalir.png")).getImage().getScaledInstance(btn4.getWidth(),btn4.getHeight(),Image.SCALE_DEFAULT)));          //se aplica sobre el componente la configuracion del icono importado
       btn4.setRolloverIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnactivos/btnsalir.png")).getImage().getScaledInstance(btn4.getWidth(),btn4.getHeight(),Image.SCALE_DEFAULT)));   //Se configuran una opcion de multiples iconos sobre el componente (bontes activos y pasivos)
       btn4.setOpaque(false);                             //configura la transparencia del componente
       btn4.setContentAreaFilled(false);                   //Se configuran areas de contenido llenas en sobre el componente
   }
    private void initComponents() {
        jPanel2 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn1.setBorder(null);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn1.setBounds(30, 70, 300, 120);
        jPanel2.add(btn1);
        btn2.setBorder(null);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        btn2.setBounds(360, 70, 300, 120);
        jPanel2.add(btn2);

        btn3.setBorder(null);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        btn3.setBounds(30, 230, 300, 120);
        jPanel2.add(btn3);

        btn4.setBorder(null);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        btn4.setBounds(360, 230, 300, 120);
        jPanel2.add(btn4);

        jLabel3.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Unidad 3 Ecuaciones Simultaneas");
        jLabel3.setBounds(80, 10, 500,50);
        jPanel2.add(jLabel3);
        ventana = new window(700,440,jPanel2,btn1,false);
    }// </editor-fold>//GEN-END:initComponents
     
    //Evento del mouse sobre el boton de control cerrar que cierra el sistema           //Evento al hacer clic en el boton
    
//Abrir metodo Gauss Seidel                                                         //Evento al hacer clic en el boton
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        seidel obj=new seidel();
        ventana.dispose();
    }//GEN-LAST:event_btn1ActionPerformed
//Abrir metodo Cramer                                                               //Evento al hacer clic en el boton
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        Cramer obj=new Cramer();
        ventana.dispose();
    }//GEN-LAST:event_btn2ActionPerformed
//Abrir metodo Gauss Jordan                                                             //Evento al hacer clic en el boton
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        Jordan sec=new Jordan();
        ventana.dispose();
    }//GEN-LAST:event_btn3ActionPerformed
//Menu principal                                                                        //Evento al hacer clic en el boton
    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        menuprincipal obj=new menuprincipal();
        ventana.dispose();
    }
}
