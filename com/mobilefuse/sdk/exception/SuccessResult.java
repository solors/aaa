package com.mobilefuse.sdk.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Either.kt */
@Metadata
/* loaded from: classes7.dex */
public final class SuccessResult<T> extends Either {
    private final T value;

    public SuccessResult(T t) {
        super(null);
        this.value = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuccessResult copy$default(SuccessResult successResult, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = successResult.value;
        }
        return successResult.copy(obj);
    }

    public final T component1() {
        return this.value;
    }

    @NotNull
    public final SuccessResult<T> copy(T t) {
        return new SuccessResult<>(t);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof SuccessResult) || !Intrinsics.m17075f(this.value, ((SuccessResult) obj).value)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t = this.value;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "SuccessResult(value=" + this.value + ")";
    }
}
