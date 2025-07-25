package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zztc implements zzsd {
    private final MediaCodec zza;
    @Nullable
    private final zzrz zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zztc(MediaCodec mediaCodec, zzrz zzrzVar, zztb zztbVar) {
        this.zza = mediaCodec;
        this.zzb = zzrzVar;
        if (zzei.zza >= 35 && zzrzVar != null) {
            zzrzVar.zza(mediaCodec);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final int zza() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final MediaFormat zzc() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    @Nullable
    public final ByteBuffer zzf(int i) {
        return this.zza.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    @Nullable
    public final ByteBuffer zzg(int i) {
        return this.zza.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    @RequiresApi(35)
    public final void zzi() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzj() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzk(int i, int i2, int i3, long j, int i4) {
        this.zza.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzl(int i, int i2, zzhe zzheVar, long j, int i3) {
        this.zza.queueSecureInputBuffer(i, 0, zzheVar.zza(), j, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzm() {
        zzrz zzrzVar;
        zzrz zzrzVar2;
        try {
            int i = zzei.zza;
            if (i >= 30 && i < 33) {
                this.zza.stop();
            }
            if (i >= 35 && (zzrzVar2 = this.zzb) != null) {
                zzrzVar2.zzc(this.zza);
            }
            this.zza.release();
        } catch (Throwable th) {
            if (zzei.zza >= 35 && (zzrzVar = this.zzb) != null) {
                zzrzVar.zzc(this.zza);
            }
            this.zza.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzn(int i, long j) {
        this.zza.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzo(int i, boolean z) {
        this.zza.releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    @RequiresApi(23)
    public final void zzp(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzq(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzr(int i) {
        this.zza.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final /* synthetic */ boolean zzs(zzsc zzscVar) {
        return false;
    }
}
