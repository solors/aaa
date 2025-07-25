package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;

/* loaded from: classes9.dex */
public class DefaultNetworkResponseHandler implements NetworkResponseHandler<DefaultResponseParser.Response> {

    /* renamed from: a */
    private final DefaultResponseParser f95869a;

    public DefaultNetworkResponseHandler() {
        this(new DefaultResponseParser());
    }

    DefaultNetworkResponseHandler(DefaultResponseParser defaultResponseParser) {
        this.f95869a = defaultResponseParser;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    @Nullable
    public DefaultResponseParser.Response handle(@NonNull ResponseDataHolder responseDataHolder) {
        if (200 == responseDataHolder.getResponseCode()) {
            return this.f95869a.parse(responseDataHolder.getResponseData());
        }
        return null;
    }
}
