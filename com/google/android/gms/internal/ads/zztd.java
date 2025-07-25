package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@RequiresApi(23)
/* loaded from: classes5.dex */
public final class zztd implements zzse {
    private final MediaCodec zza;

    public zztd(MediaCodec mediaCodec) {
        this.zza = mediaCodec;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzd(int i, int i2, int i3, long j, int i4) {
        this.zza.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zze(int i, int i2, zzhe zzheVar, long j, int i3) {
        this.zza.queueSecureInputBuffer(i, 0, zzheVar.zza(), j, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzf(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzh() {
    }
}
