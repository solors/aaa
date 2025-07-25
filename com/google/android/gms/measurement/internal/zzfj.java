package com.google.android.gms.measurement.internal;

import androidx.annotation.GuardedBy;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzfj<V> {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzfh<V> zzc;
    private final V zzd;
    private final Object zze;
    @GuardedBy("overrideLock")
    private volatile V zzf;
    @GuardedBy("cachingLock")
    private volatile V zzg;

    public final V zza(V v) {
        synchronized (this.zze) {
        }
        if (v != null) {
            return v;
        }
        if (zzfk.zza == null) {
            return this.zzd;
        }
        synchronized (zza) {
            if (zzab.zza()) {
                return this.zzg == null ? this.zzd : this.zzg;
            }
            try {
                for (zzfj zzfjVar : zzbf.zzcy()) {
                    if (!zzab.zza()) {
                        V v2 = null;
                        try {
                            zzfh<V> zzfhVar = zzfjVar.zzc;
                            if (zzfhVar != null) {
                                v2 = zzfhVar.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (zza) {
                            zzfjVar.zzg = v2;
                        }
                    } else {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                }
            } catch (SecurityException unused2) {
            }
            zzfh<V> zzfhVar2 = this.zzc;
            if (zzfhVar2 == null) {
                return this.zzd;
            }
            try {
                return zzfhVar2.zza();
            } catch (IllegalStateException unused3) {
                return this.zzd;
            } catch (SecurityException unused4) {
                return this.zzd;
            }
        }
    }

    private zzfj(String str, V v, V v2, zzfh<V> zzfhVar, boolean z) {
        this.zze = new Object();
        this.zzf = null;
        this.zzg = null;
        this.zzb = str;
        this.zzd = v;
        this.zzc = zzfhVar;
    }

    public final String zza() {
        return this.zzb;
    }
}
