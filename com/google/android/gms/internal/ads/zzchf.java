package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzchf implements zzher {
    private final zzcha zza;

    public zzchf(zzcha zzchaVar) {
        this.zza = zzchaVar;
    }

    public static WeakReference zzc(zzcha zzchaVar) {
        WeakReference zzg = zzchaVar.zzg();
        zzhez.zzb(zzg);
        return zzg;
    }

    public final WeakReference zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
