package de.osb.opensoundboard.manager;

import de.osb.opensoundboard.sound.Player;


public class VolumeManager implements Runnable {

    public static void startsThread() {
        VolumeManager obj = new VolumeManager();
        Thread thread = new Thread(obj);
        thread.start();
    }

    public void run() {
        while (SoundManager.running) {
            //Update volume
            Player.volume = 100;
        }
    }
}

