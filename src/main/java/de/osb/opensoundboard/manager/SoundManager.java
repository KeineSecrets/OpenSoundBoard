package de.osb.opensoundboard.manager;

import de.osb.opensoundboard.sound.Player;

public class SoundManager {

    public static boolean running;
    public static String PATH;

    public static void playSound(String path) {
        PATH = path;
            while (Player.playing) {
                running = false;
            }
           running = true;

        Player.startsThread();
        VolumeManager.startsThread();
    }

    public static void stopSound() {
        running = false;
        //Sound stops
    }
}
