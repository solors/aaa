package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzfxs extends zzfxi implements Set {
    private transient zzfxn zza;

    public static int zzh(int i) {
        boolean z;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            z = true;
        } else {
            z = false;
        }
        zzfun.zzf(z, "collection too large");
        return 1073741824;
    }

    public static zzfxr zzj(int i) {
        return new zzfxr(i, true);
    }

    public static zzfxs zzl(Collection collection) {
        if ((collection instanceof zzfxs) && !(collection instanceof SortedSet)) {
            zzfxs zzfxsVar = (zzfxs) collection;
            if (!zzfxsVar.zzf()) {
                return zzfxsVar;
            }
        }
        Object[] array = collection.toArray();
        return zzv(array.length, array);
    }

    public static zzfxs zzm(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return zzv(length, (Object[]) objArr.clone());
            }
            return new zzfzq(objArr[0]);
        }
        return zzfzf.zza;
    }

    public static zzfxs zzn() {
        return zzfzf.zza;
    }

    public static zzfxs zzo(Object obj) {
        return new zzfzq(obj);
    }

    public static zzfxs zzp(Object obj, Object obj2) {
        return zzv(2, obj, obj2);
    }

    public static zzfxs zzq(Object obj, Object obj2, Object obj3) {
        return zzv(3, obj, obj2, obj3);
    }

    public static zzfxs zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzv(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzfxs zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[9];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 3);
        return zzv(9, objArr2);
    }

    public static zzfxs zzv(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int zzh = zzh(i);
                Object[] objArr2 = new Object[zzh];
                int i2 = zzh - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    zzfyx.zza(obj, i5);
                    int hashCode = obj.hashCode();
                    int zza = zzfxf.zza(hashCode);
                    while (true) {
                        int i6 = zza & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 == null) {
                            objArr[i4] = obj;
                            objArr2[i6] = obj;
                            i3 += hashCode;
                            i4++;
                            break;
                        } else if (!obj2.equals(obj)) {
                            zza++;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new zzfzq(obj3);
                }
                if (zzh(i4) < zzh / 2) {
                    return zzv(i4, objArr);
                }
                if (zzw(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new zzfzf(objArr, i3, objArr2, i2, i4);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzfzq(obj4);
        }
        return zzfzf.zza;
    }

    public static boolean zzw(int i, int i2) {
        if (i < (i2 >> 1) + (i2 >> 2)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfxs) && zzu() && ((zzfxs) obj).zzu() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzfzp.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzfzp.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    public zzfxn zzd() {
        zzfxn zzfxnVar = this.zza;
        if (zzfxnVar == null) {
            zzfxn zzi = zzi();
            this.zza = zzi;
            return zzi;
        }
        return zzfxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzfzt iterator();

    zzfxn zzi() {
        Object[] array = toArray();
        int i = zzfxn.zzd;
        return zzfxn.zzj(array, array.length);
    }

    boolean zzu() {
        return false;
    }
}
