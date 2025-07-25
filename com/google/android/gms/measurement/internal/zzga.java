package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzga {
    @NonNull
    public String zza;
    @NonNull
    public Bundle zzb;
    @NonNull
    private String zzc;
    private long zzd;

    private zzga(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j) {
        this.zza = str;
        this.zzc = str2;
        this.zzb = bundle == null ? new Bundle() : bundle;
        this.zzd = j;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzb);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    public final zzbd zza() {
        return new zzbd(this.zza, new zzbc(new Bundle(this.zzb)), this.zzc, this.zzd);
    }

    public static zzga zza(zzbd zzbdVar) {
        return new zzga(zzbdVar.zza, zzbdVar.zzc, zzbdVar.zzb.zzb(), zzbdVar.zzd);
    }
}
