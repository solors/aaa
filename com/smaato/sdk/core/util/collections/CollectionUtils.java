package com.smaato.sdk.core.util.collections;

import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static boolean equalsByElements(@NonNull Collection<?> collection, @NonNull Collection<?> collection2) {
        if (collection.size() != collection2.size()) {
            return false;
        }
        HashMap hashMap = new HashMap();
        for (Object obj : collection) {
            Integer num = (Integer) hashMap.get(obj);
            if (num == null) {
                num = 0;
            }
            hashMap.put(obj, Integer.valueOf(num.intValue() + 1));
        }
        for (Object obj2 : collection2) {
            Integer num2 = (Integer) hashMap.get(obj2);
            if (num2 == null) {
                return false;
            }
            Integer valueOf = Integer.valueOf(num2.intValue() - 1);
            if (valueOf.intValue() == 0) {
                hashMap.remove(obj2);
            } else {
                hashMap.put(obj2, Integer.valueOf(valueOf.intValue() - 1));
            }
        }
        return hashMap.isEmpty();
    }
}
