package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.internal.AppCall;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ResultProcessor.kt */
@Metadata
/* loaded from: classes4.dex */
public abstract class ResultProcessor {
    @Nullable
    private final FacebookCallback<?> appCallback;

    public ResultProcessor(@Nullable FacebookCallback<?> facebookCallback) {
        this.appCallback = facebookCallback;
    }

    public void onCancel(@NotNull AppCall appCall) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        FacebookCallback<?> facebookCallback = this.appCallback;
        if (facebookCallback != null) {
            facebookCallback.onCancel();
        }
    }

    public void onError(@NotNull AppCall appCall, @NotNull FacebookException error) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(error, "error");
        FacebookCallback<?> facebookCallback = this.appCallback;
        if (facebookCallback != null) {
            facebookCallback.onError(error);
        }
    }

    public abstract void onSuccess(@NotNull AppCall appCall, @Nullable Bundle bundle);
}
