package com.niebianska.warehouse.util;

public class TableSearch {
    public static int find(Object[] table, SearchPredicate predicate){
        for (int i = 0; i < table.length; i++) {
            if(predicate.evaluate(table[i])){
                return i;
            }
        }
        return -1;
    }
}
