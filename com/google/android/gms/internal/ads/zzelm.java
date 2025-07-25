package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzelm implements zzetq {
    private final boolean zza;

    public zzelm(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str;
        Bundle bundle = ((zzcuv) obj).zza;
        if (true != this.zza) {
            str = "0";
        } else {
            str = "1";
        }
        bundle.putString("adid_p", str);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }
}
