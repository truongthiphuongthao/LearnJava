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
        PhepCong pc = new PhepCong();
        System.out.println("Ket qua: "+ pc.tinhCong(1, 2));
        System.out.println("Ket qua: "+pc.tinhCong(1, 2, 3));
        System.out.println("Ket qua: "+pc.tinhCong(1.2, 2.3));
        System.out.println("Ket qua: "+pc.tinhCong(1.2, 1.2, 1.2));
    }
}
