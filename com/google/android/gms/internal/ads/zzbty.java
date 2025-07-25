package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzbty extends zzbts {
    final /* synthetic */ List zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbty(zzbub zzbubVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zze(String str) {
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zzf(List list) {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Recorded impression urls: ".concat(this.zza.toString()));
    }
}
