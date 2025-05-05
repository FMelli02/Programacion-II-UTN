import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
public class Rectangulo implements java.io.Serializable {
    private int ancho ;
    private int alto ;
    public Rectangulo() { }
    public Rectangulo(int an, int al){
        ancho = an;
        alto = al;
    }

    public void guardaRect() throws FileNotFoundException, IOException {
        try {
            ObjectOutputStream salida=new ObjectOutputStream(new
                    FileOutputStream("figura.txt"));
            System.out.println("se guardó un objeto compuesto\n");
            salida.writeObject(this);
            //writeUnshared(this);
            salida.close();
        } catch(FileNotFoundException e){
            System.out.println("No se encontró el archivo");
            e.getMessage();
        } catch(IOException e){
            System.out.println("Hubo un error al guardar");
            e.getMessage();
        }
    }

    public static void guardaRect(ArrayList guardaArray) throws FileNotFoundException, IOException {
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("figura.txt"));
            salida.writeObject(guardaArray);
            salida.close();
        } catch(FileNotFoundException e){
            System.out.println("No se encontró el archivo");
            e.getMessage();
        } catch (IOException e){
            System.out.println("Hubo un error al guardar");
            e.getMessage();
        }
    }

    public Rectangulo consultaRect() throws FileNotFoundException, IOException, ClassNotFoundException,EOFException {
        ObjectInputStream entrada=new ObjectInputStream(new FileInputStream("figura.txt"));
        Rectangulo obj1=(Rectangulo)entrada.readObject();
        System.out.println("------------------------------");
        System.out.println("Recuperados: ancho: "+obj1.ancho+" alto: "+obj1.alto);
        System.out.println("------------------------------");
        entrada.close();
        return obj1;
    }

    public ArrayList consultaRect(int indice) throws FileNotFoundException, IOException, ClassNotFoundException,EOFException {
        ObjectInputStream entrada=new ObjectInputStream(new FileInputStream("figura.txt"));
        ArrayList<Rectangulo> obj1=(ArrayList) entrada.readObject();
        System.out.println("------------------------------");

        System.out.println("Recuperados: ancho: "+obj1.get(indice).ancho+" alto: "+obj1.get(indice).alto);
        System.out.println("------------------------------");
        entrada.close();
        return obj1;
    }

    public int calcularArea(){
        int area = this.alto*this.ancho;
        return area;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        String pregunta=JOptionPane.showInputDialog("1.guarda el objeto?\n0.Recupera el objetos?");
        Rectangulo r=new Rectangulo();
        if (pregunta.trim().equals("1")) {
            String anchura=JOptionPane.showInputDialog("Ingrese el ancho:");
            r.ancho= Integer.parseInt(anchura);
            String altura=JOptionPane.showInputDialog("Ingrese el alto:");
            r.alto= Integer.parseInt(altura);
            System.out.println("ancho: "+r.ancho+" alto: "+r.alto+"\nel área es "+r.calcularArea());
            r.guardaRect();
            ArrayList<Rectangulo> rectangulos = new ArrayList();
            rectangulos.add(r);
            guardaRect(rectangulos);
        } else {
            ArrayList<Rectangulo> vuelve = new ArrayList();
            vuelve = r.consultaRect(0);
            r = vuelve.get(0);
            System.out.println("ancho: "+r.ancho+" alto: "+r.alto+"\nel área1 es "+r.calcularArea());
        }
    }
}


