package EjercicioHilos;

import static EjercicioHilos.AnimalThreads.*;

public class Main {
    public static void main(String argv[]) throws InterruptedException {
        tortuga = new Animal("Tortuga");
        tortuga.setPriority(1);

        koala = new Animal("Koala");
        koala.setPriority(2);

        liebre = new Animal("Liebre");
        liebre.setPriority(3);
        rata = new Animal("Rata");
        rata.setPriority(6);
        leopardo = new Animal("Leopardo");
        leopardo.setPriority(10);
        tortuga.start();
        koala.start();
        rata.start();
        liebre.start();
        leopardo.start();
        tortuga.join();
        koala.join();
        rata.join();
        liebre.join();
        leopardo.join();
    }
}
