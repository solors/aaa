package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbyc extends zzbyj {
    private final Clock zzb;
    private final zzhfa zzc;
    private final zzhfa zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;
    private final zzhfa zzi;
    private final zzhfa zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbyc(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbyi zzbyiVar, zzbyd zzbydVar) {
        this.zzb = clock;
        zzher zza = zzhes.zza(context);
        this.zzc = zza;
        zzher zza2 = zzhes.zza(zzgVar);
        this.zzd = zza2;
        this.zze = zzheq.zzc(new zzbxw(zza, zza2));
        zzher zza3 = zzhes.zza(clock);
        this.zzf = zza3;
        zzher zza4 = zzhes.zza(zzbyiVar);
        this.zzg = zza4;
        zzhfa zzc = zzheq.zzc(new zzbxy(zza3, zza2, zza4));
        this.zzh = zzc;
        zzbya zzbyaVar = new zzbya(zza3, zzc);
        this.zzi = zzbyaVar;
        this.zzj = zzheq.zzc(new zzbyo(zza, zzbyaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    final zzbxv zza() {
        return (zzbxv) this.zze.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbyj
    public final zzbxz zzb() {
        return new zzbxz(this.zzb, (zzbxx) this.zzh.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    final zzbyn zzc() {
        return (zzbyn) this.zzj.zzb();
    }
}
