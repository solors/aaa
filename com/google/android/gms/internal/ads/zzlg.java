package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzlg extends zztu {
    private final zzbp zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlg(zzlh zzlhVar, zzbq zzbqVar) {
        super(zzbqVar);
        this.zzc = new zzbp();
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzbq
    public final zzbo zzd(int i, zzbo zzboVar, boolean z) {
        zzbo zzd = this.zzb.zzd(i, zzboVar, z);
        if (this.zzb.zze(zzd.zzc, this.zzc, 0L).zzb()) {
            zzd.zzi(zzboVar.zza, zzboVar.zzb, zzboVar.zzc, zzboVar.zzd, 0L, zzb.zza, true);
        } else {
            zzd.zzf = true;
        }
        return zzd;
    }
}
