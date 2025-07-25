package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public interface zzcbs extends zzcgj, zzcgm, zzbmk {
    Context getContext();

    void setBackgroundColor(int i);

    void zzA(int i);

    void zzB(int i);

    void zzC(zzcfz zzcfzVar);

    void zzdg();

    int zzf();

    int zzg();

    int zzh();

    @Nullable
    Activity zzi();

    @Nullable
    com.google.android.gms.ads.internal.zza zzj();

    @Nullable
    zzbcx zzk();

    zzbcy zzm();

    VersionInfoParcel zzn();

    @Nullable
    zzcbh zzo();

    @Nullable
    zzcde zzp(String str);

    @Nullable
    zzcfz zzq();

    @Nullable
    String zzr();

    String zzs();

    void zzt(String str, zzcde zzcdeVar);

    void zzv(boolean z, long j);

    void zzw();

    void zzx(int i);

    void zzy(int i);

    void zzz(boolean z);
}
