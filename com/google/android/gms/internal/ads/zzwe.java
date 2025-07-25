package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzwe {
    private int zza;
    private final SparseArray zzb;
    private final zzdb zzc;

    public zzwe() {
        this(new zzdb() { // from class: com.google.android.gms.internal.ads.zzwd
            @Override // com.google.android.gms.internal.ads.zzdb
            public final void zza(Object obj) {
            }
        });
    }

    public final Object zza(int i) {
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i2 = this.zza;
            if (i2 > 0 && i < this.zzb.keyAt(i2)) {
                this.zza--;
            }
        }
        while (this.zza < this.zzb.size() - 1 && i >= this.zzb.keyAt(this.zza + 1)) {
            this.zza++;
        }
        return this.zzb.valueAt(this.zza);
    }

    public final Object zzb() {
        return this.zzb.valueAt(this.zzb.size() - 1);
    }

    public final void zzc(int i, Object obj) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        boolean z;
        boolean z2 = true;
        if (this.zza == -1) {
            if (this.zzb.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            zzcw.zzf(z);
            this.zza = 0;
        }
        if (this.zzb.size() > 0) {
            int keyAt = this.zzb.keyAt(sparseArray.size() - 1);
            if (i < keyAt) {
                z2 = false;
            }
            zzcw.zzd(z2);
            if (keyAt == i) {
                this.zzc.zza(this.zzb.valueAt(sparseArray2.size() - 1));
            }
        }
        this.zzb.append(i, obj);
    }

    public final void zzd() {
        for (int i = 0; i < this.zzb.size(); i++) {
            this.zzc.zza(this.zzb.valueAt(i));
        }
        this.zza = -1;
        this.zzb.clear();
    }

    public final void zze(int i) {
        int i2 = 0;
        while (i2 < this.zzb.size() - 1) {
            int i3 = i2 + 1;
            if (i >= this.zzb.keyAt(i3)) {
                this.zzc.zza(this.zzb.valueAt(i2));
                this.zzb.removeAt(i2);
                int i4 = this.zza;
                if (i4 > 0) {
                    this.zza = i4 - 1;
                }
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public final boolean zzf() {
        if (this.zzb.size() == 0) {
            return true;
        }
        return false;
    }

    public zzwe(zzdb zzdbVar) {
        this.zzb = new SparseArray();
        this.zzc = zzdbVar;
        this.zza = -1;
    }
}
