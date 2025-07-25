package com.mobilefuse.sdk.service.impl.ifa;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IfaDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class IfaException {
    @NotNull
    private final Throwable exception;

    public IfaException(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.exception = exception;
    }

    public static /* synthetic */ IfaException copy$default(IfaException ifaException, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = ifaException.exception;
        }
        return ifaException.copy(th);
    }

    @NotNull
    public final Throwable component1() {
        return this.exception;
    }

    @NotNull
    public final IfaException copy(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new IfaException(exception);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof IfaException) || !Intrinsics.m17075f(this.exception, ((IfaException) obj).exception)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @NotNull
    public final Throwable getException() {
        return this.exception;
    }

    public int hashCode() {
        Throwable th = this.exception;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "IfaException(exception=" + this.exception + ")";
    }
}
