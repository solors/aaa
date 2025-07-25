package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* renamed from: com.yandex.mobile.ads.impl.jp */
/* loaded from: classes8.dex */
final class C30644jp {
    /* JADX INFO: Access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: a */
    public static int m32828a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }
}
