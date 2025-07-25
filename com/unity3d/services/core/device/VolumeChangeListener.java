package com.unity3d.services.core.device;

import kotlin.Metadata;

/* compiled from: VolumeChangeListener.kt */
@Metadata
/* loaded from: classes7.dex */
public interface VolumeChangeListener {
    int getStreamType();

    void onVolumeChanged(int i);
}
