//Nombre del paquete
package clases;

//Importación de librerias
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
// Clase que genera las fuentes a utilizar en el frame Login
public class fuentes {
	
	public Font fuente1() {
		Font fuente=null; //Objeto Font
		InputStream myStream = null; //Objeto InputStream para almacenar las fuentes a implementar
		try {
            myStream = new BufferedInputStream(new FileInputStream("lib/fonts/letra58.ttf")); //Implementacion y creacion de la nueva fuente
            fuente = Font.createFont(Font.TRUETYPE_FONT, myStream);                           //
            fuente = fuente.deriveFont(Font.PLAIN, 34);                                       //
        }catch (FontFormatException ex) {}  //Excepcion
		catch (IOException ex) {}   //Excepcion
		return fuente;              //Retorno de la nueva fuente
	}
	
	public Font fuente2() {
		Font fuente=null; //Objeto Font
		InputStream myStream = null; //Objeto InputStream para almacenar las fuentes a implementar
		try {
            myStream = new BufferedInputStream(new FileInputStream("lib/fonts/letra37.ttf"));   //Implementacion y creacion de la nueva fuente
            fuente=Font.createFont(Font.TRUETYPE_FONT, myStream);                               //
            fuente=fuente.deriveFont(Font.PLAIN, 18);                                           //
        }catch (FontFormatException ex) {} //Excepcion
		catch (IOException ex) {}   //Excepcion
		return fuente;              //Retorno de la fuente
	}
	
	public Font fuente3(int n) {
		Font fuente=null;  //Objeto Font
		InputStream archivo=null;   //Objeto InputStream para almacenar las fuentes a implementar
		try{
			archivo = new BufferedInputStream(new FileInputStream("lib/fonts/HARLOWSI.ttf")); //Implementacion y creacion de la nueva fuente
			fuente = Font.createFont(Font.TRUETYPE_FONT,archivo);                             //
			fuente=fuente.deriveFont(Font.PLAIN, n);                                          //
		}catch (FontFormatException ex) {}  //Excepcion
		catch (IOException ex) {}           //Excepcion
		return fuente;                      //Retorno de la fuente
	}
}
