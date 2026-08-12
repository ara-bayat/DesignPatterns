package com.learning.proxy;

public class RealFile implements File {
    private String fileName;

    public RealFile(String fileName) {
        this.fileName = fileName;
        loadFromDisk(); // عملیات سنگین!
    }

    private void loadFromDisk() {
        System.out.println("Loading file: " + fileName + " from disk... (Heavy operation)");
        try {
            Thread.sleep(2000); // شبیه‌سازی تأخیر
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("File: " + fileName + " loaded successfully!");
    }

    @Override
    public void read() {
        System.out.println("Reading content of: " + fileName);
    }

    @Override
    public void write(String data) {
        System.out.println("Writing '" + data + "' to file: " + fileName);
    }

    @Override
    public void delete() {
        System.out.println("Deleting file: " + fileName);
    }
}