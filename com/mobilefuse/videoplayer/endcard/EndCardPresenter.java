package com.mobilefuse.videoplayer.endcard;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.videoplayer.endcard.scheduler.EndCardConfig;
import com.mobilefuse.videoplayer.endcard.scheduler.EndCardScheduler;
import com.mobilefuse.videoplayer.model.VastClickThrough;
import com.mobilefuse.videoplayer.model.VastCompanion;
import com.mobilefuse.videoplayer.model.VastError;
import com.mobilefuse.videoplayer.model.VastTrackingEventType;
import com.mobilefuse.videoplayer.view.ViewCloseTrigger;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: EndCardPresenter.kt */
@Metadata
/* loaded from: classes7.dex */
public final class EndCardPresenter {
    @NotNull
    private final List<VastCompanion> companions;
    @NotNull
    private final FrameLayout container;
    @NotNull
    private final Context context;
    private EndCardView currentEndCard;
    @NotNull
    private final EndCardListener endCardListener;
    private boolean fullscreenMode;
    private int nextCompanionIndex;
    @Nullable
    private final Activity renderingActivity;
    @NotNull
    private final EndCardScheduler scheduler;

    public EndCardPresenter(@NotNull FrameLayout container, @NotNull Context context, @Nullable Activity activity, @NotNull EndCardScheduler scheduler, @NotNull List<VastCompanion> companions, boolean z, @NotNull EndCardListener endCardListener) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(companions, "companions");
        Intrinsics.checkNotNullParameter(endCardListener, "endCardListener");
        this.container = container;
        this.context = context;
        this.renderingActivity = activity;
        this.scheduler = scheduler;
        this.companions = companions;
        this.endCardListener = endCardListener;
        this.fullscreenMode = z;
    }

    private final VastCompanion getNextCompanion() {
        if (this.nextCompanionIndex >= this.companions.size()) {
            return null;
        }
        VastCompanion vastCompanion = this.companions.get(this.nextCompanionIndex);
        this.nextCompanionIndex++;
        return vastCompanion;
    }

    public final void destroy() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            destroyCurrentEndCard();
        } catch (Throwable th) {
            int i = C23751xa4bd894e.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    public final void destroyCurrentEndCard() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            EndCardView endCardView = this.currentEndCard;
            if (endCardView != null) {
                ViewParent viewParent = null;
                this.currentEndCard = null;
                endCardView.destroy();
                ViewParent parent = endCardView.getParent();
                if (parent != null) {
                    if (parent instanceof ViewGroup) {
                        viewParent = parent;
                    }
                    ViewGroup viewGroup = (ViewGroup) viewParent;
                    if (viewGroup != null) {
                        viewGroup.removeView(endCardView);
                    }
                }
            }
        } catch (Throwable th) {
            int i = C23752xddf1da80.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    @NotNull
    public final List<VastCompanion> getCompanions() {
        return this.companions;
    }

    @NotNull
    public final FrameLayout getContainer() {
        return this.container;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final EndCardListener getEndCardListener() {
        return this.endCardListener;
    }

    public final boolean getFullscreenMode() {
        return this.fullscreenMode;
    }

    @Nullable
    public final Activity getRenderingActivity() {
        return this.renderingActivity;
    }

    @NotNull
    public final EndCardScheduler getScheduler() {
        return this.scheduler;
    }

    public final void onFullscreenChanged$mobilefuse_video_player_release(boolean z) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.fullscreenMode = z;
            EndCardView endCardView = this.currentEndCard;
            if (endCardView != null) {
                if (!z) {
                    endCardView.enabledAutoClose();
                } else {
                    endCardView.disableAutoClose();
                }
            }
        } catch (Throwable th) {
            int i = C23753x5488262e.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    public final boolean showNextEndCard(@NotNull final ViewCloseTrigger earlierViewCloseTrigger) {
        boolean z;
        Intrinsics.checkNotNullParameter(earlierViewCloseTrigger, "earlierViewCloseTrigger");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            VastCompanion nextCompanion = getNextCompanion();
            if (nextCompanion == null) {
                this.endCardListener.onCompleted();
                return false;
            }
            EndCardScheduler endCardScheduler = this.scheduler;
            if (this.nextCompanionIndex == this.companions.size()) {
                z = true;
            } else {
                z = false;
            }
            EndCardConfig nextEndCardConfig = endCardScheduler.getNextEndCardConfig(this, earlierViewCloseTrigger, nextCompanion, z);
            if (nextEndCardConfig == null) {
                this.endCardListener.onCompleted();
                return false;
            }
            EndCardView endCardView = new EndCardView(this.context, this.renderingActivity, nextEndCardConfig, new EndCardListener() { // from class: com.mobilefuse.videoplayer.endcard.EndCardPresenter$showNextEndCard$$inlined$gracefullyHandleException$lambda$1
                @Override // com.mobilefuse.videoplayer.endcard.EndCardListener
                public void onClicked(@NotNull VastCompanion companion, @Nullable VastClickThrough vastClickThrough) {
                    Intrinsics.checkNotNullParameter(companion, "companion");
                    EndCardPresenter.this.getEndCardListener().onClicked(companion, vastClickThrough);
                }

                @Override // com.mobilefuse.videoplayer.endcard.EndCardListener
                public void onClosed(@NotNull VastCompanion companion, @NotNull ViewCloseTrigger closeTrigger) {
                    Intrinsics.checkNotNullParameter(companion, "companion");
                    Intrinsics.checkNotNullParameter(closeTrigger, "closeTrigger");
                    ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                    try {
                        EndCardPresenter.this.getEndCardListener().onClosed(companion, closeTrigger);
                        EndCardPresenter.this.destroyCurrentEndCard();
                        EndCardPresenter.this.showNextEndCard(closeTrigger);
                    } catch (Throwable th) {
                        int i = C23756x73cecf5.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return;
                        }
                        StabilityHelper.logException("[Automatically caught]", th);
                    }
                }

                @Override // com.mobilefuse.videoplayer.endcard.EndCardListener
                public void onError(@NotNull VastError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    EndCardPresenter.this.getEndCardListener().onError(error);
                }

                @Override // com.mobilefuse.videoplayer.endcard.EndCardListener
                public void onTrackingEvent(@NotNull VastCompanion companion, @NotNull VastTrackingEventType eventType) {
                    Intrinsics.checkNotNullParameter(companion, "companion");
                    Intrinsics.checkNotNullParameter(eventType, "eventType");
                    EndCardPresenter.this.getEndCardListener().onTrackingEvent(companion, eventType);
                }

                @Override // com.mobilefuse.videoplayer.endcard.EndCardListener
                public void onCompleted() {
                }
            });
            this.currentEndCard = endCardView;
            if (nextEndCardConfig.getAutoCloseAllowed().invoke().booleanValue()) {
                endCardView.enabledAutoClose();
            }
            this.container.addView(endCardView, new RelativeLayout.LayoutParams(-1, -1));
            return endCardView.renderAd();
        } catch (Throwable th) {
            if (C23754x2068363e.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            Throwable th2 = (Throwable) new ErrorResult(th).getValue();
            this.endCardListener.onError(VastError.UNABLE_TO_DISPLAY_REQUIRED_COMPANION);
            return false;
        }
    }
}
