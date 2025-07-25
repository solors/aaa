package com.moloco.sdk.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes7.dex */
public final class MediationInfo {
    public static final int $stable = 0;
    @NotNull
    private final String name;

    public MediationInfo(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }
}
