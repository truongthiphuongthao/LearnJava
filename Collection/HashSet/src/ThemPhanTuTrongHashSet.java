
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
public class ThemPhanTuTrongHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        HashSet<Integer> hashSetInteger = new HashSet<>();
        
        // them phan tu
        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(4);
        
        System.out.println("Cac phan tu trong hashSetInteger");
        System.out.println(hashSetInteger);
        
        System.out.print("Nhap phan tu can them: ");
        number = sc.nextInt();
        
        if(!hashSetInteger.contains(number)){
            hashSetInteger.add(number);
            System.out.println("Them thanh cong");
            System.out.println("Cac phan tu hashSetInteger sau khi them");
            System.out.println(hashSetInteger);
        }
        else{
            System.out.println("Phan tu "+ number + "da ton tai");
        }
    }
    
}
