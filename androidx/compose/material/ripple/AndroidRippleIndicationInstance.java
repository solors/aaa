package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p015ui.graphics.Canvas;
import androidx.compose.p015ui.graphics.Color;
import androidx.compose.p015ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import be.MathJVM;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: Ripple.android.kt */
@Metadata
/* loaded from: classes.dex */
public final class AndroidRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {
    private final boolean bounded;
    @NotNull
    private final State<Color> color;
    @NotNull
    private final SnapshotState invalidateTick$delegate;
    @NotNull
    private final Functions<Unit> onInvalidateRipple;
    private final float radius;
    @NotNull
    private final State<RippleAlpha> rippleAlpha;
    @NotNull
    private final RippleContainer rippleContainer;
    @NotNull
    private final SnapshotState rippleHostView$delegate;
    private int rippleRadius;
    private long rippleSize;

    public /* synthetic */ AndroidRippleIndicationInstance(boolean z, float f, State state, State state2, RippleContainer rippleContainer, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, state, state2, rippleContainer);
    }

    private final void dispose() {
        this.rippleContainer.disposeRippleIfNeeded(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getInvalidateTick() {
        return ((Boolean) this.invalidateTick$delegate.getValue()).booleanValue();
    }

    private final RippleHostView getRippleHostView() {
        return (RippleHostView) this.rippleHostView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInvalidateTick(boolean z) {
        this.invalidateTick$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setRippleHostView(RippleHostView rippleHostView) {
        this.rippleHostView$delegate.setValue(rippleHostView);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(@NotNull PressInteraction.Press interaction, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        RippleHostView rippleHostView = this.rippleContainer.getRippleHostView(this);
        rippleHostView.m107158addRippleKOepWvA(interaction, this.bounded, this.rippleSize, this.rippleRadius, this.color.getValue().m107537unboximpl(), this.rippleAlpha.getValue().getPressedAlpha(), this.onInvalidateRipple);
        setRippleHostView(rippleHostView);
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(@NotNull ContentDrawScope contentDrawScope) {
        int mo106208roundToPx0680j_4;
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        this.rippleSize = contentDrawScope.mo108021getSizeNHjbRc();
        if (Float.isNaN(this.radius)) {
            mo106208roundToPx0680j_4 = MathJVM.m103791d(RippleAnimationKt.m107155getRippleEndRadiuscSwnlzA(contentDrawScope, this.bounded, contentDrawScope.mo108021getSizeNHjbRc()));
        } else {
            mo106208roundToPx0680j_4 = contentDrawScope.mo106208roundToPx0680j_4(this.radius);
        }
        this.rippleRadius = mo106208roundToPx0680j_4;
        long m107537unboximpl = this.color.getValue().m107537unboximpl();
        float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
        contentDrawScope.drawContent();
        m107160drawStateLayerH2RKhps(contentDrawScope, this.radius, m107537unboximpl);
        Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
        getInvalidateTick();
        RippleHostView rippleHostView = getRippleHostView();
        if (rippleHostView != null) {
            rippleHostView.m107159updateRipplePropertiesbiQXAtU(contentDrawScope.mo108021getSizeNHjbRc(), this.rippleRadius, m107537unboximpl, pressedAlpha);
            rippleHostView.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        dispose();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        dispose();
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(@NotNull PressInteraction.Press interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        RippleHostView rippleHostView = getRippleHostView();
        if (rippleHostView != null) {
            rippleHostView.removeRipple();
        }
    }

    public final void resetHostView() {
        setRippleHostView(null);
    }

    private AndroidRippleIndicationInstance(boolean z, float f, State<Color> state, State<RippleAlpha> state2, RippleContainer rippleContainer) {
        super(z, state2);
        SnapshotState mutableStateOf$default;
        SnapshotState mutableStateOf$default2;
        this.bounded = z;
        this.radius = f;
        this.color = state;
        this.rippleAlpha = state2;
        this.rippleContainer = rippleContainer;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.rippleHostView$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.invalidateTick$delegate = mutableStateOf$default2;
        this.rippleSize = Size.Companion.m107369getZeroNHjbRc();
        this.rippleRadius = -1;
        this.onInvalidateRipple = new AndroidRippleIndicationInstance$onInvalidateRipple$1(this);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
