package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzed implements zzdh {
    @GuardedBy("messagePool")
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzed(Handler handler) {
        this.zzb = handler;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzeb zzebVar) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzebVar);
            }
        }
    }

    private static zzeb zzm() {
        zzeb zzebVar;
        List list = zza;
        synchronized (list) {
            if (list.isEmpty()) {
                zzebVar = new zzeb(null);
            } else {
                zzebVar = (zzeb) list.remove(list.size() - 1);
            }
        }
        return zzebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final zzdg zzb(int i) {
        Handler handler = this.zzb;
        zzeb zzm = zzm();
        zzm.zzb(handler.obtainMessage(i), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final zzdg zzc(int i, @Nullable Object obj) {
        Handler handler = this.zzb;
        zzeb zzm = zzm();
        zzm.zzb(handler.obtainMessage(i, obj), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final zzdg zzd(int i, int i2, int i3) {
        Handler handler = this.zzb;
        zzeb zzm = zzm();
        zzm.zzb(handler.obtainMessage(1, i2, i3), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final void zze(@Nullable Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final void zzf(int i) {
        this.zzb.removeMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final boolean zzg(int i) {
        return this.zzb.hasMessages(1);
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final boolean zzh(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final boolean zzi(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final boolean zzj(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final boolean zzk(zzdg zzdgVar) {
        return ((zzeb) zzdgVar).zzc(this.zzb);
    }
}
