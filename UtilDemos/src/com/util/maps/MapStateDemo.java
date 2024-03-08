package com.util.maps;

import java.security.KeyStore;
import java.util.*;

public class MapStateDemo {
    public static void main(String[] args) {
        Map<String, List<String>> stateMap=new HashMap<>();
        stateMap.put("Karnataka", Arrays.asList("Mandya","Madduru","Bangalore"));
        stateMap.put("Andra Pradesh",Arrays.asList("Vizag","Putturu","Kadapa"));
        stateMap.put("Tamilnadu",Arrays.asList("Chennai","Vellore","Coimbatore"));
        stateMap.put("Kerala",Arrays.asList("Munar","Kochin","Palakar"));

        System.out.println(stateMap.keySet());

        for (Map.Entry<String,List<String>> stateEntries:stateMap.entrySet()){
            System.out.println(stateEntries.getKey());
            List<String> cities=stateEntries.getValue();
          //  for ((String ))
        }
    }
}
