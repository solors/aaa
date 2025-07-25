package com.meevii.adsdk.common;

/* loaded from: classes6.dex */
public class AdMute {
    private static volatile boolean isMute;

    public static boolean isMuteAd() {
        return isMute;
    }

    public static void muteAd(boolean z) {
        isMute = z;
    }
}
