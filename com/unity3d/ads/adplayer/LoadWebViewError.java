package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewClientError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdPlayerError.kt */
@Metadata
/* loaded from: classes7.dex */
public final class LoadWebViewError extends AdPlayerError {
    @NotNull
    private final List<WebViewClientError> errors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadWebViewError(@NotNull List<WebViewClientError> errors) {
        super("AdPlayer was not able to load the webview.", null);
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.errors = errors;
    }

    @NotNull
    public final List<WebViewClientError> getErrors() {
        return this.errors;
    }
}
