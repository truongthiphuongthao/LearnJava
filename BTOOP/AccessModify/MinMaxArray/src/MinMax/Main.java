/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinMax;

import java.util.Scanner;

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
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[100];
        nhapMang(arr, n);
        hienThiMang(arr,n);
        System.out.println("Min: "+timMin(arr, n));
        System.out.println("Max: "+timMax(arr, n));
    }
    
    public static void nhapMang(int arr[], int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.print("Nhap phan tu thu "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
    }
    
    public static void hienThiMang(int arr[], int n){
        System.out.println("Hien thi mang ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" \t");
        }
    }
    
    // tim min
    public static int timMin(int arr[], int n){
        int min = arr[0];
        for(int i=0; i<n; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    
     // tim max
    public static int timMax(int arr[], int n){
        int max = arr[0];
        for(int i=0; i<n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    
}
