package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzfxd extends zzfxe implements Map {
    @Override // java.util.Map
    public final void clear() {
        zzb().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return zzb().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return zzb().containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return zzb().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this && !zzb().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return zzb().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return zzb().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return zzb().isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return zzb().keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return zzb().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        zzb().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return zzb().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return zzb().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return zzb().values();
    }

    @Override // com.google.android.gms.internal.ads.zzfxe
    protected /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    protected abstract Map zzb();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzc() {
        return zzfzp.zza(entrySet());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzd(Object obj) {
        zzfyf zzfyfVar = new zzfyf(entrySet().iterator());
        if (obj == null) {
            while (zzfyfVar.hasNext()) {
                if (zzfyfVar.next() == null) {
                    return true;
                }
            }
        } else {
            while (zzfyfVar.hasNext()) {
                if (obj.equals(zzfyfVar.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zze(Object obj) {
        return zzfyk.zzb(this, obj);
    }
}
