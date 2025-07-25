package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class u40 extends RuntimeException {
    public u40(int i) {
        super(m28889a(i));
    }

    /* renamed from: a */
    private static String m28889a(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "Undefined timeout.";
                }
                return "Detaching surface timed out.";
            }
            return "Setting foreground mode timed out.";
        }
        return "Player release timed out.";
    }
}
