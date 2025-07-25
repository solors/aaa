package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbyb {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzbyi zzd;

    private zzbyb() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbyb(zzbyd zzbydVar) {
    }

    public final zzbyb zza(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzbyb zzb(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzbyb zzc(Clock clock) {
        clock.getClass();
        this.zzb = clock;
        return this;
    }

    public final zzbyb zzd(zzbyi zzbyiVar) {
        this.zzd = zzbyiVar;
        return this;
    }

    public final zzbyj zze() {
        zzhez.zzc(this.zza, Context.class);
        zzhez.zzc(this.zzb, Clock.class);
        zzhez.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzhez.zzc(this.zzd, zzbyi.class);
        return new zzbyc(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
