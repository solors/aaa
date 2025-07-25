package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzcim implements zzewp {
    private final zzcih zza;
    private final zzhfa zzb;
    private final zzhfa zzc;
    private final zzhfa zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcim(zzcih zzcihVar, Context context, String str, zzcjm zzcjmVar) {
        zzhfa zzhfaVar;
        zzhfa zzhfaVar2;
        zzhfa zzhfaVar3;
        zzhfa zzhfaVar4;
        zzhfa zzhfaVar5;
        zzhfa zzhfaVar6;
        zzhfa zzhfaVar7;
        zzhfa zzhfaVar8;
        zzhfa zzhfaVar9;
        this.zza = zzcihVar;
        zzher zza = zzhes.zza(context);
        this.zzb = zza;
        zzher zza2 = zzhes.zza(str);
        this.zzc = zza2;
        zzhfaVar = zzcihVar.zzbh;
        zzhfaVar2 = zzcihVar.zzbi;
        zzezh zzezhVar = new zzezh(zza, zzhfaVar, zzhfaVar2);
        this.zzd = zzezhVar;
        zzhfaVar3 = zzcihVar.zzbh;
        zzhfa zzc = zzheq.zzc(new zzexn(zzhfaVar3));
        this.zze = zzc;
        zzhfaVar4 = zzcihVar.zzc;
        zzhfaVar5 = zzcihVar.zzS;
        zzfcl zza3 = zzfcl.zza();
        zzhfaVar6 = zzcihVar.zzl;
        zzhfa zzc2 = zzheq.zzc(new zzexp(zza, zzhfaVar4, zzhfaVar5, zzezhVar, zzc, zza3, zzhfaVar6));
        this.zzf = zzc2;
        zzhfaVar7 = zzcihVar.zzS;
        zzhfaVar8 = zzcihVar.zzl;
        zzhfaVar9 = zzcihVar.zzM;
        this.zzg = zzheq.zzc(new zzexv(zzhfaVar7, zza, zza2, zzc2, zzc, zzhfaVar8, zzhfaVar9));
    }

    @Override // com.google.android.gms.internal.ads.zzewp
    public final zzexu zza() {
        return (zzexu) this.zzg.zzb();
    }
}
