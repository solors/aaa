package com.smaato.sdk.nativead;

/* loaded from: classes7.dex */
public class NativeAdException extends RuntimeException {
    public static final NativeAdException noAdLoaded = new NativeAdException("No successfully loaded ad available");

    private NativeAdException(String str) {
        super(str);
    }
}
