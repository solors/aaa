package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public class zzfwf extends zzfwd implements List {
    final /* synthetic */ zzfwg zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwf(zzfwg zzfwgVar, Object obj, List list, zzfwd zzfwdVar) {
        super(zzfwgVar, obj, list, zzfwdVar);
        this.zzf = zzfwgVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i, obj);
        zzfwg zzfwgVar = this.zzf;
        i2 = zzfwgVar.zzb;
        zzfwgVar.zzb = i2 + 1;
        if (isEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i, collection);
        if (addAll) {
            int size2 = this.zzb.size();
            zzfwg zzfwgVar = this.zzf;
            i2 = zzfwgVar.zzb;
            zzfwgVar.zzb = i2 + (size2 - size);
            if (size == 0) {
                zza();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.zzb).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzfwe(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        zzb();
        Object remove = ((List) this.zzb).remove(i);
        zzfwg zzfwgVar = this.zzf;
        i2 = zzfwgVar.zzb;
        zzfwgVar.zzb = i2 - 1;
        zzc();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.zzb).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        List subList = ((List) this.zzb).subList(i, i2);
        zzfwd zzfwdVar = this.zzc;
        if (zzfwdVar == null) {
            zzfwdVar = this;
        }
        return this.zzf.zzh(this.zza, subList, zzfwdVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new zzfwe(this, i);
    }
}
