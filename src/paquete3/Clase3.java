
package paquete3;

import paquete1.Clase1;


public class Clase3 extends Clase1 {
    
    public Clase3(){
        super();
        this.atProtegido = "Modificamos el atributo protegido";
        System.out.println("Atributo publico hija" +
        this.atProtegido);
        this.metodoProtegido();
        
    }
    
}
