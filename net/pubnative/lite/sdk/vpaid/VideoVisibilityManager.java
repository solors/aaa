package net.pubnative.lite.sdk.vpaid;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class VideoVisibilityManager {
    private static VideoVisibilityManager instance;
    ArrayList<VideoVisibilityListener> videoVisibilityListeners = new ArrayList<>();

    /* loaded from: classes10.dex */
    public enum VideoAdStatus {
        PAUSED,
        RESUMED
    }

    private VideoVisibilityManager() {
    }

    public static VideoVisibilityManager getInstance() {
        if (instance == null) {
            instance = new VideoVisibilityManager();
        }
        return instance;
    }

    public void addCallback(VideoVisibilityListener videoVisibilityListener) {
        this.videoVisibilityListeners.add(videoVisibilityListener);
    }

    public void removeCallback(VideoVisibilityListener videoVisibilityListener) {
        this.videoVisibilityListeners.remove(videoVisibilityListener);
    }

    public void reportChange(VideoAdStatus videoAdStatus) {
        Iterator<VideoVisibilityListener> it = this.videoVisibilityListeners.iterator();
        while (it.hasNext()) {
            VideoVisibilityListener next = it.next();
            if (videoAdStatus == VideoAdStatus.PAUSED) {
                next.pauseAd();
            } else {
                next.resumeAd();
            }
        }
    }
}
