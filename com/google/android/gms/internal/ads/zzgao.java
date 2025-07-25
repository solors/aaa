package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgao implements Serializable {
    private final int[] zza;
    private final int zzb;

    private zzgao(int[] iArr, int i, int i2) {
        this.zza = iArr;
        this.zzb = i2;
    }

    public static zzgao zzb(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzgao(copyOf, 0, copyOf.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgao)) {
            return false;
        }
        zzgao zzgaoVar = (zzgao) obj;
        if (this.zzb != zzgaoVar.zzb) {
            return false;
        }
        for (int i = 0; i < this.zzb; i++) {
            if (zza(i) != zzgaoVar.zza(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            i = (i * 31) + this.zza[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.zzb;
        if (i != 0) {
            StringBuilder sb2 = new StringBuilder(i * 5);
            sb2.append('[');
            sb2.append(this.zza[0]);
            for (int i2 = 1; i2 < this.zzb; i2++) {
                sb2.append(", ");
                sb2.append(this.zza[i2]);
            }
            sb2.append(']');
            return sb2.toString();
        }
        return "[]";
    }

    public final int zza(int i) {
        zzfun.zza(i, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zza[i];
    }
}
