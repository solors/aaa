package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzcjf implements zzfbi {
    private final zzcih zza;
    private final zzhfa zzb;
    private final zzhfa zzc;
    private final zzhfa zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;
    private final zzhfa zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcjf(zzcih zzcihVar, Context context, String str, zzcjm zzcjmVar) {
        zzhfa zzhfaVar;
        zzhfa zzhfaVar2;
        zzhfa zzhfaVar3;
        zzhfa zzhfaVar4;
        zzhfa zzhfaVar5;
        zzhfa zzhfaVar6;
        zzhfa zzhfaVar7;
        zzhfa zzhfaVar8;
        this.zza = zzcihVar;
        zzher zza = zzhes.zza(context);
        this.zzb = zza;
        zzhfaVar = zzcihVar.zzbh;
        zzhfaVar2 = zzcihVar.zzbi;
        zzezi zzeziVar = new zzezi(zza, zzhfaVar, zzhfaVar2);
        this.zzc = zzeziVar;
        zzhfaVar3 = zzcihVar.zzbh;
        zzhfa zzc = zzheq.zzc(new zzfas(zzhfaVar3));
        this.zzd = zzc;
        zzhfa zzc2 = zzheq.zzc(zzfcg.zza());
        this.zze = zzc2;
        zzhfaVar4 = zzcihVar.zzc;
        zzhfaVar5 = zzcihVar.zzS;
        zzhfa zzc3 = zzheq.zzc(new zzfbc(zza, zzhfaVar4, zzhfaVar5, zzeziVar, zzc, zzfcl.zza(), zzc2));
        this.zzf = zzc3;
        this.zzg = zzheq.zzc(new zzfbm(zzc3, zzc, zzc2));
        zzher zzc4 = zzhes.zzc(str);
        this.zzh = zzc4;
        zzhfaVar6 = zzcihVar.zzl;
        zzhfaVar7 = zzcihVar.zzU;
        zzhfaVar8 = zzcihVar.zzM;
        this.zzi = zzheq.zzc(new zzfbg(zzc4, zzc3, zza, zzc, zzc2, zzhfaVar6, zzhfaVar7, zzhfaVar8));
    }

    @Override // com.google.android.gms.internal.ads.zzfbi
    public final zzfbf zza() {
        return (zzfbf) this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfbi
    public final zzfbl zzb() {
        return (zzfbl) this.zzg.zzb();
    }
}
