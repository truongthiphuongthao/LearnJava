/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryCatch;

/**
 *
 * @author truongthao
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        
        try{
            number = 5/0;
        }
//        catch(NullPointerException  e){
//            System.out.println(e);
//        }
        finally{
            System.out.println("");
        }
        System.out.println("h");
       
    }
    
}
