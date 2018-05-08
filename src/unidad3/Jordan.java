//Paquete
package unidad3;
//Importación de librerias
import java.awt.*;
import java.io.*;
import javax.swing.*;
import clases.*;
import javax.swing.table.DefaultTableModel;


public class Jordan{ //Clase
  // Variables declaration - do not modify//GEN-BEGIN:variables
  JButton btn1=new JButton();
  JButton btn2=new JButton();
  JButton btn3=new JButton();
  JButton btn4=new JButton();
  JButton jButton1=new JButton();
  JLabel jLabel1=new JLabel();
  JLabel jLabel18=new JLabel();
  JPanel jPanel2=new JPanel();
  JScrollPane jScrollPane1=new JScrollPane();
  JButton min1=new JButton();
  JScrollPane scroll=new JScrollPane();
  JTextField txt1=new JTextField();
  JTextArea txtarea=new JTextArea();
  window ventana;
  JTable tabla1; //Tabla matriz
  // End of variables declaration//GEN-END:variables
    public Jordan() { //Constructor
        initComponents(); //inicializacion de componentes
        btn2.setEnabled(false);                         //Deshabiltar boton calcular antes de haber ingresado datos
        btn4.setEnabled(false);                         //Deshabilitar boton validar antes de haber ingresado datos
    }


    double matrix[][]; // Declaracion de Matriz
                                                                                        //Método para obtener los valores en la matriz
    public void obtener_val(){
      matrix=new double[Integer.parseInt(txt1.getText())][Integer.parseInt(txt1.getText())+1];
        for(int i=0;i<tabla1.getRowCount();i++){                                        //For 1 recorre fila
            for(int j=0;j<tabla1.getColumnCount();j++){                                 //For 2 recorre columna
                    matrix[i][j]=Double.parseDouble(tabla1.getValueAt(i,j).toString() );   //Inserción del dato
            }
        }
  }
                                                                                    //Solucion por Gauss jordan
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

			txtarea.setText(pasos); //mostrar el procedimiento realizado en componente txtarea
                        return matrix;          //Metodo retorna la matriz
  }
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
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153)); // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel1.setText("Numero de variables:"); //configura el texto a mostrar
        jLabel1.setBounds(40, 60, 190,30);  //configuracion de tamaño y posicion al componente
        jPanel2.add(jLabel1);   //añade el componente al panel
        txt1.setBackground(new java.awt.Color(178, 235, 242));  //se configura el color de fondo del componente
        txt1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2)); //Configuracion del borde del componente
        txt1.setBounds(240, 60, 50, 30);    //configuracion de tamaño y posicion al componente
        jPanel2.add(txt1);  //añade el componente al panel
        btn1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(0, 102, 153));    // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        btn1.setText("Generar Matriz"); //configura el texto a mostrar
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn1ActionPerformed(evt);
            }
        });
        btn1.setBounds(150, 100, 140, 30);  //configuracion de tamaño y posicion al componente
        jPanel2.add(btn1);  //añade el componente al panel
        scroll.setBackground(new java.awt.Color(178, 235, 242));    //se configura el color de fondo del componente
        scroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2)); //Configuracion del borde del componente
        scroll.setForeground(new java.awt.Color(0, 102, 153));  // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        scroll.setOpaque(false);    //configura la transparencia del componente
        scroll.setBounds(100, 140, 260, 130);   //configuracion de tamaño y posicion al componente
        jPanel2.add(scroll);    //añade el componente al panel
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));   //Configuracion del borde del componente
        txtarea.setBackground(new java.awt.Color(178, 235, 242)); //se configura el color de fondo del componente
        txtarea.setColumns(20); //columnas
        txtarea.setRows(5); //filas
        jScrollPane1.setViewportView(txtarea); //muestra el txtarea en ScrollPane
        jScrollPane1.setBounds(430, 90, 330, 210);  //configuracion de tamaño y posicion al componente
        jPanel2.add(jScrollPane1);  //añade el componente al panel
        btn2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(0, 51, 153)); // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        btn2.setText("Calcular");//configura el texto a mostrar
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {  //Evento al hacer clic en el boton
                btn2ActionPerformed(evt);
            }
        });
        btn2.setBounds(180, 300, 100, 30);  //configuracion de tamaño y posicion al componente
        jPanel2.add(btn2);  //añade el componente al panel
        btn3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btn3.setForeground(new java.awt.Color(0, 51, 153)); // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        btn3.setText("Regresar");   //configura el texto a mostrar
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn3ActionPerformed(evt);
            }
        });
        btn3.setBounds(660, 310, 100, 30);  //configuracion de tamaño y posicion al componente
        jPanel2.add(btn3);  //añade el componente al panel
        jLabel18.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));    // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jLabel18.setText("Gauss Jordan"); //configura el texto a mostrar
        jLabel18.setBounds(280, 0, 210,50); //configuracion de tamaño y posicion al componente
        jPanel2.add(jLabel18);  //añade el componente al panel
        btn4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btn4.setForeground(new java.awt.Color(0, 51, 153)); // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        btn4.setText("Validar");    //configura el texto a mostrar
        btn4.setAutoscrolls(true); //Hacer autoScroll automaticamente
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                btn4ActionPerformed(evt);
            }
        });
        btn4.setBounds(40, 300, 100, 30);   //configuracion de tamaño y posicion al componente
        jPanel2.add(btn4);  //añade el componente al panel

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 52, 153)); // se configura el color de primer plano utilizado por el método de pintura predeterminado del Componente
        jButton1.setText("Limpiar");    //configura el texto a mostrar
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {   //Evento al hacer clic en el boton
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(320, 300, 90, 30);   //configuracion de tamaño y posicion al componente
        jPanel2.add(jButton1); //añade el componente al panel
        ventana=new window(800,400,jPanel2,min1,true);
    }// </editor-fold>//GEN-END:initComponents

   //Metodo para generar la matriz                                                      //Evento al hacer clic en el boton
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        btn2.setEnabled(false); //deshabilita el boton calcular
        if(txt1.getText().equals("")){ //Verifica que el numero para la matriz este vacio
            JOptionPane.showMessageDialog(null,"Debe ingresar el tamaño de la matrix");  //muestra un mensage de advertencia
        }else{
            try {
		int fila=Integer.parseInt(txt1.getText());  //verifica que el dato puesto para la matrix sea numero y designa el numero de filas
                btn4.setEnabled(true);  //habilita el boton validar
                String nomcolum []=new String[(fila+1)]; //crea un arreglo para el nombre de la fila
                for(int i=0;i<fila+1;i++){  //ciclo que permite recorrer el arreglo creado
                    nomcolum[i]="X"+(i+1);   //asigna el nombre para cada fila
                    if(i+1==fila+1)  //Valida si esta en el ultimo espacio del arreglo creado
                         nomcolum[i]="Resul.";  //Le asigna el nombre resul a la ultima posicion de la fila
                }
                Object [][]tabla2=new Integer[fila][fila]; //crea un arreglo bidimencional, es decir las filas y columnas de la tabla
                DefaultTableModel modelo= new DefaultTableModel(tabla2,nomcolum); //creal el modelo que tendra la tabla
                tabla1 = new JTable(modelo); //crea la tabla
                tabla1.setBorder(null);//le quita el borde ala tabla
                scroll.setViewportView(tabla1);//Permite ser visible a la tabla
	    } catch (NumberFormatException nfe){
		JOptionPane.showMessageDialog(null,"El valor introducido para generar la matrix no es un numero");
	    }
        }

    }//GEN-LAST:event_btn1ActionPerformed
                                                                                    //Evento al hacer clic en el boton
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        obtener_val();
        gauus_jordan(matrix,Integer.parseInt(txt1.getText()),Integer.parseInt(txt1.getText())+1);
    }//GEN-LAST:event_btn2ActionPerformed
//Muestra el menu de la unidad                                                      //Evento al hacer clic en el boton
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       menu_uni3 home=new menu_uni3();
       ventana.dispose();
    }
     //Validación de campos llenos y tipos de datos correctos                       //Evento al hacer clic en el boton
    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        try {
            for(int i=0;i<tabla1.getRowCount();i++){                                //For recorre filas
                for(int j=0;j<tabla1.getColumnCount();j++){                         //For recorre columnas
                    if(tabla1.getValueAt(i,j)==null){                               //obtiene el valor de la tabla y lo compara  con null
                        JOptionPane.showMessageDialog(null,"Un valor en la tabla esta vacio");  //Mensaje de error
                        break;                                                                   //Sale de la validación para corregir en la posicion actual
                    }else{
                        Double.parseDouble(tabla1.getValueAt(i,j).toString() );             //obtiene el valor
                         btn2.setEnabled(true);                                             //habilita boton para el calculo
                    }
                }
            }
	} catch (NumberFormatException nfe){                                                //Excepcion
		JOptionPane.showMessageDialog(null,"Un valor introducido en la tabla no es un numero");
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
//metodo enlace al archivo de ayuda                                                     //Evento al hacer clic en el boton
    private void min1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min1ActionPerformed
        String ruta = System.getProperty("user.dir"); //Variable para almacenar ruta del sistema
        String fileLocal = ruta + "/docu/ECUACIONES-SIMULTÁNEAS-GAUSS-JORDAN.docx"; //Nombre del archivo ayuda y carpeta donde se ubica
        try
        {
            File path = new File(fileLocal);        //abre archivo
            Desktop.getDesktop().open(path);
        }
        catch (IOException e)               //Excepcion
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_min1ActionPerformed
      //boton limpiar                                                                   //Evento al hacer clic en el boton
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

txt1.setText("");
txtarea.setText("");
tabla1.setVisible(false);
tabla1.getTableHeader().setVisible(false);


// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
}
