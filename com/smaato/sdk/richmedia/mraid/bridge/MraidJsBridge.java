package com.smaato.sdk.richmedia.mraid.bridge;

import android.net.Uri;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.richmedia.mraid.MraidUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class MraidJsBridge {
    @NonNull
    private final Map<String, MraidCommandHandler> handlers = Collections.synchronizedMap(new HashMap());
    @NonNull
    private final Logger logger;
    @NonNull
    private final WebView webView;

    public MraidJsBridge(@NonNull WebView webView, @NonNull Logger logger) {
        this.webView = (WebView) Objects.requireNonNull(webView);
        this.logger = (Logger) Objects.requireNonNull(logger);
    }

    /* renamed from: a */
    public static /* synthetic */ void m39111a(MraidJsBridge mraidJsBridge, Uri uri, boolean z, String str) {
        mraidJsBridge.lambda$handleMraidUrl$0(uri, z, str);
    }

    private void fireNativeCallCompleteEvent() {
        runScript("window.mraidbridge.nativeCallComplete();");
    }

    @NonNull
    private Map<String, String> getQueryParamMap(@NonNull Uri uri) {
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                hashMap.put(str, queryParameter);
            }
        }
        return Maps.toImmutableMap(hashMap);
    }

    private void handleCommand(@NonNull String str, @NonNull Map<String, String> map, boolean z) {
        MraidCommandHandler mraidCommandHandler = this.handlers.get(str);
        if (mraidCommandHandler == null) {
            Logger logger = this.logger;
            LogDomain logDomain = LogDomain.MRAID;
            logger.debug(logDomain, "A handler for command \"" + str + "\" is not registered", new Object[0]);
            return;
        }
        mraidCommandHandler.handle(map, z);
    }

    public /* synthetic */ void lambda$handleMraidUrl$0(Uri uri, boolean z, String str) {
        handleCommand(str, getQueryParamMap(uri), z);
    }

    public void addCommandHandler(@NonNull String str, @NonNull MraidCommandHandler mraidCommandHandler) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.handlers.put(str, mraidCommandHandler);
    }

    public void fireReadyEvent() {
        runScript("window.mraidbridge.fireReadyEvent();");
    }

    public void handleMraidUrl(@NonNull String str, final boolean z) {
        final Uri parse = Uri.parse(str);
        Objects.onNotNull(parse.getHost(), new Consumer() { // from class: com.smaato.sdk.richmedia.mraid.bridge.a
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                MraidJsBridge.m39111a(MraidJsBridge.this, parse, z, (String) obj);
            }
        });
        fireNativeCallCompleteEvent();
    }

    public void runScript(@NonNull String str) {
        Logger logger = this.logger;
        LogDomain logDomain = LogDomain.MRAID;
        logger.info(logDomain, "Running script: " + str, new Object[0]);
        this.webView.loadUrl(MraidUtils.format("javascript:%s", str));
    }
}
