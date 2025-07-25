package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbia {
    private final com.google.android.gms.ads.formats.zzg zza;
    @Nullable
    private final com.google.android.gms.ads.formats.zzf zzb;
    @Nullable
    @GuardedBy("this")
    private zzbgr zzc;

    public zzbia(com.google.android.gms.ads.formats.zzg zzgVar, @Nullable com.google.android.gms.ads.formats.zzf zzfVar) {
        this.zza = zzgVar;
        this.zzb = zzfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzbgr zzf(zzbgq zzbgqVar) {
        zzbgr zzbgrVar = this.zzc;
        if (zzbgrVar != null) {
            return zzbgrVar;
        }
        zzbgr zzbgrVar2 = new zzbgr(zzbgqVar);
        this.zzc = zzbgrVar2;
        return zzbgrVar2;
    }

    @Nullable
    public final zzbha zzc() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbhx(this, null);
    }

    public final zzbhd zzd() {
        return new zzbhy(this, null);
    }
}
