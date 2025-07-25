package com.unity3d.ads.core.data.model.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TransactionException.kt */
@Metadata
/* loaded from: classes7.dex */
public final class TransactionException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionException(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
