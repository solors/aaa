package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzyy {
    public static final zzyr zza = new zzyr(2, -9223372036854775807L, null);
    public static final zzyr zzb = new zzyr(3, -9223372036854775807L, null);
    private final zzzg zzc = zzze.zza(Executors.newSingleThreadExecutor(new ThreadFactory("ExoPlayer:Loader:ProgressiveMediaPeriod") { // from class: com.google.android.gms.internal.ads.zzeg
        public final /* synthetic */ String zza = "ExoPlayer:Loader:ProgressiveMediaPeriod";

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, this.zza);
        }
    }), new zzdb() { // from class: com.google.android.gms.internal.ads.zzyp
        @Override // com.google.android.gms.internal.ads.zzdb
        public final void zza(Object obj) {
            ((ExecutorService) obj).shutdown();
        }
    });
    @Nullable
    private zzys zzd;
    @Nullable
    private IOException zze;

    public zzyy(String str) {
    }

    public static zzyr zzb(boolean z, long j) {
        return new zzyr(z ? 1 : 0, j, null);
    }

    public final long zza(zzyt zzytVar, zzyq zzyqVar, int i) {
        Looper myLooper = Looper.myLooper();
        zzcw.zzb(myLooper);
        this.zze = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzys(this, myLooper, zzytVar, zzyqVar, i, elapsedRealtime).zzc(0L);
        return elapsedRealtime;
    }

    public final void zzg() {
        zzys zzysVar = this.zzd;
        zzcw.zzb(zzysVar);
        zzysVar.zza(false);
    }

    public final void zzh() {
        this.zze = null;
    }

    public final void zzi(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException == null) {
            zzys zzysVar = this.zzd;
            if (zzysVar != null) {
                zzysVar.zzb(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void zzj(@Nullable zzyu zzyuVar) {
        zzys zzysVar = this.zzd;
        if (zzysVar != null) {
            zzysVar.zza(true);
        }
        this.zzc.execute(new zzyv(zzyuVar));
        this.zzc.zza();
    }

    public final boolean zzk() {
        if (this.zze != null) {
            return true;
        }
        return false;
    }

    public final boolean zzl() {
        if (this.zzd != null) {
            return true;
        }
        return false;
    }
}
