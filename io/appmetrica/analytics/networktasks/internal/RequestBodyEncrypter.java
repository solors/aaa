package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public interface RequestBodyEncrypter {
    @Nullable
    byte[] encrypt(byte[] bArr);

    @NonNull
    RequestBodyEncryptionMode getEncryptionMode();
}
