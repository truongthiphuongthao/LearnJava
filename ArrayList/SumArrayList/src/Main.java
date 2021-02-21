
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
        System.out.println("Nhap so phan tu: ");
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> arrInt = new ArrayList<>();
        int number ;
        
        for(int i=0; i<n; i++){
            System.out.print("Nhap phan tu thu "+(i+1)+" : ");
            number = sc.nextInt();
            arrInt.add(number);
        }
        
        for(int i=0; i<n; i++){
            System.out.print(arrInt.get(i)+"\t");
        }
        
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arrInt.get(i);
        }
        System.out.println("\nSum: "+sum);
        
        
    }
    
}
