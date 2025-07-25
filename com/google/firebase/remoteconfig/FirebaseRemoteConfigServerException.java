package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

/* loaded from: classes4.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: b */
    private final int f43421b;

    public FirebaseRemoteConfigServerException(int i, @NonNull String str) {
        super(str);
        this.f43421b = i;
    }

    public int getHttpStatusCode() {
        return this.f43421b;
    }

    public FirebaseRemoteConfigServerException(int i, @NonNull String str, @Nullable Throwable th) {
        super(str, th);
        this.f43421b = i;
    }

    public FirebaseRemoteConfigServerException(@NonNull String str, FirebaseRemoteConfigException.Code code) {
        super(str, code);
        this.f43421b = -1;
    }

    public FirebaseRemoteConfigServerException(int i, @NonNull String str, FirebaseRemoteConfigException.Code code) {
        super(str, code);
        this.f43421b = i;
    }

    public FirebaseRemoteConfigServerException(@NonNull String str, @Nullable Throwable th, @NonNull FirebaseRemoteConfigException.Code code) {
        super(str, th, code);
        this.f43421b = -1;
    }

    public FirebaseRemoteConfigServerException(int i, @NonNull String str, @Nullable Throwable th, @NonNull FirebaseRemoteConfigException.Code code) {
        super(str, th, code);
        this.f43421b = i;
    }
}
