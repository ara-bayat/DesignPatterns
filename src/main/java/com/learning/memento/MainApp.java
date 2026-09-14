package com.learning.memento;

public class MainApp {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorHistory history = new EditorHistory();

        // تایپ ۱
        history.save(editor.save()); // ذخیره قبل از تغییر
        editor.type("سلام ");

        // تایپ ۲
        history.save(editor.save());
        editor.type("دنیا!");

        // تایپ ۳
        history.save(editor.save());
        editor.type(" چطوری؟");

        System.out.println("\n--- Undo (بازگشت) ---");
        editor.restore(history.undo()); // بازگشت به قبل از " چطوری؟"
        editor.restore(history.undo()); // بازگشت به قبل از "دنیا!"
    }
}
