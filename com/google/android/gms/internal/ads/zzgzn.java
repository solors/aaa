package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzgzn extends zzgvv implements RandomAccess {
    private static final Object[] zza;
    private static final zzgzn zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzgzn(objArr, 0, false);
    }

    zzgzn() {
        this(zza, 0, true);
    }

    public static zzgzn zzd() {
        return zzb;
    }

    private static int zzg(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzh(int i) {
        int i2 = this.zzd;
        return "Index:" + i + ", Size:" + i2;
    }

    private final void zzi(int i) {
        if (i >= 0 && i < this.zzd) {
            return;
        }
        throw new IndexOutOfBoundsException(zzh(i));
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zzdG();
        if (i >= 0 && i <= (i2 = this.zzd)) {
            int i3 = i + 1;
            Object[] objArr = this.zzc;
            int length = objArr.length;
            if (i2 < length) {
                System.arraycopy(objArr, i, objArr, i3, i2 - i);
            } else {
                Object[] objArr2 = new Object[zzg(length)];
                System.arraycopy(this.zzc, 0, objArr2, 0, i);
                System.arraycopy(this.zzc, i, objArr2, i3, this.zzd - i);
                this.zzc = objArr2;
            }
            this.zzc[i] = obj;
            this.zzd++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzh(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzi(i);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        zzdG();
        zzi(i);
        Object[] objArr = this.zzc;
        Object obj = objArr[i];
        if (i < this.zzd - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zzdG();
        zzi(i);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(int i) {
        int length = this.zzc.length;
        if (i <= length) {
            return;
        }
        if (length != 0) {
            while (length < i) {
                length = zzg(length);
            }
            this.zzc = Arrays.copyOf(this.zzc, length);
            return;
        }
        this.zzc = new Object[Math.max(i, 10)];
    }

    @Override // com.google.android.gms.internal.ads.zzgyd
    public final /* bridge */ /* synthetic */ zzgyd zzf(int i) {
        Object[] copyOf;
        if (i >= this.zzd) {
            if (i == 0) {
                copyOf = zza;
            } else {
                copyOf = Arrays.copyOf(this.zzc, i);
            }
            return new zzgzn(copyOf, this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    private zzgzn(Object[] objArr, int i, boolean z) {
        super(z);
        this.zzc = objArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzdG();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            this.zzc = Arrays.copyOf(this.zzc, zzg(length));
        }
        Object[] objArr = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
