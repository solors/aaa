package net.pubnative.lite.sdk;

/* loaded from: classes10.dex */
public interface VideoListener {
    void onVideoDismissed(int i);

    void onVideoError(int i);

    void onVideoFinished();

    void onVideoSkipped();

    void onVideoStarted();
}
