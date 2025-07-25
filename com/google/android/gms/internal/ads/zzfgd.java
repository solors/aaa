package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfgd {
    final /* synthetic */ zzfgf zza;
    private final Object zzb;
    @Nullable
    private final String zzc;
    private final ListenableFuture zzd;
    private final List zze;
    private final ListenableFuture zzf;

    /* JADX INFO: Access modifiers changed from: private */
    public zzfgd(zzfgf zzfgfVar, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2) {
        this.zza = zzfgfVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = listenableFuture;
        this.zze = list;
        this.zzf = listenableFuture2;
    }

    public final zzfft zza() {
        zzfgg zzfggVar;
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        final zzfft zzfftVar = new zzfft(obj, str, this.zzf);
        zzfggVar = this.zza.zzd;
        zzfggVar.zza(zzfftVar);
        ListenableFuture listenableFuture = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgb
            {
                zzfgd.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzfgg zzfggVar2;
                zzfggVar2 = zzfgd.this.zza.zzd;
                zzfggVar2.zzc(zzfftVar);
            }
        };
        zzgcs zzgcsVar = zzbzw.zzg;
        listenableFuture.addListener(runnable, zzgcsVar);
        zzgch.zzr(zzfftVar, new zzfgc(this, zzfftVar), zzgcsVar);
        return zzfftVar;
    }

    public final zzfgd zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfgd zzc(Class cls, zzgbo zzgboVar) {
        zzgcs zzgcsVar;
        zzgcsVar = this.zza.zzb;
        return new zzfgd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgch.zzf(this.zzf, cls, zzgboVar, zzgcsVar));
    }

    public final zzfgd zzd(final ListenableFuture listenableFuture) {
        return zzg(new zzgbo() { // from class: com.google.android.gms.internal.ads.zzfga
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final ListenableFuture zza(Object obj) {
                return listenableFuture;
            }
        }, zzbzw.zzg);
    }

    public final zzfgd zze(final zzffr zzffrVar) {
        return zzf(new zzgbo() { // from class: com.google.android.gms.internal.ads.zzffz
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final ListenableFuture zza(Object obj) {
                return zzgch.zzh(zzffr.this.zza(obj));
            }
        });
    }

    public final zzfgd zzf(zzgbo zzgboVar) {
        zzgcs zzgcsVar;
        zzgcsVar = this.zza.zzb;
        return zzg(zzgboVar, zzgcsVar);
    }

    public final zzfgd zzg(zzgbo zzgboVar, Executor executor) {
        return new zzfgd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgch.zzn(this.zzf, zzgboVar, executor));
    }

    public final zzfgd zzh(String str) {
        return new zzfgd(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfgd zzi(long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zza.zzc;
        return new zzfgd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgch.zzo(this.zzf, j, timeUnit, scheduledExecutorService));
    }
}
