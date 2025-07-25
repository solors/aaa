package com.maticoo.sdk.core;

import com.maticoo.sdk.utils.error.InternalError;

/* loaded from: classes6.dex */
public interface InitCallback {
    void onError(InternalError internalError);

    void onSuccess();
}
