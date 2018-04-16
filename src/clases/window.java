package clases; //Nombre del paquete
                                        
import java.awt.*;                      //
import java.awt.event.ActionEvent;      // Importación de librerias
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.*;                  // Importación de librerias 

public class window extends JFrame{         //Clase         
	Font fuente = null;  //objeto tipo fuente
	Font font;          //
	InputStream myStream = null;  //Objeto tipo InputStream
	Toolkit t = Toolkit.getDefaultToolkit(); //Objeto toolkit
	Dimension d = Toolkit.getDefaultToolkit().getScreenSize(); //Variable para la dimencion de la ventana
	JPanel panel1= new JPanel();  //Generacion del panel
	JPanel panel2;                //
	JLabel ms1=new JLabel();      //Generacion de etiqueta
	JLabel ms2=new JLabel();      //
	JButton cerrar = new JButton(); //Generacion de boton de control
	JButton mini = new JButton();   //
	JButton help=new JButton();     //
	int x,y;                        //variables para el posicionamiento del mouse
	//clase que crea una ventana recive el tamañode la ventana, un panel un boton y un booleano
	public window(int n1, int n2, JPanel panel2,JButton help,boolean b) {
		try { //para hacer uso de excepciones
            myStream = new BufferedInputStream(new FileInputStream("lib/fonts/letra55.ttf"));//cargamos el archivo de la fuente
            fuente = Font.createFont(Font.TRUETYPE_FONT, myStream);//creamos la fuente anterior
            fuente = fuente.deriveFont(Font.PLAIN, 16);//genera la fuente con el tamaño que tendra
        }catch (FontFormatException ex) {}          //Excepcion
		catch (IOException ex) {}           //Excepcion
		setIconImage(new ImageIcon(getClass().getResource("/img/logo.png")).getImage());//carga el icono que se vera en la barra de tareas al abrir la aplicacion
		setTitle("Owls");//Nombre que tendra la aplicacion
		setSize(n1,n2);//le asigna el tamaño que deseemos
		setLocation((d.width/2)-(n1/2),(d.height/2)-(n2/2));//posiciona la ventana en el centro e la pantalla
		setResizable(false);//indica que nuestra ventana no se reajustara el tamaño
		setUndecorated(true);//no le da estilo por defecto a la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Le asigna la operacion de cerrar a la ventana
		setLayout(null);//indica que tendra un layout vacio
		setVisible(true);//Indica que sera visible
		panel1.setSize(n1,30); // asignacion de parametros visuales al panel
		panel1.setBackground(new Color(33,97,140)); //
		panel1.setLocation(0, 0);//posicionamiento del panel1
		panel2.setSize(n1,n2-30);   //Asignacion del tamaño del panel 2
		panel2.setLayout(null); //no mostrar lienzo al panel 2
		panel2.setBackground(new Color(174, 214, 241)); //Configuracion del color al panel 2
		panel2.setLocation(0, 30); //Posicionamiento del panel 2
		panel2.setBorder(BorderFactory.createMatteBorder(2, 6, 6, 6,new Color(33,97,140))); //Configuracion del borde del panel 2
		panel1.setLayout(null); //Ocultar leinzo al panel 1
		add(panel1); //Adicion del panel 1
		add(panel2); //Adicion del panel 2
		ms1.setSize(25,25);         //configuracion de etiquetas
		ms2.setSize(210,30);        //
		ms1.setLocation(10, 3);     //
	    ms2.setLocation(50,0);          //
	    ms2.setForeground(new Color(224, 224, 224)); //
        ms2.setText("OWLS CALCULATOR");  //
        ms2.setFont(fuente);                //
        panel1.add(ms1);        //Adicion de las etiquetas al panel
	    panel1.add(ms2);    //
                                                                                                //iconos para los botones del panel
	    ImageIcon icono1=new ImageIcon(getClass().getResource("/img/exit.png"));            //
		ImageIcon icono2=new ImageIcon(getClass().getResource("/img/min.png"));         //
		ImageIcon icono3=new ImageIcon(getClass().getResource("/img/1.png"));           //
		ImageIcon ayuda1=new ImageIcon(getClass().getResource("/img/help.png"));        //              
		Icon img1=new ImageIcon(icono1.getImage().getScaledInstance(15, 14, Image.SCALE_DEFAULT));      //Configuracion de los iconos 
		Icon img2=new ImageIcon(icono2.getImage().getScaledInstance(12, 11, Image.SCALE_DEFAULT));      //
		Icon ayuda=new ImageIcon(ayuda1.getImage().getScaledInstance(17, 16, Image.SCALE_DEFAULT));     //
		Icon img3=new ImageIcon(icono3.getImage().getScaledInstance(ms1.getWidth(), ms1.getHeight(), Image.SCALE_DEFAULT)); //
	    ms1.setIcon(img3); //Icono para ms1
	    panel1.add(cerrar);     //adicion de componente cerrar
        panel1.add(mini);           // adicion del componente minimizar
        cerrar.setSize(30,30);                                      //Configuracion del componente cerrar (boton de control)
		cerrar.setLocation(n1-30,0);
		cerrar.setBackground(new Color(33, 97, 140  ));
	    cerrar.setIcon(img1);
	    if(b) {                                                     //Configuración del boton ayuda     
	    	help.setSize(30,30);                                    //
		    help.setLocation(n1-90,0);                          //configuracion de la posicion del boton help
		    help.setIcon(ayuda);                                //se aplica sobre el componente la configuracion del icono importado
		    help.setBackground(new Color(33, 97, 140  ));       //se configura el color de fondo del componente
		    help.setForeground(new Color(0, 204, 255));         // Se configura el color de frente del componente
		    help.setBorder(null);                               //Se configura el borde el componente
	        help.setFocusable(false);                               // Se configura la accion al enfocar el componente
		    panel1.add(help);                                   //adicion del boton ayuda al panel
		    
	    }
	    
	    mini.setSize(30,30);                                                     //Configuracion del tamaño del componente
	    mini.setLocation(n1-60,0);                                              //configuracion de la posicion del boton
	    mini.setIcon(img2);                                                     //se aplica sobre el componente la configuracion del icono importado
	    mini.setBackground(new Color(33, 97, 140  ));                           //se configura el color de fondo del componente   
        cerrar.setForeground(new Color(0, 204, 204));                               // Se configura el color de frente del componente
        cerrar.setBorder(null);                                                     //Se configura el borde el componente
        cerrar.setFocusable(false);                                                 // Se configura la accion al enfocar el componente
        mini.setFocusable(false);                                                   // Se configura la accion al enfocar el componente
        mini.setForeground(new Color(0, 204, 255));                                 // Se configura el color de frente del componente
        mini.setBorder(null);                                                       //Se configura el borde el componente
                                                                                                  //Manejo de eventos con el mouse
        mini.addMouseListener(new java.awt.event.MouseAdapter() {                                 
            public void mouseEntered(MouseEvent evt) {miniMouseEntered(evt);}                     //Evento al entrar al componente el puntero el mouse
            public void mouseExited(MouseEvent evt) {miniMouseExited(evt); }                      //Evento al salir del componente el puntero del mouse
        });
        mini.addActionListener(new java.awt.event.ActionListener() {                              
            public void actionPerformed(ActionEvent evt) {miniActionPerformed(evt); }               //Evento al hacer clic en el boton
        });
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {                               
            public void mouseEntered(java.awt.event.MouseEvent evt) {cerrarEntered(evt);}           //Evento al entrar al componente el puntero el mouse
            public void mouseExited(java.awt.event.MouseEvent evt) {cerrarExited(evt);} });          //Evento al salir del componente el puntero del mouse
        cerrar.addActionListener(new ActionListener() {                                        
        	public void actionPerformed(java.awt.event.ActionEvent evt) {cerrarAction(evt);}    //Evento al hacer clic en el boton
        });
        
        panel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {                      
            public void mouseDragged(MouseEvent evt) { panel1MouseDragged(evt); }                       //Evento al mover el mouse mientras se presiona sobre sobre un componente

        });
        panel1.addMouseListener(new java.awt.event.MouseAdapter() {                                  
            public void mousePressed(java.awt.event.MouseEvent evt) { panel1MousePressed(evt); }        //Evento al presionar clic sobre el componente
        });
	}
	public void helpEntered(MouseEvent e) { help.setBackground(new Color(255,51,51));	}        //Evento al entrar al componente el puntero el mouse
	public void helpExited(MouseEvent e) {help.setBackground(new Color(33, 97, 140  )); }             //Evento al salir del componente el puntero del mouse
	public void cerrarEntered(MouseEvent e) { cerrar.setBackground(new Color(255,51,51));	}         //Evento al entrar al componente el puntero el mouse
	public void cerrarExited(MouseEvent e) {cerrar.setBackground(new Color(33, 97, 140  )); }         //Evento al salir del componente el puntero del mouse
	public void cerrarAction(ActionEvent e) {System.exit(0);}                                      //Evento para salir del sistema al dar clic sobre el boton de control cerrar
	
	public void miniMouseEntered(MouseEvent e) {mini.setBackground(new Color(153,202,253));}        //Evento al entrar al componente el puntero el mouse
	public void miniMouseExited(MouseEvent e) {mini.setBackground(new Color(33, 97, 140  ));}        //Evento al salir del componente el puntero del mouse
	public void miniActionPerformed(ActionEvent e) {setExtendedState(ICONIFIED);}                   //Evento al hacer clic en el boton
	
	public void panel1MouseDragged(MouseEvent e) {                              //Evento al mover el mouse mientras se presiona sobre sobre un componente
		Point point = MouseInfo.getPointerInfo().getLocation();             //
        setLocation(point.x - x, point.y - y);
	}
	public void panel1MousePressed(MouseEvent evt) {                              //Eventos para la localizacion del mouse      
		x = evt.getX();
        y = evt.getY();
	}
}
