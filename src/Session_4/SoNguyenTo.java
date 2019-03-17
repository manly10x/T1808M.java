package Session_4;

public class SoNguyenTo {
    public int a = 2;

    public SoNguyenTo(){

    }

    public SoNguyenTo(int x){
        if(this.isSoNguyenTo(x)){
            this.setA(x);
        }
        else {
            System.out.println(x+ "Khong phai la so nguyen to");
        }

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public boolean checkSNT(int x) {
        if (x < 2) return false;
        if (x == 2) return true;

        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }



}
