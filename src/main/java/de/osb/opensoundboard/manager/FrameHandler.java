package de.osb.opensoundboard.manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class FrameHandler extends JFrame {
    public FrameHandler(String title) throws HeadlessException {
        super("OSB | OpenSoundBoard v1.0 | by Max and Christian");
        this.setSize(800, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.show();
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public MenuBar getMenuBar() {
        return super.getMenuBar();
    }

    @Override
    protected void processWindowEvent(WindowEvent e) {
        super.processWindowEvent(e);
    }
}
