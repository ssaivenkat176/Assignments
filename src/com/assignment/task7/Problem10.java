package com.assignment.task7;

import java.util.*;

class SampleComparator implements Comparator<Map.Entry<Integer,Integer>>  {

    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        return o1.getValue() - o2.getValue();
    }
}

public class Problem10 {

    public static void main(String args[]) {
        int keys[] = new int[] {2,1,3,4,17,9,18,6};
        int values[] = new int[] {6,1,3,5,5,91,10,22};

        Map<Integer, Integer> map = new HashMap<>();


        for(int i=0;i<keys.length;i++) {
            map.put(keys[i], values[i]);
        }
        for (Integer key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
        System.out.println("Sorting the map using key ...");

        Map<Integer, Integer> sortKeyMap = new TreeMap<>(map);

        for (Integer key : sortKeyMap.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }

        System.out.println("Sorting the map using values  ...");

        // First we add all the entries from Map into ArrayList and Sort the array list
        // Once the array list is sorted, insert the items into linkedhash map to maintain insertion order

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>();

        for (Map.Entry<Integer, Integer> key : map.entrySet()) {
            entries.add(key);
        }

        Collections.sort(entries, new SampleComparator());

        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, Integer> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // print the sorted Map
        for (Integer key : sortedMap.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }

    }
}
