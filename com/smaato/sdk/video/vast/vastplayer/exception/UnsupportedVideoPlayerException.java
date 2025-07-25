package com.smaato.sdk.video.vast.vastplayer.exception;

/* loaded from: classes7.dex */
public class UnsupportedVideoPlayerException extends VideoPlayerException {
    public UnsupportedVideoPlayerException() {
        super("Bitstream is conforming to the related coding standard or file spec, but the media framework does not support the feature");
    }
}
