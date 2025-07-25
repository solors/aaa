package com.google.android.gms.auth;

import android.content.Intent;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes4.dex */
public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {
    private final int zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GooglePlayServicesAvailabilityException(int i, @Nullable String str, @Nullable Intent intent) {
        super(str, intent);
        this.zza = i;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
