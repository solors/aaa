package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public class zzfwd extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzfwd zzc;
    final Collection zzd;
    final /* synthetic */ zzfwg zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfwd(zzfwg zzfwgVar, Object obj, Collection collection, zzfwd zzfwdVar) {
        Collection collection2;
        this.zze = zzfwgVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzfwdVar;
        if (zzfwdVar == null) {
            collection2 = null;
        } else {
            collection2 = zzfwdVar.zzb;
        }
        this.zzd = collection2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (add) {
            zzfwg zzfwgVar = this.zze;
            i = zzfwgVar.zzb;
            zzfwgVar.zzb = i + 1;
            if (isEmpty) {
                zza();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        if (addAll) {
            int size2 = this.zzb.size();
            zzfwg zzfwgVar = this.zze;
            i = zzfwgVar.zzb;
            zzfwgVar.zzb = i + (size2 - size);
            if (size == 0) {
                zza();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i;
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzfwg zzfwgVar = this.zze;
        i = zzfwgVar.zzb;
        zzfwgVar.zzb = i - size;
        zzc();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new zzfwc(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        zzb();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            zzfwg zzfwgVar = this.zze;
            i = zzfwgVar.zzb;
            zzfwgVar.zzb = i - 1;
            zzc();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            int size2 = this.zzb.size();
            zzfwg zzfwgVar = this.zze;
            int i2 = size2 - size;
            i = zzfwgVar.zzb;
            zzfwgVar.zzb = i + i2;
            zzc();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        int size = size();
        boolean retainAll = this.zzb.retainAll(collection);
        if (retainAll) {
            int size2 = this.zzb.size();
            zzfwg zzfwgVar = this.zze;
            int i2 = size2 - size;
            i = zzfwgVar.zzb;
            zzfwgVar.zzb = i + i2;
            zzc();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.zzb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        Map map;
        zzfwd zzfwdVar = this.zzc;
        if (zzfwdVar != null) {
            zzfwdVar.zza();
            return;
        }
        zzfwg zzfwgVar = this.zze;
        Object obj = this.zza;
        map = zzfwgVar.zza;
        map.put(obj, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Map map;
        zzfwd zzfwdVar = this.zzc;
        if (zzfwdVar != null) {
            zzfwdVar.zzb();
            zzfwd zzfwdVar2 = this.zzc;
            if (zzfwdVar2.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
        } else if (this.zzb.isEmpty()) {
            zzfwg zzfwgVar = this.zze;
            Object obj = this.zza;
            map = zzfwgVar.zza;
            Collection collection = (Collection) map.get(obj);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        Map map;
        zzfwd zzfwdVar = this.zzc;
        if (zzfwdVar != null) {
            zzfwdVar.zzc();
        } else if (this.zzb.isEmpty()) {
            zzfwg zzfwgVar = this.zze;
            Object obj = this.zza;
            map = zzfwgVar.zza;
            map.remove(obj);
        }
    }
}
