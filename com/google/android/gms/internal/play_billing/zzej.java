package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes5.dex */
public final class zzej {
    static final zzej zza = new zzej(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzej zzd;
    private final Map zze;

    zzej() {
        this.zze = new HashMap();
    }

    public static zzej zza() {
        zzej zzejVar = zzd;
        if (zzejVar != null) {
            return zzejVar;
        }
        synchronized (zzej.class) {
            zzej zzejVar2 = zzd;
            if (zzejVar2 != null) {
                return zzejVar2;
            }
            zzej zzb2 = zzer.zzb(zzej.class);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final zzev zzb(zzgc zzgcVar, int i) {
        return (zzev) this.zze.get(new zzei(zzgcVar, i));
    }

    zzej(boolean z) {
        this.zze = Collections.emptyMap();
    }
}
