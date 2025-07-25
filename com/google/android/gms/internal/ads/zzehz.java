package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzehz implements zzedc {
    private final Context zza;
    private final Executor zzb;
    private final zzdof zzc;

    public zzehz(Context context, Executor executor, zzdof zzdofVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdofVar;
    }

    public static /* bridge */ /* synthetic */ Executor zzc(zzehz zzehzVar) {
        return zzehzVar.zzb;
    }

    public static final void zze(zzfca zzfcaVar, zzfbo zzfboVar, zzecz zzeczVar) {
        try {
            ((zzfdh) zzeczVar.zzb).zzk(zzfcaVar.zza.zza.zzd, zzfboVar.zzv.toString());
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzeczVar.zza)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final /* bridge */ /* synthetic */ Object zza(zzfca zzfcaVar, zzfbo zzfboVar, final zzecz zzeczVar) throws zzfcq, zzegu {
        zzdob zze = this.zzc.zze(new zzcrp(zzfcaVar, zzfboVar, zzeczVar.zza), new zzdoc(new zzdgc() { // from class: com.google.android.gms.internal.ads.zzehv
            @Override // com.google.android.gms.internal.ads.zzdgc
            public final void zza(boolean z, Context context, zzcwg zzcwgVar) {
                zzecz zzeczVar2 = zzecz.this;
                try {
                    ((zzfdh) zzeczVar2.zzb).zzv(z);
                    ((zzfdh) zzeczVar2.zzb).zzA();
                } catch (zzfcq e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot show rewarded video.", e);
                    throw new zzdgb(e.getCause());
                }
            }
        }));
        zze.zzd().zzo(new zzcma((zzfdh) zzeczVar.zzb), this.zzb);
        zzcxa zze2 = zze.zze();
        zzcvr zzb = zze.zzb();
        ((zzeet) zzeczVar.zzc).zzc(new zzehy(this, zze.zza(), zzb, zze2, zze.zzg()));
        return zze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzb(zzfca zzfcaVar, zzfbo zzfboVar, zzecz zzeczVar) throws zzfcq {
        if (!((zzfdh) zzeczVar.zzb).zzC()) {
            ((zzeet) zzeczVar.zzc).zzd(new zzehx(this, zzfcaVar, zzfboVar, zzeczVar));
            Object obj = zzeczVar.zzb;
            Context context = this.zza;
            zzfcj zzfcjVar = zzfcaVar.zza.zza;
            String jSONObject = zzfboVar.zzv.toString();
            ((zzfdh) obj).zzh(context, zzfcjVar.zzd, null, (zzbwh) zzeczVar.zzc, jSONObject);
            return;
        }
        zze(zzfcaVar, zzfboVar, zzeczVar);
    }
}
