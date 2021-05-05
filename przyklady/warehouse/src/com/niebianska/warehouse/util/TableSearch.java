package com.niebianska.warehouse.util;

import java.util.function.Predicate;

public class TableSearch {
    public static <T> int find(T[] table, Predicate<T> predicate){
        for (int i = 0; i < table.length; i++) {
            if(predicate.test(table[i])){
                return i;
            }
        }
        return -1;
    }
}
