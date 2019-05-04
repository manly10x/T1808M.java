package java2_assignmen3;

public class Main {
    public static void main(String[] args) {
        thread1 s1=new thread1();
        thread2 s2=new thread2();
        thread3 s3=new thread3();
        s1.start();
        s2.start();
        s3.start();
    }
}