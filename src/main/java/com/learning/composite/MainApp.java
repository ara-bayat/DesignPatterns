package com.learning.composite;

public class MainApp {
    public static void main(String[] args) {
        // ساخت فایل‌ها
        FileSystemNode file1 = new File("document.txt", 50);
        FileSystemNode file2 = new File("image.jpg", 200);
        FileSystemNode file3 = new File("video.mp4", 700);

        // ساخت پوشه‌ها
        Folder root = new Folder("Root");
        Folder documents = new Folder("Documents");
        Folder media = new Folder("Media");

        // چیدمان درخت
        documents.addNode(file1);
        media.addNode(file2);
        media.addNode(file3);

        root.addNode(documents);
        root.addNode(media);
        root.addNode(new File("notes.txt", 30));

        // نمایش ساختار و حجم کل
        System.out.println("=== File System Structure ===");
        root.display();

        System.out.println("\n=== Total Size of Root: " + root.getSize() + " KB ===");
    }
}
