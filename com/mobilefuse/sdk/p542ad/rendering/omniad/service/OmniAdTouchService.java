package com.mobilefuse.sdk.p542ad.rendering.omniad.service;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.p542ad.rendering.FloatingContainer;
import com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer;
import com.mobilefuse.sdk.utils.DimConversions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45268n;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: OmniAdTouchService.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdTouchService */
/* loaded from: classes7.dex */
public final class OmniAdTouchService {
    @NotNull
    private final Activity activity;
    private boolean dragEnabled;
    private final int marginDp;
    @NotNull
    private final OmniAdContainer omniAdContainer;
    @NotNull
    private final Point sizeDp;
    @NotNull
    private final InterfaceC45268n<Integer, Integer, TouchEventType, Unit> touchCallback;
    private boolean touchInteractionEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public OmniAdTouchService(@NotNull Activity activity, @NotNull OmniAdContainer omniAdContainer, @NotNull Point sizeDp, int i, @NotNull InterfaceC45268n<? super Integer, ? super Integer, ? super TouchEventType, Unit> touchCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(omniAdContainer, "omniAdContainer");
        Intrinsics.checkNotNullParameter(sizeDp, "sizeDp");
        Intrinsics.checkNotNullParameter(touchCallback, "touchCallback");
        this.activity = activity;
        this.omniAdContainer = omniAdContainer;
        this.sizeDp = sizeDp;
        this.marginDp = i;
        this.touchCallback = touchCallback;
        this.dragEnabled = true;
        this.touchInteractionEnabled = true;
        omniAdContainer.getFloatingContainer().setFloatingTouchListener(new View.OnTouchListener() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdTouchService.1
            private final int adHeightPx;
            private final int adWidthPx;
            @NotNull
            private final ViewGroup androidContentView;
            @NotNull
            private final FloatingContainer floatingContainer;
            private final int margin;
            private float offsetX;
            private float offsetY;
            private float orgX;
            private float orgY;
            @NotNull
            private final ViewGroup rootView;
            private boolean wasAnyMoveSinceDownEvent;

            {
                Window window = OmniAdTouchService.this.getActivity().getWindow();
                Intrinsics.checkNotNullExpressionValue(window, "activity.window");
                View decorView = window.getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
                View rootView = decorView.getRootView();
                if (rootView != null) {
                    ViewGroup viewGroup = (ViewGroup) rootView;
                    this.rootView = viewGroup;
                    View findViewById = viewGroup.findViewById(16908290);
                    if (findViewById != null) {
                        this.androidContentView = (ViewGroup) findViewById;
                        this.adWidthPx = DimConversions.dpToPx(OmniAdTouchService.this.getSizeDp().x, (Context) OmniAdTouchService.this.getActivity());
                        this.adHeightPx = DimConversions.dpToPx(OmniAdTouchService.this.getSizeDp().y, (Context) OmniAdTouchService.this.getActivity());
                        this.margin = DimConversions.dpToPx(OmniAdTouchService.this.getMarginDp(), (Context) OmniAdTouchService.this.getActivity());
                        this.floatingContainer = OmniAdTouchService.this.getOmniAdContainer().getFloatingContainer();
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }

            public final int getAdHeightPx() {
                return this.adHeightPx;
            }

            public final int getAdWidthPx() {
                return this.adWidthPx;
            }

            @NotNull
            public final ViewGroup getAndroidContentView() {
                return this.androidContentView;
            }

            @NotNull
            public final FloatingContainer getFloatingContainer() {
                return this.floatingContainer;
            }

            public final int getMargin() {
                return this.margin;
            }

            public final float getOffsetX() {
                return this.offsetX;
            }

            public final float getOffsetY() {
                return this.offsetY;
            }

            public final float getOrgX() {
                return this.orgX;
            }

            public final float getOrgY() {
                return this.orgY;
            }

            @NotNull
            public final ViewGroup getRootView() {
                return this.rootView;
            }

            public final boolean getWasAnyMoveSinceDownEvent() {
                return this.wasAnyMoveSinceDownEvent;
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(@NotNull View v, @NotNull MotionEvent event) {
                float f;
                float f2;
                Intrinsics.checkNotNullParameter(v, "v");
                Intrinsics.checkNotNullParameter(event, "event");
                if (!OmniAdTouchService.this.getDragEnabled()) {
                    return true;
                }
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    Rect rect = new Rect();
                    int[] iArr = new int[2];
                    this.androidContentView.getLocationOnScreen(iArr);
                    this.androidContentView.getGlobalVisibleRect(rect, new Point(iArr[0], iArr[1]));
                    int action = event.getAction();
                    if (action != 0) {
                        if (action != 1) {
                            if (action == 2) {
                                this.offsetX = event.getRawX() - this.orgX;
                                this.offsetY = event.getRawY() - this.orgY;
                                this.floatingContainer.getLocationOnScreen(new int[2]);
                                float f3 = this.offsetX;
                                float f4 = this.offsetY;
                                int i2 = rect.left;
                                if (f3 < i2) {
                                    f3 = i2;
                                }
                                int i3 = rect.top;
                                if (f4 < i3) {
                                    f4 = i3;
                                }
                                if (this.adWidthPx + f3 > i2 + rect.width()) {
                                    f3 = (rect.left + rect.width()) - this.adWidthPx;
                                }
                                if (this.adHeightPx + f4 > rect.top + rect.height()) {
                                    f4 = (rect.top + rect.height()) - this.adHeightPx;
                                }
                                OmniAdTouchService.this.onTouchEvent(f3, f4, TouchEventType.DRAG);
                            }
                        } else {
                            Point currentPosition = OmniAdTouchService.this.getOmniAdContainer().getCurrentPosition();
                            float f5 = currentPosition.x;
                            float f6 = currentPosition.y;
                            int i4 = rect.left;
                            int i5 = this.margin;
                            if (f5 < (i5 * 5) + i4) {
                                f = i4 + i5;
                            } else {
                                f = f5;
                            }
                            int i6 = rect.top;
                            if (f6 < (i5 * 5) + i6) {
                                f2 = i6 + i5;
                            } else {
                                f2 = f6;
                            }
                            if (f5 + this.adWidthPx > (i4 + rect.width()) - (this.margin * 5)) {
                                f = ((rect.left + rect.width()) - this.adWidthPx) - this.margin;
                            }
                            if (f6 + this.adHeightPx > (rect.top + rect.height()) - (this.margin * 5)) {
                                f2 = ((rect.top + rect.height()) - this.adHeightPx) - this.margin;
                            }
                            OmniAdTouchService.this.onTouchEvent(f, f2, TouchEventType.TOUCH_UP);
                        }
                    } else {
                        this.wasAnyMoveSinceDownEvent = false;
                        this.orgX = event.getX();
                        this.orgY = event.getY();
                        OmniAdTouchService omniAdTouchService = OmniAdTouchService.this;
                        float f7 = this.orgX;
                        omniAdTouchService.onTouchEvent(f7, f7, TouchEventType.TOUCH_DOWN);
                    }
                    return true;
                } catch (Throwable th) {
                    int i7 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        StabilityHelper.logException("[Automatically caught]", th);
                    }
                    return true;
                }
            }

            public final void setOffsetX(float f) {
                this.offsetX = f;
            }

            public final void setOffsetY(float f) {
                this.offsetY = f;
            }

            public final void setOrgX(float f) {
                this.orgX = f;
            }

            public final void setOrgY(float f) {
                this.orgY = f;
            }

            public final void setWasAnyMoveSinceDownEvent(boolean z) {
                this.wasAnyMoveSinceDownEvent = z;
            }
        });
    }

    public final void destroy() {
        this.omniAdContainer.getFloatingContainer().setFloatingTouchListener(null);
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    public final boolean getDragEnabled() {
        return this.dragEnabled;
    }

    public final int getMarginDp() {
        return this.marginDp;
    }

    @NotNull
    public final OmniAdContainer getOmniAdContainer() {
        return this.omniAdContainer;
    }

    @NotNull
    public final Point getSizeDp() {
        return this.sizeDp;
    }

    @NotNull
    public final InterfaceC45268n<Integer, Integer, TouchEventType, Unit> getTouchCallback() {
        return this.touchCallback;
    }

    public final boolean getTouchInteractionEnabled() {
        return this.touchInteractionEnabled;
    }

    public final void onTouchEvent(float f, float f2, @NotNull TouchEventType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.touchCallback.invoke(Integer.valueOf((int) f), Integer.valueOf((int) f2), type);
    }

    public final void setDragEnabled(boolean z) {
        this.dragEnabled = z;
    }

    public final void setTouchInteractionEnabled(boolean z) {
        this.touchInteractionEnabled = z;
        this.omniAdContainer.getFloatingContainer().setTouchInteractionEnabled(z);
    }

    public /* synthetic */ OmniAdTouchService(Activity activity, OmniAdContainer omniAdContainer, Point point, int i, InterfaceC45268n interfaceC45268n, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, omniAdContainer, point, (i2 & 8) != 0 ? 10 : i, interfaceC45268n);
    }
}
