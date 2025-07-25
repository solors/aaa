package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzcot {
    private final zzcqx zza;
    private final View zzb;
    private final zzfbp zzc;
    @Nullable
    private final zzcex zzd;

    public zzcot(View view, @Nullable zzcex zzcexVar, zzcqx zzcqxVar, zzfbp zzfbpVar) {
        this.zzb = view;
        this.zzd = zzcexVar;
        this.zza = zzcqxVar;
        this.zzc = zzfbpVar;
    }

    public final View zza() {
        return this.zzb;
    }

    @Nullable
    public final zzcex zzb() {
        return this.zzd;
    }

    public final zzcqx zzc() {
        return this.zza;
    }

    public zzcxf zzd(Set set) {
        return new zzcxf(set);
    }

    public final zzfbp zze() {
        return this.zzc;
    }
}
