package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfdq implements zzcvw {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzbzq zzc;

    public zzfdq(Context context, zzbzq zzbzqVar) {
        this.zzb = context;
        this.zzc = zzbzqVar;
    }

    public final Bundle zzb() {
        return this.zzc.zzn(this.zzb, this);
    }

    public final synchronized void zzc(HashSet hashSet) {
        this.zza.clear();
        this.zza.addAll(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final synchronized void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.zzc.zzl(this.zza);
        }
    }
}
