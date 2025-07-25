package com.google.android.gms.ads.internal.util.client;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzp {
    public static boolean zza(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        Object obj = bundle2;
        obj = bundle2;
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj2 = bundle.get(str);
                Object obj3 = bundle2.get(str);
                if (obj2 != null && obj3 != null) {
                    if (obj2 instanceof Bundle) {
                        if (!(obj3 instanceof Bundle) || !zza((Bundle) obj2, (Bundle) obj3)) {
                            return false;
                        }
                    } else if (obj2.getClass().isArray()) {
                        int length = Array.getLength(obj2);
                        if (!obj3.getClass().isArray() || length != Array.getLength(obj3)) {
                            return false;
                        }
                        for (int i = 0; i < length; i++) {
                            if (!Objects.equal(Array.get(obj2, i), Array.get(obj3, i))) {
                                return false;
                            }
                        }
                        continue;
                    } else if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else {
                    obj = obj3;
                    bundle = obj2;
                }
            }
            return true;
        }
        if (bundle == null && obj == null) {
            return true;
        }
        return false;
    }
}
