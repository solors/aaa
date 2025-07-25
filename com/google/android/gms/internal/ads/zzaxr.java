package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzaxr implements Callable {
    protected final zzawd zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzasc zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzaxr(zzawd zzawdVar, String str, String str2, zzasc zzascVar, int i, int i2) {
        this.zza = zzawdVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzascVar;
        this.zzf = i;
        this.zzg = i2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzk() throws Exception {
        int i;
        try {
            long nanoTime = System.nanoTime();
            Method zzj = this.zza.zzj(this.zzb, this.zzc);
            this.zze = zzj;
            if (zzj != null) {
                zza();
                zzauu zzd = this.zza.zzd();
                if (zzd != null && (i = this.zzf) != Integer.MIN_VALUE) {
                    zzd.zzc(this.zzg, i, (System.nanoTime() - nanoTime) / 1000, null, null);
                    return null;
                }
                return null;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
