package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgap extends AbstractList implements RandomAccess, Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgap(int[] iArr, int i, int i2) {
        this.zza = iArr;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if ((obj instanceof Integer) && zzgaq.zza(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgap) {
            zzgap zzgapVar = (zzgap) obj;
            int i = this.zzc - this.zzb;
            if (zzgapVar.zzc - zzgapVar.zzb != i) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (this.zza[this.zzb + i2] != zzgapVar.zza[zzgapVar.zzb + i2]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzfun.zza(i, this.zzc - this.zzb, FirebaseAnalytics.Param.INDEX);
        return Integer.valueOf(this.zza[this.zzb + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.zzb; i2 < this.zzc; i2++) {
            i = (i * 31) + this.zza[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int zza;
        if ((obj instanceof Integer) && (zza = zzgaq.zza(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc)) >= 0) {
            return zza - this.zzb;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.zza;
            int intValue = ((Integer) obj).intValue();
            int i = this.zzb;
            int i2 = this.zzc - 1;
            while (true) {
                if (i2 >= i) {
                    if (iArr[i2] == intValue) {
                        break;
                    }
                    i2--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - this.zzb;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        zzfun.zza(i, this.zzc - this.zzb, FirebaseAnalytics.Param.INDEX);
        int[] iArr = this.zza;
        int i2 = this.zzb + i;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc - this.zzb;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        zzfun.zzk(i, i2, this.zzc - this.zzb);
        if (i == i2) {
            return Collections.emptyList();
        }
        int[] iArr = this.zza;
        int i3 = this.zzb;
        return new zzgap(iArr, i3 + i, i2 + i3);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.zzc - this.zzb) * 5);
        sb2.append('[');
        sb2.append(this.zza[this.zzb]);
        int i = this.zzb;
        while (true) {
            i++;
            if (i < this.zzc) {
                sb2.append(", ");
                sb2.append(this.zza[i]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }
}
