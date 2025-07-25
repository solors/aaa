package io.appmetrica.analytics.coreutils.internal.p726io;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.p724io.Compressor;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor */
/* loaded from: classes9.dex */
public class GZIPCompressor implements Compressor {
    @Override // io.appmetrica.analytics.coreapi.internal.p724io.Compressor
    @Nullable
    public byte[] compress(@Nullable byte[] bArr) throws IOException {
        if (bArr == null) {
            return null;
        }
        return GZIPUtils.gzipBytes(bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.p724io.Compressor
    @Nullable
    public byte[] uncompress(@Nullable byte[] bArr) throws IOException {
        if (bArr == null) {
            return null;
        }
        return GZIPUtils.unGzipBytes(bArr);
    }
}
