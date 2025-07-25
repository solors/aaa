package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class up0 {
    @NotNull

    /* renamed from: a */
    private static final ConcurrentHashMap<String, sp0> f86347a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final /* synthetic */ int f86348b = 0;

    @NotNull
    /* renamed from: a */
    public static final sp0 m28714a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return m28713a(context, "YadPreferenceFile");
    }

    @NotNull
    /* renamed from: a */
    public static final sp0 m28713a(@NotNull Context context, @NotNull String filename) {
        sp0 putIfAbsent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filename, "filename");
        ConcurrentHashMap<String, sp0> concurrentHashMap = f86347a;
        sp0 sp0Var = concurrentHashMap.get(filename);
        if (sp0Var == null && (putIfAbsent = concurrentHashMap.putIfAbsent(filename, (sp0Var = new tp0(context, filename, new lt1())))) != null) {
            sp0Var = putIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(sp0Var, "getOrPut(...)");
        return sp0Var;
    }
}
