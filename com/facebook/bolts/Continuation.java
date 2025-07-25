package com.facebook.bolts;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Continuation.kt */
@Metadata
/* loaded from: classes2.dex */
public interface Continuation<TTaskResult, TContinuationResult> {
    @Nullable
    TContinuationResult then(@NotNull Task<TTaskResult> task) throws Exception;
}
