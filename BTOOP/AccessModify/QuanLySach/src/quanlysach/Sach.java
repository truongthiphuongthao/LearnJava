/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysach;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author truongthao
 */
public class Sach {
    private String tenSach;
    private int tongSoSach;
    private int soSachDangChoMuon;
    
    // tao array list luu tru cac ten sach
    ArrayList<String> arrSach = new ArrayList<>();
    
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tong so sach: ");
        tongSoSach = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten sach: ");
        for(int i=0; i<tongSoSach ;i++){
            System.out.println("Ten sach thu "+(i+1)+": ");
            tenSach = sc.nextLine();
            arrSach.add(tenSach);
        }
        System.out.println("Nhap so sach cho muon: ");
        soSachDangChoMuon = sc.nextInt();
    }
    
    // in thong tin ten sach ra màn hình
    public void hienThiTenSach(){
       System.out.println("Ten sach co trong thu vien: ");
       for(int i=0; i<arrSach.size(); i++){
           System.out.println(arrSach.get(i));
       }
    }
    
    // lay tong so sach
    public int layTongSoSach(){
        return tongSoSach;
    }
    
    // lay so sach dang cho muon
    public int laySoSachDangChoMuon(){
        return soSachDangChoMuon;
    }
    
    // tinh so sach con lai
    public int tinhSoSachConLai(int tongSoSach, int soSachDangChoMuon){
        return (tongSoSach - soSachDangChoMuon);
    }
            
    
    
         
}
