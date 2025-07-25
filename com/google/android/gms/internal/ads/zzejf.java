package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzejf {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdpm zzb;

    public zzejf(zzdpm zzdpmVar) {
        this.zzb = zzdpmVar;
    }

    public final zzbrd zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbrd) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e);
        }
    }
}
