package com.vungle.ads.internal.util;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import p1046xd.Closeable;

@Metadata
/* renamed from: com.vungle.ads.internal.util.m */
/* loaded from: classes7.dex */
public final class InputOutputUtils {
    @NotNull
    public static final InputOutputUtils INSTANCE = new InputOutputUtils();

    private InputOutputUtils() {
    }

    @NotNull
    public final String convertForSending(@NotNull String stringToConvert) throws IOException {
        Intrinsics.checkNotNullParameter(stringToConvert, "stringToConvert");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(stringToConvert.length());
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            byte[] bytes = stringToConvert.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            gZIPOutputStream.write(bytes);
            gZIPOutputStream.close();
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(compressed, Base64.NO_WRAP)");
            Closeable.m1220a(gZIPOutputStream, null);
            Closeable.m1220a(byteArrayOutputStream, null);
            return encodeToString;
        } finally {
        }
    }
}
