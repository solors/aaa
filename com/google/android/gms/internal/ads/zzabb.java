package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzabb {
    @Nullable
    private final Handler zza;
    @Nullable
    private final zzabc zzb;

    public zzabb(@Nullable Handler handler, @Nullable zzabc zzabcVar) {
        this.zza = zzabcVar == null ? null : handler;
        this.zzb = zzabcVar;
    }

    public final void zza(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaar
                {
                    zzabb.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzabb.this.zzg(str, j, j2);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaba
                {
                    zzabb.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzabb.this.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzhs zzhsVar) {
        zzhsVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaz
                {
                    zzabb.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzabb.this.zzi(zzhsVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaat
                {
                    zzabb.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzabb.this.zzj(i, j);
                }
            });
        }
    }

    public final void zze(final zzhs zzhsVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaax
                {
                    zzabb.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzabb.this.zzk(zzhsVar);
                }
            });
        }
    }

    public final void zzf(final zzab zzabVar, @Nullable final zzht zzhtVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaay
                {
                    zzabb.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzabb.this.zzl(zzabVar, zzhtVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(String str, long j, long j2) {
        int i = zzei.zza;
        this.zzb.zzp(str, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(String str) {
        int i = zzei.zza;
        this.zzb.zzq(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(zzhs zzhsVar) {
        zzhsVar.zza();
        int i = zzei.zza;
        this.zzb.zzr(zzhsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(int i, long j) {
        int i2 = zzei.zza;
        this.zzb.zzl(i, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(zzhs zzhsVar) {
        int i = zzei.zza;
        this.zzb.zzs(zzhsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzab zzabVar, zzht zzhtVar) {
        int i = zzei.zza;
        this.zzb.zzu(zzabVar, zzhtVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(Object obj, long j) {
        int i = zzei.zza;
        this.zzb.zzm(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(long j, int i) {
        int i2 = zzei.zza;
        this.zzb.zzt(j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(Exception exc) {
        int i = zzei.zza;
        this.zzb.zzo(exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(zzcd zzcdVar) {
        int i = zzei.zza;
        this.zzb.zzv(zzcdVar);
    }

    public final void zzq(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaau
                {
                    zzabb.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzabb.this.zzm(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaav
                {
                    zzabb.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzabb.this.zzn(j, i);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaw
                {
                    zzabb.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzabb.this.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzcd zzcdVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaas
                {
                    zzabb.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzabb.this.zzp(zzcdVar);
                }
            });
        }
    }
}
