package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzfmv extends zzfmw {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfmv(zzfmo zzfmoVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfmoVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j;
    }
}
