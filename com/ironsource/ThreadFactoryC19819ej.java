package com.ironsource;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.ej */
/* loaded from: classes6.dex */
final class ThreadFactoryC19819ej implements ThreadFactory {
    @NotNull

    /* renamed from: a */
    private final AtomicInteger f49879a = new AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@NotNull Runnable r) {
        Intrinsics.checkNotNullParameter(r, "r");
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format(Locale.ENGLISH, "%s-%d", Arrays.copyOf(new Object[]{"IronSourceThread", Integer.valueOf(this.f49879a.incrementAndGet())}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return new Thread(r, format);
    }
}
