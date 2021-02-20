/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

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
        Bank b1 = new AGR();
        Bank b2 = new CTG();
        Bank b3 = new VCB();
        System.out.println("AGR: "+b1.getRateOfInterest());
        System.out.println("CTG: "+b2.getRateOfInterest());
        System.out.println("VCB: "+b3.getRateOfInterest());
        
        
    }
    
}
