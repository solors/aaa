package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.q9 */
/* loaded from: classes8.dex */
public final class C31184q9 {
    @Nullable

    /* renamed from: a */
    private String f84258a;

    @Nullable
    /* renamed from: a */
    public final String m30444a() {
        return this.f84258a;
    }

    /* renamed from: a */
    public final void m30443a(@Nullable String str) {
        boolean m16635B;
        if (str != null) {
            m16635B = StringsJVM.m16635B(str);
            if (!m16635B) {
                String str2 = this.f84258a;
                if (str2 != null && !Intrinsics.m17075f(str2, str)) {
                    km0.m32485c("Ad Unit Id can't be set twice.", new Object[0]);
                    return;
                } else {
                    this.f84258a = str;
                    return;
                }
            }
        }
        km0.m32485c("Ad Unit Id can't be null or empty.", new Object[0]);
    }
}
