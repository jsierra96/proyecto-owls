//Nombre del paquete
package unidad3;
//Importacion de librerias
import java.awt.*;
import clases.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
public class Cramer{ //Clase

    // Variables declaration - do not modify//GEN-BEGIN:variables
    JButton btn1=new JButton();
    JButton btn2=new JButton();
    JButton btn3=new JButton();
    JButton jButton1=new JButton();
    JLabel jLabel1=new JLabel();
    JLabel jLabel2=new JLabel();
    JPanel jPanel1=new JPanel();
    JScrollPane jScrollPane1=new JScrollPane();
    JTextArea jTextArea1=new JTextArea();
    JTextField jTextField1=new JTextField();
    JButton min1=new JButton();
    window ventana;
    // End of variables declaration//GEN-END:variables
    public Cramer() { //Metodo constructor
        initComponents(); //inicializacion de componentes y configuracion de los mismos
    }
 private void initComponents() {
        jLabel1.setFont(new java.awt.Font("Harlow Solid Italic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 121, 107));
        jLabel1.setText("Cramer");
        jLabel1.setBounds(300, 10, 130, 27);
        jPanel1.add(jLabel1);
        btn2.setText("Ingresar datos");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        btn2.setBounds(30, 220, 150, 30);
        jPanel1.add(btn2);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));
        jScrollPane1.setOpaque(false);

        jTextArea1.setBackground(new java.awt.Color(178, 235, 242));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(26, 82, 118)));
        jScrollPane1.setViewportView(jTextArea1);
        jScrollPane1.setBounds(385, 86, 313, 188);
        jPanel1.add(jScrollPane1);
        btn3.setText("Limpiar");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        btn3.setBounds(240, 220, 100, 30);
        jPanel1.add(btn3);
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 121, 107));
        jLabel2.setText("Tama�o de la matriz:");
        jLabel2.setBounds(30, 80, 200, 30);
        jPanel1.add(jLabel2);
        jTextField1.setBackground(new java.awt.Color(178, 235, 242));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 121, 107), 2));
        jTextField1.setBounds(240, 80, 80, 30);
        jPanel1.add(jTextField1);
        btn1.setText("Generar Matriz");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);
        btn1.setBounds(140, 150, 140, 30);
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(620, 350, 100, 30);
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
        ventana=new window(760,430,jPanel1,min1,true);
    }
//Metodo para ejecutar el algoritmo que resolvera por Cramer                        //Evento al hacer clic en el boton
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       main2();
    }//GEN-LAST:event_btn2ActionPerformed
//limpiador del area de Texto                                                       //Evento al hacer clic en el boton
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        jTextArea1.setText("");
    }//GEN-LAST:event_btn3ActionPerformed
 private int tam=0; //Tamaño inicial de 0 de la matriz                              //Evento al hacer clic en el boton
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

     try{           //Validacion del tama�o del cual sera la matriz mediante una excepcion
         tam=Integer.parseInt(jTextField1.getText());
         if(tam<=1){
                throw new Exception("Ha ingresado un numero invalido para el sistema");         //Mensaje de error en el valor para el tamaño
            }
         JOptionPane.showMessageDialog(null, "Correcto");                                       //Mensaje aprobatorio
     }
     catch(NumberFormatException ec){                                                           //Excepción
	JOptionPane.showMessageDialog(null, "Ha ingresado un valor invalido para el sistema");  //Mensaje de error
     }
     catch(Exception e){}
    }
    //Evento al entrar al componente el puntero el mouse
    private void min1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min1MouseEntered
        min1.setBackground(new Color(153, 202, 253));
    }//GEN-LAST:event_min1MouseEntered
                                                                                             //Evento del mouse //Evento al salir del componente el puntero del mouse
    private void min1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min1MouseExited
        min1.setBackground(new Color(33, 97, 140));
    }//GEN-LAST:event_min1MouseExited
//Método para abrir el archivo de ayuda                                               //Evento al hacer clic en el boton
    private void min1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min1ActionPerformed
        String ruta = System.getProperty("user.dir"); //Variable para almacenar la ruta del sistema
        String fileLocal = ruta + "/src/docu/EXTRAPOLACION.docx"; //Varable para almacenar el nombre del archivo ayuda asi como la carpeta donde se encuentra
        try
        {
            File path = new File(fileLocal);  //Abre el archivo
            Desktop.getDesktop().open(path);
        }
        catch (IOException e)       //Excepción para abrir el archivo de ayuda sin problema
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_min1ActionPerformed
                                                                                    //Método para abrir el archivo de menu unidad 3
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menu_uni3 m=new menu_uni3();
        ventana.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
                                                    //Metodo para insertar valores a la matriz
    public  void main2(){


		float a[][]=new float[tam][tam]; //ecuacion

		float b[]=new float[tam]; //resultado de a

		float solucion[]=new float [tam]; //vector del tamaño del numero de datos

		float cmr[]=new float[tam]; //vector temporal cramer


		JOptionPane.showMessageDialog(null,"Valores de la matriz");
		insertarM(a);                                                       //llamada a procedimiento
		JOptionPane.showMessageDialog(null,"Valores resultado");
		insertarV(b);                                                      //Insertar el resultado de b en el procedimiento


		cmr=cramer(a,b);                                                    //inserción de los 2 vectores al metodo cramer
                jTextArea1.append("Los resultados son: \n");
		mostrarX(cmr);                                                          //Muestra los resultados

	}

	//Declaracion de procedimiento para matriz
	public  void insertarM(float a[][]){  //Insertar valores y recibir matriz inicial
            jTextArea1.append("Matriz\n");
		for(int i=0; i<a.length; i++){              //Primer ciclo para la matriz
			for (int j=0; j<a[i].length;j++){   //Segundo ciclo para la matriz
                            boolean ban=false;
			while(ban==false){          //Validación por cada dato ingresado
                            try{

                                a[i][j]=Float.parseFloat(JOptionPane.showInputDialog(null,"Inserte un valor para la posicion: [ "+i+" , "+j+" ]"));	//Dato ingesado
                                ban=true;
                                jTextArea1.append(a[i][j]+"\t");
                            }
                            catch(HeadlessException | NumberFormatException e){                 //Excepción
                                JOptionPane.showMessageDialog(null, "Ha ingresado un valor invalido para el sistema");  //Mensaje de error
                            }
                        }
                        }
                        jTextArea1.append("\n");  //Salto en el area de texto

		}

	}

	public void mostrarM(float a[][]){ //Muestra la matriz a
		for(int i=0; i<a.length; i++){                          //Primer ciclo para mostrar la matriz
			for (int j=0; j<a[i].length;j++){               //Segundo ciclo para mostrar la matriz
				 jTextArea1.append("El resultado de la matriz en la posicion  [ "+i+" , "+j+ " ] es: "+a[i][j]+"\n");   //Muestra los datos
			}
		}

	}
                                                                                    //Declaracion de procedimientos para vector a
	public void insertarV(float a[]){
            jTextArea1.append("\nResultados de las ecuaciones son: \n");
		for(int i=0; i<a.length; i++){                                      //Ciclo para el vector a
                            boolean ban=false;                                      //variables boleanas para la validacion de datos insertados
			while(ban==false){                                          //ciclo para validacion de datos insertados
                            try{
				a[i]=Float.parseFloat(JOptionPane.showInputDialog(null,"Inserte un valor para el vector en la posicion: [ "+i+" ]" ));		//insercion
                                ban=true;                                               //Validación de dato
                                jTextArea1.append(a[i]+"\n");
                                 }
                             catch(HeadlessException | NumberFormatException e){                    //Excepción
                                JOptionPane.showMessageDialog(null, "Ha ingresado un valor invalido para el sistema");   //Mensaje de error

                                        }
                            }
                }
                jTextArea1.append("-------------------");
	}
	//Mostrar vector a
	public  void mostrarV(float a[]){
		for(int i=0; i<a.length; i++){                                          //Ciclo para recorrer el vector
			 jTextArea1.append("El resultado de la matriz en la posicion  [ "+i+" ] es: "+a[i]+"\n");  //imprime dato
		}

	}

	public static int determinante(float a[][]){                                //Calculo del determinante de la matriz
		float c[][]=new float[a.length+(a.length-1)][a.length];             //Matriz para el determinante
		float det = 0;

		//almacena los resultados parciales
		float par[]=new float[(a.length)*2];

		for(int i=0;i<a.length;i++){
			for(int j=0; j<a[i].length; j++){

					c[i][j]=a[i][j];                            //almacenamiento de la matriz en la matriz c (determinante)

			}
		}
		int k=0;
		for(int i=a.length;i<c.length;i++){                               //
			for(int j=0; j<a.length; j++){
					c[i][j]=a[k][j];

			}
			k++;
		}

                                                                                    //calcula la suma de los productos y la inserta en par
		k=0;
		float temp=1;
		float inc=1;

		for (int i=0; i< a.length;i++){                                     //For 1
			for(int j=0; j<a[i].length;j++){                            //For 2
				temp=temp*c[k][j];                                  //almacenamiento de productos en matriz temp
				k++;
			}
			k=(int) inc;
			par[i]=temp;
			temp=1;
			inc++;
		}

                                                                                    //calcula la resta de los productos y la inserta en par
		k=a.length-1;

		temp=1;
		inc=a.length-1;

		int l=(par.length)/2;

		for (int i=0; i< a.length;i++){                                         //For1
			for(int j=0; j<a[i].length;j++){                                //For2
				temp=temp*c[k][j];                                      //Calculo de productos
				k--; //k=k-1;                                           //resta en k (fila)
			}
			par[l]=-temp;
			temp=1;

			inc++;
			k=(int) inc;
			l++;
		}

		det=suma(par);

		return (int) det;
	}


	//sustituye los valores de b en a en la posicion pos
	public static float [][] sustituye(float a[][], float b[], float pos){
		float c[][] =new float[a.length][a.length];                         //matriz c


		for(int i=0;i<a.length;i++){
			for(int j=0; j<a[i].length; j++){
				if(j==pos){
					c[i][j]=b[i];  //sustitucion de valor
				}
				else{
					c[i][j]=a[i][j];            //continua el recorrido
				}

			}

		}

		return c;
	}

	public static float suma(float a[]){
		float result=0;                                         //Variable para resultado
		for(int i=0; i<a.length; i++){                          //recorrido del vector resultado
			result=result+a[i];                             //resultado de ecuacion
		}

		return result;                                           //retorno del resultado

	}

                                                                                    ///funcion cramer
	public  float[] cramer(float a[][], float b[]){
		float Rcramer[]=new float[b.length];                               //Vector para el resultado de las variables de la ecucacion
		float det=determinante(a);                                          //variable que almacena el valor del determinante dato por el calculo en el metodo determinante()
		if(det==0){                                                         //Si el determinante es 0
			 jTextArea1.append("No tiene solución\n");                  //matriz sin solución
			return Rcramer;                                             //retorno del valor
		}

		float detTemp;

		float c[][]=new float[a.length][a.length];
		for(int i=0; i<a.length; i++){
			c=sustituye(a,b,i);                                      // c almacena los valores que devuelve el metodo sustituye los cuales son los valores sustituidos por iteracion en la matriz

			detTemp=determinante(c);                                  //detTemp almacena el valor del determinante


			Rcramer[i]=(float)detTemp/(float)det;			//Se almacena en el vector Rcramer el resultado de las operaciones de el determinante por posicion de c entre el determinante de la matriz
		}
		return Rcramer;
	}

                                                                                    //muestra los resultados de X
		public  void mostrarX(float a[]){
		for(int i=0; i<a.length; i++){
			 jTextArea1.append("El valor de X"+i+" es: "+a[i]+"\n");			//imprime
		}

	}
}
