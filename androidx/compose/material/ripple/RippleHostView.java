package androidx.compose.material.ripple;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.SizeKt;
import androidx.compose.p015ui.graphics.RectHelper_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RippleHostView.android.kt */
@Metadata
/* loaded from: classes.dex */
public final class RippleHostView extends View {
    private static final long MinimumRippleStateChangeTime = 5;
    private static final long ResetRippleDelayDuration = 50;
    @Nullable
    private Boolean bounded;
    @Nullable
    private Long lastRippleStateChangeTimeMillis;
    @Nullable
    private Functions<Unit> onInvalidateRipple;
    @Nullable
    private Runnable resetRippleRunnable;
    @Nullable
    private UnprojectedRipple ripple;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final int[] PressedState = {16842919, 16842910};
    @NotNull
    private static final int[] RestingState = new int[0];

    /* compiled from: RippleHostView.android.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleHostView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void createRipple(boolean z) {
        UnprojectedRipple unprojectedRipple = new UnprojectedRipple(z);
        setBackground(unprojectedRipple);
        this.ripple = unprojectedRipple;
    }

    private final void setRippleState(boolean z) {
        long j;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.lastRippleStateChangeTimeMillis;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long j2 = currentAnimationTimeMillis - j;
        if (!z && j2 < MinimumRippleStateChangeTime) {
            Runnable runnable2 = new Runnable() { // from class: androidx.compose.material.ripple.a
                {
                    RippleHostView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    RippleHostView.m107157setRippleState$lambda2(RippleHostView.this);
                }
            };
            this.resetRippleRunnable = runnable2;
            postDelayed(runnable2, 50L);
        } else {
            if (z) {
                iArr = PressedState;
            } else {
                iArr = RestingState;
            }
            UnprojectedRipple unprojectedRipple = this.ripple;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(iArr);
            }
        }
        this.lastRippleStateChangeTimeMillis = Long.valueOf(currentAnimationTimeMillis);
    }

    /* renamed from: setRippleState$lambda-2 */
    public static final void m107157setRippleState$lambda2(RippleHostView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UnprojectedRipple unprojectedRipple = this$0.ripple;
        if (unprojectedRipple != null) {
            unprojectedRipple.setState(RestingState);
        }
        this$0.resetRippleRunnable = null;
    }

    /* renamed from: addRipple-KOepWvA */
    public final void m107158addRippleKOepWvA(@NotNull PressInteraction.Press interaction, boolean z, long j, int i, long j2, float f, @NotNull Functions<Unit> onInvalidateRipple) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(onInvalidateRipple, "onInvalidateRipple");
        if (this.ripple == null || !Intrinsics.m17075f(Boolean.valueOf(z), this.bounded)) {
            createRipple(z);
            this.bounded = Boolean.valueOf(z);
        }
        UnprojectedRipple unprojectedRipple = this.ripple;
        Intrinsics.m17074g(unprojectedRipple);
        this.onInvalidateRipple = onInvalidateRipple;
        m107159updateRipplePropertiesbiQXAtU(j, i, j2, f);
        if (z) {
            unprojectedRipple.setHotspot(Offset.m107291getXimpl(interaction.m106239getPressPositionF1C5BW0()), Offset.m107292getYimpl(interaction.m106239getPressPositionF1C5BW0()));
        } else {
            unprojectedRipple.setHotspot(unprojectedRipple.getBounds().centerX(), unprojectedRipple.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void disposeRipple() {
        this.onInvalidateRipple = null;
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.resetRippleRunnable;
            Intrinsics.m17074g(runnable2);
            runnable2.run();
        } else {
            UnprojectedRipple unprojectedRipple = this.ripple;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(RestingState);
            }
        }
        UnprojectedRipple unprojectedRipple2 = this.ripple;
        if (unprojectedRipple2 == null) {
            return;
        }
        unprojectedRipple2.setVisible(false, false);
        unscheduleDrawable(unprojectedRipple2);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NotNull Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        Functions<Unit> functions = this.onInvalidateRipple;
        if (functions != null) {
            functions.invoke();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void removeRipple() {
        setRippleState(false);
    }

    /* renamed from: updateRippleProperties-biQXAtU */
    public final void m107159updateRipplePropertiesbiQXAtU(long j, int i, long j2, float f) {
        UnprojectedRipple unprojectedRipple = this.ripple;
        if (unprojectedRipple == null) {
            return;
        }
        unprojectedRipple.trySetRadius(i);
        unprojectedRipple.m107166setColorDxMtmZc(j2, f);
        Rect androidRect = RectHelper_androidKt.toAndroidRect(SizeKt.m107381toRectuvyYCjk(j));
        setLeft(androidRect.left);
        setTop(androidRect.top);
        setRight(androidRect.right);
        setBottom(androidRect.bottom);
        unprojectedRipple.setBounds(androidRect);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
