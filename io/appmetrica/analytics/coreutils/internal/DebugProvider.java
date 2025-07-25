package io.appmetrica.analytics.coreutils.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class DebugProvider {
    public static final boolean DEBUG = false;
    @NotNull
    public static final DebugProvider INSTANCE = new DebugProvider();

    private DebugProvider() {
    }
}
