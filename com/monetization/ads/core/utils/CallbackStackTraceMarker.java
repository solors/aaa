package com.monetization.ads.core.utils;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public final class CallbackStackTraceMarker {
    public CallbackStackTraceMarker(@NotNull Functions<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke();
    }
}
