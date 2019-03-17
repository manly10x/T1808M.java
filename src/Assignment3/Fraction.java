package Assignment3;

import java.util.Scanner;

public class Fraction {

    public int tu_so;
    public int mau_so;

    public Fraction() {
    }

    public Fraction(int tu_so, int mau_so) {
        this.tu_so = tu_so;
        this.mau_so = mau_so;
    }

    public int getTu_so() {
        return tu_so;
    }

    public void setTu_so(int tu_so) {
        this.tu_so = tu_so;
    }

    public int getMau_so() {
        return mau_so;
    }

    public void setMau_so(int mau_so) {
        this.mau_so = mau_so!=0?mau_so:1;
    }

    public void nhapPhanSo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tu so:");
        this.setTu_so(scanner.hasNextInt()?scanner.nextInt():1);

        System.out.println("Nhap mau so:");
        this.setMau_so(scanner.hasNextInt()?scanner.nextInt():1);
    }

    public void inPhanSo(){
        System.out.println("Phan so: "+this.getTu_so()+"/"+this.getMau_so());
    }

    public void rutGonPhanSo(){
        int usc = this.USCLN();
        this.setTu_so(this.getTu_so()/usc);
        this.setMau_so(this.getMau_so()/usc);
    }

    public int USCLN(){
        int usc = 1;
        int abs_tu_so = Math.abs(this.getTu_so());// Lay gia tri tuyet doi
        int abs_mau_so = Math.abs(this.getMau_so());

        for(int i=2;i <= Math.min(abs_tu_so,abs_mau_so); i++){
            if(abs_tu_so % i == 0 && abs_mau_so % i == 0){
                usc = i;
            }
        }

        return usc;
    }

    public void nghichDaoPhanSo(){
        if(this.getTu_so() == 0){
            System.out.println("khong the nghich dao do tu so  = 0");
            return;
        }
        int tmp = this.getMau_so();
        this.setMau_so(this.getTu_so());
        this.setTu_so(tmp);
    }

    public void add(Fraction fraction){
        int tu_so = this.getTu_so()*fraction.getMau_so()
                + this.getMau_so()*fraction.getTu_so();
        int mau_so = this.getMau_so()*fraction.getMau_so();

        Fraction result = new Fraction(tu_so,mau_so);
        result.rutGonPhanSo();

        System.out.println("Tong 2 phan so:" + result.getTu_so()
                +"/"+result.getMau_so());
    }

    public void sub(Fraction fraction){
        int tu_so = this.getTu_so()*fraction.getMau_so()
                - this.getMau_so()*fraction.getTu_so();
        int mau_so = this.getMau_so()*fraction.getMau_so();

        Fraction result = new Fraction(tu_so,mau_so);
        result.rutGonPhanSo();

        System.out.println("Hieu 2 phan so:" + result.getTu_so()
                +"/"+result.getMau_so());
    }

    public void mul(Fraction fraction){
        int tu_so = this.getTu_so()*fraction.getTu_so();
        int mau_so = this.getMau_so()*fraction.getMau_so();

        Fraction result = new Fraction(tu_so,mau_so);
        result.rutGonPhanSo();

        System.out.println("Tich 2 phan so:" + result.getTu_so()
                +"/"+result.getMau_so());
    }

    public void div(Fraction fraction){
        if(fraction.getTu_so() == 0){
            System.out.println("khong the chia");
            return;
        }
        int tu_so = this.getTu_so()*fraction.getMau_so();
        int mau_so = this.getMau_so()*fraction.getTu_so();

        Fraction result = new Fraction(tu_so,mau_so);
        result.rutGonPhanSo();

        System.out.println("Tich 2 phan so:" + result.getTu_so()
                +"/"+result.getMau_so());
    }

}