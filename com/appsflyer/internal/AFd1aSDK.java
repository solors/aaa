package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public interface AFd1aSDK {

    /* loaded from: classes2.dex */
    public interface AFa1zSDK {
        void onConfigurationChanged(boolean z);
    }

    void AFInAppEventParameterName();

    void AFInAppEventParameterName(@NonNull Throwable th, @NonNull String str);

    void AFInAppEventType();

    void AFKeystoreWrapper(@Nullable AFa1zSDK aFa1zSDK);
}
