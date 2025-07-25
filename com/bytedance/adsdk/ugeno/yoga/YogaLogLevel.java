package com.bytedance.adsdk.ugeno.yoga;

import com.bytedance.adsdk.ugeno.yoga.p226bg.InterfaceC7150bg;

@InterfaceC7150bg
/* loaded from: classes3.dex */
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);
    

    /* renamed from: iR */
    private final int f15372iR;

    YogaLogLevel(int i) {
        this.f15372iR = i;
    }

    @InterfaceC7150bg
    public static YogaLogLevel fromInt(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return FATAL;
                            }
                            throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
                        }
                        return VERBOSE;
                    }
                    return DEBUG;
                }
                return INFO;
            }
            return WARN;
        }
        return ERROR;
    }
}
