package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
final class zzjj extends zzhu<Float> implements zzlf, RandomAccess {
    private float[] zza;
    private int zzb;

    static {
        new zzjj(new float[0], 0, false);
    }

    zzjj() {
        this(new float[10], 0, true);
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
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i >= 0 && i <= (i2 = this.zzb)) {
            float[] fArr = this.zza;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.zza, i, fArr2, i + 1, this.zzb - i);
                this.zza = fArr2;
            }
            this.zza[i] = floatValue;
            this.zzb++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzc(i));
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        zza();
        zzjm.zza(collection);
        if (!(collection instanceof zzjj)) {
            return super.addAll(collection);
        }
        zzjj zzjjVar = (zzjj) collection;
        int i = zzjjVar.zzb;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzb;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.zza;
            if (i3 > fArr.length) {
                this.zza = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(zzjjVar.zza, 0, this.zza, this.zzb, zzjjVar.zzb);
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
        if (!(obj instanceof zzjj)) {
            return super.equals(obj);
        }
        zzjj zzjjVar = (zzjj) obj;
        if (this.zzb != zzjjVar.zzb) {
            return false;
        }
        float[] fArr = zzjjVar.zza;
        for (int i = 0; i < this.zzb; i++) {
            if (Float.floatToIntBits(this.zza[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Float.valueOf(zzb(i));
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.zza[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.zza[i] == floatValue) {
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
        float[] fArr = this.zza;
        float f = fArr[i];
        if (i < this.zzb - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zza();
        if (i2 >= i) {
            float[] fArr = this.zza;
            System.arraycopy(fArr, i2, fArr, i, this.zzb - i2);
            this.zzb -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        zzd(i);
        float[] fArr = this.zza;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzjt
    public final /* synthetic */ zzjt zza(int i) {
        if (i >= this.zzb) {
            return new zzjj(Arrays.copyOf(this.zza, i), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zzb(int i) {
        zzd(i);
        return this.zza[i];
    }

    private zzjj(float[] fArr, int i, boolean z) {
        super(z);
        this.zza = fArr;
        this.zzb = i;
    }

    public final void zza(float f) {
        zza();
        int i = this.zzb;
        float[] fArr = this.zza;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.zza = fArr2;
        }
        float[] fArr3 = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Float) obj).floatValue());
        return true;
    }
}
