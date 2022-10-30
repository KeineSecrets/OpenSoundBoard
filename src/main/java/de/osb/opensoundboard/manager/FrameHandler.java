package de.osb.opensoundboard.manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class FrameHandler extends JFrame {
    public FrameHandler(String title) throws HeadlessException {
        super(title);
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
