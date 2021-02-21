
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
public class Nguoi {
    private String hoTen, queQuan, soCMND;
    
    public Nguoi(){
        super();
    }
    public Nguoi(String hoTen, String queQuan, String soCMND){
        super();
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.soCMND = soCMND;
    }
    
    public void nhapThongTinNguoi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap que quan: ");
        queQuan = sc.nextLine();
        System.out.println("Nhap so CMND: ");
        soCMND = sc.nextLine();
    }
    
    public void hienThiNguoi(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Que quan: "+queQuan);
        System.out.println("CMND: "+soCMND);
    }
    
    // lay so cmnd
    public String laySoCMND(){
        return soCMND;
    }
    
}
