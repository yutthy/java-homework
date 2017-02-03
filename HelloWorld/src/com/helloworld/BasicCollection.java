package com.helloworld;

import java.util.*;

/**
 * Created by uyutthy on 12/17/2016.
 */
public class BasicCollection {
    public static void main(String[] args){
        Collection<String> c = new HashSet();
        /**** when add then A become to the Object of the collection ****/
        c.add("A");
        c.add("B");
        c.add("C");
        /*System.out.println("Size" + c.size());
        System.out.println(c.isEmpty());
        System.out.println(c.contains("A"));*/

        for(Iterator<String> it = c.iterator(); it.hasNext();){
            it.next();
            it.remove();
        }
        System.out.println("Size " + c.size());

        /*** Set Store as Unique and No Duplication Value *****/
        int  count[] = {10, 15, 10, 20, 30, 10};
        Set<Integer> set = new HashSet<Integer>();

        for(int i =0; i < 5; i++){
            set.add(count[i]);
        }
        System.out.println(set);


        /*** Set Store as Unique and No Duplication Value but Sort Data *****/
        int  sortSetCount[] = {10, 15, 10, 20, 30, 10};
        Set<Integer> sortSet = new TreeSet<Integer>();

        for(int i =0; i < 5; i++){
            sortSet.add(sortSetCount[i]);
        }
        System.out.println(sortSet);

        /***** Lab ************/
        String language[] = {"C", "C++", "JAVA", "PHP", "Python", "GO", "JAVA", "ASP"};

        Set<String> labTreeSet = new TreeSet<String>(Arrays.asList(language));
        Set<String> labHashSet = new HashSet<String>(Arrays.asList(language));
        Set<String> labLinkedHashSet = new LinkedHashSet<String>(Arrays.asList(language));

        System.out.println("TreeSet");
        displayAll(labTreeSet);

        System.out.println("HashSet");
        displayAll(labHashSet);

        System.out.println("LinkedHashSet");
        displayAll(labLinkedHashSet);
    }


    public static void displayAll(Set<String> set){
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+' ');
        }
    }
}
