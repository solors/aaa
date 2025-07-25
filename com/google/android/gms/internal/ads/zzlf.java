package com.google.android.gms.internal.ads;

import android.os.Looper;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzlf {
    private final zzle zza;
    private final zzld zzb;
    private final zzbq zzc;
    private int zzd;
    @Nullable
    private Object zze;
    private final Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;

    public zzlf(zzld zzldVar, zzle zzleVar, zzbq zzbqVar, int i, zzcx zzcxVar, Looper looper) {
        this.zzb = zzldVar;
        this.zza = zzleVar;
        this.zzc = zzbqVar;
        this.zzf = looper;
        this.zzg = i;
    }

    public final int zza() {
        return this.zzd;
    }

    public final Looper zzb() {
        return this.zzf;
    }

    public final zzle zzc() {
        return this.zza;
    }

    public final zzlf zzd() {
        zzcw.zzf(!this.zzh);
        this.zzh = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzlf zze(@Nullable Object obj) {
        zzcw.zzf(!this.zzh);
        this.zze = obj;
        return this;
    }

    public final zzlf zzf(int i) {
        zzcw.zzf(!this.zzh);
        this.zzd = i;
        return this;
    }

    @Nullable
    public final Object zzg() {
        return this.zze;
    }

    public final synchronized void zzh(boolean z) {
        this.zzi = z | this.zzi;
        notifyAll();
    }

    public final synchronized boolean zzi() {
        return false;
    }
}
