import javax.swing.*;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Archivos {
    public static void main(String args[]) throws IOException {
        RandomAccessFile miRAFile;
        //Creo un archive de acceso directo
        String s = JOptionPane.showInputDialog("Ingrese el mensaje:");
        //pido que se ingrese lo que guardaré en el archivo
        // Abro el fichero como de lectura escritura (rw)
        miRAFile = new RandomAccessFile( "Mensaje.txt","rw" );
        // Nos vamos al final del fichero
        miRAFile.seek( miRAFile.length() );
        //seek ubica el puntero a un lugar del fichero.
        miRAFile.writeBytes( s );
        //escribi los bytes en el fichero
        miRAFile = new RandomAccessFile ( "Mensaje.txt","r");
        //declare el archive como de lectura (r)
        // guardamos la longitud del archivo
        int longitud = (int)miRAFile.length() ;
        //creamos un arreglo para guardar los datos
        byte arre[] = new byte[longitud]; //de tipo byte
        //leemos y guardamos en el arreglo
        miRAFile.readFully(arre); //readfully lee complete el archivo
        String f = new String(arre,0);
        //mostramos los datos convertidos de byte a String
        System.out.println(f);
        // Cerramos el fichero
        miRAFile.close();
    }
}

