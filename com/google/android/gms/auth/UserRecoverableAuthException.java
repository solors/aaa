package com.google.android.gms.auth;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepName;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
@KeepName
/* loaded from: classes4.dex */
public class UserRecoverableAuthException extends GoogleAuthException {
    @Nullable
    private final Intent zza;

    public UserRecoverableAuthException(@Nullable String str, @Nullable Intent intent) {
        super(str);
        this.zza = intent;
    }

    @Nullable
    public Intent getIntent() {
        Intent intent = this.zza;
        if (intent == null) {
            return null;
        }
        return new Intent(intent);
    }
}
