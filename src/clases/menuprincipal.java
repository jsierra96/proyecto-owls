//Paquete en el que se encuentra
package clases;
//Importacion de librerias y paquetes a utilizar
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import unidad2.menu_uni2;
import unidad3.menu_uni3;
import unidad4.*;
import unidad1.*;
import java.io.*;
import unidad5.Inter;
//Generaion de la clase inicio
public class menuprincipal{
    JButton btn[]=new JButton[5];
    JLabel jLabel3=new JLabel();
    JPanel jPanel2=new JPanel();
    JButton help=new JButton();
    JButton salir=new JButton();
    window ventana;
    fuentes fuente=new fuentes();
    public menuprincipal() {  //Metodo constructor
       initComponents();  //inicializacion de componentes
       Botones();  //Ejecucion del metodo botones
    }
//Metodo para la generacion de los botones asi como asignacion de formato
    public void Botones(){
        btn[0].setBounds(70, 70,300, 120);
        btn[1].setBounds(440, 70,300, 120);
        btn[2].setBounds(70, 200,300, 120);
        btn[3].setBounds( 440, 200,300, 120);
        btn[4].setBounds(250, 330,300, 120);
        btn[0].setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnpasivos/btn1.png")).getImage().getScaledInstance(btn[0].getWidth(), btn[0].getHeight(), Image.SCALE_DEFAULT)));
        btn[0].setRolloverIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnactivos/btn1.png")).getImage().getScaledInstance(btn[0].getWidth(), btn[0].getHeight(), Image.SCALE_DEFAULT)));
        btn[1].setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnpasivos/btn2.png")).getImage().getScaledInstance(btn[1].getWidth(), btn[1].getHeight(), Image.SCALE_DEFAULT)));
        btn[1].setRolloverIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnactivos/btn2.png")).getImage().getScaledInstance(btn[1].getWidth(), btn[1].getHeight(), Image.SCALE_DEFAULT)));
        btn[2].setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnpasivos/btn3.png")).getImage().getScaledInstance(btn[2].getWidth(), btn[2].getHeight(), Image.SCALE_DEFAULT)));
        btn[2].setRolloverIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnactivos/btn3.png")).getImage().getScaledInstance(btn[2].getWidth(), btn[2].getHeight(), Image.SCALE_DEFAULT)));
        btn[3].setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnpasivos/btn4.png")).getImage().getScaledInstance(btn[3].getWidth(), btn[3].getHeight(), Image.SCALE_DEFAULT)));
        btn[3].setRolloverIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnactivos/btn4.png")).getImage().getScaledInstance(btn[3].getWidth(), btn[3].getHeight(), Image.SCALE_DEFAULT)));
        btn[4].setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnpasivos/btn5.png")).getImage().getScaledInstance(btn[4].getWidth(), btn[4].getHeight(), Image.SCALE_DEFAULT)));
        btn[4].setRolloverIcon(new ImageIcon(new ImageIcon(getClass().getResource("/btnactivos/btn5.png")).getImage().getScaledInstance(btn[4].getWidth(), btn[4].getHeight(), Image.SCALE_DEFAULT)));
        btn[0].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn[1].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        btn[2].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        btn[3].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        btn[4].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
    }    
 private void initComponents() {//metodo que se encarga de inicializar los componentes a utilizar en esta interface
	 for(int i=0;i<5;i++) {
     	btn[i]=new JButton();
     	btn[i].setBorder(null);
     	btn[i].setBorderPainted(false);
     	btn[i].setContentAreaFilled(false);
     	jPanel2.add(btn[i]);
     }
 	help.setFocusable(false);
     jLabel3.setBackground(new Color(0, 102, 102));
     jLabel3.setFont(fuente.fuente3(48)); // NOI18N
     jLabel3.setForeground(new Color(0, 102, 102));
     jLabel3.setText("Menu Principal");
     jLabel3.setBounds(240, 0, 330, 70);
     jPanel2.add(jLabel3);
     help.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
             helpMouseEntered(evt);
         }
         public void mouseExited(MouseEvent evt) {
             helpMouseExited(evt);
         }
     });
     help.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
             min1ActionPerformed(evt);
         }
     });
     salir.setText("Salir");
     salir.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
             jButton1ActionPerformed(evt);
         }
     });
     salir.setBounds(620, 410, 80, 30);
     jPanel2.add(salir);
     ventana=new window(800,500,jPanel2,help,true);
    }
                                                                                    //Evento al hacer clic en el boton                                                                                 //Evento al entrar al componente el puntero el mouse
//objeto para ejecutar la clase Serie de taylor                                     //Evento al hacer clic en el boton
    private void btn1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
       serie_taylor obj=new serie_taylor();
       ventana.dispose();
    }
//objeto para ejecutar la clase para el menu de unidad 2                            //Evento al hacer clic en el boton
    private void btn2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        menu_uni2 menu=new menu_uni2();
        ventana.dispose();
    }
//objeto para ejecutar la clase para el menu de unidad 3                            //Evento al hacer clic en el boton
    private void btn3ActionPerformed(ActionEvent evt) {
        menu_uni3 obj=new menu_uni3();
        ventana.dispose();
    }
//objeto para ejecutar la clase para unidad 4                                       //Evento al hacer clic en el boton
    private void btn4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        extrapolacion obj=new extrapolacion();
        ventana.dispose();
    }
//objeto para ejecutar la clase para unidad 5                                       //Evento al hacer clic en el boton
    private void btn5ActionPerformed(ActionEvent evt) {
        Inter obj=new Inter();
        ventana.dispose();
    }
                                                                                    //Evento al entrar al componente el puntero el mouse
    private void helpMouseEntered(MouseEvent evt) {
        help.setBackground(new Color(153, 202, 253));
    }
                                                                                    //Evento al salir del componente el puntero del mouse
    private void helpMouseExited(MouseEvent evt) {//GEN-FIRST:event_min1MouseExited
        help.setBackground(new Color(33, 97, 140));
    }
            //metodo  para el enlace desde el boton de ayuda hacia el documento propio del metodo       //Evento al hacer clic en el boton
    private void min1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_min1ActionPerformed
        String ruta = System.getProperty("user.dir"); //Variable que almacena la ruta desde el sistema
        String fileLocal = ruta +"/src/docu/MANUAL-USO.pdf"; //Variable que contiene el nombre del archivo de ayuda y la carpeta donde se encuentra
        try
        {                                      //excepcion para abrir el archivo sin problemas 
            File path = new File(fileLocal);
            Desktop.getDesktop().open(path);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
                                   //Evento del muouse para salir del sistema       //Evento al hacer clic en el boton
    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }
}
