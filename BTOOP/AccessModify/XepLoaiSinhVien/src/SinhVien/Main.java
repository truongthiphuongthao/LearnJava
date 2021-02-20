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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien();
        sv.nhapThongTin();
        
        // hien thi thong tin sv
        sv.hienThiThongTin();
        
        // tinh diem trung binh
        double diemTb = sv.tinhDiemTrungBinh(sv.layDiemToan(), sv.layDiemLy(), sv.layDiemHoa());
        
       // xep loai diem
       String xepLoai = sv.xepLoaiTrungBinh(diemTb);
       System.out.println("Xếp loại: "+xepLoai);
    }
    
}
