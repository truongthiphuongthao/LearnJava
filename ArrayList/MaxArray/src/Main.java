
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
        System.out.print("Nhap so luong phan tu: ");
        int n = Integer.parseInt(sc.nextLine());
        int number;
        
        ArrayList<Integer> arrInt = new ArrayList<>();
        
        // nhap phan tu
        for(int i=0; i<n; i++){
            System.out.println("Nhap phan tu thu: "+(i+1)+" : ");
            number = sc.nextInt();
            arrInt.add(number);
        }
        
        // hien thi phan tu
        System.out.println("Hien thi phan tu: ");
        for(int i=0; i<n; i++){
            System.out.print(arrInt.get(i)+"\t");
        }
        
        // tim phan tu lon nhat
        int max = arrInt.get(0);
        for(int i=0; i<n; i++){
            if(max < arrInt.get(i)){
                max = arrInt.get(i);
            }
        }
        System.out.println("\nMax: "+max);
       
        
    }
    
}
