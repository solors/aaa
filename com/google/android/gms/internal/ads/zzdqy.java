package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdqy implements zzfgo {
    private final Map zza;
    private final zzbbj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqy(zzbbj zzbbjVar, Map map) {
        this.zza = map;
        this.zzb = zzbbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzd(zzfgh zzfghVar, String str) {
        if (this.zza.containsKey(zzfghVar)) {
            this.zzb.zzc(((zzdqx) this.zza.get(zzfghVar)).zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdB(zzfgh zzfghVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfghVar)) {
            this.zzb.zzc(((zzdqx) this.zza.get(zzfghVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdC(zzfgh zzfghVar, String str) {
        if (this.zza.containsKey(zzfghVar)) {
            this.zzb.zzc(((zzdqx) this.zza.get(zzfghVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdA(zzfgh zzfghVar, String str) {
    }
}
