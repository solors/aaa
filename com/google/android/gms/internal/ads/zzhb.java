package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzhb {
    private int zza;

    public final void zza(int i) {
        this.zza |= 536870912;
    }

    @CallSuper
    public void zzb() {
        this.zza = 0;
    }

    public final void zzc(int i) {
        this.zza = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzd(int i) {
        if ((this.zza & i) == i) {
            return true;
        }
        return false;
    }

    public final boolean zze() {
        return zzd(268435456);
    }

    public final boolean zzf() {
        return zzd(4);
    }

    public final boolean zzg() {
        return zzd(1);
    }

    public final boolean zzh() {
        return zzd(536870912);
    }

    public final boolean zzi() {
        return zzd(67108864);
    }
}
