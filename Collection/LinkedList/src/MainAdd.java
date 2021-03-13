
import java.util.ArrayList;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author truongthao
 */
public class MainAdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        
        // them phan tu
        linkedList.add(2);
        linkedList.add(10);
        linkedList.add(3);
        
        System.out.println("List: "+linkedList);
        
        // them phan tu tu linked nay sang linked khac
        
        LinkedList<Integer> linkListAnother = new LinkedList<>();
        linkListAnother.addAll(linkedList);
        linkListAnother.add(45);
        System.out.println(linkListAnother);   
    }
    
    
}
