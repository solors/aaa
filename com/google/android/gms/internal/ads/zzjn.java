package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzjn implements zzkp {
    private final Object zza;
    private zzbq zzb;

    public zzjn(Object obj, zzub zzubVar) {
        this.zza = obj;
        this.zzb = zzubVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final zzbq zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final Object zzb() {
        return this.zza;
    }

    public final void zzc(zzbq zzbqVar) {
        this.zzb = zzbqVar;
    }
}
