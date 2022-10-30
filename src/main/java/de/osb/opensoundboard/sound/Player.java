package de.osb.opensoundboard.sound;

import de.osb.opensoundboard.manager.SoundManager;

public class Player implements Runnable {


    public static void startsThread() {
        Player obj = new Player();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("playing");
    }

    public void run() {
        while (SoundManager.running) {

            //stuff to run async in loop

        }
        System.out.println("stops");
    }
}
