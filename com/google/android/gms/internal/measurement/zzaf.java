package com.google.android.gms.internal.measurement;

import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzaf implements zzak, zzaq, Iterable<zzaq> {
    @VisibleForTesting
    private final SortedMap<Integer, zzaq> zza;
    @VisibleForTesting
    private final Map<String, zzaq> zzb;

    public zzaf() {
        this.zza = new TreeMap();
        this.zzb = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaf)) {
            return false;
        }
        zzaf zzafVar = (zzaf) obj;
        if (zzb() != zzafVar.zzb()) {
            return false;
        }
        if (this.zza.isEmpty()) {
            return zzafVar.zza.isEmpty();
        }
        for (int intValue = this.zza.firstKey().intValue(); intValue <= this.zza.lastKey().intValue(); intValue++) {
            if (!zza(intValue).equals(zzafVar.zza(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzaq> iterator() {
        return new zzah(this);
    }

    public final String toString() {
        return zzb(",");
    }

    public final int zza() {
        return this.zza.size();
    }

    public final int zzb() {
        if (this.zza.isEmpty()) {
            return 0;
        }
        return this.zza.lastKey().intValue() + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        zzaf zzafVar = new zzaf();
        for (Map.Entry<Integer, zzaq> entry : this.zza.entrySet()) {
            if (entry.getValue() instanceof zzak) {
                zzafVar.zza.put(entry.getKey(), entry.getValue());
            } else {
                zzafVar.zza.put(entry.getKey(), entry.getValue().zzc());
            }
        }
        return zzafVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        if (this.zza.size() == 1) {
            return zza(0).zze();
        }
        if (this.zza.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return toString();
    }

    public final Iterator<Integer> zzg() {
        return this.zza.keySet().iterator();
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return new zzae(this, this.zza.keySet().iterator(), this.zzb.keySet().iterator());
    }

    public final List<zzaq> zzi() {
        ArrayList arrayList = new ArrayList(zzb());
        for (int i = 0; i < zzb(); i++) {
            arrayList.add(zza(i));
        }
        return arrayList;
    }

    public final void zzj() {
        this.zza.clear();
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        if ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) {
            return zzbe.zza(str, this, zzhVar, list);
        }
        return zzan.zza(this, new zzas(str), zzhVar, list);
    }

    public final String zzb(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (!this.zza.isEmpty()) {
            for (int i = 0; i < zzb(); i++) {
                zzaq zza = zza(i);
                sb2.append(str);
                if (!(zza instanceof zzax) && !(zza instanceof zzao)) {
                    sb2.append(zza.zzf());
                }
            }
            sb2.delete(0, str.length());
        }
        return sb2.toString();
    }

    public zzaf(List<zzaq> list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                zzb(i, list.get(i));
            }
        }
    }

    public final boolean zzc(int i) {
        if (i >= 0 && i <= this.zza.lastKey().intValue()) {
            return this.zza.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    public zzaf(zzaq... zzaqVarArr) {
        this(Arrays.asList(zzaqVarArr));
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean zzc(String str) {
        return "length".equals(str) || this.zzb.containsKey(str);
    }

    public final void zzb(int i) {
        int intValue = this.zza.lastKey().intValue();
        if (i > intValue || i < 0) {
            return;
        }
        this.zza.remove(Integer.valueOf(i));
        if (i == intValue) {
            int i2 = i - 1;
            if (this.zza.containsKey(Integer.valueOf(i2)) || i2 < 0) {
                return;
            }
            this.zza.put(Integer.valueOf(i2), zzaq.zzc);
            return;
        }
        while (true) {
            i++;
            if (i > this.zza.lastKey().intValue()) {
                return;
            }
            zzaq zzaqVar = this.zza.get(Integer.valueOf(i));
            if (zzaqVar != null) {
                this.zza.put(Integer.valueOf(i - 1), zzaqVar);
                this.zza.remove(Integer.valueOf(i));
            }
        }
    }

    public final void zzb(int i, zzaq zzaqVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        } else if (zzaqVar == null) {
            this.zza.remove(Integer.valueOf(i));
        } else {
            this.zza.put(Integer.valueOf(i), zzaqVar);
        }
    }

    public final zzaq zza(int i) {
        zzaq zzaqVar;
        if (i < zzb()) {
            return (!zzc(i) || (zzaqVar = this.zza.get(Integer.valueOf(i))) == null) ? zzaq.zzc : zzaqVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzaq zza(String str) {
        zzaq zzaqVar;
        if ("length".equals(str)) {
            return new zzai(Double.valueOf(zzb()));
        }
        return (!zzc(str) || (zzaqVar = this.zzb.get(str)) == null) ? zzaq.zzc : zzaqVar;
    }

    public final void zza(zzaq zzaqVar) {
        zzb(zzb(), zzaqVar);
    }

    public final void zza(int i, zzaq zzaqVar) {
        if (i >= 0) {
            if (i >= zzb()) {
                zzb(i, zzaqVar);
                return;
            }
            for (int intValue = this.zza.lastKey().intValue(); intValue >= i; intValue--) {
                zzaq zzaqVar2 = this.zza.get(Integer.valueOf(intValue));
                if (zzaqVar2 != null) {
                    zzb(intValue + 1, zzaqVar2);
                    this.zza.remove(Integer.valueOf(intValue));
                }
            }
            zzb(i, zzaqVar);
            return;
        }
        throw new IllegalArgumentException("Invalid value index: " + i);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void zza(String str, zzaq zzaqVar) {
        if (zzaqVar == null) {
            this.zzb.remove(str);
        } else {
            this.zzb.put(str, zzaqVar);
        }
    }
}
