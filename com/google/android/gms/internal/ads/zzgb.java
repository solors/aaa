package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgb {
    @Nullable
    private Uri zza;
    private Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgb(zzgd zzgdVar, zzgc zzgcVar) {
        this.zza = zzgdVar.zza;
        this.zzb = zzgdVar.zzd;
        this.zzc = zzgdVar.zze;
        this.zzd = zzgdVar.zzf;
        this.zze = zzgdVar.zzg;
    }

    public final zzgb zza(int i) {
        this.zze = 6;
        return this;
    }

    public final zzgb zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzgb zzc(long j) {
        this.zzc = j;
        return this;
    }

    public final zzgb zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzgd zze() {
        if (this.zza != null) {
            return new zzgd(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public zzgb() {
        this.zzb = Collections.emptyMap();
        this.zzd = -1L;
    }
}
