/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author truongthao
 */
public class HinhChuNhat extends Hinh{
    
    public int tinhChuVi(int chieuDai, int chieuRong){
        return (chieuDai + chieuRong)*2;
    }
    
    public int tinhDienTich(int chieuDai, int chieuRong){
        return chieuDai * chieuRong;
    }
    
}
