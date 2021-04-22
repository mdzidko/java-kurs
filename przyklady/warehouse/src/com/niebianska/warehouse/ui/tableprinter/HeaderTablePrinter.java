package com.niebianska.warehouse.ui.tableprinter;
public abstract class HeaderTablePrinter implements TablePrinter{
    @Override
    public final void print(final Object[] table) {
        printHeaders();
        printTable(table);
    }

    protected abstract void printTable(final Object[] table);

    protected abstract void printHeaders();
}
