package com.learning.command;

public interface Command {
    void execute();
    void undo(); // برای پشتیبانی از Undo
}
