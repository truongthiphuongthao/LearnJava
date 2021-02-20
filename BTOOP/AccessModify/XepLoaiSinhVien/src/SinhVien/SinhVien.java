/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

import java.util.Scanner;

/**
 *
 * @author truongthao
 */
public class SinhVien {
    private String hoTen;
    private String lop;
    private double diemToan, diemLy, diemHoa;
    
    
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập lớp: ");
        lop = sc.nextLine();
        System.out.print("Nhập toán: ");
        diemToan = sc.nextDouble();
        System.out.print("Nhập lý: ");
        diemLy = sc.nextDouble();
        System.out.print("Nhập hóa: ");
        diemHoa = sc.nextDouble();
    }
    
    // lay gia tri diem
    public double layDiemLy(){
        return diemLy;
    }
    public double layDiemToan(){
        return diemToan;
    }
    public double layDiemHoa(){
        return diemHoa;
    }
    // tinh diem trung binh
    public double tinhDiemTrungBinh( double diemToan, double diemLy, double diemHoa){
        return (diemLy + diemHoa + diemToan) / 3;
    }
    public void hienThiThongTin(){
        System.out.println("Họ và tên: "+hoTen);
        System.out.println("Lớp: "+lop);
        System.out.println("Toán: "+diemToan);
        System.out.println("Lý: "+diemLy);
        System.out.println("Hóa: "+diemHoa);
    }
    
    public String xepLoaiTrungBinh(double diemTB){
        if(diemTB >= 8 && diemTB <=10){
            return "Gioi";
        }
        if(diemTB>=6 && diemTB <8){
            return "Kha";
        }
        if(diemTB>=4 && diemTB < 6){
            return "Tb";
        }
        if(diemTB>=1 && diemTB < 4){
            return "Yeu";
        }
        return "Nhap sai";
    }
}
