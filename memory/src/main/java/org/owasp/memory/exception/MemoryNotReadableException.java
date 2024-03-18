package org.owasp.memory.exception;

public class MemoryNotReadableException extends MemoryException {
    private static final String MESSAGE = "Memory is not readable";

    public MemoryNotReadableException() {
        super(MESSAGE);
    }
}
