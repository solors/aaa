package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfww extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    zzfww() {
        zzp(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzC() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object zzg(zzfww zzfwwVar, int i) {
        return zzfwwVar.zzB()[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object zzi(zzfww zzfwwVar) {
        Object obj = zzfwwVar.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object zzj(zzfww zzfwwVar, int i) {
        return zzfwwVar.zzC()[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzn(zzfww zzfwwVar, int i, Object obj) {
        zzfwwVar.zzC()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw(Object obj) {
        if (zzr()) {
            return -1;
        }
        int zzb = zzfxf.zzb(obj);
        int zzv = zzv();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int zzc = zzfwx.zzc(obj2, zzb & zzv);
        if (zzc == 0) {
            return -1;
        }
        int i = ~zzv;
        int i2 = zzb & i;
        do {
            int i3 = zzc - 1;
            int i4 = zzA()[i3];
            if ((i4 & i) == i2 && zzfuk.zza(obj, zzB()[i3])) {
                return i3;
            }
            zzc = i4 & zzv;
        } while (zzc != 0);
        return -1;
    }

    private final int zzx(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object zzd2 = zzfwx.zzd(i2);
        if (i4 != 0) {
            zzfwx.zze(zzd2, i3 & i5, i4 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzA = zzA();
        for (int i6 = 0; i6 <= i; i6++) {
            int zzc = zzfwx.zzc(obj, i6);
            while (zzc != 0) {
                int i7 = zzc - 1;
                int i8 = zzA[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int zzc2 = zzfwx.zzc(zzd2, i10);
                zzfwx.zze(zzd2, i10, zzc);
                zzA[i7] = ((~i5) & i9) | (zzc2 & i5);
                zzc = i8 & i;
            }
        }
        this.zze = zzd2;
        zzz(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzy(Object obj) {
        if (!zzr()) {
            int zzv = zzv();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int zzb = zzfwx.zzb(obj, null, zzv, obj2, zzA(), zzB(), null);
            if (zzb != -1) {
                Object obj3 = zzC()[zzb];
                zzq(zzb, zzv);
                this.zzg--;
                zzo();
                return obj3;
            }
        }
        return zzd;
    }

    private final void zzz(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        Map zzl = zzl();
        if (zzl != null) {
            this.zzf = zzgaq.zzc(size(), 3, 1073741823);
            zzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsKey(obj);
        }
        if (zzw(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map zzl = zzl();
        if (zzl == null) {
            for (int i = 0; i < this.zzg; i++) {
                if (zzfuk.zza(obj, zzC()[i])) {
                    return true;
                }
            }
            return false;
        }
        return zzl.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set == null) {
            zzfwq zzfwqVar = new zzfwq(this);
            this.zzi = zzfwqVar;
            return zzfwqVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.get(obj);
        }
        int zzw = zzw(obj);
        if (zzw == -1) {
            return null;
        }
        return zzC()[zzw];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set == null) {
            zzfws zzfwsVar = new zzfws(this);
            this.zzh = zzfwsVar;
            return zzfwsVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (zzr()) {
            zzfun.zzm(zzr(), "Arrays already allocated");
            int i = this.zzf;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzfwx.zzd(max2);
            zzz(max2 - 1);
            this.zza = new int[i];
            this.zzb = new Object[i];
            this.zzc = new Object[i];
        }
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.put(obj, obj2);
        }
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int i2 = this.zzg;
        int i3 = i2 + 1;
        int zzb = zzfxf.zzb(obj);
        int zzv = zzv();
        int i4 = zzb & zzv;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int zzc = zzfwx.zzc(obj3, i4);
        if (zzc == 0) {
            if (i3 > zzv) {
                zzv = zzx(zzv, zzfwx.zza(zzv), zzb, i2);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                zzfwx.zze(obj4, i4, i3);
            }
        } else {
            int i5 = ~zzv;
            int i6 = zzb & i5;
            int i7 = 0;
            while (true) {
                int i8 = zzc - 1;
                int i9 = zzA[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && zzfuk.zza(obj, zzB[i8])) {
                    Object obj5 = zzC[i8];
                    zzC[i8] = obj2;
                    return obj5;
                }
                int i11 = i9 & zzv;
                i7++;
                if (i11 == 0) {
                    if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzv() + 1, 1.0f);
                        int zze = zze();
                        while (zze >= 0) {
                            linkedHashMap.put(zzB()[zze], zzC()[zze]);
                            zze = zzf(zze);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzo();
                        return linkedHashMap.put(obj, obj2);
                    } else if (i3 > zzv) {
                        zzv = zzx(zzv, zzfwx.zza(zzv), zzb, i2);
                    } else {
                        zzA[i8] = (i3 & zzv) | i10;
                    }
                } else {
                    zzc = i11;
                }
            }
        }
        int length = zzA().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzA(), min);
            this.zzb = Arrays.copyOf(zzB(), min);
            this.zzc = Arrays.copyOf(zzC(), min);
        }
        zzA()[i2] = (~zzv) & zzb;
        zzB()[i2] = obj;
        zzC()[i2] = obj2;
        this.zzg = i3;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.remove(obj);
        }
        Object zzy = zzy(obj);
        if (zzy == zzd) {
            return null;
        }
        return zzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.size();
        }
        return this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection == null) {
            zzfwu zzfwuVar = new zzfwu(this);
            this.zzj = zzfwuVar;
            return zzfwuVar;
        }
        return collection;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zze() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzf(int i) {
        int i2 = i + 1;
        if (i2 < this.zzg) {
            return i2;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzo() {
        this.zzf += 32;
    }

    final void zzp(int i) {
        this.zzf = zzgaq.zzc(i, 1, 1073741823);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzq(int i, int i2) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int size = size() - 1;
        if (i < size) {
            int i3 = i + 1;
            Object obj2 = zzB[size];
            zzB[i] = obj2;
            zzC[i] = zzC[size];
            zzB[size] = null;
            zzC[size] = null;
            zzA[i] = zzA[size];
            zzA[size] = 0;
            int zzb = zzfxf.zzb(obj2) & i2;
            int zzc = zzfwx.zzc(obj, zzb);
            int i4 = size + 1;
            if (zzc == i4) {
                zzfwx.zze(obj, zzb, i3);
                return;
            }
            while (true) {
                int i5 = zzc - 1;
                int i6 = zzA[i5];
                int i7 = i6 & i2;
                if (i7 != i4) {
                    zzc = i7;
                } else {
                    zzA[i5] = (i6 & (~i2)) | (i2 & i3);
                    return;
                }
            }
        } else {
            zzB[i] = null;
            zzC[i] = null;
            zzA[i] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzr() {
        if (this.zze == null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfww(int i) {
        zzp(8);
    }
}
