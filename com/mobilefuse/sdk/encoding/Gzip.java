package com.mobilefuse.sdk.encoding;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1046xd.C44986p;
import p1046xd.Closeable;

/* compiled from: Gzip.kt */
@Metadata
/* loaded from: classes7.dex */
public final class Gzip {
    @Nullable
    public static final String gunzip(@NotNull byte[] gunzip) {
        BufferedReader bufferedReader;
        Intrinsics.checkNotNullParameter(gunzip, "$this$gunzip");
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new GZIPInputStream(new ByteArrayInputStream(gunzip)), Charsets.UTF_8);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, 8192);
            }
            String m1163g = C44986p.m1163g(bufferedReader);
            Closeable.m1220a(bufferedReader, null);
            return m1163g;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NotNull
    public static final byte[] gzip(@NotNull byte[] gzip) {
        Intrinsics.checkNotNullParameter(gzip, "$this$gzip");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(gzip);
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "byteStream.toByteArray()");
        return byteArray;
    }

    @NotNull
    public static final byte[] toGzipByteArray(@NotNull String toGzipByteArray) {
        Intrinsics.checkNotNullParameter(toGzipByteArray, "$this$toGzipByteArray");
        byte[] bytes = toGzipByteArray.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return gzip(bytes);
    }
}
