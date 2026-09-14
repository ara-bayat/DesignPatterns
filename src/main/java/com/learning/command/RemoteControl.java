package com.learning.command;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command lastCommand; // برای Undo

    public RemoteControl(int slots) {
        onCommands = new Command[slots];
        offCommands = new Command[slots];
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pressOnButton(int slot) {
        if (onCommands[slot] != null) {
            onCommands[slot].execute();
            lastCommand = onCommands[slot];
        }
    }

    public void pressOffButton(int slot) {
        if (offCommands[slot] != null) {
            offCommands[slot].execute();
            lastCommand = offCommands[slot];
        }
    }

    public void pressUndoButton() {
        if (lastCommand != null) {
            System.out.println("↩️ بازگشت...");
            lastCommand.undo();
            lastCommand = null;
        } else {
            System.out.println("❌ چیزی برای بازگشت وجود ندارد");
        }
    }
}