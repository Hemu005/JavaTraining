package com.util.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Node");
        list.add("Angular");
        list.add("Maven");
        System.out.println(list);

        list.addFirst("Html");
        list.addLast("Css");
        list.set(1,"React");
        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.get(0));

        Iterator<String> iterator=list.iterator();
        while ((iterator.hasNext())){
            String value=iterator.next();
            System.out.println(value);
        }
    }
}
