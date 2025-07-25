package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzful implements Serializable {
    public static zzful zzc() {
        return zzftr.zza;
    }

    public static zzful zzd(Object obj) {
        if (obj == null) {
            return zzftr.zza;
        }
        return new zzfus(obj);
    }

    public abstract zzful zza(zzfuc zzfucVar);

    public abstract Object zzb(Object obj);
}
