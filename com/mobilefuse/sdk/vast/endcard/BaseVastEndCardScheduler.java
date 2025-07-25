package com.mobilefuse.sdk.vast.endcard;

import com.mobilefuse.videoplayer.endcard.EndCardPresenter;
import com.mobilefuse.videoplayer.endcard.scheduler.EndCardConfig;
import com.mobilefuse.videoplayer.endcard.scheduler.EndCardScheduler;
import com.mobilefuse.videoplayer.model.VastCompanion;
import com.mobilefuse.videoplayer.view.ViewCloseTrigger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BaseVastEndCardScheduler.kt */
@Metadata
/* loaded from: classes7.dex */
public final class BaseVastEndCardScheduler implements EndCardScheduler {
    private final float closeButtonDelaySeconds;
    private final boolean isLastEndCardCloseable;

    public BaseVastEndCardScheduler(float f, boolean z) {
        this.closeButtonDelaySeconds = f;
        this.isLastEndCardCloseable = z;
    }

    @Override // com.mobilefuse.videoplayer.endcard.scheduler.EndCardScheduler
    public float getCloseButtonDelaySeconds() {
        return this.closeButtonDelaySeconds;
    }

    @Override // com.mobilefuse.videoplayer.endcard.scheduler.EndCardScheduler
    @NotNull
    public EndCardConfig getNextEndCardConfig(@NotNull EndCardPresenter presenter, @NotNull ViewCloseTrigger earlierViewCloseTrigger, @NotNull VastCompanion companion, boolean z) {
        boolean z2;
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(earlierViewCloseTrigger, "earlierViewCloseTrigger");
        Intrinsics.checkNotNullParameter(companion, "companion");
        if (z) {
            z2 = this.isLastEndCardCloseable;
        } else {
            z2 = true;
        }
        return new EndCardConfig(companion, z2, getCloseButtonDelaySeconds(), false, BaseVastEndCardScheduler$getNextEndCardConfig$1.INSTANCE, -1L);
    }

    public final boolean isLastEndCardCloseable() {
        return this.isLastEndCardCloseable;
    }
}
