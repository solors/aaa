package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzhem {
    final LinkedHashMap zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhem(int i) {
        this.zza = zzheo.zzb(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzhem zza(Object obj, zzhfa zzhfaVar) {
        zzhez.zza(obj, "key");
        zzhez.zza(zzhfaVar, IronSourceConstants.EVENTS_PROVIDER);
        this.zza.put(obj, zzhfaVar);
        return this;
    }
}
