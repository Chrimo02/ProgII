package Lektion22.YinYang;

public class MyInheritedThread extends Thread{
    String message;
    public MyInheritedThread(String message){
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
        Thread t1 = new MyInheritedThread("Yin");
        Thread t2 = new MyInheritedThread("Yang");
        t1.start();
        t2.start();
    }
}
