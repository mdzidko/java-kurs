package com.niebianska.warehouse.ui.operations;

abstract class LabeledOperation implements Operation{
    protected final String label;

    protected LabeledOperation(final String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
