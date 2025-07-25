package com.mobilefuse.videoplayer.endcard;

import com.mobilefuse.videoplayer.model.VastClickThrough;
import com.mobilefuse.videoplayer.model.VastCompanion;
import com.mobilefuse.videoplayer.model.VastError;
import com.mobilefuse.videoplayer.model.VastTrackingEventType;
import com.mobilefuse.videoplayer.view.ViewCloseTrigger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EndCardListener.kt */
@Metadata
/* loaded from: classes7.dex */
public interface EndCardListener {
    void onClicked(@NotNull VastCompanion vastCompanion, @Nullable VastClickThrough vastClickThrough);

    void onClosed(@NotNull VastCompanion vastCompanion, @NotNull ViewCloseTrigger viewCloseTrigger);

    void onCompleted();

    void onError(@NotNull VastError vastError);

    void onTrackingEvent(@NotNull VastCompanion vastCompanion, @NotNull VastTrackingEventType vastTrackingEventType);
}
