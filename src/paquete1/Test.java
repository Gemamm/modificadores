
package paquete1;

import paquete1.*;
import paquete1.Clase3;


public class Test {
    public static void main(String[] args) {
        Clase1 class1 = new Clase1();
        System.out.println(Clase1.atPrivado);
        class1.metodoPrivado();
        
        Clase3 claseHija = new Clase3();
        System.out.println("ClaseHija: " + claseHija);
    }
    
}
