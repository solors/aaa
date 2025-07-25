package com.yandex.mobile.ads.impl;

import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class rd0 {
    @NotNull

    /* renamed from: a */
    private static final Regex f84726a = new Regex("(?:[a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?\\.)+[a-z0-9][a-z0-9-]{0,61}[a-z0-9]");

    /* renamed from: a */
    public static boolean m30073a(@Nullable String str) {
        if (str != null) {
            return f84726a.m16766e(str);
        }
        return false;
    }
}
