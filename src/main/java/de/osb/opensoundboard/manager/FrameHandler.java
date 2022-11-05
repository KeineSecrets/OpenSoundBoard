package de.osb.opensoundboard.manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class FrameHandler extends JFrame implements ActionListener {

    public static String error;
    public static boolean deleteRequest;
    public static boolean deleteRequestAnswer;
    public static String deleteRequestContent;

    public FrameHandler() throws HeadlessException {
        super("OSB | OpenSoundBoard v1.0 | by Max and Christian");
        this.setSize(750, 650);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Button one = new Button("Choose sound...");
        one.setLocation(0, 0);
        one.setActionCommand("chooser");
        one.addActionListener(this);

        this.add(one);

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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("chooser")) {
            JFileChooser chooser = new JFileChooser();
            chooser.setName("Choose sound...");
            chooser.show();
        }
    }

    public static boolean deleteRequestAnswer() {
        return deleteRequestAnswer;
    }
}
