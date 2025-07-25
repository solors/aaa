package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes5.dex */
public final class zzdm implements zzdq {
    private static final Object zza = new Object();
    private volatile zzdq zzb;
    private volatile Object zzc = zza;

    private zzdm(zzdq zzdqVar) {
        this.zzb = zzdqVar;
    }

    public static zzdq zzb(zzdq zzdqVar) {
        if (zzdqVar instanceof zzdm) {
            return zzdqVar;
        }
        return new zzdm(zzdqVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zza() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.zzc;
                if (obj == obj2) {
                    obj = this.zzb.zza();
                    Object obj3 = this.zzc;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = obj;
                    this.zzb = null;
                }
            }
        }
        return obj;
    }
}
