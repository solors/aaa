package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfls implements zzfll {
    private static zzfls zza;
    private float zzb = 0.0f;
    private zzflg zzc;
    private zzflk zzd;

    public zzfls(zzflh zzflhVar, zzflf zzflfVar) {
    }

    public static zzfls zzb() {
        if (zza == null) {
            zza = new zzfls(new zzflh(), new zzflf());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfll
    public final void zzc(boolean z) {
        if (z) {
            zzfmu.zzd().zzi();
        } else {
            zzfmu.zzd().zzh();
        }
    }

    public final void zzd(Context context) {
        this.zzc = new zzflg(new Handler(), context, new zzfle(), this);
    }

    public final void zze(float f) {
        this.zzb = f;
        if (this.zzd == null) {
            this.zzd = zzflk.zza();
        }
        for (zzfkt zzfktVar : this.zzd.zzb()) {
            zzfktVar.zzg().zzl(f);
        }
    }

    public final void zzf() {
        zzflj.zza().zze(this);
        zzflj.zza().zzf();
        zzfmu.zzd().zzi();
        this.zzc.zza();
    }

    public final void zzg() {
        zzfmu.zzd().zzj();
        zzflj.zza().zzg();
        this.zzc.zzb();
    }
}
