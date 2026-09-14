package com.learning.memento;

public class TextEditor {
    private String content = "";

    public void type(String text) {
        content += text;
        System.out.println("📝 تایپ شد: \"" + text + "\" → متن فعلی: \"" + content + "\"");
    }

    public void deleteLast(int count) {
        if (count > content.length()) count = content.length();
        content = content.substring(0, content.length() - count);
        System.out.println("🗑️ " + count + " کاراکتر حذف شد → متن فعلی: \"" + content + "\"");
    }

    // ذخیره‌ی وضعیت فعلی در یک Memento
    public EditorMemento save() {
        System.out.println("💾 ذخیره‌ی نسخه پشتیبان از متن: \"" + content + "\"");
        return new EditorMemento(content);
    }

    // بازیابی وضعیت از یک Memento
    public void restore(EditorMemento memento) {
        this.content = memento.getContent();
        System.out.println("↩️ بازگردانی به متن: \"" + content + "\"");
    }

    public String getContent() {
        return content;
    }
}
