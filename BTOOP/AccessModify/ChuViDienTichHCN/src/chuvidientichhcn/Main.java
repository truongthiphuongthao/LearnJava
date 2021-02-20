/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuvidientichhcn;

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
        HCN hcn = new HCN();
        hcn.nhapThongTin();
        hcn.hienThi();
        hcn.hienThiChuViDienTich(hcn.tinhChuViHCN(hcn.layChieuDai(), hcn.layChieuRong()), hcn.tinhDienTichHCN(hcn.layChieuDai(), hcn.layChieuRong()));
    }
    
}
