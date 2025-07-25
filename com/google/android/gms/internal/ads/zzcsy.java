package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcsy implements com.google.android.gms.ads.internal.client.zza {
    private final zzctc zza;
    private final zzfcj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcsy(zzctc zzctcVar, zzfcj zzfcjVar) {
        this.zza = zzctcVar;
        this.zzb = zzfcjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zzc(this.zzb.zzf);
    }
}
