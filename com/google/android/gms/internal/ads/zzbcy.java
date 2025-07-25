package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@Deprecated
/* loaded from: classes5.dex */
public final class zzbcy {
    private final Map zza = new HashMap();
    private final zzbda zzb;

    public zzbcy(zzbda zzbdaVar) {
        this.zzb = zzbdaVar;
    }

    public final zzbda zza() {
        return this.zzb;
    }

    public final void zzb(String str, @Nullable zzbcx zzbcxVar) {
        this.zza.put(str, zzbcxVar);
    }

    public final void zzc(String str, String str2, long j) {
        zzbcx zzbcxVar = (zzbcx) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbcxVar != null) {
            this.zzb.zze(zzbcxVar, j, strArr);
        }
        this.zza.put(str, new zzbcx(j, null, null));
    }
}
