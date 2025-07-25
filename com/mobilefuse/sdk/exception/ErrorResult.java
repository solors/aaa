package com.mobilefuse.sdk.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Either.kt */
@Metadata
/* loaded from: classes7.dex */
public final class ErrorResult<E> extends Either {
    private final E value;

    public ErrorResult(E e) {
        super(null);
        this.value = e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorResult copy$default(ErrorResult errorResult, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = errorResult.value;
        }
        return errorResult.copy(obj);
    }

    public final E component1() {
        return this.value;
    }

    @NotNull
    public final ErrorResult<E> copy(E e) {
        return new ErrorResult<>(e);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof ErrorResult) || !Intrinsics.m17075f(this.value, ((ErrorResult) obj).value)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final E getValue() {
        return this.value;
    }

    public int hashCode() {
        E e = this.value;
        if (e != null) {
            return e.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "ErrorResult(value=" + this.value + ")";
    }
}
