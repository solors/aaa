package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.encryption.AESRSAEncrypter;

/* loaded from: classes9.dex */
public class AESRSARequestBodyEncrypter implements RequestBodyEncrypter {

    /* renamed from: a */
    private final AESRSAEncrypter f95857a;

    public AESRSARequestBodyEncrypter() {
        this(new AESRSAEncrypter());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter
    @Nullable
    public byte[] encrypt(@Nullable byte[] bArr) {
        return this.f95857a.encrypt(bArr);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter
    @NonNull
    public RequestBodyEncryptionMode getEncryptionMode() {
        return RequestBodyEncryptionMode.AES_RSA;
    }

    AESRSARequestBodyEncrypter(AESRSAEncrypter aESRSAEncrypter) {
        this.f95857a = aESRSAEncrypter;
    }
}
