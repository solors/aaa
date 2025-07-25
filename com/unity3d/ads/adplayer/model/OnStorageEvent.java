package com.unity3d.ads.adplayer.model;

import com.unity3d.services.core.device.StorageEvent;
import com.unity3d.services.core.device.StorageManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebViewEvent.kt */
@Metadata
/* loaded from: classes7.dex */
public final class OnStorageEvent implements WebViewEvent {
    @NotNull
    private final String category;
    @NotNull
    private final String name;
    @NotNull
    private final Object[] parameters;

    public OnStorageEvent(@NotNull StorageEvent eventType, @NotNull StorageManager.StorageType storageType, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(storageType, "storageType");
        this.category = "STORAGE";
        this.name = eventType.name();
        this.parameters = new Object[]{storageType.name(), obj};
    }

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
