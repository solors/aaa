package com.unity3d.ads.core.extensions;

import java.net.URLConnection;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.C39208h;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.unity3d.ads.core.extensions.StringExtensionsKt */
/* loaded from: classes7.dex */
public final class StringExtensions {
    @NotNull
    public static final String getSHA256Hash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        String mo13395l = C39208h.m13553v(Arrays.copyOf(bytes, bytes.length)).m13570B().mo13395l();
        Intrinsics.checkNotNullExpressionValue(mo13395l, "bytes.sha256().hex()");
        return mo13395l;
    }

    @NotNull
    public static final String guessMimeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String guessMimeType = URLConnection.guessContentTypeFromName(str);
        Intrinsics.checkNotNullExpressionValue(guessMimeType, "guessMimeType");
        return guessMimeType;
    }
}
