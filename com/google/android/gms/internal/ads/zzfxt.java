package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfxt {
    public static Object zza(Iterable iterable, Object obj) {
        zzfzt it = ((zzfzj) iterable).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return obj;
    }

    public static boolean zzb(Iterable iterable, zzfuo zzfuoVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzfuoVar.getClass();
            return zzd((List) iterable, zzfuoVar);
        }
        Iterator it = iterable.iterator();
        zzfuoVar.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (zzfuoVar.zza(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    private static void zzc(List list, zzfuo zzfuoVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzfuoVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                list.remove(i2);
            } else {
                return;
            }
        }
    }

    private static boolean zzd(List list, zzfuo zzfuoVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!zzfuoVar.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        zzc(list, zzfuoVar, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzc(list, zzfuoVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        if (i == i2) {
            return false;
        }
        return true;
    }
}
