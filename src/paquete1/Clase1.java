
package paquete1;


public class Clase1 {
    protected String atProtegido;
    
    protected Clase1(){
        System.out.println("Imprimiendo desde el constructor vacio protegido clase 1");
    }
    
    public Clase1(String arg){
        System.out.println("Desde el constructor publico con  1 argumento"+ arg);
    }
    
    protected void metodoProtegido(){
        System.out.println("Imprimiendo desde metodo protegido.");
    }
}
