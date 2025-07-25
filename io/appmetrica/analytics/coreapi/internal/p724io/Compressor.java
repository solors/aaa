package io.appmetrica.analytics.coreapi.internal.p724io;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.coreapi.internal.io.Compressor */
/* loaded from: classes9.dex */
public interface Compressor {
    @Nullable
    byte[] compress(@NonNull byte[] bArr) throws IOException;

    @Nullable
    byte[] uncompress(@NonNull byte[] bArr) throws IOException;
}
