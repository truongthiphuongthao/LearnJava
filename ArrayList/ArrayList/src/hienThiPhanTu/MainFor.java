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
public class MainFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> arrListString = new ArrayList<>();
        
        arrListString.add("PHP");
        arrListString.add("JAVA");
        arrListString.add("Nodejs");
        
        // them phan tu vao vi tri so 1
        arrListString.add(1, "C#");
        
        // cap nhat gia tri cua phan tu so 0
        arrListString.set(0, "C");
        
        // xoa tat cac cac phan tu trong mang
        //arrListString.clear();
        
        // xoa phan tu dua vao chi so
        arrListString.remove(1);
        
        // xoa phan tu dua vao gia tri phan tu
        arrListString.remove("Nodejs");
        
        // for thong thuong
//        for(int i=0; i<arrListString.size(); i++){
//            System.out.println(arrListString.get(i));
//        }
        
        // for duyet theo kieu doi tuong
        
        for(String str : arrListString){
            System.out.println(str);
        }
        
    }
    
}
