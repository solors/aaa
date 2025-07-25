package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class NetworkTaskForSendingDataParamsAppender {

    /* renamed from: a */
    private final RequestBodyEncrypter f95896a;

    public NetworkTaskForSendingDataParamsAppender(@NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this.f95896a = requestBodyEncrypter;
    }

    public void appendEncryptedData(@NonNull Uri.Builder builder) {
        if (this.f95896a.getEncryptionMode() == RequestBodyEncryptionMode.AES_RSA) {
            builder.appendQueryParameter(CommonUrlParts.ENCRYPTED_REQUEST, "1");
        }
    }
}
