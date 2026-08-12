package com.learning.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemNode {
    private String name;
    private List<FileSystemNode> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addNode(FileSystemNode node) {
        children.add(node);
    }

    public void removeNode(FileSystemNode node) {
        children.remove(node);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemNode child : children) {
            totalSize += child.getSize();
        }
        return totalSize;
    }

    @Override
    public void display() {
        System.out.println("Folder: " + name + " (Total: " + getSize() + " KB)");
        System.out.println("  Contents:");
        for (FileSystemNode child : children) {
            System.out.print("    ");
            child.display(); // recursive
        }
    }
}
