package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdno extends zzdmy implements zzdds {
    private zzdds zza;

    @Override // com.google.android.gms.internal.ads.zzdds
    public final synchronized void zzdd() {
        zzdds zzddsVar = this.zza;
        if (zzddsVar != null) {
            zzddsVar.zzdd();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zza zzaVar, zzbif zzbifVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbih zzbihVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar, zzdds zzddsVar) {
        super.zzh(zzaVar, zzbifVar, zzrVar, zzbihVar, zzacVar);
        this.zza = zzddsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final synchronized void zzu() {
        zzdds zzddsVar = this.zza;
        if (zzddsVar != null) {
            zzddsVar.zzu();
        }
    }
}
