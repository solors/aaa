package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbog {
    @VisibleForTesting
    static final com.google.android.gms.ads.internal.util.zzbd zza = new zzboe();
    @VisibleForTesting
    static final com.google.android.gms.ads.internal.util.zzbd zzb = new zzbof();
    private final zzbns zzc;

    public zzbog(Context context, VersionInfoParcel versionInfoParcel, String str, zzfhk zzfhkVar) {
        this.zzc = new zzbns(context, versionInfoParcel, str, zza, zzb, zzfhkVar);
    }

    public final zzbnw zza(String str, zzbnz zzbnzVar, zzbny zzbnyVar) {
        return new zzbok(this.zzc, str, zzbnzVar, zzbnyVar);
    }

    public final zzbop zzb() {
        return new zzbop(this.zzc);
    }
}
