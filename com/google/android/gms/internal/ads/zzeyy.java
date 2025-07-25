package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzeyy implements zzfuc {
    final /* synthetic */ zzezb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeyy(zzezb zzezbVar) {
        this.zza = zzezbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzeyz zzeyzVar;
        zzbvk zzbvkVar = (zzbvk) obj;
        this.zza.zzd = new zzeyz(zzbvkVar, new zzfei(zzbvkVar.zzj), null);
        zzeyzVar = this.zza.zzd;
        return zzeyzVar;
    }
}
