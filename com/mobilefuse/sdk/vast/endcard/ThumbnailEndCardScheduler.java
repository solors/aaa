package com.mobilefuse.sdk.vast.endcard;

import com.mobilefuse.videoplayer.endcard.EndCardPresenter;
import com.mobilefuse.videoplayer.endcard.scheduler.EndCardConfig;
import com.mobilefuse.videoplayer.endcard.scheduler.EndCardScheduler;
import com.mobilefuse.videoplayer.model.VastCompanion;
import com.mobilefuse.videoplayer.view.ViewCloseTrigger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ThumbnailEndCardScheduler.kt */
@Metadata
/* loaded from: classes7.dex */
public final class ThumbnailEndCardScheduler implements EndCardScheduler {
    private final long autoCloseDelayMillis;
    private final float closeButtonDelaySeconds;

    public ThumbnailEndCardScheduler(float f, long j) {
        this.closeButtonDelaySeconds = f;
        this.autoCloseDelayMillis = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isThumbnailModeActive(EndCardPresenter endCardPresenter) {
        return !endCardPresenter.getFullscreenMode();
    }

    public final long getAutoCloseDelayMillis() {
        return this.autoCloseDelayMillis;
    }

    @Override // com.mobilefuse.videoplayer.endcard.scheduler.EndCardScheduler
    public float getCloseButtonDelaySeconds() {
        return this.closeButtonDelaySeconds;
    }

    @Override // com.mobilefuse.videoplayer.endcard.scheduler.EndCardScheduler
    @Nullable
    public EndCardConfig getNextEndCardConfig(@NotNull EndCardPresenter presenter, @NotNull ViewCloseTrigger earlierViewCloseTrigger, @NotNull VastCompanion companion, boolean z) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(earlierViewCloseTrigger, "earlierViewCloseTrigger");
        Intrinsics.checkNotNullParameter(companion, "companion");
        if (isThumbnailModeActive(presenter) && earlierViewCloseTrigger == ViewCloseTrigger.USER) {
            return null;
        }
        return new EndCardConfig(companion, true, getCloseButtonDelaySeconds(), isThumbnailModeActive(presenter), new ThumbnailEndCardScheduler$getNextEndCardConfig$1(this, presenter), this.autoCloseDelayMillis);
    }
}
