
package ejercicio2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author plago-bergonpazos
 */
public class Ejercicio2 extends Thread {
    
    public Ejercicio2 (String str){
        super(str);
    }
    //Thread
    @Override
    public void run(){
        for(int i = 0; i<6; i++){
            System.out.println(i+" "+getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
        }
        System.out.println("Secuencia de "+getName()+" acabada.");
    }

    //Main
    public static void main(String[] args) {
        //Se instancian 3 hilos
        new Ejercicio2("Pablo").start();
        new Ejercicio2("Javi").start();
        new Ejercicio2("Nabor").start();
        
    }
    
}
