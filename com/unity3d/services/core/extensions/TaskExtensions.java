package com.unity3d.services.core.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.unity3d.services.core.extensions.AbortRetryException */
/* loaded from: classes7.dex */
public final class TaskExtensions extends Exception {
    @NotNull
    private final String reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskExtensions(@NotNull String reason) {
        super(reason);
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.reason = reason;
    }
}
