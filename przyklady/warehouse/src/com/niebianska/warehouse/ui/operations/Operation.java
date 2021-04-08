package com.niebianska.warehouse.ui.operations;

public class Operation {
    private final String label;

    public Operation(final String label) {
        this.label = label;
    }

    public void execute(){
        System.out.println("Executing " + toString());
    }

    @Override
    public String toString() {
        return label;
    }
}
