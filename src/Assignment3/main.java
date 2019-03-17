package Assignment3;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        ArrayList arr = new ArrayList();

        arr.add("hello");
        arr.add(1);
        arr.add(3.14);



        for (int i=0;i<arr.size();i++){
            System.out.println(arr.get(1));
        }

       // Fraction fraction1 = new Fraction();
       // fraction1.nhapPhanSo();
       // Fraction fraction2 = new Fraction(3,4);
       // fraction1.add(fraction2);
        //fraction1.sub(fraction2);
        //fraction1.mul(fraction2);
        //fraction1.div(fraction2);
    }
}