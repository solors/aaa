package com.mobilefuse.sdk.network.client;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: HttpClient.kt */
@Metadata
/* loaded from: classes7.dex */
public final class HttpClientKt {
    @NotNull
    private static final InterfaceC38501j defaultHttpClient$delegate;

    static {
        InterfaceC38501j m14554a;
        m14554a = LazyJVM.m14554a(HttpClientKt$defaultHttpClient$2.INSTANCE);
        defaultHttpClient$delegate = m14554a;
    }

    @NotNull
    public static final HttpClient getDefaultHttpClient() {
        return (HttpClient) defaultHttpClient$delegate.getValue();
    }
}
