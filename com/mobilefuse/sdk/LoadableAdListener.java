package com.mobilefuse.sdk;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LoadableAdListener.kt */
@Metadata
/* loaded from: classes7.dex */
public interface LoadableAdListener {
    void onAdError(@NotNull AdError adError);

    void onAdExpired();

    void onAdLoaded();

    void onAdNotFilled();
}
