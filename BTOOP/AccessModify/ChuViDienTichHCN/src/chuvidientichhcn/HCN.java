/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuvidientichhcn;

import java.util.Scanner;

/**
 *
 * @author truongthao
 */
public class HCN {
    private double chieuDai;
    private double chieuRong;
    private double chuVi;
    private double dienTich;
    
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        chieuDai = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        chieuRong = sc.nextDouble();
        while(chieuRong > chieuDai){
            System.out.println("Chieu rong phai nho hon chieu dai");
            System.out.print("Nhap chieu rong: ");
            chieuRong = sc.nextDouble();
        }
    }
    
    // lay chieu rong
    public double layChieuRong(){
        return chieuRong;
    }
    
    // lay chieu dai
    public double layChieuDai(){
        return chieuDai;
    }
    
    // hien thi chieu dai, chieu rong
    public void hienThi(){
        System.out.println("Chieu dai: "+chieuDai);
        System.out.println("Chieu rong: "+chieuRong);
    }
    
    // tinh chu vi hinh chu nhat
    public double tinhChuViHCN(double chieuDai, double chieuRong){
        chuVi = (chieuDai + chieuRong)*2;
        return chuVi;
    }

    // tinh dien tich hinh chu nhat
    public double tinhDienTichHCN(double chieuDai, double chieuRong){
        dienTich = chieuDai * chieuRong;
        return dienTich;
    }
    
    // hien thi chu vi, dien tich
    public void hienThiChuViDienTich(double chuVi, double dienTich){
        System.out.println("Chu vi: "+chuVi);
        System.out.println("Dien tich: "+dienTich);
        
    }
}
