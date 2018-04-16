//Nombre del paquete
package unidad1;
//Importacion de librerias
import java.awt.*;
import java.io.*;
import javax.swing.*;
import clases.*;
import main.evaluador;
//clase
public class serie_taylor{
  evaluador evaluador1,evaluador2,evaluador3,evaluador4;// variables de tipo objeto evaluador de la libreria Evaluador
  JButton btn1,btn2,btn3,jButton1,min4;  //variables de tipo boton
  JLabel jLabel10,jLabel18,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9;//variables de tipo etiquetas de texto
  JPanel jPanel2;//variable tipo panel para incluir componentes
  JTextField txt1,txt2,txt3,txt4;//variables que permiten el ingreso de datos
  window ventana;
    public serie_taylor() {  //M�todo constructor
        initComponents();        //Inicializacion de componentes y configuaracion de los mismos
        btn1.setEnabled(false);         //se deshabilita el boton calcular
       ImageIcon imgs=new ImageIcon(getClass().getResource("/funcion.png"));          //se crea una variable de tipo ImageIcon que contiene la direccion del recurso imagen que sera un icono
       Icon img1=new ImageIcon(imgs.getImage().getScaledInstance(jLabel3.getWidth(),jLabel3.getHeight(), Image.SCALE_DEFAULT));     //Se define el tamaño del icono respecto al componente al que se aplicara
       jLabel3.setIcon(img1);       //se aplica sobre el componente la configuracion del icono importado
        ImageIcon imgs2=new ImageIcon(getClass().getResource("/x.png"));                //se crea una variable de tipo ImageIcon que contiene la direccion del recurso imagen que sera un icono
       Icon img2=new ImageIcon(imgs2.getImage().getScaledInstance(jLabel4.getWidth(),jLabel4.getHeight(), Image.SCALE_DEFAULT));     //Se define el tamaño del icono respecto al componente al que se aplicara
       jLabel4.setIcon(img2);       //se aplica sobre el componente la configuracion del icono importado
       ImageIcon imgs3=new ImageIcon(getClass().getResource("/derivada1.png"));         //se crea una variable de tipo ImageIcon que contiene la direccion del recurso imagen que sera un icono
       Icon img3=new ImageIcon(imgs3.getImage().getScaledInstance(jLabel5.getWidth(),jLabel5.getHeight(), Image.SCALE_DEFAULT));    //Se define el tamaño del icono respecto al componente al que se aplicara
       jLabel5.setIcon(img3);       //se aplica sobre el componente la configuracion del icono importado
       ImageIcon imgs4=new ImageIcon(getClass().getResource("/derivada2.png"));         //se crea una variable de tipo ImageIcon que contiene la direccion del recurso imagen que sera un icono
       Icon img4=new ImageIcon(imgs4.getImage().getScaledInstance(jLabel6.getWidth(),jLabel6.getHeight(), Image.SCALE_DEFAULT));    //Se define el tamaño del icono respecto al componente al que se aplicara
       jLabel6.setIcon(img4);       //se aplica sobre el componente la configuracion del icono importado
       ImageIcon imgs5=new ImageIcon(getClass().getResource("/derivada3.png"));         //se crea una variable de tipo ImageIcon que contiene la direccion del recurso imagen que sera un icono
       Icon img5=new ImageIcon(imgs5.getImage().getScaledInstance(jLabel7.getWidth(),jLabel7.getHeight(), Image.SCALE_DEFAULT));    //Se define el tamaño del icono respecto al componente al que se aplicara
       jLabel7.setIcon(img5);      //se aplica sobre el componente la configuracion del icono importado
       ImageIcon imgs6=new ImageIcon(getClass().getResource("/xo.png"));                //se crea una variable de tipo ImageIcon que contiene la direccion del recurso imagen que sera un icono
       Icon img6=new ImageIcon(imgs6.getImage().getScaledInstance(jLabel10.getWidth(),jLabel10.getHeight(), Image.SCALE_DEFAULT));  //Se define el tamaño del icono respecto al componente al que se aplicara
       jLabel10.setIcon(img6);      //se aplica sobre el componente la configuracion del icono importado
    }
     private void initComponents() {
        min4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        evaluador1 = new main.evaluador();
        evaluador2 = new main.evaluador();
        evaluador3 = new main.evaluador();
        evaluador4 = new main.evaluador();
        btn3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        min4.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        min4.setForeground(new java.awt.Color(0, 204, 255));
        min4.setBorderPainted(false);
        min4.setDefaultCapable(false);
        min4.setFocusPainted(false);
        min4.setFocusable(false);
        min4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                min4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                min4MouseExited(evt);
            }
        });
        min4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                min4ActionPerformed(evt);
            }
        });
        
        jLabel3.setBackground(new Color(51, 204, 0));
        jLabel3.setBounds(30, 55, 50, 20);
        jLabel4.setBounds(290, 50, 30, 20);
        jLabel5.setBounds(30, 130, 50, 40);
        jLabel6.setBounds(30, 190, 50, 45);
        jLabel7.setBounds(30, 250, 50, 45);
        jLabel8.setBounds(270, 220, 150, 40);
        jLabel9.setBounds(290, 160, 130, 40);
        jLabel10.setBounds(400, 50, 30, 20);
        jLabel18.setBounds(180, 0, 240, 49);
        txt1.setBounds(330, 50, 40, 25);
        txt2.setBounds(430, 170, 85, 30);
        txt3.setBounds(430, 230, 85, 30);
        evaluador1.setBounds(90,50,132,30);
        evaluador2.setBounds(90,140,132,30);
        evaluador3.setBounds(90,200,132,30);
        evaluador4.setBounds(90,260,132,30);
        btn1.setBounds(310,100,100,30);
        btn2.setBounds(440,100,100,30);
        btn3.setBounds(140,320,100,30);
        jButton1.setBounds(485,323,90,30);
        txt1.setBackground(new Color(178, 235, 242));
        txt2.setBackground(new Color(178, 235, 242));
        txt3.setBackground(new Color(178, 235, 242));
        txt4.setBackground(new Color(178, 235, 242));
        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Porcentaje de error:");
        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Serie de Taylor :");
        btn1.setText("Calcular");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn2.setText("Limpiar");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        txt4.setBounds(440,50,40,25);
        btn3.setText("Validar");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLabel18.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Serie de Taylor");
        jPanel2.add(jLabel8);
        jPanel2.add(txt2);
        jPanel2.add(jLabel9);
        jPanel2.add(txt3);
        jPanel2.add(btn1);
        jPanel2.add(jLabel6);
        jPanel2.add(jLabel7);
        jPanel2.add(jLabel5);
        jPanel2.add(btn3);
        jPanel2.add(btn2);
        jPanel2.add(jLabel10);
        jPanel2.add(txt4);
        jPanel2.add(evaluador1);
        jPanel2.add(evaluador2);
        jPanel2.add(evaluador3);
        jPanel2.add(evaluador4);
        jPanel2.add(jLabel18);
        jPanel2.add(jButton1);
        jPanel2.add(jLabel3);
        jPanel2.add(jLabel4);
        jPanel2.add(txt1);
        ventana=new window(600,400,jPanel2,min4,true);
    }
   //Evento del boton Calcular, envio de la funcion al componente evaluador         //Evento al hacer clic en el boton
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {
        String aux2="";                                                             
        evaluador1.setvar(Double.parseDouble(txt4.getText()));
        evaluador1.iniciar1();
        String aux=evaluador1.getexpre();
        aux2=aux;
        evaluador1.iniciar();
        evaluador2.setvar(Double.parseDouble(txt4.getText()));
        evaluador2.iniciar1();
        evaluador2.iniciar();
        evaluador3.setvar(Double.parseDouble(txt4.getText()));
        evaluador3.iniciar1();
        evaluador3.iniciar();
        evaluador4.setvar(Double.parseDouble(txt4.getText()));
        evaluador4.iniciar1();
        evaluador4.iniciar();
        serie();
        error(aux2);
    }
                                                                                     //Evento del boton Limpiar //Evento al hacer clic en el boton
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        serie_taylor serie=new serie_taylor();
        ventana.dispose();
    }
                                                                                    // Evento del boton validar     //Evento al hacer clic en el boton
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {
        if(txt1.getText().equals("")&&txt4.getText().equals("")
                &&evaluador1.getexpre().equals("")&&evaluador2.getexpre().equals("")
                &&evaluador3.getexpre().equals("")&&evaluador4.getexpre().equals("")){  //valida que las cajas de X y X0 no esten vacias
            JOptionPane.showMessageDialog(null,"Hay aungun campo vacio");
        }else{
            try {                                                  // excepcion para validar que los valores
		Float.parseFloat(txt1.getText());                  // X  X0 sean numeros
                Float.parseFloat(txt4.getText());
                btn1.setEnabled(true);
	    } catch (NumberFormatException nfe){
		JOptionPane.showMessageDialog(null,"El valor de X o X0 no es un numero");  //Mensaje
	    }
        }
    }
                                                                                    //Evento al entrar al componente el puntero el mouse
    private void min4MouseEntered(java.awt.event.MouseEvent evt) {
        min4.setBackground(new Color(153, 202, 253));
    }
                                                                                    //Evento al salir del componente el puntero del mouse
    private void min4MouseExited(java.awt.event.MouseEvent evt) {
        min4.setBackground(new Color(33, 97, 140));
    }
 //Evento del boton Ayuda, para el enlace desde el boton hacia el documento propio del metodo       //Evento al hacer clic en el boton
    private void min4ActionPerformed(java.awt.event.ActionEvent evt) {
        String ruta = System.getProperty("user.dir"); //variable para la ruta
        String fileLocal = ruta + "/src/docu/SERIES-DE-TAYLOR.docx"; //variable que contiene el nombre del documento y la carpeta donde se encuentra
       //Excepcion para abrir sin problema el archivo
        try{
            File path = new File(fileLocal);        //Abre el archivo
            Desktop.getDesktop().open(path);
        }catch (IOException e){                       //Excepcion
            e.printStackTrace();
        }
    }
    //Boton para abrir el menu principal                                             //Evento al hacer clic en el boton
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        menuprincipal obj=new menuprincipal();    //Objeto que controlara la clase Inicio()
        ventana.dispose();             //Cierra este formulario
    }
        //Metodo que resuelve el valor devuelto por el evaluador y aplica la formula de la serie de Taylor
    public void serie(){
        double n=evaluador1.getvar()+(evaluador2.getvar())*(Double.parseDouble(txt1.getText())-Double.parseDouble(txt4.getText()))+
                (evaluador3.getvar()/2)*(Math.pow(Double.parseDouble(txt1.getText())-Double.parseDouble(txt4.getText()), 2.0))+
                (evaluador4.getvar()/6)*(Math.pow(Double.parseDouble(txt1.getText())-Double.parseDouble(txt4.getText()), 3.0));
        txt2.setText(String.valueOf(n));
    }
    //Metodo que resuelve el porcentaje de error de la serie 
    public void error(String expre){
        double inicial=evaluador1.Posfija(expre, txt1.getText());//variable para el valor inicial
        double r=Math.abs( (inicial-Double.parseDouble(txt2.getText()) )/inicial)  ; //obtener el resultado en su valor absoluto
        txt3.setText(String.valueOf(r) ); //muestras el resultado r en txt3
    }
}
