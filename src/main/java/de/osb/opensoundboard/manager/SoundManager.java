package de.osb.opensoundboard.manager;

import de.osb.opensoundboard.sound.Player;

import java.io.File;

public class SoundManager {
    public static void playStandardSound(String name) {
        String path = "./data/sounds/standardSounds/" + name + ".wav";
        if (Player.getPlaying()) {
            Player.stop();
        }
        Player.play(path);
    }

    public static void playPrivateSound(String name) {
        String path = "./data/sounds/privateSounds/" + name + ".wav";
        if (Player.getPlaying()) {
            Player.stop();
        }
        Player.play(path);
    }

    public static void deleteSound(String name) {
        String path = "./data/sounds/privateSounds/" + name + ".wav";
        File f = new File(path);
        if (DeleteRequest.request(name)) {
            f.delete();
        }
    }
}
