package com.applovin.exoplayer2.common.base;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Objects extends AbstractC3940c {
    private Objects() {
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
