package Threads;

/**
 * Main class of the Java program.
 */

public class Main {

    public static void main(String[] args) {
        ThreadPool.initialize(10);
        Thread t1 = ThreadPool.getReference();
        Thread t2 = ThreadPool.getReference();
        Thread t3 = ThreadPool.getReference();
        Thread t4 = ThreadPool.getReference();
        Thread t5 = ThreadPool.getReference();

        System.out.println(t1.uniqueId);
        System.out.println(t2.uniqueId);
        System.out.println(t3.uniqueId);
        System.out.println(t4.uniqueId);
        System.out.println(t5.uniqueId);
        
        ThreadPool.releaseReference(t3);
        
        Thread t6 = ThreadPool.getReference();
    
        System.out.println(t6.uniqueId);
        
    }
}
