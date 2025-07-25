package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ac2 {
    @NotNull
    /* renamed from: a */
    public static String m35919a(@NotNull String string) {
        CharSequence m16571b1;
        Intrinsics.checkNotNullParameter(string, "string");
        m16571b1 = C37690r.m16571b1(string);
        String obj = m16571b1.toString();
        if (obj.length() > 0) {
            return "yma_" + obj;
        }
        return "";
    }
}
