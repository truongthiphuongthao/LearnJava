
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
public class HienThiPhanTuFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashSet<String> hashSet = new HashSet<>();
        
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("two");
        hashSet.add("three");
        
        for(String str : hashSet){
            System.out.print(str+"\t");
        }
        
        
    }
    
}
