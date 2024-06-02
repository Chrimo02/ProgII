package Lektion22.YinYang;

public class AnonymerThread {
    public static void main(String[] args) {
        Thread yinThread = new Thread(){
            @Override
            public void run(){
                try {
                    while (true){
                        System.out.println("Yin");
                        Thread.sleep(500);
                    }
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        Thread yangThread = new Thread(){
            @Override
            public void run(){
                try {
                    while (true){
                        System.out.println("Yang");
                        Thread.sleep(500);
                    }

                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        yinThread.start();
        yangThread.start();
    }
}
