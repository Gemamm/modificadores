
package paquete1;

import paquete1.Clase1;


public class Clase3 extends Clase1 {
    
    public Clase3(){
        super();
        this.atPrivado = "Modificamos el atributo privado";
        System.out.println("Atributo publico hija" +
            this.atPrivado);
        this.metodoPrivado();
        
    }
    
}
