package edu.com.sumare.thread;


public class Minhathread implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello, meu primeiro codifo Thread!!!");
    }
    
    public static void main(String[] args) {
       /*Minhathread thread =  new Minhathread();
        new Thread( thread ).start();*/
        new Thread( new Minhathread() ).start();
        new Thread( new Minhathread() ).stop();
    }

    
}
