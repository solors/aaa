package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
final class zzhy extends zzhu<Boolean> implements zzlf, RandomAccess {
    private boolean[] zza;
    private int zzb;

    static {
        new zzhy(new boolean[0], 0, false);
    }

    zzhy() {
        this(new boolean[10], 0, true);
    }

    private final String zzc(int i) {
        int i2 = this.zzb;
        return "Index:" + i + ", Size:" + i2;
    }

    private final void zzd(int i) {
        if (i >= 0 && i < this.zzb) {
            return;
        }
        throw new IndexOutOfBoundsException(zzc(i));
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i >= 0 && i <= (i2 = this.zzb)) {
            boolean[] zArr = this.zza;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.zza, i, zArr2, i + 1, this.zzb - i);
                this.zza = zArr2;
            }
            this.zza[i] = booleanValue;
            this.zzb++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzc(i));
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        zza();
        zzjm.zza(collection);
        if (!(collection instanceof zzhy)) {
            return super.addAll(collection);
        }
        zzhy zzhyVar = (zzhy) collection;
        int i = zzhyVar.zzb;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzb;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.zza;
            if (i3 > zArr.length) {
                this.zza = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(zzhyVar.zza, 0, this.zza, this.zzb, zzhyVar.zzb);
            this.zzb = i3;
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

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhy)) {
            return super.equals(obj);
        }
        zzhy zzhyVar = (zzhy) obj;
        if (this.zzb != zzhyVar.zzb) {
            return false;
        }
        boolean[] zArr = zzhyVar.zza;
        for (int i = 0; i < this.zzb; i++) {
            if (this.zza[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Boolean.valueOf(zzb(i));
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            i = (i * 31) + zzjm.zza(this.zza[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.zza[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        zza();
        zzd(i);
        boolean[] zArr = this.zza;
        boolean z = zArr[i];
        if (i < this.zzb - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zza();
        if (i2 >= i) {
            boolean[] zArr = this.zza;
            System.arraycopy(zArr, i2, zArr, i, this.zzb - i2);
            this.zzb -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzd(i);
        boolean[] zArr = this.zza;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzjt
    public final /* synthetic */ zzjt zza(int i) {
        if (i >= this.zzb) {
            return new zzhy(Arrays.copyOf(this.zza, i), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean zzb(int i) {
        zzd(i);
        return this.zza[i];
    }

    private zzhy(boolean[] zArr, int i, boolean z) {
        super(z);
        this.zza = zArr;
        this.zzb = i;
    }

    public final void zza(boolean z) {
        zza();
        int i = this.zzb;
        boolean[] zArr = this.zza;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.zza = zArr2;
        }
        boolean[] zArr3 = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Boolean) obj).booleanValue());
        return true;
    }
}
