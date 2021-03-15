
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author truongthao
 */
public class HienThiPhanTu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // khai báo HashSet co ten la hashSet
        // co ieu la string
        HashSet<String> hashSet = new HashSet<>();
        
        // them cac phan tu vao su dung phuong thuc Add
        hashSet.add("Java");
        hashSet.add("JSP");
        hashSet.add("Hibernate");
        hashSet.add("Java");
        
        // hiển thị phần tử trong hashSet
        System.out.println("Cac phan tu trong hashSet la: ");
        System.out.println(hashSet);
        
    }
    
}
