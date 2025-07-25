package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfwq extends AbstractSet {
    final /* synthetic */ zzfww zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfwq(zzfww zzfwwVar) {
        this.zza = zzfwwVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int zzw;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzw = this.zza.zzw(entry.getKey());
            if (zzw != -1 && zzfuk.zza(zzfww.zzj(this.zza, zzw), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfww zzfwwVar = this.zza;
        Map zzl = zzfwwVar.zzl();
        if (zzl != null) {
            return zzl.entrySet().iterator();
        }
        return new zzfwo(zzfwwVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzv;
        int[] zzA;
        Object[] zzB;
        Object[] zzC;
        int i;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzfww zzfwwVar = this.zza;
            if (!zzfwwVar.zzr()) {
                zzv = zzfwwVar.zzv();
                Object key = entry.getKey();
                Object value = entry.getValue();
                zzfww zzfwwVar2 = this.zza;
                Object zzi = zzfww.zzi(zzfwwVar2);
                zzA = zzfwwVar2.zzA();
                zzB = zzfwwVar2.zzB();
                zzC = zzfwwVar2.zzC();
                int zzb = zzfwx.zzb(key, value, zzv, zzi, zzA, zzB, zzC);
                if (zzb != -1) {
                    this.zza.zzq(zzb, zzv);
                    zzfww zzfwwVar3 = this.zza;
                    i = zzfwwVar3.zzg;
                    zzfwwVar3.zzg = i - 1;
                    this.zza.zzo();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
