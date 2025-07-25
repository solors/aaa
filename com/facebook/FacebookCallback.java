package com.facebook;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: FacebookCallback.kt */
@Metadata
/* loaded from: classes3.dex */
public interface FacebookCallback<RESULT> {
    void onCancel();

    void onError(@NotNull FacebookException facebookException);

    void onSuccess(RESULT result);
}
