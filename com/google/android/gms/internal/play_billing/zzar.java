package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes5.dex */
public final class zzar {
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
}
