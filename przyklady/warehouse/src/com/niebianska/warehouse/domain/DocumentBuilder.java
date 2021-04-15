package com.niebianska.warehouse.domain;

import java.util.Arrays;

public class DocumentBuilder {
    private DocumentLine[] lines = new DocumentLine[0];

    public DocumentBuilder line(Item item, long quantity) {
        DocumentLine newLine = new DocumentLine(item, quantity);

        lines = Arrays.copyOf(lines, lines.length + 1);
        lines[lines.length - 1] = newLine;

        return this;
    }

    public Issue buildIssue(){
        return new Issue(lines);
    }

    public Receive buildReceive(){
        return new Receive(lines);
    }
}
