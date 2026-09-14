package com.learning.memento;

public final class EditorMemento {
    private final String content;
    private final long timestamp;

    public EditorMemento(String content) {
        this.content = content;
        this.timestamp = System.currentTimeMillis();
    }

    // فقط Getter (بدون Setter برای حفظ Immutability)
    public String getContent() {
        return content;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
