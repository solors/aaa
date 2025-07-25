package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzgn {
    private final String zza;
    private boolean zzb;
    private String zzc;
    private final /* synthetic */ zzgh zzd;

    public zzgn(zzgh zzghVar, String str, String str2) {
        this.zzd = zzghVar;
        Preconditions.checkNotEmpty(str);
        this.zza = str;
    }

    @WorkerThread
    public final String zza() {
        if (!this.zzb) {
            this.zzb = true;
            this.zzc = this.zzd.zzg().getString(this.zza, null);
        }
        return this.zzc;
    }

    @WorkerThread
    public final void zza(String str) {
        SharedPreferences.Editor edit = this.zzd.zzg().edit();
        edit.putString(this.zza, str);
        edit.apply();
        this.zzc = str;
    }
}
