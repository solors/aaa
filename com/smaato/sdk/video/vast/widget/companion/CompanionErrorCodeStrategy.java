package com.smaato.sdk.video.vast.widget.companion;

import androidx.annotation.NonNull;
import com.smaato.sdk.video.vast.widget.element.VastElementErrorCodeStrategy;
import com.smaato.sdk.video.vast.widget.element.VastElementException;
import com.smaato.sdk.video.vast.widget.element.VastElementLoadingException;

/* loaded from: classes7.dex */
public final class CompanionErrorCodeStrategy implements VastElementErrorCodeStrategy {
    @Override // com.smaato.sdk.video.vast.widget.element.VastElementErrorCodeStrategy
    public int getVastErrorCode(@NonNull VastElementException vastElementException) {
        if (vastElementException instanceof VastElementLoadingException) {
            return 603;
        }
        return 900;
    }
}
