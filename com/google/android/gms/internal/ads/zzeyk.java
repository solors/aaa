package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzeyk implements zzfer {
    public final zzeze zza;
    public final zzezg zzb;
    public final com.google.android.gms.ads.internal.client.zzm zzc;
    public final String zzd;
    public final Executor zze;
    public final com.google.android.gms.ads.internal.client.zzy zzf;
    public final zzfeg zzg;

    public zzeyk(zzeze zzezeVar, zzezg zzezgVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzy zzyVar, zzfeg zzfegVar) {
        this.zza = zzezeVar;
        this.zzb = zzezgVar;
        this.zzc = zzmVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzyVar;
        this.zzg = zzfegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    public final zzfeg zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfer
    public final Executor zzb() {
        return this.zze;
    }
}
