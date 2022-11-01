package de.osb.opensoundboard;

import de.osb.opensoundboard.manager.FrameHandler;
import de.osb.opensoundboard.manager.SoundManager;

public class OpenSoundBoard {

    public static void main(String[] args) {
        new FrameHandler();
        SoundManager.playStandardSound("test");
    }

}
