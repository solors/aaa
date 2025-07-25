package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzsi {
    private static Boolean zza;

    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (zzei.zza >= 29) {
            Boolean bool = zza;
            if (bool == null || !bool.booleanValue()) {
                return zzsh.zza(videoCapabilities, i, i2, d);
            }
            return 0;
        }
        return 0;
    }
}
