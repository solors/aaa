package com.yandex.mobile.ads.impl;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class dz1 {
    @Nullable
    /* renamed from: a */
    public static Object m34738a(@NotNull Callable tryBlock, @Nullable Object obj, @NotNull String whileWhat, @NotNull String whatIsNull) {
        Intrinsics.checkNotNullParameter(tryBlock, "tryBlock");
        Intrinsics.checkNotNullParameter(whileWhat, "whileWhat");
        Intrinsics.checkNotNullParameter(whatIsNull, "whatIsNull");
        if (obj != null) {
            try {
                return tryBlock.call();
            } catch (Throwable unused) {
                um0.m28726c(new Object[0]);
                return null;
            }
        }
        um0.m28723f(new Object[0]);
        return null;
    }
}
