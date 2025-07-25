package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzalh {
    @Nullable
    public static zzali zza(@Nullable zzali zzaliVar, @Nullable String[] strArr, Map map) {
        int length;
        int i = 0;
        if (zzaliVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzali) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzali zzaliVar2 = new zzali();
                while (i < length2) {
                    zzaliVar2.zzl((zzali) map.get(strArr[i]));
                    i++;
                }
                return zzaliVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            zzaliVar.zzl((zzali) map.get(strArr[0]));
            return zzaliVar;
        } else if (strArr != null && (length = strArr.length) > 1) {
            while (i < length) {
                zzaliVar.zzl((zzali) map.get(strArr[i]));
                i++;
            }
        }
        return zzaliVar;
    }
}
