package com.mobilefuse.sdk.encoding;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.encoding.UriEncodeKt */
/* loaded from: classes7.dex */
public final class UriEncode {
    public static final String uriEncode(@NotNull String uriEncode) {
        Intrinsics.checkNotNullParameter(uriEncode, "$this$uriEncode");
        return Uri.encode(uriEncode);
    }
}
