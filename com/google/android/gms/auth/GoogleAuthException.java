package com.google.android.gms.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes4.dex */
public class GoogleAuthException extends Exception {
    public GoogleAuthException() {
    }

    public GoogleAuthException(@Nullable String str) {
        super(str);
    }

    public GoogleAuthException(@Nullable String str, @NonNull Throwable th) {
        super(str, th);
    }

    public GoogleAuthException(@NonNull Throwable th) {
        super(th);
    }
}
