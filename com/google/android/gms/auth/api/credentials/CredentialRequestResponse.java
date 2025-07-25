package com.google.android.gms.auth.api.credentials;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Response;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
@Deprecated
/* loaded from: classes4.dex */
public class CredentialRequestResponse extends Response<CredentialRequestResult> {
    @Nullable
    public Credential getCredential() {
        return getResult().getCredential();
    }
}
