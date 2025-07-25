package io.appmetrica.analytics.coreapi.internal.crypto;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface CryptoProvider {
    @NotNull
    Encrypter getAesRsaEncrypter();
}
