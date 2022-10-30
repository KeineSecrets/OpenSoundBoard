package de.osb.opensoundboard.manager;

public class SoundManager {

    public static boolean running;
    public static String path;

    public static void playSound(String path, int volume) {
        path = path;
        running = true;
    }

    public static void stopSound() {
        running = false;
    }
}
