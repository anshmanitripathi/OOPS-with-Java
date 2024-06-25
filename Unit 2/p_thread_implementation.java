class Thread1 extends Thread{
    public void run(){
        for(int i = 0; i<=10; i++){
            System.out.println("I"+i);
        }
    }
}

class Thread2 implements Runnable{
    public void run(){
        for(int k = 11; k<=20; k++){
            System.out.println("K"+k);
        }
    }
}
public class p_thread_implementation {
    public static void main(String[] args) {
        Thread1 T1 = new Thread1();
        Thread T2 = new Thread(new Thread2());
        System.out.println("Starting 1 :");
        T1.start();
        System.out.println("Starting 2 :");
        T2.start();
        System.out.println("End of main");
    }
    
}