package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbsr {
    private final NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;
    @Nullable
    private final NativeCustomFormatAd.OnCustomClickListener zzb;
    @Nullable
    @GuardedBy("this")
    private NativeCustomFormatAd zzc;

    public zzbsr(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, @Nullable NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomFormatAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    public final synchronized NativeCustomFormatAd zzf(zzbgq zzbgqVar) {
        NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        zzbss zzbssVar = new zzbss(zzbgqVar);
        this.zzc = zzbssVar;
        return zzbssVar;
    }

    @Nullable
    public final zzbha zza() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbso(this, null);
    }

    public final zzbhd zzb() {
        return new zzbsp(this, null);
    }
}
