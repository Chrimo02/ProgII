package Lektion22.YinYang;

public class MyLocalClassThread {

    public static void main(String[] args) {
        class LocalClassThread extends Thread{
            private final String message;
            public LocalClassThread(String message){
                this.message = message;
            }
            @Override
            public void run(){
                try {
                    while (true){
                        System.out.println(this.message);
                        Thread.sleep(500);
                    }
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        Thread t1 = new LocalClassThread("Yin");
        Thread t2 = new LocalClassThread("Yang");
        t1.start();
        t2.start();
    }
}
