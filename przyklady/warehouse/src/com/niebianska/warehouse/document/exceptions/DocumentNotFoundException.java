package com.niebianska.warehouse.document.exceptions;

import java.util.UUID;

public class DocumentNotFoundException extends RuntimeException {
    public DocumentNotFoundException(final UUID number) {
        super("Document with number " + number.toString() + " not found");
    }
}
