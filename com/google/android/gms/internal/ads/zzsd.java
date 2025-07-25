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
public interface zzsd {
    int zza();

    int zzb(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzc();

    @Nullable
    ByteBuffer zzf(int i);

    @Nullable
    ByteBuffer zzg(int i);

    @RequiresApi(35)
    void zzi();

    void zzj();

    void zzk(int i, int i2, int i3, long j, int i4);

    void zzl(int i, int i2, zzhe zzheVar, long j, int i3);

    void zzm();

    void zzn(int i, long j);

    void zzo(int i, boolean z);

    @RequiresApi(23)
    void zzp(Surface surface);

    void zzq(Bundle bundle);

    void zzr(int i);

    boolean zzs(zzsc zzscVar);
}
