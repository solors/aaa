package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@RequiresApi(35)
/* loaded from: classes5.dex */
public final class zzrz {
    private final HashSet zza;
    @Nullable
    private LoudnessCodecController zzb;

    public zzrz() {
        throw null;
    }

    public final void zza(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        zzcw.zzf(this.zza.add(mediaCodec));
    }

    public final void zzb() {
        this.zza.clear();
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void zzc(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.zza.remove(mediaCodec) && (loudnessCodecController = this.zzb) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void zzd(int i) {
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.zzb = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i, zzgcz.zzc(), new zzrw(this));
        this.zzb = create;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public zzrz(zzry zzryVar) {
        this.zza = new HashSet();
    }
}
