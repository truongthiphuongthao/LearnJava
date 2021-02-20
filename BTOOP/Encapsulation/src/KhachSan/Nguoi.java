/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KhachSan;

import java.util.Scanner;

/**
 *
 * @author truongthao
 */
public class Nguoi {
    private String hoTen;
    private String CMND;
    private String queQuan;
    
    public Nguoi(String hoTen, String CMND, String queQuan){
        this.hoTen = hoTen;
        this.CMND = CMND;
        this.queQuan = queQuan;
    }
    
    public void nhapThongTinKhachTro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên khách hàng: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập quê quán: ");
        queQuan = sc.nextLine();
        System.out.println("Nhập CMND: ");
        CMND = sc.nextLine();
    }
    
    public void hienThiThongtinKhachTro(){
        System.out.println("Họ và tên khách hàng: " +hoTen);
        System.out.println("Quê quán: " +queQuan);
        System.out.println("Số CMND: " +CMND);
    }
}
