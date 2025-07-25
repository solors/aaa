package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcva {
    private Context zza;
    private zzfcj zzb;
    private Bundle zzc;
    @Nullable
    private zzfcb zzd;
    @Nullable
    private zzcut zze;
    @Nullable
    private zzedb zzf;
    private int zzg = 0;

    public final zzcva zze(@Nullable zzedb zzedbVar) {
        this.zzf = zzedbVar;
        return this;
    }

    public final zzcva zzf(Context context) {
        this.zza = context;
        return this;
    }

    public final zzcva zzg(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzcva zzh(@Nullable zzcut zzcutVar) {
        this.zze = zzcutVar;
        return this;
    }

    public final zzcva zzi(int i) {
        this.zzg = i;
        return this;
    }

    public final zzcva zzj(zzfcb zzfcbVar) {
        this.zzd = zzfcbVar;
        return this;
    }

    public final zzcva zzk(zzfcj zzfcjVar) {
        this.zzb = zzfcjVar;
        return this;
    }

    public final zzcvc zzl() {
        return new zzcvc(this, null);
    }
}
