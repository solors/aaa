package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class t80 extends Lambda implements Function1<Map.Entry<? extends String, ? extends Object>, CharSequence> {

    /* renamed from: b */
    public static final t80 f85550b = new t80();

    t80() {
        super(1);
    }

    @NotNull
    /* renamed from: a */
    public static String m29260a(@NotNull Map.Entry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object key = it.getKey();
        Object value = it.getValue();
        return key + "=" + value;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends Object> entry) {
        return m29260a(entry);
    }
}
