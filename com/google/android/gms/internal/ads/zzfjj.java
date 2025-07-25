package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfjj extends com.google.android.gms.ads.internal.client.zzch {
    private final zzfjv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfjj(zzfjv zzfjvVar) {
        this.zza = zzfjvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final zzbad zze(String str) {
        return this.zza.zza(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final com.google.android.gms.ads.internal.client.zzby zzf(String str) {
        return this.zza.zzb(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final zzbwp zzg(String str) {
        return this.zza.zzc(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzh(zzbpe zzbpeVar) {
        this.zza.zzi(zzbpeVar);
        this.zza.zzh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzi(List list, com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        this.zza.zzj(list, zzcfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzj(String str) {
        return this.zza.zzk(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzk(String str) {
        return this.zza.zzl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzl(String str) {
        return this.zza.zzm(str);
    }
}
