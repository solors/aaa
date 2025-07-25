package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.RequiresApi;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@RequiresApi(24)
/* loaded from: classes5.dex */
final class zzhc {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zza(zzhc zzhcVar, int i, int i2) {
        zzhcVar.zzb.set(i, i2);
        zzhcVar.zza.setPattern(zzhcVar.zzb);
    }
}
