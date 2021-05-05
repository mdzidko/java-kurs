package com.niebianska.warehouse.document;

import com.niebianska.warehouse.inventory.Inventory;

import java.util.*;

public abstract class Document {
    protected final UUID number;
    protected final Iterable<DocumentLine> lines;
    protected DocumentStatus status;
    protected final DocumentType type;

    Document(final DocumentType type, final Iterable<DocumentLine> lines) {
        this.type = type;
        this.lines = lines;
        this.number = UUID.randomUUID();
        this.status = DocumentStatus.NEW;
    }

    public abstract void accept(Inventory inventory);

    public DocumentType getDocumentType() {return type; }

    public DocumentStatus getStatus() {
        return status;
    }

    public UUID getNumber() {
        return number;
    }

    public Iterable<DocumentLine> getLines() {
        return lines;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Document document = (Document) o;
        return Objects.equals(number, document.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
