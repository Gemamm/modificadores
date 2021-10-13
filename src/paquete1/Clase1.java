
package paquete1;


class Clase1 {
     private static String atPrivado;
    
    private Clase1(){
        System.out.println("Imprimiendo desde el constructor vacio privado clase 1");
    }
    
    public Clase1(String arg){
        System.out.println("Desde el constructor publico con  1 argumento"+ arg);
    }
    
    private void metodoPrivado(){
        System.out.println("Imprimiendo desde metodo privado.");
    }
}
