
package edu.com.sumare12;


public class T extends A implements Runnable{
    //T t = new T();
    @Override
    public void run() {
        listar();
        //t.listar();
        /*try {
            Thread.interrupted();            
            //Thread.sleep(100);
        } catch (Exception e) {
            //System.err.println(e.getMessage());
            e.printStackTrace();
        }*/
        
    }
    public static void main(String[] args) {
    Thread t;
    t = new Thread( new T());
    t.start();
    
    /*nome da thread*/
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getState());
        System.out.println(t.getPriority());
        System.out.println( Thread.currentThread().getState());
    }
    
}


