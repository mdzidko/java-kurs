package com.niebianska.warehouse.document.exceptions;

import com.niebianska.warehouse.document.DocumentStatus;

import java.util.UUID;

public class WrongDocumentStatusException extends RuntimeException {
    public WrongDocumentStatusException(final DocumentStatus status, final UUID number) {
        super("Wrong status " + status.toString() + " of document with number: " + number.toString());
    }
}
