package com.google.android.gms.internal.ads;

import com.ironsource.C20517nb;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzfxq implements Map, Serializable {
    private transient zzfxs zza;
    private transient zzfxs zzb;
    private transient zzfxi zzc;

    public static zzfxq zzc(Map map) {
        int i;
        Set entrySet = map.entrySet();
        if (entrySet instanceof Collection) {
            i = entrySet.size();
        } else {
            i = 4;
        }
        zzfxp zzfxpVar = new zzfxp(i);
        zzfxpVar.zzb(entrySet);
        return zzfxpVar.zzc();
    }

    public static zzfxq zzd() {
        return zzfze.zza;
    }

    public static zzfxq zze(Object obj, Object obj2) {
        zzfwk.zzb("dialog_not_shown_reason", obj2);
        return zzfze.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

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
        return zzfyk.zzb(this, obj);
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
        return zzfzp.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
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
        zzfwk.zza(size, "size");
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

    abstract zzfxi zza();

    @Override // java.util.Map
    /* renamed from: zzb */
    public final zzfxi values() {
        zzfxi zzfxiVar = this.zzc;
        if (zzfxiVar == null) {
            zzfxi zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzfxiVar;
    }

    abstract zzfxs zzf();

    abstract zzfxs zzg();

    @Override // java.util.Map
    /* renamed from: zzh */
    public final zzfxs entrySet() {
        zzfxs zzfxsVar = this.zza;
        if (zzfxsVar == null) {
            zzfxs zzf = zzf();
            this.zza = zzf;
            return zzf;
        }
        return zzfxsVar;
    }

    @Override // java.util.Map
    /* renamed from: zzi */
    public final zzfxs keySet() {
        zzfxs zzfxsVar = this.zzb;
        if (zzfxsVar == null) {
            zzfxs zzg = zzg();
            this.zzb = zzg;
            return zzg;
        }
        return zzfxsVar;
    }
}
