package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcnn implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzcnn(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton;
        zzcnh zzcnhVar = (zzcnh) this.zza.zzb();
        zzgcs zzc = zzffh.zzc();
        if (((JSONObject) this.zzb.zzb()) == null) {
            singleton = Collections.emptySet();
        } else {
            singleton = Collections.singleton(new zzddk(zzcnhVar, zzc));
        }
        zzhez.zzb(singleton);
        return singleton;
    }
}
