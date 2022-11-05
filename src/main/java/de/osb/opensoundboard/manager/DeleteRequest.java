package de.osb.opensoundboard.manager;

public class DeleteRequest {
    public static boolean request(String name) {
        FrameHandler.deleteRequest = true;
        FrameHandler.deleteRequestContent = name;
        return FrameHandler.deleteRequestAnswer();
    }
}
