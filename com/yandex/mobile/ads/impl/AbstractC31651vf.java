package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.vf */
/* loaded from: classes8.dex */
public abstract class AbstractC31651vf<T, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: a */
    public static C31034of m28322a(@NotNull String name, @NotNull String type, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        return new C31034of(name, type, value, null, false, false);
    }

    @NotNull
    /* renamed from: a */
    public abstract C31034of mo28323a(Object obj, @NotNull String str);
}
