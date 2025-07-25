package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SubcomposeLayout.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutState */
/* loaded from: classes.dex */
public final class SubcomposeLayoutState {
    public static final int $stable = 8;
    @Nullable
    private LayoutNodeSubcompositionsState _state;
    @NotNull
    private final Function2<LayoutNode, CompositionContext, Unit> setCompositionContext;
    @NotNull
    private final Function2<LayoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit> setMeasurePolicy;
    @NotNull
    private final Function2<LayoutNode, SubcomposeLayoutState, Unit> setRoot;
    @NotNull
    private final SubcomposeSlotReusePolicy slotReusePolicy;

    public SubcomposeLayoutState(@NotNull SubcomposeSlotReusePolicy slotReusePolicy) {
        Intrinsics.checkNotNullParameter(slotReusePolicy, "slotReusePolicy");
        this.slotReusePolicy = slotReusePolicy;
        this.setRoot = new SubcomposeLayoutState$setRoot$1(this);
        this.setCompositionContext = new SubcomposeLayoutState$setCompositionContext$1(this);
        this.setMeasurePolicy = new SubcomposeLayoutState$setMeasurePolicy$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNodeSubcompositionsState getState() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this._state;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    public final void disposeCurrentNodes$ui_release() {
        getState().disposeCurrentNodes();
    }

    public final void forceRecomposeChildren$ui_release() {
        getState().forceRecomposeChildren();
    }

    @NotNull
    public final Function2<LayoutNode, CompositionContext, Unit> getSetCompositionContext$ui_release() {
        return this.setCompositionContext;
    }

    @NotNull
    public final Function2<LayoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit> getSetMeasurePolicy$ui_release() {
        return this.setMeasurePolicy;
    }

    @NotNull
    public final Function2<LayoutNode, SubcomposeLayoutState, Unit> getSetRoot$ui_release() {
        return this.setRoot;
    }

    @NotNull
    public final PrecomposedSlotHandle precompose(@Nullable Object obj, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return getState().precompose(obj, content);
    }

    public SubcomposeLayoutState() {
        this(NoOpSubcomposeSlotReusePolicy.INSTANCE);
    }

    public SubcomposeLayoutState(int i) {
        this(SubcomposeLayoutKt.SubcomposeSlotReusePolicy(i));
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.layout.SubcomposeLayoutState$PrecomposedSlotHandle */
    /* loaded from: classes.dex */
    public interface PrecomposedSlotHandle {
        void dispose();

        default int getPlaceablesCount() {
            return 0;
        }

        /* renamed from: premeasure-0kLqBqw */
        default void mo109029premeasure0kLqBqw(int i, long j) {
        }
    }
}
