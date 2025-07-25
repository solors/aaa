package com.smaato.sdk.video.vast.widget.icon;

import androidx.annotation.NonNull;
import com.smaato.sdk.video.vast.widget.element.VastElementErrorCodeStrategy;
import com.smaato.sdk.video.vast.widget.element.VastElementException;

/* loaded from: classes7.dex */
public final class IconErrorCodeStrategy implements VastElementErrorCodeStrategy {
    @Override // com.smaato.sdk.video.vast.widget.element.VastElementErrorCodeStrategy
    public int getVastErrorCode(@NonNull VastElementException vastElementException) {
        return 900;
    }
}
