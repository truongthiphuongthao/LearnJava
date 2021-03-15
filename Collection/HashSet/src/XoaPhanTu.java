
import java.util.HashSet;
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
public class XoaPhanTu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashSetInteger = new HashSet<>();
        
        hashSetInteger.add(1);
        hashSetInteger.add(2);
        hashSetInteger.add(0);
        
        System.out.print("Nhap phan tu can xoa: ");
        number = sc.nextInt();
        
        if(hashSetInteger.contains(number)){
            hashSetInteger.remove(number);
            System.out.println("Xoa thanh cong ");
            System.out.println("Cac phan tu con lai");
            System.out.println(hashSetInteger);
        }
        else {
            System.out.println("Phan tu "+ number +" khong co");
        }
    }
    
}
