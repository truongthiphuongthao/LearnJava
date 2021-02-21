/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysach;

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
        Sach s = new Sach();
        s.nhapThongTin();
        s.hienThiTenSach();
        System.out.println("So sach con lai: "+s.tinhSoSachConLai(s.layTongSoSach(), s.laySoSachDangChoMuon()));
    }
    
}
