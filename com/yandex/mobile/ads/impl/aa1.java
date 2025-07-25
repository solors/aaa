package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class aa1 extends AbstractC31651vf<String, String> {
    @NotNull

    /* renamed from: a */
    private final in1 f76746a;

    public aa1(@NotNull in1 reviewCountFormatter) {
        Intrinsics.checkNotNullParameter(reviewCountFormatter, "reviewCountFormatter");
        this.f76746a = reviewCountFormatter;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC31651vf
    /* renamed from: a */
    public final C31034of mo28323a(Object obj, String name) {
        String value = (String) obj;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.m17075f("review_count", name)) {
            try {
                value = this.f76746a.m33161a(value);
            } catch (i31 unused) {
            }
        }
        return AbstractC31651vf.m28322a(name, "string", value);
    }
}
