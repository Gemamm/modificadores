
package test;

import paquete1.Clase1;
import paquete3.Clase3;


public class Test {
    public static void main(String[] args) {
        //Clase1 class1 = new Clase1();
        //System.out.println(Clase1.atProtegido);
        //Clase1.metodoProtegido();
        Clase3 claseHija = new Clase3();
        System.out.println("ClaseHija: " + claseHija);
    }
    
}
