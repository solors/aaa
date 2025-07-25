package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzaff extends zzada {
    final /* synthetic */ zzadm zza;
    final /* synthetic */ zzafg zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaff(zzafg zzafgVar, zzadm zzadmVar, zzadm zzadmVar2) {
        super(zzadmVar);
        this.zza = zzadmVar2;
        this.zzb = zzafgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzada, com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        long j2;
        long j3;
        zzadk zzg = this.zza.zzg(j);
        zzadn zzadnVar = zzg.zza;
        long j4 = zzadnVar.zzc;
        j2 = this.zzb.zzb;
        zzadn zzadnVar2 = new zzadn(zzadnVar.zzb, j4 + j2);
        zzadn zzadnVar3 = zzg.zzb;
        long j5 = zzadnVar3.zzc;
        j3 = this.zzb.zzb;
        return new zzadk(zzadnVar2, new zzadn(zzadnVar3.zzb, j5 + j3));
    }
}
