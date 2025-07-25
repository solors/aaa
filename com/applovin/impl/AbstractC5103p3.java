package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;

/* renamed from: com.applovin.impl.p3 */
/* loaded from: classes2.dex */
abstract class AbstractC5103p3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m96597a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        } else if (obj2 != null) {
        } else {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m96598a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m96596a(boolean z) {
        Preconditions.checkState(z, "no calls to next() since the last call to remove()");
    }
}
