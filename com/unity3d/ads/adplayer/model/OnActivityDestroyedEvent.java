package com.unity3d.ads.adplayer.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: WebViewEvent.kt */
@Metadata
/* loaded from: classes7.dex */
public final class OnActivityDestroyedEvent implements WebViewEvent {
    @NotNull
    private final String category = "ADVIEWER";
    @NotNull
    private final String name = "ON_ACTIVITY_DESTROY";
    @NotNull
    private final Object[] parameters = new Object[0];

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    @NotNull
    public String getCategory() {
        return this.category;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    @NotNull
    public Object[] getParameters() {
        return this.parameters;
    }
}
