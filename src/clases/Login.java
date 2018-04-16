//Nombre del paquete
package clases; 
//imporacion de clases y paquete unidad 1
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.Statement;
//Metido login
public class Login {
    //Metodo Principal
  public static void main(String[]args) {
		fuentes letra=new fuentes(); //invoca a la clase fuentes donde se carga un estilo de fuente
		JPanel pa=new JPanel(); //se crea un panel
		JLabel usu=new JLabel(); //genera una etiqueta de texto
		JLabel con=new JLabel();//genera una etiqueta de texto 
		JLabel men=new JLabel();//genera una etiqueta de texto 
		JTextField user=new JTextField();//genera una caja de texto 
		JPasswordField password= new JPasswordField();//crea una caja de texto tipo contraseña
		JButton boton1 =new JButton("Iniciar");//crea el boton iniciar
		JButton boton2 =new JButton("Cancelar");//crea el boton cancelar
		men.setText("Iniciar sesion"); //asigna el mensage a la etiqueta de texto men
		usu.setText("Usuario:"); //asigna el mensage entre comillas a la etiqueta usu
		usu.setFont(letra.fuente2());//a la etiqueta usu le pone un estilo de letra que se encuentra en la clase fuentes
		usu.setForeground(Color.blue);//ala etiqueta usu sele asigna un color de letra azul
		usu.setLocation(40,90); //se posiciona la etiqueta usu en X=40 Y=90
		usu.setSize(100,30);//se le da un tamaño de largo 100 y ancho 30 a la etiqueta usu
		con.setText("Contraseña:");//Asigna el mensaje a la etiqueta con y se le establecen parametros
		con.setLocation(40,150);    //
		con.setSize(120,30);    //
		con.setFont(letra.fuente2()); //Asignacion de estilo de letra fuente 2
		men.setFont(letra.fuente1());  //Asignacion de estilo de letra fuente 1
		men.setForeground(new Color(21, 67, 96));  //Asignacion de color a las etiquetas
		con.setForeground(new Color(21, 67, 96));  //
		usu.setForeground(new Color(21, 67, 96));  //
		men.setSize(180,30);        //Asignacion de tamaño a las etiquetas
		men.setLocation(80,25);     //
		user.setSize(125,30);       //      Modificaciones al cuadro de texto para usuario
		user.setFont(letra.fuente2()); //
		user.setLocation(160,90);       //
		password.setSize(125,30);       //  Modificaciones al cuadro de texto para usuario
		password.setLocation(160,150);  //
		boton1.setFont(letra.fuente2());    // Modificaciones al boton 1
		boton1.setSize(100,30);             //
		boton1.setLocation(60,210);         //  
		pa.add(boton1);                     // Adicion del componente boton 1
		boton2.setFont(letra.fuente2());    // Modificaciones al boton 2
		boton2.setSize(110,30);             //
		boton2.setLocation(180,210);        //
		pa.add(boton2); //adicion del componente boton 2
		pa.add(usu);  //adicion de la etiqueta usu
		pa.add(con);  //adicion de la etiqueta con
		pa.add(user);  // asignacion de user
		pa.add(men);   //asignacion de la etiqueta men
		pa.add(password);//Adicion del componente password
		window ventana=new window(350,300,pa,boton1,false);   //Generacion de la ventana con las medidas establecidas
		boton2.addActionListener(new java.awt.event.ActionListener() { //Evento escuchador del mouse
			public void actionPerformed(ActionEvent evt) {System.exit(0);; } //Metodo para el evento del mouse para salir
		});
		boton1.addActionListener(new java.awt.event.ActionListener() { //Adicion del evento al boton 1
                                                                                  //Método que genera la conexión con la base de datos y valida el inicio de sesion
			public void actionPerformed(ActionEvent eve) {  
				try {
					 Class.forName("org.h2.Driver");  //Base de datos
					 Statement st; //Variable st de tipo Statement para la conexion a la bd
					 ResultSet rs;  // variable rs de tipo resultset  
					 Connection conn = DriverManager.getConnection("jdbc:h2:file:./lib/metodos", "sa", ""); //objeto conexion para la base de datos
					 st=conn.createStatement();  //Creacion del objeto Statement para la base de datos
					 rs=st.executeQuery("SELECT * FROM METODOS.USUARIOS WHERE CONTRASEÑA='"+password.getText()+"'  AND NOMBRE='"+user.getText()+"';"); //Consulta SQL para comparar los datos
					 if(!rs.absolute(1)) {  //Validacion para el inicio de sesion
						 JOptionPane.showMessageDialog(null,"Usuario o contrase�a invalidos" ); //Mensaje en caso de inicio no valido
						 password.setText(""); //Limpia de cuadros de texto
						 user.setText("");     //
					 }else {
						 menuprincipal inicio = new menuprincipal();      //Cambio a la ventana de menu principal
                         ventana.dispose();                 //Cerrar esta clase
					 }
				}catch(SQLException b){b.printStackTrace();}            //Excepciones 
				 catch(ClassNotFoundException c){c.printStackTrace();}  //
				
				}
		});
	}  
}
