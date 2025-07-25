package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfzp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(Set set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    public static zzfzn zzb(Set set, Set set2) {
        zzfun.zzc(set, "set1");
        zzfun.zzc(set2, "set2");
        return new zzfzj(set, set2);
    }

    public static Set zzc(Set set, zzfuo zzfuoVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof zzfzk) {
                zzfzk zzfzkVar = (zzfzk) sortedSet;
                return new zzfzl((SortedSet) zzfzkVar.zza, zzfur.zza(zzfzkVar.zzb, zzfuoVar));
            }
            sortedSet.getClass();
            return new zzfzl(sortedSet, zzfuoVar);
        } else if (set instanceof zzfzk) {
            zzfzk zzfzkVar2 = (zzfzk) set;
            return new zzfzk((Set) zzfzkVar2.zza, zzfur.zza(zzfzkVar2.zzb, zzfuoVar));
        } else {
            set.getClass();
            return new zzfzk(set, zzfuoVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzd(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zze(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzfyv) {
            collection = ((zzfyv) collection).zza();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            Iterator it = set.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        return zzf(set, collection.iterator());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzf(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
