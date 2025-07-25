package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes4.dex */
public abstract class BrowserRequestOptions extends RequestOptions {
    @NonNull
    public abstract byte[] getClientDataHash();

    @NonNull
    public abstract Uri getOrigin();
}
