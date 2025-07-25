package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@VisibleForTesting
/* loaded from: classes5.dex */
public final class zzua extends zzbq {
    private final zzar zzb;

    public zzua(zzar zzarVar) {
        this.zzb = zzarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zza(Object obj) {
        if (obj == zztz.zzc) {
            return 0;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final zzbo zzd(int i, zzbo zzboVar, boolean z) {
        Integer num;
        Object obj = null;
        if (z) {
            num = 0;
        } else {
            num = null;
        }
        if (z) {
            obj = zztz.zzc;
        }
        zzboVar.zzi(num, obj, 0, -9223372036854775807L, 0L, zzb.zza, true);
        return zzboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final zzbp zze(int i, zzbp zzbpVar, long j) {
        zzbpVar.zza(zzbp.zza, this.zzb, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzbpVar.zzk = true;
        return zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final Object zzf(int i) {
        return zztz.zzc;
    }
}
