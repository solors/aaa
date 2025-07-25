package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzfwg extends zzfwj implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfwg(Map map) {
        zzfun.zze(map.isEmpty());
        this.zza = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzo(zzfwg zzfwgVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfwgVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfwgVar.zzb -= size;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Collection zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection zzb(Collection collection) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfyl
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    final Collection zzf() {
        return new zzfwi(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfwj
    public final Iterator zzg() {
        return new zzfvq(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List zzh(Object obj, List list, zzfwd zzfwdVar) {
        if (list instanceof RandomAccess) {
            return new zzfvz(this, obj, list, zzfwdVar);
        }
        return new zzfwf(this, obj, list, zzfwdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    Map zzj() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map zzk() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfvx(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfwa(this, (SortedMap) map);
        }
        return new zzfvt(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    Set zzl() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set zzm() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfvy(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfwb(this, (SortedMap) map);
        }
        return new zzfvw(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfyl
    public final void zzp() {
        for (Collection collection : this.zza.values()) {
            collection.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfwj, com.google.android.gms.internal.ads.zzfyl
    public final boolean zzq(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            Collection zza = zza();
            if (zza.add(obj2)) {
                this.zzb++;
                this.zza.put(obj, zza);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(obj2)) {
            this.zzb++;
            return true;
        } else {
            return false;
        }
    }
}
