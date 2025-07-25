package com.mobilefuse.videoplayer.endcard.scheduler;

import com.mobilefuse.videoplayer.endcard.EndCardPresenter;
import com.mobilefuse.videoplayer.model.VastCompanion;
import com.mobilefuse.videoplayer.view.ViewCloseTrigger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EndCardScheduler.kt */
@Metadata
/* loaded from: classes7.dex */
public interface EndCardScheduler {
    float getCloseButtonDelaySeconds();

    @Nullable
    EndCardConfig getNextEndCardConfig(@NotNull EndCardPresenter endCardPresenter, @NotNull ViewCloseTrigger viewCloseTrigger, @NotNull VastCompanion vastCompanion, boolean z);
}
