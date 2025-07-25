package com.mobilefuse.videoplayer.endcard.scheduler;

import com.mobilefuse.videoplayer.endcard.EndCardPresenter;
import com.mobilefuse.videoplayer.model.VastCompanion;
import com.mobilefuse.videoplayer.view.ViewCloseTrigger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BaseEndCardScheduler.kt */
@Metadata
/* loaded from: classes7.dex */
public final class BaseEndCardScheduler implements EndCardScheduler {
    private final float closeButtonDelaySeconds;

    @Override // com.mobilefuse.videoplayer.endcard.scheduler.EndCardScheduler
    public float getCloseButtonDelaySeconds() {
        return this.closeButtonDelaySeconds;
    }

    @Override // com.mobilefuse.videoplayer.endcard.scheduler.EndCardScheduler
    @NotNull
    public EndCardConfig getNextEndCardConfig(@NotNull EndCardPresenter presenter, @NotNull ViewCloseTrigger earlierViewCloseTrigger, @NotNull VastCompanion companion, boolean z) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(earlierViewCloseTrigger, "earlierViewCloseTrigger");
        Intrinsics.checkNotNullParameter(companion, "companion");
        return new EndCardConfig(companion, true, getCloseButtonDelaySeconds(), false, BaseEndCardScheduler$getNextEndCardConfig$1.INSTANCE, -1L);
    }
}
