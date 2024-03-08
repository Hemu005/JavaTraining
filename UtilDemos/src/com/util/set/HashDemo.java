package com.util.set;

import java.util.*;

public class HashDemo {
    public static void main(String[] args) {
       // Set<String> hashSet=new HashSet<>();
       Set<String> hashSet=new LinkedHashSet<>();
       // Set<String> hashSet=new TreeSet<>();

        hashSet.add("Apple");
        hashSet.add("Pineapple");
        hashSet.add("Orange");
        hashSet.add("Banana");
        hashSet.add("Kiwi");
        hashSet.add("100");
        hashSet.add(null);

        System.out.println(hashSet);

        Iterator<String> iterator=hashSet.iterator();
        while ((iterator.hasNext())){
            String val=iterator.next();
            System.out.println(val);
        }
    }
}
