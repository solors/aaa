package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
public class zzlm<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private List<zzls> zza;
    private Map<K, V> zzb;
    private boolean zzc;
    private volatile zzlx zzd;
    private Map<K, V> zze;
    private volatile zzlq zzf;

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzb.isEmpty() && !(this.zzb instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzb = treeMap;
            this.zze = treeMap.descendingMap();
        }
        return (SortedMap) this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        if (!this.zzc) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzg();
        if (!this.zza.isEmpty()) {
            this.zza.clear();
        }
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (zza((zzlm<K, V>) comparable) < 0 && !this.zzb.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzd == null) {
            this.zzd = new zzlx(this);
        }
        return this.zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlm)) {
            return super.equals(obj);
        }
        zzlm zzlmVar = (zzlm) obj;
        int size = size();
        if (size != zzlmVar.size()) {
            return false;
        }
        int zza = zza();
        if (zza != zzlmVar.zza()) {
            return entrySet().equals(zzlmVar.entrySet());
        }
        for (int i = 0; i < zza; i++) {
            if (!zza(i).equals(zzlmVar.zza(i))) {
                return false;
            }
        }
        if (zza == size) {
            return true;
        }
        return this.zzb.equals(zzlmVar.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzlm<K, V>) comparable);
        if (zza >= 0) {
            return (V) this.zza.get(zza).getValue();
        }
        return this.zzb.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int zza = zza();
        int i = 0;
        for (int i2 = 0; i2 < zza; i2++) {
            i += this.zza.get(i2).hashCode();
        }
        if (this.zzb.size() > 0) {
            return i + this.zzb.hashCode();
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzlm<K, V>) ((Comparable) obj), (Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzlm<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzb(zza);
        }
        if (this.zzb.isEmpty()) {
            return null;
        }
        return this.zzb.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zza.size() + this.zzb.size();
    }

    public final boolean zze() {
        return this.zzc;
    }

    private zzlm() {
        this.zza = Collections.emptyList();
        this.zzb = Collections.emptyMap();
        this.zze = Collections.emptyMap();
    }

    public final Iterable<Map.Entry<K, V>> zzb() {
        if (this.zzb.isEmpty()) {
            return Collections.emptySet();
        }
        return this.zzb.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zzc() {
        if (this.zzf == null) {
            this.zzf = new zzlq(this);
        }
        return this.zzf;
    }

    public void zzd() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.zzc) {
            return;
        }
        if (this.zzb.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.zzb);
        }
        this.zzb = unmodifiableMap;
        if (this.zze.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.zze);
        }
        this.zze = unmodifiableMap2;
        this.zzc = true;
    }

    private final int zza(K k) {
        int size = this.zza.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.zza.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.zza.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzb(int i) {
        zzg();
        V v = (V) this.zza.remove(i).getValue();
        if (!this.zzb.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzf().entrySet().iterator();
            this.zza.add(new zzls(this, it.next()));
            it.remove();
        }
        return v;
    }

    public final int zza() {
        return this.zza.size();
    }

    public final V zza(K k, V v) {
        zzg();
        int zza = zza((zzlm<K, V>) k);
        if (zza >= 0) {
            return (V) this.zza.get(zza).setValue(v);
        }
        zzg();
        if (this.zza.isEmpty() && !(this.zza instanceof ArrayList)) {
            this.zza = new ArrayList(16);
        }
        int i = -(zza + 1);
        if (i >= 16) {
            return zzf().put(k, v);
        }
        if (this.zza.size() == 16) {
            zzls remove = this.zza.remove(15);
            zzf().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.zza.add(i, new zzls(this, k, v));
        return null;
    }

    public final Map.Entry<K, V> zza(int i) {
        return this.zza.get(i);
    }
}
