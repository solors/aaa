package com.facebook;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LoginStatusCallback.kt */
@Metadata
/* loaded from: classes3.dex */
public interface LoginStatusCallback {
    void onCompleted(@NotNull AccessToken accessToken);

    void onError(@NotNull Exception exc);

    void onFailure();
}
