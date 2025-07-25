package com.yandex.mobile.ads.impl;

import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class or0 {
    @NotNull
    /* renamed from: a */
    public static String m30939a() {
        String m16628I;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        m16628I = StringsJVM.m16628I(uuid, "-", "", false, 4, null);
        String lowerCase = m16628I.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
