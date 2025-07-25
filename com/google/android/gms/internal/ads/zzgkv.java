package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgkv {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzgkv() {
    }

    public final zzgkv zza(Enum r2, Object obj) {
        this.zza.put(r2, obj);
        this.zzb.put(obj, r2);
        return this;
    }

    public final zzgkx zzb() {
        return new zzgkx(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgkv(zzgkw zzgkwVar) {
    }
}
