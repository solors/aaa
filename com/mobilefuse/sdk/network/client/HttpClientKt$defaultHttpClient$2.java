package com.mobilefuse.sdk.network.client;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpClient.kt */
@Metadata
/* loaded from: classes7.dex */
final class HttpClientKt$defaultHttpClient$2 extends Lambda implements Functions<AndroidHttpClient> {
    public static final HttpClientKt$defaultHttpClient$2 INSTANCE = new HttpClientKt$defaultHttpClient$2();

    HttpClientKt$defaultHttpClient$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final AndroidHttpClient invoke() {
        return new AndroidHttpClient();
    }
}
