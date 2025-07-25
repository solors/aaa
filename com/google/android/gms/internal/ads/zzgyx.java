package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzgyx {
    public static final boolean zza(Object obj) {
        if (!((zzgyw) obj).zze()) {
            return true;
        }
        return false;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzgyw zzgywVar = (zzgyw) obj;
        zzgyw zzgywVar2 = (zzgyw) obj2;
        if (!zzgywVar2.isEmpty()) {
            if (!zzgywVar.zze()) {
                zzgywVar = zzgywVar.zzb();
            }
            zzgywVar.zzd(zzgywVar2);
        }
        return zzgywVar;
    }
}
