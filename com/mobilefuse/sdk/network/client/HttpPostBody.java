package com.mobilefuse.sdk.network.client;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpRequestDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public interface HttpPostBody {

    /* compiled from: HttpRequestDataModel.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        @NotNull
        public static Map<String, String> getHeaders(@NotNull HttpPostBody httpPostBody) {
            Map<String, String> m17284j;
            m17284j = C37559r0.m17284j();
            return m17284j;
        }
    }

    @Nullable
    byte[] getContent();

    @NotNull
    String getContentType();

    @NotNull
    Map<String, String> getHeaders();
}
