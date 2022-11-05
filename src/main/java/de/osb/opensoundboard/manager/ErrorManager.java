package de.osb.opensoundboard.manager;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class ErrorManager {
    public static void error(Throwable e) {
        FrameHandler.error = "An error happened:\r\n" + e.toString();
    }
}
