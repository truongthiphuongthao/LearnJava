
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
public class Hinh {
    
    protected int chieuDai;
    protected int chieuRong;
    
    public Hinh(){
        super();
    }
    
    public Hinh(int chieuDai, int chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    
    public int getChieuDai(){
        return chieuDai;
    }
    
    public int getChieuRong(){
        return chieuRong;
    }
    
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        chieuDai = sc.nextInt();
        System.out.print("Nhap chieu rong: ");
        chieuRong = sc.nextInt();
    }
    
    public void inTT(){
        System.out.println("Chieu dai: "+chieuDai);
        System.out.println("Chieu rong: "+chieuRong);
    }
    
}
