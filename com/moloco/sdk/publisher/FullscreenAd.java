package com.moloco.sdk.publisher;

import com.moloco.sdk.publisher.AdShowListener;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public interface FullscreenAd<T extends AdShowListener> extends AdLoad, Destroyable {
    void show(@Nullable T t);
}
