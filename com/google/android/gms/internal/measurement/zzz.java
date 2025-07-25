package com.google.android.gms.internal.measurement;

import com.google.common.annotations.VisibleForTesting;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzz extends zzal {
    private final zzl zzk;
    @VisibleForTesting
    private final Map<String, zzal> zzl;

    public zzz(zzl zzlVar) {
        super("require");
        this.zzl = new HashMap();
        this.zzk = zzlVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        zzg.zza("require", 1, list);
        String zzf = zzhVar.zza(list.get(0)).zzf();
        if (this.zzl.containsKey(zzf)) {
            return this.zzl.get(zzf);
        }
        zzaq zza = this.zzk.zza(zzf);
        if (zza instanceof zzal) {
            this.zzl.put(zzf, (zzal) zza);
        }
        return zza;
    }
}
