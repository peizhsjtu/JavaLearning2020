package com.DataStruct.Set;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        Iterator iter = set.iterator();

        while(iter.hasNext()){
            String value = (String) iter.next();
            System.out.println(value);
        }

        for(Iterator iter2 = set.iterator();iter2.hasNext();){
            String value = (String) iter2.next();
            System.out.println(value);
        }
    }
}
