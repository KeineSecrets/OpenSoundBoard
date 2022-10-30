package de.osb.opensoundboard.sound;

import de.osb.opensoundboard.manager.SoundManager;

public class Player implements Runnable {

    public static boolean playing = false;
    public static int volume;

    public static void startsThread() {
        Player obj = new Player();
        Thread thread = new Thread(obj);
        thread.start();
        playing = true;
        System.out.println("playing");
    }

    public void run() {
        while (SoundManager.running) {

            //stuff to run async in loop

        }
        playing = false;
        System.out.println("stops");
    }
}
