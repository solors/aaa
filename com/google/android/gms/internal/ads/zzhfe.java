package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzhfe {
    private final List zza;
    private final List zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhfe(int i, int i2, zzhfd zzhfdVar) {
        this.zza = zzheo.zzc(i);
        this.zzb = zzheo.zzc(i2);
    }

    public final zzhfe zza(zzhfa zzhfaVar) {
        this.zzb.add(zzhfaVar);
        return this;
    }

    public final zzhfe zzb(zzhfa zzhfaVar) {
        this.zza.add(zzhfaVar);
        return this;
    }

    public final zzhff zzc() {
        return new zzhff(this.zza, this.zzb, null);
    }
}
