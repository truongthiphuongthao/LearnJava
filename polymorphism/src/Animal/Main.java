/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

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
        Animal a1, a2, a3;
        a1 = new Animal();
        a2 = new Dog();
        a3 = new Cat();
        a1.eat();
        a2.eat();
        a3.eat();
        
    }
    
}
