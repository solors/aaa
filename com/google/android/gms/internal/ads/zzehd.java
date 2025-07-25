package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzehd implements zzedc {
    private final Context zza;
    private final Executor zzb;
    private final zzdof zzc;

    public zzehd(Context context, Executor executor, zzdof zzdofVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdofVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final /* bridge */ /* synthetic */ Object zza(zzfca zzfcaVar, zzfbo zzfboVar, final zzecz zzeczVar) throws zzfcq, zzegu {
        zzdob zze = this.zzc.zze(new zzcrp(zzfcaVar, zzfboVar, zzeczVar.zza), new zzdoc(new zzdgc() { // from class: com.google.android.gms.internal.ads.zzehc
            @Override // com.google.android.gms.internal.ads.zzdgc
            public final void zza(boolean z, Context context, zzcwg zzcwgVar) {
                zzecz zzeczVar2 = zzecz.this;
                try {
                    ((zzfdh) zzeczVar2.zzb).zzv(z);
                    ((zzfdh) zzeczVar2.zzb).zzz(context);
                } catch (zzfcq e) {
                    throw new zzdgb(e.getCause());
                }
            }
        }));
        zze.zzd().zzo(new zzcma((zzfdh) zzeczVar.zzb), this.zzb);
        ((zzees) zzeczVar.zzc).zzc(zze.zzn());
        return zze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzb(zzfca zzfcaVar, zzfbo zzfboVar, zzecz zzeczVar) throws zzfcq {
        try {
            zzfcj zzfcjVar = zzfcaVar.zza.zza;
            if (zzfcjVar.zzo.zza == 3) {
                ((zzfdh) zzeczVar.zzb).zzr(this.zza, zzfcjVar.zzd, zzfboVar.zzv.toString(), (zzbpk) zzeczVar.zzc);
            } else {
                ((zzfdh) zzeczVar.zzb).zzq(this.zza, zzfcjVar.zzd, zzfboVar.zzv.toString(), (zzbpk) zzeczVar.zzc);
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzeczVar.zza)), e);
        }
    }
}
