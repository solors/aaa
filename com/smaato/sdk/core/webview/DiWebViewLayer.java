package com.smaato.sdk.core.webview;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.p569di.ClassFactory;
import com.smaato.sdk.core.p569di.DiConstructor;
import com.smaato.sdk.core.p569di.DiRegistry;
import com.smaato.sdk.core.util.p574fi.Consumer;

/* loaded from: classes7.dex */
public final class DiWebViewLayer {
    private DiWebViewLayer() {
    }

    @NonNull
    public static DiRegistry createRegistry() {
        return DiRegistry.m39638of(new Consumer() { // from class: com.smaato.sdk.core.webview.h
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                DiWebViewLayer.lambda$createRegistry$2((DiRegistry) obj);
            }
        });
    }

    @NonNull
    public static BaseWebChromeClient getBaseWebChromeClientFrom(@NonNull DiConstructor diConstructor) {
        return (BaseWebChromeClient) diConstructor.get(BaseWebChromeClient.class);
    }

    @NonNull
    public static BaseWebViewClient getBaseWebViewClientFrom(@NonNull DiConstructor diConstructor) {
        return (BaseWebViewClient) diConstructor.get(BaseWebViewClient.class);
    }

    public static /* synthetic */ BaseWebViewClient lambda$createRegistry$0(DiConstructor diConstructor) {
        return new BaseWebViewClient();
    }

    public static /* synthetic */ BaseWebChromeClient lambda$createRegistry$1(DiConstructor diConstructor) {
        return new BaseWebChromeClient();
    }

    public static /* synthetic */ void lambda$createRegistry$2(DiRegistry diRegistry) {
        diRegistry.registerFactory(BaseWebViewClient.class, new ClassFactory() { // from class: com.smaato.sdk.core.webview.i
            @Override // com.smaato.sdk.core.p569di.ClassFactory
            public final Object get(DiConstructor diConstructor) {
                BaseWebViewClient lambda$createRegistry$0;
                lambda$createRegistry$0 = DiWebViewLayer.lambda$createRegistry$0(diConstructor);
                return lambda$createRegistry$0;
            }
        });
        diRegistry.registerFactory(BaseWebChromeClient.class, new ClassFactory() { // from class: com.smaato.sdk.core.webview.j
            @Override // com.smaato.sdk.core.p569di.ClassFactory
            public final Object get(DiConstructor diConstructor) {
                BaseWebChromeClient lambda$createRegistry$1;
                lambda$createRegistry$1 = DiWebViewLayer.lambda$createRegistry$1(diConstructor);
                return lambda$createRegistry$1;
            }
        });
    }
}
