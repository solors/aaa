package com.pubmatic.sdk.common;

import android.content.Context;
import androidx.annotation.AnyThread;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: OpenWrapSDKInitializer.kt */
@Metadata
/* loaded from: classes7.dex */
public interface OpenWrapSDKInitializer {

    /* compiled from: OpenWrapSDKInitializer.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public interface Listener {
        void onFailure(@NotNull POBError pOBError);

        void onSuccess();
    }

    @AnyThread
    void initialize(@NotNull Context context, @NotNull OpenWrapSDKConfig openWrapSDKConfig, @NotNull Listener listener);

    boolean isInitialized();
}
