package com.maticoo.sdk.p405ad.video;

/* renamed from: com.maticoo.sdk.ad.video.VideoOptions */
/* loaded from: classes6.dex */
public class VideoOptions {
    private boolean startMuted;
    private VideoAdListener videoAdListener;

    /* renamed from: com.maticoo.sdk.ad.video.VideoOptions$Builder */
    /* loaded from: classes6.dex */
    public static class Builder {
        private boolean startMuted = true;
        private VideoAdListener videoAdListener;

        public VideoOptions build() {
            VideoOptions videoOptions = new VideoOptions();
            videoOptions.startMuted = this.startMuted;
            videoOptions.videoAdListener = this.videoAdListener;
            return videoOptions;
        }

        public Builder setStartMuted(boolean z) {
            this.startMuted = z;
            return this;
        }

        public Builder setVideoAdListener(VideoAdListener videoAdListener) {
            this.videoAdListener = videoAdListener;
            return this;
        }
    }

    public VideoAdListener getVideoAdListener() {
        return this.videoAdListener;
    }

    public boolean isStartMuted() {
        return this.startMuted;
    }

    private VideoOptions() {
        this.startMuted = true;
    }
}
