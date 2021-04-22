package com.niebianska.warehouse.util;

@FunctionalInterface
public interface SearchPredicate {
    boolean evaluate(Object obj);
}
