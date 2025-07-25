package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzapv;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzbi implements zzapq {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbk zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbi(zzbo zzboVar, String str, zzbk zzbkVar) {
        this.zza = str;
        this.zzb = zzbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapq
    public final void zza(zzapv zzapvVar) {
        String obj = zzapvVar.toString();
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load URL: " + this.zza + "\n" + obj);
        this.zzb.zza((Object) null);
    }
}
