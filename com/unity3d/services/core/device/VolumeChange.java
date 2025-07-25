package com.unity3d.services.core.device;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: VolumeChange.kt */
@Metadata
/* loaded from: classes7.dex */
public interface VolumeChange {
    void clearAllListeners();

    void registerListener(@NotNull VolumeChangeListener volumeChangeListener);

    void startObserving();

    void stopObserving();

    void unregisterListener(@NotNull VolumeChangeListener volumeChangeListener);
}
