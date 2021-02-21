
import java.util.ArrayList;
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong khach tro: ");
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachSan> arrKS = new ArrayList<>();
        KhachSan ks;
        // nhap thong tin khach tro
        for(int i=0; i<n; i++){
            ks = new KhachSan();
            System.out.println("Khach tro thu: "+(i+1)+ " : ");
            ks.nhapThongTinKhachSan();
            arrKS.add(ks);
        }
        
        // hien thi thong tin khach tro
        for(int i=0; i<n; i++){
            arrKS.get(i).hienThiThongTinKhachSan();
        }
        
        // tim kiem bang so cmnd de tra tro
        
        System.out.println("Nhap so CMND: ");
        String soCMND = sc.nextLine();
        for(int i=0; i<n; i++){
            if(arrKS.get(i).layNguoi().laySoCMND().equalsIgnoreCase(soCMND)){
                System.out.print("Tien phong: "+arrKS.get(i).tinhTien(arrKS.get(i).layGiaPhong(), arrKS.get(i).laySoNgayTro()));
            }
        }
        
    }
    
}
