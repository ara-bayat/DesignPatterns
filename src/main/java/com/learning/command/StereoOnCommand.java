package com.learning.command;

public class StereoOnCommand implements Command {
    private final Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
