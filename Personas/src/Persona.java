public class Persona {
    public static void main(String[] args) {
        Alumno a1 = new Alumno();

        a1.nombre = "María";
        a1.setDni(12345678);
        a1.trabaja = true;
        a1.mostrar_atributos();

        Alumno a2 = new Alumno();

        a2.nombre = "Franco";
        a2.setDni(44247706);
        a2.trabaja = true;
        a2.mostrar_atributos();

        Alumno b1 = new Alumno();

        b1.nombre = "Lautaro";
        b1.setDni(45519515);
        b1.trabaja = false;
        b1.mostrar_atributos();
        
        System.out.println("suma dni:" + (a1.getDni() + a2.getDni() + b1.getDni()));

        if (a1.nombre.equals(a2.nombre)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintos");
        }

        System.out.println(Math.pow(5,2));
        System.out.println(Math.sqrt(25));

        Alumno z1 = new Alumno(46327019);
        z1.mostrar_atributos();
    }
}
