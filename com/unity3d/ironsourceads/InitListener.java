package com.unity3d.ironsourceads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public interface InitListener {
    void onInitFailed(@NotNull IronSourceError ironSourceError);

    void onInitSuccess();
}
