/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintest;

/**
 *
 * @author truongthao
 */
public class MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder a = new StringBuilder("hello");
        StringBuilder b = new StringBuilder("hello world");
        b = a;
        a.append("java");
        // b = "hello"
        //a = "hello java"
        System.out.println("a: "+a);
        System.out.println("b: "+b);
               
    }
    
}
