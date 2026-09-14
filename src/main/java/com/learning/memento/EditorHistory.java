package com.learning.memento;

import java.util.Stack;

public class EditorHistory {
    private final Stack<EditorMemento> history = new Stack<>();

    public void save(EditorMemento memento) {
        history.push(memento);
    }

    public EditorMemento undo() {
        if (history.isEmpty()) {
            System.out.println("❌ تاریخچه خالی است!");
            return null;
        }
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}