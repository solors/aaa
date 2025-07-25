package com.google.android.gms.internal.play_billing;

import com.ironsource.C20517nb;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes5.dex */
public abstract class zzai implements Map, Serializable {
    private transient zzaj zza;
    private transient zzaj zzb;
    private transient zzac zzc;

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzar.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzaj zzajVar = this.zzb;
        if (zzajVar == null) {
            zzaj zzd = zzd();
            this.zzb = zzd;
            return zzd;
        }
        return zzajVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
            sb2.append('{');
            boolean z = true;
            for (Map.Entry entry : entrySet()) {
                if (!z) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append(C20517nb.f52173T);
                sb2.append(entry.getValue());
                z = false;
            }
            sb2.append('}');
            return sb2.toString();
        }
        throw new IllegalArgumentException("size cannot be negative but was: " + size);
    }

    abstract zzac zza();

    @Override // java.util.Map
    /* renamed from: zzb */
    public final zzac values() {
        zzac zzacVar = this.zzc;
        if (zzacVar == null) {
            zzac zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzacVar;
    }

    abstract zzaj zzc();

    abstract zzaj zzd();

    @Override // java.util.Map
    /* renamed from: zze */
    public final zzaj entrySet() {
        zzaj zzajVar = this.zza;
        if (zzajVar == null) {
            zzaj zzc = zzc();
            this.zza = zzc;
            return zzc;
        }
        return zzajVar;
    }
}
