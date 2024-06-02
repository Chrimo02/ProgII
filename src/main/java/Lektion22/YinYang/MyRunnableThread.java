package Lektion22.YinYang;

public class MyRunnableThread implements Runnable{
    String message;
    public MyRunnableThread(String message){
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

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnableThread("Yin"));
        Thread t2 = new Thread(new MyRunnableThread("Yang"));
        t1.start();
        t2.start();
    }
}
