package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public interface zzpm {
    boolean zzA(zzab zzabVar);

    int zza(zzab zzabVar);

    long zzb(boolean z);

    zzbe zzc();

    zzor zzd(zzab zzabVar);

    void zze(zzab zzabVar, int i, @Nullable int[] iArr) throws zzph;

    void zzf();

    void zzg();

    void zzh();

    void zzi();

    void zzj() throws zzpl;

    void zzk();

    void zzl();

    void zzm(zze zzeVar);

    void zzn(int i);

    void zzo(zzf zzfVar);

    void zzp(zzcx zzcxVar);

    void zzq(zzpj zzpjVar);

    @RequiresApi(29)
    void zzr(int i, int i2);

    void zzs(zzbe zzbeVar);

    void zzt(@Nullable zzog zzogVar);

    @RequiresApi(23)
    void zzu(@Nullable AudioDeviceInfo audioDeviceInfo);

    void zzv(boolean z);

    void zzw(float f);

    boolean zzx(ByteBuffer byteBuffer, long j, int i) throws zzpi, zzpl;

    boolean zzy();

    boolean zzz();
}
