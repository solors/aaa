package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzazk {
    private final float zza;
    private final float zzb;
    private final float zzc;
    private final float zzd;
    private final int zze;

    @VisibleForTesting
    public zzazk(float f, float f2, float f3, float f4, int i) {
        this.zza = f;
        this.zzb = f2;
        this.zzc = f + f3;
        this.zzd = f2 + f4;
        this.zze = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float zza() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float zzb() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float zzc() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float zzd() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zze() {
        return this.zze;
    }
}
