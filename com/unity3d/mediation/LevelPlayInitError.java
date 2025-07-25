package com.unity3d.mediation;

import com.ironsource.C19784dq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public final class LevelPlayInitError {

    /* renamed from: a */
    private final int f74497a;
    @NotNull

    /* renamed from: b */
    private final String f74498b;

    public LevelPlayInitError(int i, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f74497a = i;
        this.f74498b = errorMessage;
    }

    public final int getErrorCode() {
        return this.f74497a;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.f74498b;
    }

    @NotNull
    public String toString() {
        return "LevelPlayError(errorCode=" + this.f74497a + ", errorMessage='" + this.f74498b + "')";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInitError(@NotNull C19784dq sdkError) {
        this(sdkError.m58855c(), sdkError.m58854d());
        Intrinsics.checkNotNullParameter(sdkError, "sdkError");
    }
}
