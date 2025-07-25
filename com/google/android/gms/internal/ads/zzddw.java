package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzddw {
    private final List zza;
    private final zzfja zzb;
    @Nullable
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;
    private boolean zzd;

    public zzddw(zzfbo zzfboVar, zzfja zzfjaVar) {
        this.zza = zzfboVar.zzp;
        this.zzb = zzfjaVar;
        this.zzc = zzfboVar.zzax;
    }

    public final void zza() {
        if (!this.zzd) {
            this.zzb.zze(this.zza, this.zzc);
            this.zzd = true;
        }
    }
}
