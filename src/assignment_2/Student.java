package assignment_2;

import java.util.Scanner;

public class Student {
    public String Mahocsinh;
    public int Diemtrungbinh;
    public int Tuoi;
    public String Lop;



    public void inputInfo() {
        System.out.println("Nhap ma hoc sinh: ");
        Scanner scanner = new Scanner(System.in);
        Mahocsinh = scanner.nextLine();

        System.out.println("Nhap so diem trung binh: ");
        Diemtrungbinh = scanner.nextInt();

        System.out.println("Nhap so tuoi: ");
        Tuoi = scanner.nextInt();

        System.out.println("Nhap ten lop hoc: ");
        Lop = scanner.next();
    }

    public void printInfo() {
        System.out.println("Thong tin cua hoc sinh");
        System.out.println("Ma hoc sinh: "+Mahocsinh+"; Diem trung binh: "+Diemtrungbinh+";  Tuoi: "+Tuoi+";Lop: "+Lop);
    }
    public void HocBong()
    {
        if (Diemtrungbinh>=8.0)
            System.out.println("Hoc Sinh Du Dieu Kien Nhan Hoc Bong");
        else
            System.out.println("Học Sinh Khong Du Dieu Kien Nhan Hoc Bong");
    }
}

