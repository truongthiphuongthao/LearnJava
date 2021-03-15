
import java.util.HashSet;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author truongthao
 */
public class HienThiPhanTuIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<Integer> hashSet = new HashSet<>();
        
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(2);
        
       Iterator<Integer> iterator = hashSet.iterator();
       
       while(iterator.hasNext()){
           System.out.println(iterator.next()+"\t");
       }
       
    }
    
}
