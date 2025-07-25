package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzeyx implements zzfuc {
    final /* synthetic */ zzezb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeyx(zzezb zzezbVar) {
        this.zza = zzezbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzfeg zze;
        zzeyz zzeyzVar;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("", (zzdyh) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzezb zzezbVar = this.zza;
        zze = zzezbVar.zze();
        zzezbVar.zzd = new zzeyz(null, zze, null);
        zzeyzVar = this.zza.zzd;
        return zzeyzVar;
    }
}
