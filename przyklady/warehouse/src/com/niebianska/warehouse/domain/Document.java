package com.niebianska.warehouse.domain;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class Document {
    protected final UUID number;
    protected final DocumentLine[] lines;
    protected DocumentStatus status;

    Document(final DocumentLine[] lines) {
        this.number = UUID.randomUUID();
        this.lines = lines;
        this.status = DocumentStatus.NEW;
    }

    public UUID getNumber() {
        return number;
    }

    public static DocumentBuilder builder(){
        return new DocumentBuilder();
    }

    public void accept(Inventory inventory){
        System.out.println("Can't accept generic document");
    }

    @Override
    public String toString() {
        return "number: " + number + ", status: " + status.toString() + ", lines: " + Arrays.toString(lines);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Document document = (Document) o;
        return Objects.equals(number, document.number);
    }
}
