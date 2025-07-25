package com.google.android.gms.auth;

import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes4.dex */
public class UserRecoverableNotifiedException extends GoogleAuthException {
    public UserRecoverableNotifiedException(@NonNull String str) {
        super(str);
    }

    public UserRecoverableNotifiedException(@NonNull String str, @NonNull Throwable th) {
        super(str, th);
    }
}
