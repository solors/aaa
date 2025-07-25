package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.WebViewAdsError;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.store.StoreError;
import com.unity3d.services.store.StoreEvent;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* compiled from: WebViewStoreExceptionHandler.kt */
@Metadata
/* loaded from: classes7.dex */
public final class WebViewStoreExceptionHandler implements StoreExceptionHandler {
    @NotNull
    private final WebViewErrorHandler _webViewErrorHandler;

    public WebViewStoreExceptionHandler(@NotNull WebViewErrorHandler _webViewErrorHandler) {
        Intrinsics.checkNotNullParameter(_webViewErrorHandler, "_webViewErrorHandler");
        this._webViewErrorHandler = _webViewErrorHandler;
    }

    private final StoreError getStoreError(Exception exc) {
        if (exc instanceof NoSuchMethodException) {
            return StoreError.NO_SUCH_METHOD;
        }
        if (exc instanceof IllegalAccessException) {
            return StoreError.ILLEGAL_ACCESS;
        }
        if (exc instanceof JSONException) {
            return StoreError.JSON_ERROR;
        }
        if (exc instanceof InvocationTargetException) {
            return StoreError.INVOCATION_TARGET;
        }
        if (exc instanceof ClassNotFoundException) {
            return StoreError.CLASS_NOT_FOUND;
        }
        return StoreError.UNKNOWN_ERROR;
    }

    private final void sendErrorToWebView(StoreEvent storeEvent, StoreError storeError, int i, Exception exc) {
        this._webViewErrorHandler.handleError((WebViewAdsError) new StoreWebViewError(storeEvent, exc.getMessage(), Integer.valueOf(i), storeError, exc.getMessage()));
    }

    @Override // com.unity3d.services.store.core.StoreExceptionHandler
    public void handleStoreException(@NotNull StoreEvent storeEvent, int i, @NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(storeEvent, "storeEvent");
        Intrinsics.checkNotNullParameter(exception, "exception");
        sendErrorToWebView(storeEvent, getStoreError(exception), i, exception);
    }
}
