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
public class NhanVien {
    
    private String hoTen, SDT;
    
    public void nhapNhanVien(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap SDT: ");
        SDT = sc.nextLine();
    }
    
    public void hienThiNhanVien(){
        System.out.println("Ho ten: " +hoTen);
        System.out.println("Ho ten: " +SDT);
    }
    
    public String layHoTen(){
        return hoTen;
    }
}
