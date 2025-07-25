package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzez extends zzdg {
    private final String zza;
    private final String zzb;

    public zzez(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zze() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzf() throws RemoteException {
        return this.zzb;
    }
}
