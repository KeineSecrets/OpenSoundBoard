package de.osb.opensoundboard.manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class FrameHandler extends JFrame {
    public FrameHandler() throws HeadlessException {
        super("OSB | OpenSoundBoard v1.0 | by Max and Christian");
        this.setSize(750, 650);
        this.setResizable(false);
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
