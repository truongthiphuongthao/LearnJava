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
        Nguoi nguoi = new Nguoi();
        nguoi.nhapTT();
        nguoi.inTT();
        nguoi.setHoTen("Phuc");
        nguoi.setTuoi(22);
        nguoi.inTT();

    }
    
}
