package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzsa {
    public final zzsg zza;
    public final MediaFormat zzb;
    public final zzab zzc;
    @Nullable
    public final Surface zzd;
    @Nullable
    public final MediaCrypto zze = null;
    @Nullable
    public final zzrz zzf;

    private zzsa(zzsg zzsgVar, MediaFormat mediaFormat, zzab zzabVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, @Nullable zzrz zzrzVar) {
        this.zza = zzsgVar;
        this.zzb = mediaFormat;
        this.zzc = zzabVar;
        this.zzd = surface;
        this.zzf = zzrzVar;
    }

    public static zzsa zza(zzsg zzsgVar, MediaFormat mediaFormat, zzab zzabVar, @Nullable MediaCrypto mediaCrypto, @Nullable zzrz zzrzVar) {
        return new zzsa(zzsgVar, mediaFormat, zzabVar, null, null, zzrzVar);
    }

    public static zzsa zzb(zzsg zzsgVar, MediaFormat mediaFormat, zzab zzabVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
        return new zzsa(zzsgVar, mediaFormat, zzabVar, surface, null, null);
    }
}
