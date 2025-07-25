package io.appmetrica.analytics.coreapi.internal.crypto;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public interface Encrypter {
    @Nullable
    byte[] encrypt(@NotNull byte[] bArr);
}
