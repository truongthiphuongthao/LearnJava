
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author truongthao
 */
public class XoaTatCaPhanTu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<Integer> hashSetInteger = new HashSet<>();
        
        hashSetInteger.add(1);
        hashSetInteger.add(2);
        hashSetInteger.add(3);
        
        hashSetInteger.clear();
        
        if(hashSetInteger.isEmpty()){
            System.out.println("Khong co phan tu nao");
        }
    }
    
}
