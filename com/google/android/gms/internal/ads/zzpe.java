package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzpe {
    @Nullable
    private final Handler zza;
    @Nullable
    private final zzpf zzb;

    public zzpe(@Nullable Handler handler, @Nullable zzpf zzpfVar) {
        this.zza = zzpfVar == null ? null : handler;
        this.zzb = zzpfVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoy
                {
                    zzpe.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzj(exc);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoz
                {
                    zzpe.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzk(exc);
                }
            });
        }
    }

    public final void zzc(final zzpg zzpgVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzow
                {
                    zzpe.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzl(zzpgVar);
                }
            });
        }
    }

    public final void zzd(final zzpg zzpgVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzox
                {
                    zzpe.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzm(zzpgVar);
                }
            });
        }
    }

    public final void zze(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpc
                {
                    zzpe.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzn(str, j, j2);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpd
                {
                    zzpe.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzo(str);
                }
            });
        }
    }

    public final void zzg(final zzhs zzhsVar) {
        zzhsVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzot
                {
                    zzpe.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzp(zzhsVar);
                }
            });
        }
    }

    public final void zzh(final zzhs zzhsVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzos
                {
                    zzpe.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzq(zzhsVar);
                }
            });
        }
    }

    public final void zzi(final zzab zzabVar, @Nullable final zzht zzhtVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpa
                {
                    zzpe.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzr(zzabVar, zzhtVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(Exception exc) {
        int i = zzei.zza;
        this.zzb.zza(exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(Exception exc) {
        int i = zzei.zza;
        this.zzb.zzh(exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzpg zzpgVar) {
        int i = zzei.zza;
        this.zzb.zzi(zzpgVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(zzpg zzpgVar) {
        int i = zzei.zza;
        this.zzb.zzj(zzpgVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(String str, long j, long j2) {
        int i = zzei.zza;
        this.zzb.zzb(str, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(String str) {
        int i = zzei.zza;
        this.zzb.zzc(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(zzhs zzhsVar) {
        zzhsVar.zza();
        int i = zzei.zza;
        this.zzb.zzd(zzhsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(zzhs zzhsVar) {
        int i = zzei.zza;
        this.zzb.zze(zzhsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzr(zzab zzabVar, zzht zzhtVar) {
        int i = zzei.zza;
        this.zzb.zzf(zzabVar, zzhtVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzs(long j) {
        int i = zzei.zza;
        this.zzb.zzg(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzt(boolean z) {
        int i = zzei.zza;
        this.zzb.zzn(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzu(int i, long j, long j2) {
        int i2 = zzei.zza;
        this.zzb.zzk(i, j, j2);
    }

    public final void zzv(final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzou
                {
                    zzpe.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzs(j);
                }
            });
        }
    }

    public final void zzw(final boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpb
                {
                    zzpe.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzt(z);
                }
            });
        }
    }

    public final void zzx(final int i, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzov
                {
                    zzpe.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzpe.this.zzu(i, j, j2);
                }
            });
        }
    }
}
