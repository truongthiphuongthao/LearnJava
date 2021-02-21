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
public class MainConvertArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> arrListInt = new ArrayList<>();
        arrListInt.add(1);
        arrListInt.add(2);
        arrListInt.add(3);
        
        // chuyen tu ArrayList sang array
        Object[] arr = arrListInt.toArray();
        
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
        
        
    }
    
}
