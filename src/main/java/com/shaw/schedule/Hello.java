package com.shaw.schedule;

import java.util.*;

/**
 * Created by shaw on 2017/7/17.
 */
public class Hello {
//    private static Hello ourInstance = new Hello();
//
//    public static Hello getInstance() {
//        return ourInstance;
//    }
//
//    private Hello() {
//    }

    public static void main(String args[]){
        Map<Integer,String> map = new HashMap<>();
        map.put(2,"hello");
        map.put(1,"world");
        map.put(3,"homie");
        map.put(4,"fly");
        map.put(5,"away");
        List<Map.Entry<Integer,String>> infolds = new ArrayList<>(map.entrySet());

        Collections.sort(infolds, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey().toString().compareTo(o2.getValue());
            }
        });

        for (int i=0;i<infolds.size();i++){
            System.out.println(infolds.get(i).toString());
        }
    }
}
