package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfrq extends zzfsc {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final zzfsc zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final zzfsc zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final zzfsd zzc() {
        return new zzfrs(this.zza, this.zzb, null);
    }
}
