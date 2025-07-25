package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzts {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private zzfx zzc;

    public zzts(zzacs zzacsVar, zzakd zzakdVar) {
    }

    public final void zza(zzfx zzfxVar) {
        if (zzfxVar != this.zzc) {
            this.zzc = zzfxVar;
            this.zza.clear();
            this.zzb.clear();
        }
    }
}
