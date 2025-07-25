package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzcir implements zzeyd {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzs zzb;
    private final String zzc;
    private final zzcih zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;
    private final zzhfa zzi;
    private final zzhfa zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcir(zzcih zzcihVar, Context context, String str, com.google.android.gms.ads.internal.client.zzs zzsVar, zzcjm zzcjmVar) {
        zzhfa zzhfaVar;
        zzhfa zzhfaVar2;
        zzhfa zzhfaVar3;
        this.zzd = zzcihVar;
        this.zza = context;
        this.zzb = zzsVar;
        this.zzc = str;
        zzher zza = zzhes.zza(context);
        this.zze = zza;
        zzher zza2 = zzhes.zza(zzsVar);
        this.zzf = zza2;
        zzhfaVar = zzcihVar.zzM;
        zzhfa zzc = zzheq.zzc(new zzeko(zzhfaVar));
        this.zzg = zzc;
        zzhfa zzc2 = zzheq.zzc(zzekt.zza());
        this.zzh = zzc2;
        zzhfa zzc3 = zzheq.zzc(zzdat.zza());
        this.zzi = zzc3;
        zzhfaVar2 = zzcihVar.zzc;
        zzhfaVar3 = zzcihVar.zzS;
        this.zzj = zzheq.zzc(new zzeyb(zza, zzhfaVar2, zza2, zzhfaVar3, zzc, zzc2, zzfcl.zza(), zzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzeyd
    public final zzejt zza() {
        zzcha zzchaVar;
        zzhfa zzhfaVar;
        zzeya zzeyaVar = (zzeya) this.zzj.zzb();
        zzekn zzeknVar = (zzekn) this.zzg.zzb();
        zzchaVar = this.zzd.zza;
        VersionInfoParcel zzc = zzchs.zzc(zzchaVar);
        zzhfaVar = this.zzd.zzM;
        return new zzejt(this.zza, this.zzb, this.zzc, zzeyaVar, zzeknVar, zzc, (zzdrw) zzhfaVar.zzb());
    }
}
