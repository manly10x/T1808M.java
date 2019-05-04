package java2_assignmen3;

public class thread2 extends Thread {
    public void run(){
        try {


            for (int i=1;i<=50;i++){
                System.out.println(i);
                Thread.sleep(500);
            }}catch (Exception e){}
    }
}