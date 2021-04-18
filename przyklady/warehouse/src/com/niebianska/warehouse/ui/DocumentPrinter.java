package com.niebianska.warehouse.ui;

import com.niebianska.warehouse.document.Document;
import com.niebianska.warehouse.document.DocumentLine;

public class DocumentPrinter extends TablePrinter{
    @Override
    protected void printHeaders() {
        System.out.printf("%-6s%-40s%-20s%-20s\n", "Lp", "Document number", "Document type", "Document status");
    }

    @Override
    protected void printTable(final Object[] table) {
        for (int i = 0; i < table.length; i++) {
            Document document = (Document)table[i];
            System.out.printf("%-6s%-40s%-20s%s\n", i, document.getNumber(), document.getDocumentType(), document.getStatus());

            printLineHeaders();

            for (final DocumentLine line : document.getLines()) {
                System.out.printf("\t%-20s%-20s%d\n", line.getItem().getName(), line.getItem().getPackageType(), line.getQuantity());
            }
        }
    }

    private void printLineHeaders() {
        System.out.printf("\t%-20s%-20s%-20s\n", "Item name", "Package type", "Quantity");
    }
}
