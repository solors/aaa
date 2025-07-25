package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfwz extends zzfxc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfwz() {
        super(null);
    }

    static final zzfxc zzf(int i) {
        zzfxc zzfxcVar;
        zzfxc zzfxcVar2;
        zzfxc zzfxcVar3;
        if (i < 0) {
            zzfxcVar3 = zzfxc.zzb;
            return zzfxcVar3;
        } else if (i > 0) {
            zzfxcVar2 = zzfxc.zzc;
            return zzfxcVar2;
        } else {
            zzfxcVar = zzfxc.zza;
            return zzfxcVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final zzfxc zzb(int i, int i2) {
        return zzf(Integer.compare(i, i2));
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final zzfxc zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final zzfxc zzd(boolean z, boolean z2) {
        return zzf(Boolean.compare(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final zzfxc zze(boolean z, boolean z2) {
        return zzf(Boolean.compare(z2, z));
    }
}
