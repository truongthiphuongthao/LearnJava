/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        HinhChuNhat  hcn = new HinhChuNhat();
        hcn.nhapTT();
        hcn.inTT();
        int chuVi = hcn.tinhChuVi(hcn.getChieuDai(), hcn.getChieuRong());
        int dienTich = hcn.tinhDienTich(hcn.getChieuDai(), hcn.getChieuRong());
        System.out.println("Chu vi: " + chuVi );
        System.out.println("Dien tich: "+ dienTich);
        
    }
    
}
