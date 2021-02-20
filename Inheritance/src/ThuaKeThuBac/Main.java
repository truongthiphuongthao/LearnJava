/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThuaKeThuBac;

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
        dog d = new dog();
        d.barking();
        d.eat();
        cat c = new cat();
        c.eat();
        c.meow();
    }
    
}
