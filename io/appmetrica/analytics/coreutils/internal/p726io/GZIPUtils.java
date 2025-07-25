package io.appmetrica.analytics.coreutils.internal.p726io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1046xd.IOStreams;

@Metadata
/* renamed from: io.appmetrica.analytics.coreutils.internal.io.GZIPUtils */
/* loaded from: classes9.dex */
public final class GZIPUtils {
    @NotNull
    public static final GZIPUtils INSTANCE = new GZIPUtils();

    private GZIPUtils() {
    }

    @Nullable
    public static final byte[] gzipBytes(@Nullable byte[] bArr) throws IOException {
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr2 = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (bArr != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                    try {
                        gZIPOutputStream.write(bArr);
                        gZIPOutputStream.finish();
                        bArr2 = byteArrayOutputStream2.toByteArray();
                        CloseableUtilsKt.closeSafely(gZIPOutputStream);
                        CloseableUtilsKt.closeSafely(byteArrayOutputStream2);
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        CloseableUtilsKt.closeSafely(gZIPOutputStream);
                        CloseableUtilsKt.closeSafely(byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                gZIPOutputStream = null;
            }
        }
        return bArr2;
    }

    @Nullable
    public static final byte[] unGzipBytes(@Nullable byte[] bArr) throws IOException {
        Throwable th;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        byte[] bArr2 = null;
        ByteArrayInputStream byteArrayInputStream2 = null;
        if (bArr != null) {
            try {
                ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(bArr);
                try {
                    gZIPInputStream = new GZIPInputStream(byteArrayInputStream3);
                } catch (Throwable th2) {
                    byteArrayInputStream = byteArrayInputStream3;
                    th = th2;
                    gZIPInputStream = null;
                }
                try {
                    bArr2 = IOStreams.m1221c(gZIPInputStream);
                    CloseableUtilsKt.closeSafely(gZIPInputStream);
                    CloseableUtilsKt.closeSafely(byteArrayInputStream3);
                } catch (Throwable th3) {
                    byteArrayInputStream = byteArrayInputStream3;
                    th = th3;
                    byteArrayInputStream2 = byteArrayInputStream;
                    CloseableUtilsKt.closeSafely(gZIPInputStream);
                    CloseableUtilsKt.closeSafely(byteArrayInputStream2);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                gZIPInputStream = null;
            }
        }
        return bArr2;
    }
}
