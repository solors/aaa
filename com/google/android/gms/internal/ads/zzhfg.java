package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzhfg implements zzhfa {
    private static final Object zza = new Object();
    private volatile zzhfa zzb;
    private volatile Object zzc = zza;

    private zzhfg(zzhfa zzhfaVar) {
        this.zzb = zzhfaVar;
    }

    public static zzhfa zza(zzhfa zzhfaVar) {
        if (!(zzhfaVar instanceof zzhfg) && !(zzhfaVar instanceof zzheq)) {
            return new zzhfg(zzhfaVar);
        }
        return zzhfaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj == zza) {
            zzhfa zzhfaVar = this.zzb;
            if (zzhfaVar == null) {
                return this.zzc;
            }
            Object zzb = zzhfaVar.zzb();
            this.zzc = zzb;
            this.zzb = null;
            return zzb;
        }
        return obj;
    }
}
