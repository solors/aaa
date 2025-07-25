package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfln {
    private final zzfnb zza;
    private final String zzb;
    private final zzfkw zzc;
    private final String zzd = "Ad overlay";

    public zzfln(View view, zzfkw zzfkwVar, @Nullable String str) {
        this.zza = new zzfnb(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfkwVar;
    }

    public final zzfkw zza() {
        return this.zzc;
    }

    public final zzfnb zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
