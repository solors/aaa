package com.google.android.gms.internal.play_billing;

import java.util.Comparator;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes5.dex */
final class zzcq implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzcx zza = zzcx.zza(obj);
        zzcx zza2 = zzcx.zza(obj2);
        if (zza == zza2) {
            int ordinal = zza.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            return ((Double) obj).compareTo((Double) obj2);
                        }
                        throw null;
                    }
                    return ((Long) obj).compareTo((Long) obj2);
                }
                return ((String) obj).compareTo((String) obj2);
            }
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
        return zza.compareTo(zza2);
    }
}
