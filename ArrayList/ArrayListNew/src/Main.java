
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
        System.out.println("Nhap so luong phan tu: ");
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> arrIntOld = new ArrayList<>();
        int number;
        for(int i=0; i<n; i++){
            System.out.print("Nhap phan tu thu: "+(i+1)+" : ");
            number = sc.nextInt();
            arrIntOld.add(number);
        }
        
        System.out.println("Hien thi phan tu mang cu: ");
        for(int i=0; i<n; i++){
            System.out.println(arrIntOld.get(i)+"\t");
        }
        
        ArrayList<Integer> arrIntNew = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(!arrIntNew.contains(arrIntOld.get(i))){
                arrIntNew.add(arrIntOld.get(i));
            }
        }
        System.out.println("Hien thi phan tu mang moi: ");
        for(int i=0; i<arrIntNew.size(); i++){
            System.out.println(arrIntNew.get(i));
        }
    }
    
}
