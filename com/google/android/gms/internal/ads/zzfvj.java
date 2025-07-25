package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfvj {
    public static zzfvf zza(zzfvf zzfvfVar) {
        if (!(zzfvfVar instanceof zzfvi) && !(zzfvfVar instanceof zzfvg)) {
            if (zzfvfVar instanceof Serializable) {
                return new zzfvg(zzfvfVar);
            }
            return new zzfvi(zzfvfVar);
        }
        return zzfvfVar;
    }
}
