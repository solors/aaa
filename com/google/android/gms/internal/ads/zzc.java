package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzc {
    public final AudioAttributes zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzc(zze zzeVar, zzd zzdVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = zzei.zza;
        if (i >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        if (i >= 32) {
            usage.setSpatializationBehavior(0);
        }
        this.zza = usage.build();
    }
}
