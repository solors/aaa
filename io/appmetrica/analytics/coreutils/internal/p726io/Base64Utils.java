package io.appmetrica.analytics.coreutils.internal.p726io;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1046xd.IOStreams;

@Metadata
/* renamed from: io.appmetrica.analytics.coreutils.internal.io.Base64Utils */
/* loaded from: classes9.dex */
public final class Base64Utils {
    @NotNull
    public static final Base64Utils INSTANCE = new Base64Utils();
    public static final int IO_BUFFER_SIZE = 4096;

    private Base64Utils() {
    }

    @Nullable
    public static final String compressBase64(@Nullable byte[] bArr) {
        try {
            return Base64.encodeToString(GZIPUtils.gzipBytes(bArr), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final String compressBase64String(@Nullable String str) {
        byte[] bytes;
        if (str != null) {
            try {
                bytes = str.getBytes(Charsets.UTF_8);
            } catch (Throwable unused) {
                return null;
            }
        } else {
            bytes = null;
        }
        return compressBase64(bytes);
    }

    @NotNull
    public static final byte[] decompressBase64GzipAsBytes(@Nullable String str) {
        GZIPInputStream gZIPInputStream;
        byte[] bArr;
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(Base64.decode(str, 0));
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream2);
                try {
                    bArr = IOStreams.m1221c(gZIPInputStream);
                } catch (Throwable unused) {
                    byteArrayInputStream = byteArrayInputStream2;
                    try {
                        bArr = new byte[0];
                        byteArrayInputStream2 = byteArrayInputStream;
                        return bArr;
                    } finally {
                        CloseableUtilsKt.closeSafely(gZIPInputStream);
                        CloseableUtilsKt.closeSafely(byteArrayInputStream);
                    }
                }
            } catch (Throwable unused2) {
                gZIPInputStream = null;
            }
        } catch (Throwable unused3) {
            gZIPInputStream = null;
        }
        return bArr;
    }

    @Nullable
    public static final String decompressBase64GzipAsString(@Nullable String str) {
        try {
            return new String(decompressBase64GzipAsBytes(str), Charsets.UTF_8);
        } catch (Throwable unused) {
            return null;
        }
    }
}
