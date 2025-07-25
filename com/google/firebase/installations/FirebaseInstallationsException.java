package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseException;

/* loaded from: classes4.dex */
public class FirebaseInstallationsException extends FirebaseException {
    @NonNull

    /* renamed from: b */
    private final Status f43076b;

    /* loaded from: classes4.dex */
    public enum Status {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(@NonNull Status status) {
        this.f43076b = status;
    }

    @NonNull
    public Status getStatus() {
        return this.f43076b;
    }

    public FirebaseInstallationsException(@NonNull String str, @NonNull Status status) {
        super(str);
        this.f43076b = status;
    }

    public FirebaseInstallationsException(@NonNull String str, @NonNull Status status, @NonNull Throwable th) {
        super(str, th);
        this.f43076b = status;
    }
}
