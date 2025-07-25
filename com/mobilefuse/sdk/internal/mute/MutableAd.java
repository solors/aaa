package com.mobilefuse.sdk.internal.mute;

import com.mobilefuse.sdk.MuteChangedListener;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: MutableAd.kt */
@Metadata
/* loaded from: classes7.dex */
public interface MutableAd {
    @Nullable
    MuteChangedListener getMuteChangedListener();

    boolean isMuted();

    void setMuteChangedListener(@Nullable MuteChangedListener muteChangedListener);

    void setMuted(boolean z);
}
