package com.mobilefuse.sdk.p542ad.rendering.omniad.container;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.RelativeLayout;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.p542ad.rendering.FloatingContainer;
import com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.AnimatedPositionModifier;
import com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.AnimatedScaleModifier;
import com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.AnimatedSizeModifier;
import com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.EmptyScaleModifier;
import com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.ScaleModifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: InAppContainer.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.container.InAppContainer */
/* loaded from: classes7.dex */
public final class InAppContainer implements OmniAdContainer {
    @NotNull
    private final Activity activity;
    @NotNull
    private final View contentView;
    @NotNull
    private final AnimatedPositionModifier defaultPositionModifier;
    @NotNull
    private final ScaleModifier defaultScaleModifier;
    @NotNull
    private final AnimatedSizeModifier defaultSizeModifier;
    @NotNull
    private final FloatingContainer floatingContainer;
    private final boolean scaleAnimationEnabled;

    public InAppContainer(@NotNull Activity activity, @NotNull View contentView, boolean z) {
        ScaleModifier emptyScaleModifier;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.activity = activity;
        this.contentView = contentView;
        this.scaleAnimationEnabled = z;
        this.floatingContainer = new FloatingContainer(activity);
        this.defaultPositionModifier = new AnimatedPositionModifier(this, 0L, null, 6, null);
        this.defaultSizeModifier = new AnimatedSizeModifier(this, 0L, null, 6, null);
        if (z) {
            emptyScaleModifier = new AnimatedScaleModifier(this, 0L, null, 6, null);
        } else {
            emptyScaleModifier = new EmptyScaleModifier(this);
        }
        this.defaultScaleModifier = emptyScaleModifier;
        getFloatingContainer().addView(contentView, new RelativeLayout.LayoutParams(-1, -1));
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
        View rootView = decorView.getRootView();
        if (rootView != null) {
            ((ViewGroup) rootView).addView(getFloatingContainer());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer
    public void changePosition(int i, int i2) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            getFloatingContainer().setX(i);
            getFloatingContainer().setY(i2);
        } catch (Throwable th) {
            int i3 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer
    public void changeScale(float f) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            getFloatingContainer().setScaleX(f);
            getFloatingContainer().setScaleY(f);
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer
    public void changeSize(int i, int i2) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            ViewGroup.LayoutParams layoutParams = getFloatingContainer().getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            getFloatingContainer().setLayoutParams(layoutParams);
        } catch (Throwable th) {
            int i3 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer
    public void destroy() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            getFloatingContainer().removeAllViews();
            ViewParent parent = getFloatingContainer().getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(getFloatingContainer());
            }
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
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
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    public final View getContentView() {
        return this.contentView;
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public Point getCurrentPosition() {
        return new Point((int) getFloatingContainer().getX(), (int) getFloatingContainer().getY());
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer
    public float getCurrentScale() {
        return getFloatingContainer().getScaleX();
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public Point getCurrentSize() {
        return new Point(getFloatingContainer().getWidth(), getFloatingContainer().getHeight());
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public ScaleModifier getDefaultScaleModifier() {
        return this.defaultScaleModifier;
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public FloatingContainer getFloatingContainer() {
        return this.floatingContainer;
    }

    public final boolean getScaleAnimationEnabled() {
        return this.scaleAnimationEnabled;
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public AnimatedPositionModifier getDefaultPositionModifier() {
        return this.defaultPositionModifier;
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public AnimatedSizeModifier getDefaultSizeModifier() {
        return this.defaultSizeModifier;
    }
}
