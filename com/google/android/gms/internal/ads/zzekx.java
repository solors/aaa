package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzekx implements zzelc {
    final /* synthetic */ zzeky zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzekx(zzeky zzekyVar) {
        this.zza = zzekyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcqz zzcqzVar = (zzcqz) obj;
        synchronized (this.zza) {
            this.zza.zzc = zzcqzVar.zzm();
            zzcqzVar.zzk();
        }
    }
}
