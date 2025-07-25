package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfsv extends zzfro {
    final /* synthetic */ zzfsw zza;
    private final zzftb zzb;

    public zzfsv(zzfsw zzfswVar, zzftb zzftbVar) {
        this.zza = zzfswVar;
        this.zzb = zzftbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrp
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfsz zzc = zzfta.zzc();
        zzc.zzb(i);
        if (string != null) {
            zzc.zza(string);
        }
        this.zzb.zza(zzc.zzc());
        if (i == 8157) {
            this.zza.zza();
        }
    }
}
