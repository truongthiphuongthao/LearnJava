
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author truongthao
 */
public class KhachSan {
   private int soNgayTro;
   private String loaiPhong;
   private double giaPhong;
   private Nguoi nguoi;
   
   public KhachSan(){
       super();
   }
   public KhachSan(int soNgayTro, String loaiPhong, double giaPhong, Nguoi nguoi){
       super();
       this.soNgayTro = soNgayTro;
       this.loaiPhong = loaiPhong;
       this.giaPhong = giaPhong;
       this.nguoi = nguoi;
   }
   
   public void nhapThongTinKhachSan(){
       Scanner sc = new Scanner(System.in);
       // nhap thong tin nguoi
       nguoi = new Nguoi();
       nguoi.nhapThongTinNguoi();
       System.out.println("Nhap so ngay tro: ");
       soNgayTro = sc.nextInt();
       sc.nextLine();
       System.out.println("Nhap loai phong: ");
       loaiPhong = sc.nextLine();
       System.out.println("Nhap gia phong: ");
       giaPhong = sc.nextDouble();
   }
   
   public void hienThiThongTinKhachSan(){
      nguoi.hienThiNguoi();
      System.out.println("So ngay tro: "+soNgayTro);
      System.out.println("Loai phong: "+loaiPhong);
      System.out.println("Gia phong: "+giaPhong);
    }
   
   // lay gia phong
   public double layGiaPhong(){
       return giaPhong;
   }
   
   // lay so ngay tro
   public int laySoNgayTro(){
       return soNgayTro;
   }
   
   // tinh tien khach san
   public double tinhTien(double giaPhong, int soNgayTro){
       return giaPhong * soNgayTro;
   }
  
   // lay nguoi
   public Nguoi layNguoi(){
       return nguoi;
   }
    
    
    
}
