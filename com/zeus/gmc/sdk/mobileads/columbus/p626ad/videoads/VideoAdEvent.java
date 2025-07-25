package com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads;

import com.zeus.gmc.sdk.mobileads.columbus.p626ad.nativead.NativeAdError;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.VideoAdEvent */
/* loaded from: classes8.dex */
public interface VideoAdEvent {

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.VideoAdEvent$VideoAdEventType */
    /* loaded from: classes8.dex */
    public enum VideoAdEventType {
        LOADED,
        IMPRESSION,
        CLICK,
        START,
        TYPE_FIRST,
        TYPE_MID,
        TYPE_THIRD,
        TYPE_COMPLETE,
        TYPE_FULL,
        TYPE_NORMAL,
        TYPE_EXPANDED,
        TYPE_COLLAPSED,
        RESUME,
        PAUSE,
        STOP,
        SKIP,
        MUTE,
        UNMUTE,
        COMPLETE,
        REPLAY,
        CLOSED
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.VideoAdEvent$VideoEventListener */
    /* loaded from: classes8.dex */
    public interface VideoEventListener {
        void onAdError(NativeAdError nativeAdError);

        void onVideoEvent(VideoAdEvent videoAdEvent);
    }

    VideoAdEventType getType();
}
