package io.appmetrica.analytics.coreutils.internal.asserts;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class DebugAssert {
    @NotNull
    public static final DebugAssert INSTANCE = new DebugAssert();

    private DebugAssert() {
    }

    public static final void assertNotNull(@Nullable Object obj, @NotNull String str) {
    }
}
