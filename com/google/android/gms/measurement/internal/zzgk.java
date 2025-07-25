package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzgk {
    private final String zza;
    private final boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private final /* synthetic */ zzgh zze;

    public zzgk(zzgh zzghVar, String str, boolean z) {
        this.zze = zzghVar;
        Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = z;
    }

    @WorkerThread
    public final void zza(boolean z) {
        SharedPreferences.Editor edit = this.zze.zzg().edit();
        edit.putBoolean(this.zza, z);
        edit.apply();
        this.zzd = z;
    }

    @WorkerThread
    public final boolean zza() {
        if (!this.zzc) {
            this.zzc = true;
            this.zzd = this.zze.zzg().getBoolean(this.zza, this.zzb);
        }
        return this.zzd;
    }
}
