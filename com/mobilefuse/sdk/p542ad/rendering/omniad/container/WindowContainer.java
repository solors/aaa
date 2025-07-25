package com.mobilefuse.sdk.p542ad.rendering.omniad.container;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.internal.Callback;
import com.mobilefuse.sdk.p542ad.rendering.FloatingContainer;
import com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.EmptyScaleModifier;
import com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.StaticPositionModifier;
import com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.StaticSizeModifier;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: WindowContainer.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.container.WindowContainer */
/* loaded from: classes7.dex */
public final class WindowContainer implements OmniAdContainer {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final boolean DISABLE_WINDOW_DEFAULT_ANIMATIONS = true;
    @NotNull
    private final Activity activity;
    @NotNull
    private final View contentView;
    @NotNull
    private final StaticPositionModifier defaultPositionModifier;
    @NotNull
    private final EmptyScaleModifier defaultScaleModifier;
    @NotNull
    private final StaticSizeModifier defaultSizeModifier;
    @NotNull
    private final FloatingContainer floatingContainer;
    private Rect rect;
    private final FrameLayout windowContainer;
    private final WindowManager windowManager;

    /* compiled from: WindowContainer.kt */
    @Metadata
    /* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.container.WindowContainer$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WindowContainer(@NotNull Activity activity, @NotNull View contentView, @NotNull Point initSizePx) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(initSizePx, "initSizePx");
        this.activity = activity;
        this.contentView = contentView;
        this.floatingContainer = new FloatingContainer(activity);
        this.defaultPositionModifier = new StaticPositionModifier(this);
        this.defaultSizeModifier = new StaticSizeModifier(this);
        this.defaultScaleModifier = new EmptyScaleModifier(this);
        Object systemService = activity.getSystemService("window");
        if (systemService != null) {
            WindowManager windowManager = (WindowManager) systemService;
            this.windowManager = windowManager;
            FrameLayout frameLayout = new FrameLayout(activity.getApplicationContext()) { // from class: com.mobilefuse.sdk.ad.rendering.omniad.container.WindowContainer.1
                @Override // android.view.ViewGroup, android.view.View
                public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
                    Intrinsics.checkNotNullParameter(event, "event");
                    ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                    try {
                        Window window = WindowContainer.this.getActivity().getWindow();
                        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
                        View decorView = window.getDecorView();
                        Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
                        decorView.getRootView().dispatchKeyEvent(event);
                    } catch (Throwable th) {
                        int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            StabilityHelper.logException("[Automatically caught]", th);
                        }
                    }
                    return true;
                }

                @Override // android.view.ViewGroup, android.view.View
                public boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
                    Intrinsics.checkNotNullParameter(ev, "ev");
                    if (!WindowContainer.this.getFloatingContainer().isTouchInteractionEnabled()) {
                        return false;
                    }
                    return super.dispatchTouchEvent(ev);
                }
            };
            this.windowContainer = frameLayout;
            getFloatingContainer().addView(contentView, new RelativeLayout.LayoutParams(-1, -1));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(initSizePx.x, initSizePx.y, 1002, 16777760, -3);
            layoutParams.gravity = 8388659;
            layoutParams.x = 0;
            layoutParams.y = 0;
            WindowContainerKt.disableWindowDefaultAnimations(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams2.gravity = 17;
            frameLayout.addView(getFloatingContainer(), layoutParams2);
            Window window = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "activity.window");
            View decorView = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
            frameLayout.setSystemUiVisibility(decorView.getSystemUiVisibility());
            windowManager.addView(frameLayout, layoutParams);
            getFloatingContainer().setOnTouchInteractionEnabledChanged(new Callback() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.container.WindowContainer.2
                @Override // com.mobilefuse.sdk.internal.Callback
                public final void call(Boolean enabled) {
                    if (((C234151) WindowContainer.this.windowContainer).getParent() == null) {
                        return;
                    }
                    ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                    try {
                        ViewGroup.LayoutParams layoutParams3 = ((C234151) WindowContainer.this.windowContainer).getLayoutParams();
                        if (layoutParams3 != null) {
                            WindowManager.LayoutParams layoutParams4 = (WindowManager.LayoutParams) layoutParams3;
                            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
                            if (enabled.booleanValue()) {
                                layoutParams4.flags &= -17;
                            } else {
                                layoutParams4.flags |= 16;
                            }
                            WindowContainer.this.windowManager.updateViewLayout(WindowContainer.this.windowContainer, layoutParams4);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                    } catch (Throwable th) {
                        int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                        if (i == 1) {
                            StabilityHelper.logException("[Automatically caught]", th);
                        } else if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            });
            this.rect = new Rect();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    private final WindowManager.LayoutParams getWindowParams() {
        ViewGroup.LayoutParams layoutParams = this.windowContainer.getLayoutParams();
        if (layoutParams != null) {
            return (WindowManager.LayoutParams) layoutParams;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
    }

    private final void updateWindowLayout() {
        if (this.windowContainer.getParent() == null) {
            return;
        }
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            WindowManager.LayoutParams windowParams = getWindowParams();
            Rect rect = this.rect;
            windowParams.x = rect.left;
            windowParams.y = rect.top;
            windowParams.width = rect.right;
            windowParams.height = rect.bottom;
            this.windowManager.updateViewLayout(this.windowContainer, windowParams);
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
    public void changePosition(int i, int i2) {
        Rect rect = this.rect;
        rect.left = i;
        rect.top = i2;
        updateWindowLayout();
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer
    public void changeSize(int i, int i2) {
        Rect rect = this.rect;
        rect.right = i;
        rect.bottom = i2;
        updateWindowLayout();
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
            if (this.windowContainer.getParent() != null) {
                this.windowManager.removeView(this.windowContainer);
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
        WindowManager.LayoutParams windowParams = getWindowParams();
        return new Point(windowParams.x, windowParams.y);
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer
    public float getCurrentScale() {
        return 1.0f;
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public Point getCurrentSize() {
        WindowManager.LayoutParams windowParams = getWindowParams();
        return new Point(windowParams.width, windowParams.height);
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public FloatingContainer getFloatingContainer() {
        return this.floatingContainer;
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public StaticPositionModifier getDefaultPositionModifier() {
        return this.defaultPositionModifier;
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public EmptyScaleModifier getDefaultScaleModifier() {
        return this.defaultScaleModifier;
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public StaticSizeModifier getDefaultSizeModifier() {
        return this.defaultSizeModifier;
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer
    public void changeScale(float f) {
    }

    public /* synthetic */ WindowContainer(Activity activity, View view, Point point, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, view, (i & 4) != 0 ? new Point(200, 200) : point);
    }
}
