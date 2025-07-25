package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
abstract class zzmf<T, B> {
    public abstract int zza(T t);

    abstract B zza();

    public abstract T zza(T t, T t2);

    abstract void zza(B b, int i, int i2);

    abstract void zza(B b, int i, long j);

    public abstract void zza(B b, int i, zzia zziaVar);

    abstract void zza(B b, int i, T t);

    public abstract void zza(T t, zzna zznaVar) throws IOException;

    public abstract boolean zza(zzli zzliVar);

    public final boolean zza(B b, zzli zzliVar) throws IOException {
        int zzd = zzliVar.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                zza((zzmf<T, B>) b, i, zzliVar.zzf());
                                return true;
                            }
                            throw zzjs.zza();
                        }
                        return false;
                    }
                    B zza = zza();
                    int i3 = 4 | (i << 3);
                    while (zzliVar.zzc() != Integer.MAX_VALUE && zza((zzmf<T, B>) zza, zzliVar)) {
                    }
                    if (i3 == zzliVar.zzd()) {
                        zza((zzmf<T, B>) b, i, (int) zze(zza));
                        return true;
                    }
                    throw zzjs.zzb();
                }
                zza((zzmf<T, B>) b, i, zzliVar.zzp());
                return true;
            }
            zza((zzmf<T, B>) b, i, zzliVar.zzk());
            return true;
        }
        zzb(b, i, zzliVar.zzl());
        return true;
    }

    public abstract int zzb(T t);

    public abstract void zzb(B b, int i, long j);

    public abstract void zzb(T t, zzna zznaVar) throws IOException;

    public abstract void zzb(Object obj, B b);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t);

    public abstract T zzd(Object obj);

    abstract T zze(B b);

    public abstract void zzf(Object obj);
}
