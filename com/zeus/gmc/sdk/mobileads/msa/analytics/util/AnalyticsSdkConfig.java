package com.zeus.gmc.sdk.mobileads.msa.analytics.util;

import com.p552ot.pubsub.PubSubTrack;

/* loaded from: classes8.dex */
public class AnalyticsSdkConfig {
    public static boolean DEBUG = false;
    public static boolean USE_STAGING = false;

    private AnalyticsSdkConfig() {
    }

    public static void setDebug(boolean z) {
        DEBUG = z;
        if (z) {
            C32821atntntntanaan.atnaaata();
            PubSubTrack.setDebugMode(true);
            return;
        }
        C32821atntntntanaan.atntaanaa();
        PubSubTrack.setDebugMode(false);
    }
}
