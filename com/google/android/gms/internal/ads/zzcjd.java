package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzcjd implements zzezu {
    private final zzcih zza;
    private final zzhfa zzb;
    private final zzhfa zzc;
    private final zzhfa zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcjd(zzcih zzcihVar, Context context, String str, com.google.android.gms.ads.internal.client.zzs zzsVar, zzcjm zzcjmVar) {
        zzhfa zzhfaVar;
        zzhfa zzhfaVar2;
        zzhfa zzhfaVar3;
        zzhfa zzhfaVar4;
        zzhfa zzhfaVar5;
        zzhfa zzhfaVar6;
        zzhfa zzhfaVar7;
        this.zza = zzcihVar;
        zzher zza = zzhes.zza(context);
        this.zzb = zza;
        zzher zza2 = zzhes.zza(zzsVar);
        this.zzc = zza2;
        zzher zza3 = zzhes.zza(str);
        this.zzd = zza3;
        zzhfaVar = zzcihVar.zzM;
        zzhfa zzc = zzheq.zzc(new zzeko(zzhfaVar));
        this.zze = zzc;
        zzhfaVar2 = zzcihVar.zzbh;
        zzhfa zzc2 = zzheq.zzc(new zzfas(zzhfaVar2));
        this.zzf = zzc2;
        zzhfaVar3 = zzcihVar.zzc;
        zzhfaVar4 = zzcihVar.zzS;
        zzhfa zzc3 = zzheq.zzc(new zzezs(zza, zzhfaVar3, zzhfaVar4, zzc, zzc2, zzfcl.zza()));
        this.zzg = zzc3;
        zzhfaVar5 = zzcihVar.zzl;
        zzhfaVar6 = zzcihVar.zzU;
        zzhfaVar7 = zzcihVar.zzM;
        this.zzh = zzheq.zzc(new zzekw(zza, zza2, zza3, zzc3, zzc, zzc2, zzhfaVar5, zzhfaVar6, zzhfaVar7));
    }

    @Override // com.google.android.gms.internal.ads.zzezu
    public final zzekv zza() {
        return (zzekv) this.zzh.zzb();
    }
}
