package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes5.dex */
public final class zzdn {
    public static zzdj zza(zzdj zzdjVar) {
        if (!(zzdjVar instanceof zzdl) && !(zzdjVar instanceof zzdk)) {
            if (zzdjVar instanceof Serializable) {
                return new zzdk(zzdjVar);
            }
            return new zzdl(zzdjVar);
        }
        return zzdjVar;
    }

    public static zzdj zzb(Object obj) {
        return new zzdm(obj);
    }
}
