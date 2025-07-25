package com.google.android.gms.fido.fido2.api.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes4.dex */
public abstract class RequestOptions extends AbstractSafeParcelable {
    @Nullable
    public abstract AuthenticationExtensions getAuthenticationExtensions();

    @NonNull
    public abstract byte[] getChallenge();

    @Nullable
    public abstract Integer getRequestId();

    @Nullable
    public abstract Double getTimeoutSeconds();

    @Nullable
    public abstract TokenBinding getTokenBinding();

    @NonNull
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }
}
