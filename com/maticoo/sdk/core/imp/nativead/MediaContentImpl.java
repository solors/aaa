package com.maticoo.sdk.core.imp.nativead;

import com.maticoo.sdk.p405ad.nativead.NativeAd;
import com.maticoo.sdk.p405ad.nativead.NativeAdOptions;
import com.maticoo.sdk.p405ad.video.VideoOptions;

/* loaded from: classes6.dex */
public class MediaContentImpl extends NativeAd.MediaContent {
    private String contentUrl;
    private NativeAdOptions nativeAdOptions;
    private int type;
    private VideoOptions videoOptions;

    public MediaContentImpl(int i, String str) {
        this.type = i;
        this.contentUrl = str;
    }

    @Override // com.maticoo.sdk.p405ad.nativead.NativeAd.MediaContent
    public String getContentUrl() {
        return this.contentUrl;
    }

    public NativeAdOptions getNativeAdOptions() {
        return this.nativeAdOptions;
    }

    public int getType() {
        return this.type;
    }

    public VideoOptions getVideoOptions() {
        return this.videoOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setNativeAdOptions(NativeAdOptions nativeAdOptions) {
        this.nativeAdOptions = nativeAdOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setVideoOptions(VideoOptions videoOptions) {
        this.videoOptions = videoOptions;
    }
}
