package de.osb.opensoundboard.sound;

import de.osb.opensoundboard.manager.ErrorManager;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Player implements Runnable {
    private static Clip clip;
    private static boolean playing = false;
    private static String playPath;

    private static void startsThread() {
        Player obj = new Player();
        Thread thread = new Thread(obj);
        thread.start();
        playing = true;
        System.out.println("playing");
    }

    public void run() {
        try {
            File f = new File(playPath);
            if (f.exists()) {
                AudioInputStream ai = AudioSystem.getAudioInputStream(f);
                clip = AudioSystem.getClip();
                clip.open(ai);
                clip.start();
                JOptionPane.showMessageDialog(null, "press 'ok' to stop playing");
            }
            else {
                System.err.println("File does not exist");
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e){
            ErrorManager.error(e);
            throw new RuntimeException(e);
        }
        playing = false;
        System.out.println("stops");
    }

    public static boolean getPlaying() {
        return playing;
    }

    public static void play(String path) {
        playPath = path;
        startsThread();
    }

    public static void stop() {
        clip.stop();
    }
}
