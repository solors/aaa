package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfyu extends zzfvp {
    final transient zzfvf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyu(Map map, zzfvf zzfvfVar) {
        super(map);
        this.zza = zzfvfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfvp, com.google.android.gms.internal.ads.zzfwg
    public final /* bridge */ /* synthetic */ Collection zza() {
        return (List) this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfwg, com.google.android.gms.internal.ads.zzfwj
    final Map zzj() {
        return zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzfwg, com.google.android.gms.internal.ads.zzfwj
    final Set zzl() {
        return zzm();
    }
}
