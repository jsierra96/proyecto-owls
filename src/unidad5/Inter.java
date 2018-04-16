//Nombre del paquete
package unidad5;
//Librerias 
import LibreriasLion.evaexpresion;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import clases.*;
//Clase
public class Inter{
    // Variables declaration
    JPanel jPanel1 = new JPanel();
    JScrollPane scroll1 = new JScrollPane();
    JScrollPane jScrollPane2 = new  JScrollPane();
    JTable tabla1 = new JTable();
    JTextArea txtarea = new JTextArea();
    JButton btn1 = new JButton();
    JButton btn2 = new JButton();
    JButton btn3 = new JButton();
    JTextField txt1 = new JTextField();
    JTextField txt2 = new JTextField();
    JTextField txt3 = new JTextField();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JLabel jLabel18 = new JLabel();
    JButton btn4 = new JButton();
    JButton btn5 = new JButton();
    JButton btn6 = new JButton();
    JButton min1 = new JButton();
    window ventana;
    String ruta=System.getProperty("user.dir"); //ruta de sistema
    double valy[],valx[]; //Vectores para X y Y
    // End of variables declaration//GEN-END:variables

    public Inter() { //Metodo Costructor
        initComponents(); //inicializador de componentes 
        tabla1.setVisible(false); //no se muestra la tabla al inicio de la ejecucion
        tabla1.getTableHeader().setVisible(false); //no se muestra el encabezado de la tabla
        btn5.setEnabled(false);      //Se desactiva el boton para validar
        btn2.setEnabled(false);      //Se desactiva el  boton para diferencias de newton
        btn3.setEnabled(false);      //se desactiva el boton para LaGrange
    }

    //Generar tabla con dimenciones definidas por usuario
    public void cargar_tabla(){
        String nomcolum []={"X","Y"};
       Object [][]tabla=new Integer[Integer.parseInt(txt1.getText())][5];
        DefaultTableModel modelo= new DefaultTableModel(tabla,nomcolum);
        tabla1 = new JTable(modelo);
        TableColumnModel columnModel = tabla1.getColumnModel();  //Personalizacion de tabla
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
              columnModel.getColumn(i).setPreferredWidth(91);
         }
        scroll1.setViewportView(tabla1);
    }
    
    private void initComponents() {
        scroll1.setBackground(new java.awt.Color(153, 255, 153));
        scroll1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));
        scroll1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scroll1.setOpaque(false);
        scroll1.setViewportView(tabla1);
        scroll1.setBounds(40, 130, 194, 136);
        jPanel1.add(scroll1);
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));
        txtarea.setEditable(false);
        txtarea.setBackground(new java.awt.Color(178, 235, 242));
        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane2.setViewportView(txtarea);
        jScrollPane2.setBounds(350, 140, 310, 136);
        jPanel1.add(jScrollPane2);
        btn1.setText("Cargar tabla");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn1.setBounds(250, 70, 140, 30);
        jPanel1.add(btn1);
        btn2.setText("Diferencia de Newton");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        btn2.setBounds(150, 380, 170, 30);
        jPanel1.add(btn2);
        btn3.setText("Lagrange");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        btn3.setBounds(350,380,100,30);
        jPanel1.add(btn3);
        txt1.setBackground(new java.awt.Color(178, 235, 242));
        txt1.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        txt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));
        txt1.setBounds(140, 70, 90, 30);
        jPanel1.add(txt1);
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Num. de Datos");
        jLabel1.setBounds(30, 70,105,30);
        jPanel1.add(jLabel1);
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("X:");
        jLabel2.setBounds(430, 90, 30,30);
        jPanel1.add(jLabel2);
        txt2.setBackground(new java.awt.Color(178, 235, 242));
        txt2.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        txt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));
        txt2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt2.setBounds(460, 90, 80, 30);
        jPanel1.add(txt2);
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Y:");
        jLabel3.setBounds(310, 310, 20,30);
        jPanel1.add(jLabel3);
        txt3.setBackground(new java.awt.Color(178, 235, 242));
        txt3.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        txt3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));
        txt3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt3.setBounds(340, 310, 160, 30);
        jPanel1.add(txt3);
        btn4.setText("Regresar");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        btn4.setBounds(680, 390, 100, 30);
        jPanel1.add(btn4);
        jLabel18.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Interpolacion");
        jLabel18.setToolTipText("");
        jLabel18.setBounds(263, 0, 220, 50);
        jPanel1.add(jLabel18);
        btn5.setText("Validar");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        btn5.setBounds(30, 380, 100, 30);
        jPanel1.add(btn5);
        btn6.setText("Limpiar");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        btn6.setBounds(480, 380, 100, 30);
        jPanel1.add(btn6);

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
        ventana=new window(800,470,jPanel1,min1,true);
    }
  //Metodo para cargar la tabla                                                          //Evento al hacer clic en el boton
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {
        btn2.setEnabled(false); //deshabilita el boton difencias de newton
        btn3.setEnabled(false); //deshabilita el boton lagrange
        btn5.setEnabled(false); //deshabilita el boton Validar
        if(txt1.getText().equals("")){ //Verifica que el numero para la matrix este vacio
            JOptionPane.showMessageDialog(null,"Debe ingresar el numero de datos exprerimentales");  //muestra un mensaje de advertencia
        }else{
            try {
                Integer.parseInt(txt1.getText()); //convierte numero de datos a entero
                
             cargar_tabla(); //ejecuta metodo para cargar la tabla
             btn5.setEnabled(true);  //habilita el boton validar
	    } catch (NumberFormatException nfe){  //Excepcion 
		JOptionPane.showMessageDialog(null,"Ingrese un valor entero para el num. de datos");//Mensaje de error
	    }
        }
        
    }
//Metodo para resolver por diferencias de newton                                    //Evento al hacer clic en el boton
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        valx=new double[Integer.parseInt(txt1.getText())]; //vector x
        valy=new double[Integer.parseInt(txt1.getText())]; //vector y
        double auxy[]=valy; //auxiliar para el vector y
        double valx2[];     //auxiliar para el vector x
        valx2=valx;         //
        int c=Integer.parseInt(txt1.getText()); //Captura de numero de datos 
        double b[]=new double[Integer.parseInt(txt1.getText())]; //Generacion de vector para el numero de datos
        double resu[];  //vector que contendra las multiplicaciones de Lj
        obtener_val(); //metodo que obtiene los valores de la tabla
        b[0]=valy[0]; //el vector v en la primera posicion almacena el valor de y en su primera posicion 
        int conta=1,a=c; //Variables para los ciclos
        String ms="\nb0:"+b[0]; //Mensaje que muestra el valor para b0
        while(conta<c){ //mientras el contador sea menor al numero de datos, entra
           resu=new double[a-1]; 
           
           for(int i=0;i<a-1;i++)  //ciclo para almacenar el el vector resu los resultados de los calculos iteratios de X
               resu[i]=(auxy[i+1]-auxy[i])/(valx2[i+conta]-valx2[i]);
           
           for(int i=0;i<resu.length;i++)  //ciclo que recorre el vecto resu
               auxy[i]=resu[i];             //copia de resu en el vector auxiliar para y
           
           b[conta]=resu[0];  //b en posicion de conta (aumento) almacena el resultado del primer ciclo de calculos en X
           ms=ms+"\nb"+conta+": "+b[conta]; //mensaje de valores que va valiendo las vueltas de b
           conta++; //incremento de conta
           a--; //resta al numero de datos (en este caso, para numero de ciclos) a calcular
        }
        String aux1=""+b[0],expre="",aux3=""; //variables String para almacenar cadenas para mostrar resultados 
        for(int j=1;j<b.length;j++){ //ciclo para recorrer b y obtener valores para armar la expresion en una cadena
            aux3=aux3+",*,(,x,-,"+valx[j-1]+",)"; //Expresiones
            expre=",+,(,"+b[j]+aux3+",)"; //recibe el valor de b[]
            aux1=aux1+expre;
        }
        
        txt3.setText(String.valueOf(evaexpresion.Posfija(aux1, txt2.getText()))); //muestra en panel la solucion de la expresion devuelta por el componente evaluador
        aux1=aux1.replaceAll(",", ""); 
        ms=ms+"\nY: "+aux1.replaceAll("x",txt2.getText()); 
        txtarea.setText(ms); //muestra el proceso de soluciones de X
    }
//abrir menu principal                                                              //Evento al hacer clic en el boton
    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
         menuprincipal obj=new menuprincipal();
         ventana.dispose();
    }
//Resolcion por lagrange                                                            //Evento al hacer clic en el boton
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {
       valx=new double[Integer.parseInt(txt1.getText())]; //Vector para x
       valy=new double[Integer.parseInt(txt1.getText())]; //Vector para y
        double auxy[]=valy; //Vector auxiliar para y
        double valx2[]; //vector auxiliar para x
        valx2=valx;
        int c=Integer.parseInt(txt1.getText()); //numero de datos
        double l[]=new double[Integer.parseInt(txt1.getText())]; //Generar vector para el numero de datos
     
        obtener_val(); //obtiene los valores introducidos
         
        int conta=0,a=c; //controladores de ciclos
        String ms=""; //Mensaje
        String aux1,expre,aux3; //variables String para mostrar expresion 
        while(conta<a){     // mientras contador sea menor a numero de datos
            aux1="";  //inicializacion de variables string
            expre=""; //
            aux3="";  //
            for(int i=0;i<valx.length;i++){           //mientras en controlador del ciclo sea menor al numero de datos
                if(conta!=i ){          
                    if( i==valx.length-1 ){  //si la posicion del ciclo es igual al numero de datos (primera vuelta)
                          aux1=aux1+"(,x,-,"+valx[i]+",)";                           //Se genera las expresiones para L(x)
                          aux3=aux3+"(,"+valx[conta]+",-,"+valx[i]+",)";            //
                    }else{
                        if( conta==valx.length-1 && i+1==valx.length-1){            // si la posicion del ciclo y el controlador del ciclo es igual al numero de datos (segunda vuelta) 
                            aux1=aux1+"(,x,-,"+valx[i]+",)";                        //se generan las expresiones para L(x)
                            aux3=aux3+"(,"+valx[conta]+",-,"+valx[i]+",)";
                        }else{                                                      //el resto de vueltas                
                          aux1=aux1+"(,x,-,"+valx[i]+",),*,";                       //Se generan las expresiones para L(x)
                          aux3=aux3+"(,"+valx[conta]+",-,"+valx[i]+",),*,";
                        }
                    }
                }
            }
            expre=expre+"(,"+aux1+",),/,(,"+aux3+",)";                                //almacena la expresion en cadena
            l[conta]=evaexpresion.Posfija(expre, txt2.getText());                     //se almacena el valor resulto de la expresion en el vector l (vector de resultados de expresiones)
            
            ms=ms+"\n L"+conta+": "+l[conta];                                       //se almacena la posicion de L(x) y su valor
            conta++;
        }
        aux1="";                                                                    //inicializacion de variable string
        double r=0;                                 //variable para almacenar los resultados de las operaciones de L(x)
        for(int i=0;i<l.length;i++){            //recorrer el vector l
            r=r+(valy[i]*l[i]);                 //se acumulan los resultados de la multiplicacion de los valores en y (V en formula) y los resultados de L(x)
            if(i==l.length-1)                   //si es la primera posicion
                aux1=aux1+"("+valy[i]+"*"+l[i]+")";         //almacena expresion
            else
                aux1=aux1+"("+valy[i]+"*"+l[i]+")+";        //almacena expresion
        }
        System.out.println(aux1);                           //imprime en consola expresion
        ms=ms+"\n Y="+aux1;                                 //imprime el resultado de Y en formula
        txtarea.setText(ms);                                //imprime proceso
        txt3.setText(String.valueOf(r));                    //imprime resultado 
    }

//Validacion de campos llenos y tipos de datos correctos                            //Evento al hacer clic en el boton
    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {
    	 boolean b=false;
         for(int i=0;i<tabla1.getRowCount();i++){        
                 for(int j=0;j<tabla1.getColumnCount();j++){
                     if(tabla1.getValueAt(i,j)==null)
                         b=true;
                 }
         }
         if(txt2.getText().equals("") && b)    //comparacion par checar que X junto con la tabla no esten vacios
             JOptionPane.showMessageDialog(null,"El valor de X y la tabla esta vacio");  //muestra mensaje encaso de que la tabla y X esten vacios
         else if(txt2.getText().equals("") && !b)    //comparacion unicamente en caso de que X este vacio
             JOptionPane.showMessageDialog(null,"El valor de X esta vacio");
         else if(b) //comparacion escaso de que solo la tabla este vacia o uno de sus campos
             JOptionPane.showMessageDialog(null,"La tabla esta vacia o valor en la tabla esta vacio");
         else{ 
             try {   //recorre la tabla verificando que todos sus campos sean numeros 
            	 Double.parseDouble(txt2.getText());
                 for(int i=0;i<tabla1.getRowCount();i++){        //recorre filas
                    for(int j=0;j<tabla1.getColumnCount();j++){ //recorre columnas
                          Double.parseDouble(tabla1.getValueAt(i,j).toString() );  //convierte en tipo de dato double
                    }
                 }
              btn2.setEnabled(true);                                   //Deshabilita botones para el calculo
              btn3.setEnabled(true);
 	} catch (NumberFormatException nfe){                                        //Excepcion
 		JOptionPane.showMessageDialog(null,"Un valor introducido en la tabla o X, no es un numero ");   //mensaje de error
 	    }
         }
    }
//Boton limpiar                                                                         //Evento al hacer clic en el boton
    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {
       this.txt1.setText("");               //Se limpian los componentes de entrada de datos
       this.txt2.setText("");
       this.txt3.setText("");
       this.txtarea.setText("");
       this.tabla1.setVisible(false);
       this.tabla1.getTableHeader().setVisible(false);
    }
                                                                                        //Evento al entrar al componente el puntero el mouse
    private void min1MouseEntered(java.awt.event.MouseEvent evt) {
        min1.setBackground(new Color(153, 202, 253));
    }
                                                                                     //Evento al salir del componente el puntero del mouse
    private void min1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min1MouseExited
        min1.setBackground(new Color(33, 97, 140));
    }
//Abrir archivo de ayuda                                                            //Evento al hacer clic en el boton
    private void min1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min1ActionPerformed
        String ruta = System.getProperty("user.dir"); //Ruta de sistema
        String fileLocal = ruta + "/src/docu/EXTRAPOLACION.docx"; //ruta y nombre del archivo ayuda
        try{                                   //abre el archivo
           File path = new File(fileLocal);
           Desktop.getDesktop().open(path);
        }catch (IOException e) {              //Excepcion
            e.printStackTrace();
        }
    }
//Obtener valores de la tabla
    public void obtener_val(){
       for(int i=0;i<tabla1.getRowCount();i++){                 //Recorre fila
            for(int j=0;j<tabla1.getColumnCount();j++){         //recorre columnas
                if (j==0)                                                           //condicion para obtener primero las columnas
                    valx[i]=Double.parseDouble(tabla1.getValueAt(i,j).toString() );
                else
                    valy[i]=Double.parseDouble(tabla1.getValueAt(i,j).toString() );  //condicion para obtener las filas
            }
        } 
    }

}
