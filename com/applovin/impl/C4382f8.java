package com.applovin.impl;

/* renamed from: com.applovin.impl.f8 */
/* loaded from: classes2.dex */
public final class C4382f8 extends RuntimeException {

    /* renamed from: a */
    public final int f6060a;

    public C4382f8(int i) {
        super(m99394a(i));
        this.f6060a = i;
    }

    /* renamed from: a */
    private static String m99394a(int i) {
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
