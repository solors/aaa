package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzegz {
    @Nullable
    private zzegq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzegz() {
    }

    private zzegz(zzegq zzegqVar) {
        this.zza = zzegqVar;
    }

    public static zzegz zzb(zzegq zzegqVar) {
        return new zzegz(zzegqVar);
    }

    public final zzegq zza(Clock clock, zzegs zzegsVar, zzedb zzedbVar, zzfja zzfjaVar) {
        zzegq zzegqVar = this.zza;
        if (zzegqVar != null) {
            return zzegqVar;
        }
        return new zzegq(clock, zzegsVar, zzedbVar, zzfjaVar);
    }
}
