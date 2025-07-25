package com.mobilefuse.sdk.encoding;

import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.encoding.HttpParamsKt */
/* loaded from: classes7.dex */
public final class HttpParams {
    @NotNull
    public static final String toUriParams(@NotNull Map<String, String> toUriParams) {
        String m16628I;
        Intrinsics.checkNotNullParameter(toUriParams, "$this$toUriParams");
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry<String, String> entry : toUriParams.entrySet()) {
            builder.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String uri = builder.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "Uri.Builder().also {\n   …ild()\n        .toString()");
        m16628I = StringsJVM.m16628I(uri, "?", "", false, 4, null);
        return m16628I;
    }
}
