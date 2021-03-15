
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
public class VD_HashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       Scanner sc = new Scanner(System.in);
       
       HashSet<String> hashSetFruit = new HashSet<>();
       String fruit;
       String findFruit;
       int numberFruit;
       
       System.out.println("Nhap tong so trai cay: ");
       numberFruit =Integer.parseInt(sc.nextLine());
       
       // nhap ten cua tung loai trai cay
       for(int i=0; i<numberFruit; i++){
           System.out.println("Nhap ten trai cay: ");
           fruit = sc.nextLine();
           hashSetFruit.add(fruit);
       }
       
       // hien thi tung loai trai cay
        System.out.println("Hien thi trai cay");
        System.out.println(hashSetFruit);
       
        // nhap ten loai trai cay con tim
        System.out.println("Nhap ten loai trai cay can tim: ");
        findFruit = sc.nextLine();
        
//        if(!hashSetFruit.contains(findFruit)){
//            
//        }
        
        // kiem tra ten 1 loai trai cay co ton tai hay khong
        
       
       
       
        
        
        
    }
    
}
