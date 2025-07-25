package androidx.compose.material.ripple;

import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p015ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: Ripple.kt */
@Metadata
/* loaded from: classes.dex */
public abstract class RippleIndicationInstance implements IndicationInstance {
    @NotNull
    private final StateLayer stateLayer;

    public RippleIndicationInstance(boolean z, @NotNull State<RippleAlpha> rippleAlpha) {
        Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        this.stateLayer = new StateLayer(z, rippleAlpha);
    }

    public abstract void addRipple(@NotNull PressInteraction.Press press, @NotNull CoroutineScope coroutineScope);

    /* renamed from: drawStateLayer-H2RKhps  reason: not valid java name */
    public final void m107160drawStateLayerH2RKhps(@NotNull DrawScope drawStateLayer, float f, long j) {
        Intrinsics.checkNotNullParameter(drawStateLayer, "$this$drawStateLayer");
        this.stateLayer.m107164drawStateLayerH2RKhps(drawStateLayer, f, j);
    }

    public abstract void removeRipple(@NotNull PressInteraction.Press press);

    public final void updateStateLayer$material_ripple_release(@NotNull Interaction interaction, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.stateLayer.handleInteraction(interaction, scope);
    }
}
