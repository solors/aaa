package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzgwy extends zzgvv implements RandomAccess, zzgxu, zzgzl {
    private static final double[] zza;
    private static final zzgwy zzb;
    private double[] zzc;
    private int zzd;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        zzb = new zzgwy(dArr, 0, false);
    }

    zzgwy() {
        this(zza, 0, true);
    }

    public static zzgwy zze() {
        return zzb;
    }

    private static int zzj(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzk(int i) {
        int i2 = this.zzd;
        return "Index:" + i + ", Size:" + i2;
    }

    private final void zzl(int i) {
        if (i >= 0 && i < this.zzd) {
            return;
        }
        throw new IndexOutOfBoundsException(zzk(i));
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        zzdG();
        if (i >= 0 && i <= (i2 = this.zzd)) {
            int i3 = i + 1;
            double[] dArr = this.zzc;
            int length = dArr.length;
            if (i2 < length) {
                System.arraycopy(dArr, i, dArr, i3, i2 - i);
            } else {
                double[] dArr2 = new double[zzj(length)];
                System.arraycopy(this.zzc, 0, dArr2, 0, i);
                System.arraycopy(this.zzc, i, dArr2, i3, this.zzd - i);
                this.zzc = dArr2;
            }
            this.zzc[i] = doubleValue;
            this.zzd++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzk(i));
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdG();
        byte[] bArr = zzgye.zzb;
        collection.getClass();
        if (!(collection instanceof zzgwy)) {
            return super.addAll(collection);
        }
        zzgwy zzgwyVar = (zzgwy) collection;
        int i = zzgwyVar.zzd;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzd;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.zzc;
            if (i3 > dArr.length) {
                this.zzc = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(zzgwyVar.zzc, 0, this.zzc, this.zzd, zzgwyVar.zzd);
            this.zzd = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgwy)) {
            return super.equals(obj);
        }
        zzgwy zzgwyVar = (zzgwy) obj;
        if (this.zzd != zzgwyVar.zzd) {
            return false;
        }
        double[] dArr = zzgwyVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (Double.doubleToLongBits(this.zzc[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzl(i);
        return Double.valueOf(this.zzc[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            long doubleToLongBits = Double.doubleToLongBits(this.zzc[i2]);
            byte[] bArr = zzgye.zzb;
            i = (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.zzd;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzc[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        zzdG();
        zzl(i);
        double[] dArr = this.zzc;
        double d = dArr[i];
        if (i < this.zzd - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzdG();
        if (i2 >= i) {
            double[] dArr = this.zzc;
            System.arraycopy(dArr, i2, dArr, i, this.zzd - i2);
            this.zzd -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zzdG();
        zzl(i);
        double[] dArr = this.zzc;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final double zzd(int i) {
        zzl(i);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgyd
    /* renamed from: zzg */
    public final zzgxu zzf(int i) {
        double[] copyOf;
        if (i >= this.zzd) {
            if (i == 0) {
                copyOf = zza;
            } else {
                copyOf = Arrays.copyOf(this.zzc, i);
            }
            return new zzgwy(copyOf, this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(double d) {
        zzdG();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            double[] dArr = new double[zzj(length)];
            System.arraycopy(this.zzc, 0, dArr, 0, this.zzd);
            this.zzc = dArr;
        }
        double[] dArr2 = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        dArr2[i2] = d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi(int i) {
        int length = this.zzc.length;
        if (i <= length) {
            return;
        }
        if (length != 0) {
            while (length < i) {
                length = zzj(length);
            }
            this.zzc = Arrays.copyOf(this.zzc, length);
            return;
        }
        this.zzc = new double[Math.max(i, 10)];
    }

    private zzgwy(double[] dArr, int i, boolean z) {
        super(z);
        this.zzc = dArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Double) obj).doubleValue());
        return true;
    }
}
