package com.vungle.ads.internal.network.converters;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p1077ze.ResponseBody;

@Metadata
/* renamed from: com.vungle.ads.internal.network.converters.b */
/* loaded from: classes7.dex */
public final class EmptyResponseConverter implements Converter<ResponseBody, Void> {
    @Override // com.vungle.ads.internal.network.converters.Converter
    @Nullable
    public Void convert(@Nullable ResponseBody responseBody) {
        if (responseBody != null) {
            responseBody.close();
            return null;
        }
        return null;
    }
}
