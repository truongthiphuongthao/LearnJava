
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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
        
        // ArrayList
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("JAVA");
//        arrayList.add("C");
//        arrayList.add("PHP");
//        arrayList.add("C#");
//        arrayList.add("JAVA");
//        System.out.println("Cac phan tu duoc in ra ArrayList: ");
//        System.out.println(arrayList);
//        
        // LinkedList
//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("JAVA");
//        linkedList.add("C");
//        linkedList.add("PHP");
//        linkedList.add("C#");
//        linkedList.add("JAVA");
//        System.out.println("Cac phan tu duoc in ra LinkedList: ");
//        System.out.println(linkedList);
        
        //HashSet
//        HashSet<String> hashSet = new HashSet<>();
//        hashSet.add("JAVA");
//        hashSet.add("C");
//        hashSet.add("PHP");
//        hashSet.add("C#");
//        hashSet.add("JAVA");
//        System.out.println("Cac phan tu duoc in ra HashSet: ");
//        System.out.println(hashSet);
//        
        //Map
//        Map<String, String>  map = new HashMap<String, String>();
//        map.put("100abc", "JAVA");
//        map.put("200hgd", "C");
//        map.put("1a", "PHP");
//        map.put("1234a", "C#");
//        map.put("100", "JAVA1");
//        // show map
//        Set<String> set = map.keySet();
//        for(String key: set){
//            System.out.println(key + " "+ map.get(key));
//        }
        
        // TreeSet
//        TreeSet<String> treeSet = new TreeSet<String>();
//        treeSet.add("JAVA");
//        treeSet.add("C++");
//        treeSet.add("JAVA");
//        treeSet.add("PHP");
//        System.out.println("Cac phan tu duoc in ra TreeSet: ");
//        for(String str: treeSet){
//            System.out.println(str);
//        }
//        TreeSet<Integer> treeSetInteger = new TreeSet<Integer>();
//        treeSetInteger.add(1);
//        treeSetInteger.add(0);
//        treeSetInteger.add(20);
//        treeSetInteger.add(14);
//        System.out.println("Cac phan tu duoc in ra TreeSet: ");
//        for(Integer i: treeSetInteger){
//            System.out.println(i);
//        }
       // List
//       List<Integer> list = new ArrayList<>();
//       list.add(1);
//       list.add(1);
//       list.add(2);
//       list.add(3);
//       for(Integer i: list){
//           System.out.println(i);
//       }

        // HashSet
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);
        for(Integer i : hashSet){
            System.out.println(i);
        }
        
        
        
        
    }
    
}
