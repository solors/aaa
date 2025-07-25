package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfek {
    private final HashMap zza = new HashMap();

    public final zzfej zza(zzfea zzfeaVar, Context context, zzfds zzfdsVar, zzfeq zzfeqVar) {
        zzfej zzfejVar = (zzfej) this.zza.get(zzfeaVar);
        if (zzfejVar == null) {
            zzfdx zzfdxVar = new zzfdx(zzfed.zza(zzfeaVar, context));
            zzfej zzfejVar2 = new zzfej(zzfdxVar, new zzfes(zzfdxVar, zzfdsVar, zzfeqVar));
            this.zza.put(zzfeaVar, zzfejVar2);
            return zzfejVar2;
        }
        return zzfejVar;
    }
}
