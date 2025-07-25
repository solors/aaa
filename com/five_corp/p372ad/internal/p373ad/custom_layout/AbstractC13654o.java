package com.five_corp.p372ad.internal.p373ad.custom_layout;

/* renamed from: com.five_corp.ad.internal.ad.custom_layout.o */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC13654o {
    /* renamed from: a */
    public static /* synthetic */ int m78462a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        if (i == 5) {
                            return 5;
                        }
                        throw null;
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static /* synthetic */ String m78461b(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "null";
                        }
                        return "START_MS_TO_BEFORE_VIEW_THROUGH";
                    }
                    return "START_END";
                }
                return "BEFORE_VIEW_THROUGH";
            }
            return "AFTER_VIEW_THROUGH";
        }
        return "ALL_TIME";
    }
}
