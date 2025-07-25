package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzajg implements zzadm {
    final /* synthetic */ zzaji zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzajg(zzaji zzajiVar, zzajh zzajhVar) {
        this.zza = zzajiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        zzajt zzajtVar;
        long j;
        zzaji zzajiVar = this.zza;
        zzajtVar = zzajiVar.zzd;
        j = zzajiVar.zzf;
        return zzajtVar.zzf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        zzajt zzajtVar;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        zzaji zzajiVar = this.zza;
        zzajtVar = zzajiVar.zzd;
        long zzg = zzajtVar.zzg(j);
        j2 = zzajiVar.zzb;
        BigInteger valueOf = BigInteger.valueOf(zzg);
        zzaji zzajiVar2 = this.zza;
        j3 = zzajiVar2.zzc;
        j4 = zzajiVar2.zzb;
        BigInteger multiply = valueOf.multiply(BigInteger.valueOf(j3 - j4));
        j5 = this.zza.zzf;
        long longValue = j2 + multiply.divide(BigInteger.valueOf(j5)).longValue();
        zzaji zzajiVar3 = this.zza;
        j6 = zzajiVar3.zzb;
        j7 = zzajiVar3.zzc;
        zzadn zzadnVar = new zzadn(j, Math.max(j6, Math.min(longValue - 30000, j7 - 1)));
        return new zzadk(zzadnVar, zzadnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}
