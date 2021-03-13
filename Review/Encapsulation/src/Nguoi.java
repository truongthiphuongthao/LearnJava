
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
    
    private String hoTen;
    private int tuoi;
    
    public Nguoi(){
        super();
    }
    
    public Nguoi(String hoTen, int tuoi){
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }
    
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
    
    public String getHoTen(){
        return hoTen;
    }
    
    public int getTuoi(){
        return tuoi;
    }
    
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
    }
    
    public void inTT(){
        System.out.println("Ten: "+hoTen);
        System.out.println("Tuoi: "+tuoi);
    }
}
