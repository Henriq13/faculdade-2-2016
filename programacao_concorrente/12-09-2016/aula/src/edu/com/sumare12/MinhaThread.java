
package edu.com.sumare12;


public class MinhaThread extends A implements Runnable {

    @Override
    public void run() {        
        //System.out.println("Hello Thread");
        B b = new B();
        b.listar();
    }
    
    public static void main(String[] args) {
        new Thread( new MinhaThread() ).start();
        Thread t;
        t = new Thread( new MinhaThread());
        t.start();
        
        Thread t1;
        t = new Thread( new MinhaThread());
        t.start();
        Thread t2;
        t = new Thread( new MinhaThread());
        t.start();
        
        
    }       
   
    
    
}
