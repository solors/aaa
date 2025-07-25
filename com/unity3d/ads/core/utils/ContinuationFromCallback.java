package com.unity3d.ads.core.utils;

import com.unity3d.ads.core.data.model.exception.ExposureException;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;

/* compiled from: ContinuationFromCallback.kt */
@Metadata
/* loaded from: classes7.dex */
public final class ContinuationFromCallback extends WebViewCallback {
    @NotNull
    private final Continuation<Object> continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuationFromCallback(@NotNull Continuation<Object> continuation) {
        super("", 0);
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.continuation = continuation;
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void error(@Nullable Enum<?> r5, @NotNull Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Continuation<Object> continuation = this.continuation;
        Result.C38506a c38506a = Result.f101870c;
        continuation.resumeWith(Result.m14549b(C38508r.m14540a(new ExposureException("Invocation failed with: " + r5, params))));
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void invoke(@NotNull Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.continuation.resumeWith(Result.m14549b(params));
    }
}
