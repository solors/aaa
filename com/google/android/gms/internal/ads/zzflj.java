package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzflj extends zzflm {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzflj zzb = new zzflj();

    private zzflj() {
    }

    public static zzflj zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzflm
    public final void zzb(boolean z) {
        for (zzfkt zzfktVar : zzflk.zza().zzc()) {
            zzfktVar.zzg().zzk(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflm
    public final boolean zzc() {
        for (zzfkt zzfktVar : zzflk.zza().zzb()) {
            View zzf = zzfktVar.zzf();
            if (zzf != null && zzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
