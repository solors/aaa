package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzws implements zzxv {
    protected final zzbr zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzab[] zzd;
    private int zze;

    public zzws(zzbr zzbrVar, int[] iArr, int i) {
        boolean z;
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        zzbrVar.getClass();
        this.zza = zzbrVar;
        this.zzb = length;
        this.zzd = new zzab[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzd[i2] = zzbrVar.zzb(iArr[i2]);
        }
        Arrays.sort(this.zzd, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwr
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzab) obj2).zzj - ((zzab) obj).zzj;
            }
        });
        this.zzc = new int[this.zzb];
        for (int i3 = 0; i3 < this.zzb; i3++) {
            this.zzc[i3] = zzbrVar.zza(this.zzd[i3]);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzws zzwsVar = (zzws) obj;
            if (this.zza.equals(zzwsVar.zza) && Arrays.equals(this.zzc, zzwsVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i == 0) {
            int identityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
            this.zze = identityHashCode;
            return identityHashCode;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final int zza(int i) {
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final int zzb() {
        return this.zzc[0];
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final int zzc(int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzc[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final int zzd() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final zzab zze(int i) {
        return this.zzd[i];
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final zzab zzf() {
        return this.zzd[0];
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final zzbr zzg() {
        return this.zza;
    }
}
