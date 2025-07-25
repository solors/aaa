package com.mobilefuse.sdk.utils;

import com.mobilefuse.sdk.AdError;
import com.mobilefuse.sdk.config.ObservableConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdErrorHelper.kt */
@Metadata
/* loaded from: classes7.dex */
public interface AdErrorCallback {
    void onError(@NotNull AdError adError, @NotNull ObservableConfig observableConfig);
}
