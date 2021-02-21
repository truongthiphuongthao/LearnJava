/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien;

import java.util.ArrayList;
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
       System.out.print("Nhap so nhan vien: ");
       int n = Integer.parseInt(sc.nextLine());
     
        // su dung ArrayList
        ArrayList<NhanVien> arrNV = new ArrayList<>();
        for(int i=0; i<n; i++){
            NhanVien nv = new NhanVien();
            nv.nhapNhanVien();
            arrNV.add(nv);
        }

        for(int i=0; i<n; i++){
            arrNV.get(i).hienThiNhanVien();
        }
        
        // tim kiem nhan vien theo ten
        System.out.println("Nhap ho ten nhan vien can tim kiem: ");
        String hoTen = sc.nextLine();
        for(int i=0; i<n ;i++){
            if(arrNV.get(i).layHoTen().equals(hoTen)){
                System.out.println("co nhan vien ten : "+hoTen);
                return;
            }
            else {
                System.out.println("Khong nhan vien ten : "+hoTen);
                return;
            }
        }
    }
    
    
}
