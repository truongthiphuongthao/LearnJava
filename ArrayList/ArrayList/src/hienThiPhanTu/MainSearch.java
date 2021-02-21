/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hienThiPhanTu;

import java.util.ArrayList;

/**
 *
 * @author truongthao
 */
public class MainSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> arrListInt = new ArrayList<>();
        arrListInt.add(1);
        arrListInt.add(2);
        arrListInt.add(3);
        arrListInt.add(3);
        
        // tim kiem phan tu se tra ve true, nguoc lai tra ve false
        boolean result = arrListInt.contains(1);
        if(result){
            System.out.println(result);
        }
        else{
            System.out.println(result);
        }
        
        // tim kiem vi tri xuat hien dau tien trong ArrayList
        int index = arrListInt.indexOf(0);
        System.out.println(index);
        
        // tim kiem vi tri xuat hien cuoi cung trong ArrayList
        int lastIndex = arrListInt.lastIndexOf(3);
        System.out.println(lastIndex);
    }
    
}
