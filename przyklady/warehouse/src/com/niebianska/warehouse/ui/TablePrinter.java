package com.niebianska.warehouse.ui;
public class TablePrinter {
    public final void print(Object[] table){
        printHeaders();
        printTable(table);
    }

    protected void printTable(final Object[] table) {
        System.out.println("Can't print generic table");
    }

    protected void printHeaders() {
        System.out.println("Can't print generic table header");
    }
}
