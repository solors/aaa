package com.smaato.sdk.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes7.dex */
public final class Either<Left, Right> {
    @Nullable
    private final Left left;
    @Nullable
    private final Right right;

    @VisibleForTesting
    Either(@Nullable Left left, @Nullable Right right) {
        if (left == null && right == null) {
            throw new IllegalArgumentException("Both parameters are null. Either left or right parameter should be not null");
        }
        if (left != null && right != null) {
            throw new IllegalArgumentException("Both parameters are not null. Either left or right parameter should be null");
        }
        this.left = left;
        this.right = right;
    }

    @Nullable
    public Left left() {
        return this.left;
    }

    @Nullable
    public Right right() {
        return this.right;
    }

    @NonNull
    public static <Left, Right> Either<Left, Right> left(@NonNull Left left) {
        return new Either<>(left, null);
    }

    @NonNull
    public static <Left, Right> Either<Left, Right> right(@NonNull Right right) {
        return new Either<>(null, right);
    }
}
