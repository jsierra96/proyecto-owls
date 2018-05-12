//Nombre del paquete
package unidad4;
//Importacion de clases y librerias java
import LibreriasLion.evaexpresion;
import clases.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
//Clase
public class extrapolacion{

    // Variables declaration - do not modify                     
    JButton btn1=new JButton();
    JButton btn2=new JButton();
    JButton btn3=new JButton();
    JButton btn4=new JButton();
    JButton btn5=new JButton();
    JButton btn6=new JButton();
    JButton btn7=new JButton();
    grafical.graf graf1 = new grafical.graf();;
    JLabel jLabel1=new JLabel();
    JLabel jLabel18=new JLabel();
    JLabel jLabel2=new JLabel();
    JLabel jLabel5=new JLabel();
    JLabel jLabel6=new JLabel();
    JPanel jPanel3=new JPanel();
    JPanel jPanel4=new JPanel();
    JScrollPane jScrollPane1=new JScrollPane();
    JScrollPane jScrollPane2=new JScrollPane();
    JButton min1=new JButton();
    JScrollPane scroll1=new JScrollPane();
    JTable tabla1=new JTable();
    JTextField txt1=new JTextField();
    JTextField txt2=new JTextField();
    JTextField txt3=new JTextField();
    JTextArea txtarea=new JTextArea();
    JTextArea txtarea2=new JTextArea();
    JTextField txtformula=new JTextField();
    JTable tabla ; //componente tabla
    double valx []; //Vector para x
    double valy[]; //Vector para y
    window ventana;
    // End of variables declaration 

    public extrapolacion() { //Método constuctor
        initComponents(); //Inicializacion de componentes 
        tabla1.setVisible(false); //no se muestra la tabla al inicio de la ejecucion
        tabla1.getTableHeader().setVisible(false); //no se muestra el encabezado de la tabla  
        btn2.setEnabled(false);          //desactiva el boton graficar
        btn3.setEnabled(false);          //descativa el boton lineal
        btn4.setEnabled(false);          //desactiva el boton polinomial
    }
    
    public void cargar_tabla(){ //Metodo para cargar la tabla del tamaño indicado por usuario
        String[] nomcolum = { "X", "Y" };   //se le almacena el nombre a las columnas 
        Object[][] tabla1 = new Integer[Integer.parseInt(this.txt1.getText())][5]; //se genera la tabla del tamaño indicado por el usuario
        DefaultTableModel modelo = new DefaultTableModel(tabla1, nomcolum);
        this.tabla = new JTable(modelo);  //tabla contie un nuevo objeto de tipo JTable 
        TableColumnModel columnModel = this.tabla.getColumnModel();
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            columnModel.getColumn(i).setPreferredWidth(91);
        }
        tabla.setBorder(null);//le quita el borde a la tabla
        //Personalización de la tabla
        scroll1.setViewportView(tabla);          //Muestra tabla
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        min1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {   //Evento al entrar al componente el puntero el mouse
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
        txtformula.setEditable(false);
        txt3.setEditable(false);
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); //Configura la fuete de letra
        jLabel1.setForeground(new java.awt.Color(0, 102, 153)); // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel1.setText("Numero de datos (m):"); //configura el texto a mostrar
        jLabel1.setBounds(20, 60, 150, 20);//configuracion de tamaño y posicion al componente
        jPanel4.add(jLabel1);   //Añade el componente al panel
        txt1.setBackground(new java.awt.Color(178, 235, 242));   //se configura el color de fondo del componente
        txt1.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        txt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 73, 94))); //configurar borde del componente
        txt1.setBounds(180, 60, 50, 20);    //configuracion de tamaño y posicion al componente
        jPanel4.add(txt1);  //Añade el componente al panel
        btn1.setFont(new java.awt.Font("Comic Sans MS", 1, 14));    //Configura la fuete de letra
        btn1.setForeground(new java.awt.Color(0, 102, 153));    // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        btn1.setText("Cargar tabla");   //configura el texto a mostrar
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn1ActionPerformed(evt);
            }
        });
        btn1.setBounds(270, 60, 140, 30);   //configuracion de tamaño y posicion al componente
        jPanel4.add(btn1);  //Añade el componente al panel
        btn2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N  //Configura la fuete de letra
        btn2.setForeground(new java.awt.Color(0, 102, 153));    // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        btn2.setText("Graficar");//configura el texto a mostrar
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn2ActionPerformed(evt);
            }
        });
        btn2.setBounds(80, 280, 100, 30);   //configuracion de tamaño y posicion al componente
        jPanel4.add(btn2);  //Añade el componente al panel
        jPanel3.setBackground(new java.awt.Color(178, 235, 242));  //se configura el color de fondo del componente
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));   //configurar borde del componente
        graf1.setBackground(new java.awt.Color(178, 235, 242));
        javax.swing.GroupLayout graf1Layout = new javax.swing.GroupLayout(graf1);
        graf1.setLayout(graf1Layout);
        graf1Layout.setHorizontalGroup(
            graf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
        graf1Layout.setVerticalGroup(
            graf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(graf1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(graf1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3.setBounds(460, 60, 370, 250);  //configuracion de tamaño y posicion al componente
        jPanel4.add(jPanel3);   //Añade el componente al panel
        btn3.setFont(new java.awt.Font("Comic Sans MS", 1, 14));    //Configura la fuete de letra
        btn3.setForeground(new java.awt.Color(0, 102, 153));    // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        btn3.setText("Lineal"); //configura el texto a mostrar
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { //Evento al hacer clic en el boton
                btn3ActionPerformed(evt);
            }
        });
        btn3.setBounds(80, 320, 100, 30);   //configuracion de tamaño y posicion al componente
        jPanel4.add(btn3);  //Añade el componente al panel
        btn4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); //Configura la fuete de letra
        btn4.setForeground(new java.awt.Color(0, 102, 153));    // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        btn4.setText("Polinomial"); //configura el texto a mostrar
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {  //Evento al hacer clic en el boton
                btn4ActionPerformed(evt);
            }
        });
        btn4.setBounds(240, 320, 100, 30);  //configuracion de tamaño y posicion al componente
        jPanel4.add(btn4);  //Añade el componente al panel
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));  //configurar borde del componente
        jScrollPane1.setOpaque(false);  //configura la transparencia del componente
        txtarea.setEditable(false); //no se puede editar el txtarea
        txtarea.setBackground(new java.awt.Color(178, 235, 242));    //se configura el color de fondo del componente
        txtarea.setColumns(20); //columnas
        txtarea.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtarea.setRows(5); //filas
        txtarea.setBorder(null); //quitar borde
        jScrollPane1.setViewportView(txtarea); //mostrar txtarea en scrollpane1
        jScrollPane1.setBounds(80, 370, 280, 130);  //configuracion de tamaño y posicion al componente
        jPanel4.add(jScrollPane1);  //Añade el componente al panel
        btn5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N  //Configura la fuete de letra
        btn5.setForeground(new java.awt.Color(0, 102, 153));    // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        btn5.setText("Regresar");   //configura el texto a mostrar
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn5ActionPerformed(evt);
            }
        });
        btn5.setBounds(740, 450, 100, 30);  //configuracion de tamaño y posicion al componente
        jPanel4.add(btn5);  //Añade el componente al panel
        jScrollPane2.setBackground(new java.awt.Color(250, 229, 211)); //se configura el color de fondo del componente
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));  //configurar borde del componente
        jScrollPane2.setOpaque(false);  //configura la transparencia del componente
        txtarea2.setEditable(false); //no se puede editar el txt2
        txtarea2.setBackground(new java.awt.Color(178, 235, 242)); //se configura el color de fondo del componente
        txtarea2.setColumns(20); //Columnas
        txtarea2.setRows(5); //filas
        txtarea2.setBorder(null); //quitar borde
        jScrollPane2.setViewportView(txtarea2); //mostrar txtarea2 en scrollpane2
        jScrollPane2.setBounds(420, 370, 310, 130); //configuracion de tamaño y posicion al componente
        jPanel4.add(jScrollPane2);  //Añade el componente al panel
        txtformula.setBackground(new java.awt.Color(178, 235, 242));     //se configura el color de fondo del componente
        txtformula.setFont(new java.awt.Font("Comic Sans MS", 0, 14));  //Configura la fuete de letra
        txtformula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 73, 94)));  //configurar borde del componente
        txtformula.setBounds(500, 330, 190, 20);    //configuracion de tamaño y posicion al componente
        jPanel4.add(txtformula);    //Añade el componente al panel
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); //Configura la fuete de letra
        jLabel2.setForeground(new java.awt.Color(0, 102, 153)); // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel2.setText("Formula general"); //configura el texto a mostrar
        jLabel2.setBounds(380, 330, 110, 20);   //configuracion de tamaño y posicion al componente
        jPanel4.add(jLabel2);   //Añade el componente al panel
        jLabel18.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36));  //Configura la fuete de letra
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));    // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Extrapolación");//configura el texto a mostrar
        jLabel18.setToolTipText("");
        jLabel18.setBounds(263, 0, 220, 50);    //configuracion de tamaño y posicion al componente
        jPanel4.add(jLabel18);  //Añade el componente al panel
        txt2.setBackground(new java.awt.Color(178, 235, 242));   //se configura el color de fondo del componente
        txt2.setFont(new java.awt.Font("Comic Sans MS", 1, 14));    //Configura la fuete de letra
        txt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 73, 94)));  //configurar borde del componente
        txt2.setBounds(370, 150, 50, 30);   //configuracion de tamaño y posicion al componente
        jPanel4.add(txt2);  //Añade el componente al panel
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N   //Configura la fuete de letra
        jLabel5.setForeground(new java.awt.Color(0, 102, 153)); // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel5.setText("X:");//configura el texto a mostrar
        jLabel5.setBounds(331, 150, 30, 30);   //configuracion de tamaño y posicion al componente
        jPanel4.add(jLabel5);   //Añade el componente al panel
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N   //Configura la fuete de letra
        jLabel6.setForeground(new java.awt.Color(0, 102, 153)); // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel6.setText("Y:");//configura el texto a mostrar
        jLabel6.setBounds(310, 230, 30,30); //configuracion de tamaño y posicion al componente
        jPanel4.add(jLabel6);   //Añade el componente al panel
        txt3.setBackground(new java.awt.Color(178, 235, 242));   //se configura el color de fondo del componente
        txt3.setFont(new java.awt.Font("Comic Sans MS", 1, 14));    //Configura la fuete de letra
        txt3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 73, 94)));  //configurar borde del componente
        txt3.setBounds(340, 230, 100, 30);  //configuracion de tamaño y posicion al componente
        jPanel4.add(txt3);//Añade el componente al panel
        btn6.setFont(new java.awt.Font("Comic Sans MS", 1, 14));    //Configura la fuete de letra
        btn6.setForeground(new java.awt.Color(0, 102, 153));    // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        btn6.setText("Validar");    //configura el texto a mostrar
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn6ActionPerformed(evt);
            }
        });
        btn6.setBounds(240, 280, 100, 30);  //configuracion de tamaño y posicion al componente
        jPanel4.add(btn6);  //Añade el componente al panel
        btn7.setFont(new java.awt.Font("Comic Sans MS", 1, 14));   //Configura la fuete de letra
        btn7.setForeground(new java.awt.Color(0, 102, 153));    // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        btn7.setText("Limpiar");   //configura el texto a mostrar
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn7ActionPerformed(evt);
            }
        });
        btn7.setBounds(740, 380, 100, 30);  //configuracion de tamaño y posicion al componente
        jPanel4.add(btn7);  //Añade el componente al panel
        scroll1.setBackground(new java.awt.Color(153, 255, 153));    //se configura el color de fondo del componente
        scroll1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));  //configurar borde del componente
        scroll1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scroll1.setOpaque(false);   //configura la transparencia del componente
        scroll1.setViewportView(tabla1); //muestra la tabla en scroll
        scroll1.setBounds(70, 120, 194, 136);   //configuracion de tamaño y posicion al componente
        jPanel4.add(scroll1); //Añade el componente al panel
        ventana=new window(860,555,jPanel4,min1,true);
    }// </editor-fold>                        
//Boton para cargar la tabla                                                        //Evento al hacer clic en el boton
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        btn2.setEnabled(false); //deshabilita el boton graficar
        btn3.setEnabled(false); //deshabilita el boton Lineal
        btn4.setEnabled(false); //deshabilita el boton polinomial
        if(txt1.getText().equals("")){ //Verifica que el numero para la matrix este vacio
            JOptionPane.showMessageDialog(null,"Debe ingresar el numero de datos exprerimentales");  //muestra un mensage de advertencia
        }else{
             cargar_tabla(); //En caso de que el numero que genera la tabla es correcto, ejecuta el metodo 
        }
    }                                    
//Obtener los valores necesarios para graficar; boton graficar                      //Evento al hacer clic en el boton
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
            obtener_val(); //ejecuta al metodo obtener valores 
            int tol=0; //Almacena en numero de datos
            if (txt1.getText().equals(null)) // si el valor obtenido de txt1 es nulo, el numero de valores es 0
                tol=0;
            else
                tol=Integer.parseInt(txt1.getText()); // contiene el numero de datos a graficar 
            //grafl es una variable de tipo graf, es decir, contiene la grafica
            graf1.setNumValores(tol); //Se configura el numero de valores que mostrara la grafica
            graf1.setValX(valx); //el valor en X para la grafica viene devuelto por valx que se obtuvo en el metodo  obtener_val()
            graf1.setValY(valy); //el valor en Y para la grafica viene devuelto por valy que se obtuvo en el metodo  obtener_val()
            btn3.setEnabled(true); //  Se deshabilitan los botones que definen el tipo de extrapolacion, debido a que
            btn4.setEnabled(true); //  se debe introducir valores para la tabla y para X (Valor a buscar)
    }                                    
//Extrapolar por metodo lineal                                                      //Evento al hacer clic en el boton
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        String ms="";  //variable para almacenar el el mensaje  de la formula lineal
        double a=0,b=0,c=0,d=0,e=0,f=0; //Variables para la sustitucion de valores de la tabla sobre la formula gral Lineal
        ms=ms+"La formula para Extrapolcaion Lineal:\n (m*a0)+(a1*Σx)=Σy\n(a0Σx)+(a1*Σ(x^2) )=Σxy"; //Mensaje 
        a=Double.parseDouble(txt1.getText()); // recibe el numero de datos m
        for(int i=0;i<tabla.getRowCount();i++){ //recorre vector
            b=valx[i]+b;  // la variable b recibe la sumatoria de los valores en x 
            c=valy[i]+c;  //la variable c recibe la sumatoria de los valores en y
            d=valx[i]+d;    //la variable d recibe la sumatoria de los valores en x
            e=Math.pow(valx[i], 2.0)+e; //la variable e recibe la sumatoria de los valores en x al cuadrado
            f=(valx[i]*valy[i])+f; //la variable f recibe la sumatoria de los valores de x multiplicados por los valores de y
        }
        //Mostrar matriz por gauss jordan
        ms=ms+"\n-----------------------\nEl sistema de ecuaciones:\n"+a+"a0 + "+b+" a1="+c+"\n"+d+"a0 + "+e+" a1="+f; //Se muestra el sistema de ecuaciones resultante
        double matrix[][]={{a,b,c},{d,e,f}}; // se crea una matriz y se le almacenan los valores obtenidos anteriormente
        txtarea.setText(ms);  //imprime el mensaje en el area de texto txtarea
        matrix=gauus_jordan(matrix,2,3); //la variable matrix recibe la matriz resuelta ejecutando el metodo gauss jordan
        txtformula.setText("Y= "+matrix[0][2]+" + "+matrix[1][2]+" *X "); // en el cuadro de texto etiquetado en panel con formula gral se imprime la formula a seguir
        txt3.setText(String.valueOf(evaexpresion.Posfija(matrix[0][2]+",+,(,"+matrix[1][2]+",*,x,)",txt2.getText()))); //se muestra en Y del panel la ecuacion resuelta, enviada al componente evaluador
    }                                    
//Abrir menu inicio                                                                 //Evento al hacer clic en el boton
    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        menuprincipal obj=new menuprincipal();
        ventana.dispose();
    }                                    
//Extrapolar por metodo polinomial                                                  //Evento al hacer clic en el boton
    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        String ms=""; //variable para mensaje
        double a = 0.0D;double b = 0.0D;double c = 0.0D;double d = 0.0D;double e = 0.0D;double f = 0.0D;
        double g = 0.0D;double h = 0.0D;double j = 0.0D;double k = 0.0D;double l = 0.0D;double m = 0.0D; //Variables para la sustitucion de valores de la tabla sobre la formula gral polinomial
        ms=ms+"La formula para Extrapolacion Polinomial:\n ma0+(a1*Σx)+a2Σx^2=Σy" //mensaje para la formula polinomial
                + "\na0Σx+a1*Σx^2+a2Σx^3=Σxy\na0Σx^2+a1Σx^3+a2Σx^4=Σx^2y";
        a = Double.parseDouble(this.txt1.getText()); //recibe el numero de datos
        for (int i = 0; i < tabla.getRowCount(); i++){ //iteraciones de la formula polinomial
            b = this.valx[i] + b; //la variable b almacena la sumatoria de los valores en X
            c = Math.pow(this.valx[i], 2.0D) + c; //la variable c almacena la sumatoria de los valores al cuadrado en X
            d = this.valy[i] + d; //la variable d almacena la sumatoria de los valores en Y
            g = Math.pow(this.valx[i], 3.0D) + g; //la variable g almacena la sumatoria de los valores el cubo en X
            h = this.valx[i] * this.valy[i] + h; //la variable h almacena la multiplicacion de los valores en X * Y
            l = Math.pow(this.valx[i], 4.0D) + l; //la variable l almacena la sumatoria de los valores a la cuarta en X
            m = Math.pow(this.valx[i], 2.0D) * this.valy[i] + m;
        }
        e=b; // se copian los valores obtenidos en las sumatorias en variables auxiliares
        f=c; //
        j=f; //
        k=g; //
        ms=ms+"\n-----------------------\nEl sistema de ecuaciones:\n"+a+"a0 + "+b+" a1+"+c+"a2="+d+""   //sistema de ecuaciones 
                + "\n"+e+"a0 + "+f+" a1 + "+g+"a2 ="+h+ "\n"+j+"a0 + "+k+" a1 + "+l+"a2 ="+m;
        double[][] matrix = { { a, b, c, d }, { e, f, g, h }, { j, k, l, m } }; //se crea una matriz con los valores obtenidos anteriormente
        this.txtarea.setText(ms); //Muestra sistema de acuaciones
        matrix = gauus_jordan(matrix, 3, 4);  //Solución de sistema de ecuaciones por metodo de Gauss jordan 
        this.txtformula.setText("Y= " + matrix[0][3] + " + " + matrix[1][3] + "*X + " + matrix[2][3] + "*X^2");  // en el cuadro de texto etiquetado en panel con formula gral se imprime la formula a seguir
        this.txt3.setText(String.valueOf(evaexpresion.Posfija(matrix[0][3] + ",+,(," + matrix[1][3] + ",*,x,),+,(," + matrix[2][3] + ",*,(,x,^,2,),)", this.txt2.getText()))); //se muestra en Y del panel la ecuacion resuelta, enviada al componente evaluador
    }                                    
                                                                //Evento al entrar al componente el puntero el mouse                                 
   //Validación de campos llenos y tipos de datos correctos
    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {
    	boolean b=false;
        for(int i=0;i<tabla.getRowCount();i++){        
                for(int j=0;j<tabla.getColumnCount();j++){
                    if(tabla.getValueAt(i,j)==null)
                        b=true;
                }
        }
        if(txt2.getText().equals("") && b)    //comparacion con el valor para X con 0
            JOptionPane.showMessageDialog(null,"El valor de X y la tabla esta vacio");
        else if(txt2.getText().equals("") && !b)    //comparacion con el valor para X con 0
            JOptionPane.showMessageDialog(null,"El valor de X esta vacio");
        else if(b)
            JOptionPane.showMessageDialog(null,"La tabla esta vacia o valor en la tabla esta vacio");
        else{
            try {   
            for(int i=0;i<tabla.getRowCount();i++){        //recorre filas
                for(int j=0;j<tabla.getColumnCount();j++){ //recorre columnas
                         Double.parseDouble(tabla.getValueAt(i,j).toString() );  //convierte en tipo de dato double
                         Double.parseDouble(txt2.getText());
                }
            }
             btn2.setEnabled(true); 
	} catch (NumberFormatException nfe){                                        //Excepcion
		JOptionPane.showMessageDialog(null,"Un valor introducido en la tabla o X, no es un numero ");   //mensaje de error
	    }
        }
    }                                    
//Método para limpiar la ventana
    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
    this.txt1.setText("");                                      //SE limpian los componentes de entrada de datos
    this.txt2.setText("");
    this.txt3.setText("");
    this.txtarea.setText("");
    this.txtarea2.setText("");
    this.txtformula.setText("");
    this.tabla.setVisible(false);
    btn2.setEnabled(false);
    btn3.setEnabled(false);          //descativa el boton lineal
    btn4.setEnabled(false);          //desactiva el boton polinomial
    for (int i = 0; i < this.valx.length; i++)
    {
      this.valx[i] = 0.0D;
      this.valy[i] = 0.0D;
    }
    this.graf1.setValX(this.valx);
    this.graf1.setValY(this.valy);
    this.tabla.getTableHeader().setVisible(false);
    }                                    
                                                                                     //Evento al entrar al componente el puntero el mouse   
    private void min1MouseEntered(java.awt.event.MouseEvent evt) {                                  
        min1.setBackground(new Color(153, 202, 253));
    }                                 
                                                                                    //Evento al salir del componente el puntero del mouse
    private void min1MouseExited(java.awt.event.MouseEvent evt) {                                 
        min1.setBackground(new Color(33, 97, 140));
    }                                
 //Abrir archivo de ayuda                                                               //Evento al hacer clic en el boton
    private void min1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        String ruta = System.getProperty("user.dir"); //Ruta del sistema
        String fileLocal = ruta + "/docu/EXTRAPOLACION.pdf"; //Ruta y  nombre del archivo de ayuda
        try   
        {
            File path = new File(fileLocal);        //abre el archivo 
            Desktop.getDesktop().open(path);
        }
        catch (IOException e)                       //Excepción
        {
            e.printStackTrace();
        }
    }                                    
//Capturar los valores en las variables 
  public void obtener_val(){
      
       valx=new double[tabla.getRowCount()];            // valx es un vector que recibe los valores X
       valy=new double[tabla.getRowCount()];            //valy es un vector que recibe los valores de y
        for(int i=0;i<tabla.getRowCount();i++){         //for para filas
            for(int j=0;j<tabla.getColumnCount();j++){  //for para columnas
                if (j==0)                               //Condicion para obtener valores en x
                    valx[i]=Double.parseDouble(tabla.getValueAt(i,j).toString() ); //Recibe los valores en x
                else
                    valy[i]=Double.parseDouble(tabla.getValueAt(i,j).toString() );  //Recibe los valores en y
            }
        }
  }
//Método Gauss Jordan
     public double[][] gauus_jordan(double [][] ma,int fila,int colum){
		double [][] matrix=ma;                                              //Matriz original almacenada con el mismo nombre, recibida por ma[][]  
		int c=0,z=0;                                                        //Variables para controlar ciclos
		String pasos="",aux="";                                             //Variables para imprimir en cadenas la matriz
		pasos=pasos+"Esta es la matriz original:\n";                        //Mensaje impreso
		for(int i=0;i<fila;i++){                                            //recorre filas de matriz
			for(int j=0;j<colum;j++){                                   //Recorre columnas de matriz
				pasos=pasos+(matrix[i][j] +"\t|\t");                //Almacena en cadena
			}
			pasos=pasos+("\n");                                         //salto de linea por fila
		}
		pasos=pasos+("\n");
		while(c<fila){                                          //iteraciones de la matriz
			aux=String.valueOf( matrix[c][c]);
			for(int i=(colum-1);i>=0;i--){                  //Recorrido de la matriz
			    matrix[c][i]=matrix[c][i]/matrix[c][c];     //Operaciones en iteraciones de matriz, multiplicacion por renglones
			    
			}
			
			
			pasos=pasos+"Multiplicacion del renglon "+(c+1)+" dividido por: "+aux+"\n";     //Mensaje de procesos realizados
			for(int i=0;i<fila;i++){                                    //For recorre filas                     
				for(int j=0;j<colum;j++){                           //For recorre columnas
					pasos=pasos+(matrix[i][j]+"\t|\t");         //almacenamiento en cadena de la matriz resultante 
				}
				pasos=pasos+("\n");                                 //Salto de fila
			}
			pasos=pasos+("\n");
			z=c+1;                                                      //variable z almacena el valor siguiente que contenga c (Renglon), en este caso 2
			while(z<fila){                                              //Condición: mientras renglon en que este sea menor que el numero de filas, entra
				aux=String.valueOf(((-1)*matrix[z][c]));            //almacena en cadena el contenido de la matriz multiplicando su posición por -1
				for(int i=(colum-1);i>=0;i--){                      //For recorre columnas
				     matrix[z][i]=(( matrix[c][i]*((-1)*matrix[z][c]))+matrix[z][i]); //Multiplicacion de matriz: renglon actual por renglon por -1  y sumada por renglon siguiente
				}
				
				pasos=pasos+"Renglon"+(c+1)+" multiplicado por: "+aux+" y sumado el renglon "+(z+1)+"\n";   //Impresión del proceso realizado en cliclo anterior
				for(int i=0;i<fila;i++){
					for(int j=0;j<colum;j++){
						pasos=pasos+(matrix[i][j]+"\t|\t");   //Almacenamiento en cadena el proceso anterior
					}
					pasos=pasos+("\n");
				}
				z++;
				pasos=pasos+("\n");
			}
			z=c-1;                                                      //variable z almacena el valor siguiente que contenga c (Renglon)
			while(z>-1){                                                //Condición: mientras renglon en que este sea mayor a -1
				aux=String.valueOf(((-1)*matrix[z][c]));             //almacena en cadena el contenido de la matriz multiplicando su posición por -1
				for(int i=(colum-1);i>=0;i--){                       //For recorre columnas
				     matrix[z][i]=(( matrix[c][i]*((-1)*matrix[z][c]))+matrix[z][i]);   //Multiplicacion de matriz: renglon actual por renglon por -1  y sumada por renglon siguiente
				}
				
				pasos=pasos+"Renglon"+(c+1)+" multiplicado por: "+aux+" y sumado el renglon "+(z+1)+"\n";       //Impreción del proceso realizado en cliclo anterior
				for(int i=0;i<fila;i++){                                //Recorre filas para impresion
					for(int j=0;j<colum;j++){                       //Recorre columnas para impresion 
						pasos=pasos+(matrix[i][j]+"\t|\t");     //Almacena en variable los valores almacenados en las posiciones de la matriz obtenidas por los ciclos 
					}
					pasos=pasos+("\n");                             //Salto de linea
				}
				z--;                                                    //z se reduce hasta cumplir con condicion y no tener filas
			}
			
			c++;
			pasos=pasos+("\n");                                             //Salto en fila
		}
		
			txtarea2.setText(pasos); //mostrar el procedimiento realizado en componente txtarea
                        return matrix;          //Metodo retorna la matriz 
  }
                  
}

