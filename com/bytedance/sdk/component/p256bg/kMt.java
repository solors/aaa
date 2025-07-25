package com.bytedance.sdk.component.p256bg;

import io.appmetrica.analytics.BuildConfig;

/* renamed from: com.bytedance.sdk.component.bg.kMt */
/* loaded from: classes3.dex */
public enum kMt {
    PUBLIC,
    PROTECTED,
    PRIVATE;

    @Override // java.lang.Enum
    public String toString() {
        if (this == PRIVATE) {
            return "private";
        }
        if (this == PROTECTED) {
            return "protected";
        }
        return BuildConfig.SDK_BUILD_FLAVOR;
    }
}
