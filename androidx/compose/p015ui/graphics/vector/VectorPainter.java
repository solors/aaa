package androidx.compose.p015ui.graphics.vector;

import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.graphics.ColorFilter;
import androidx.compose.p015ui.graphics.drawscope.DrawContext;
import androidx.compose.p015ui.graphics.drawscope.DrawScope;
import androidx.compose.p015ui.graphics.painter.Painter;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45269o;

/* compiled from: VectorPainter.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.VectorPainter */
/* loaded from: classes.dex */
public final class VectorPainter extends Painter {
    public static final int $stable = 8;
    @NotNull
    private final SnapshotState autoMirror$delegate;
    @Nullable
    private Composition composition;
    private float currentAlpha;
    @Nullable
    private ColorFilter currentColorFilter;
    @NotNull
    private final SnapshotState isDirty$delegate;
    @NotNull
    private final SnapshotState size$delegate;
    @NotNull
    private final VectorComponent vector;

    public VectorPainter() {
        SnapshotState mutableStateOf$default;
        SnapshotState mutableStateOf$default2;
        SnapshotState mutableStateOf$default3;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m107348boximpl(Size.Companion.m107369getZeroNHjbRc()), null, 2, null);
        this.size$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.autoMirror$delegate = mutableStateOf$default2;
        VectorComponent vectorComponent = new VectorComponent();
        vectorComponent.setInvalidateCallback$ui_release(new VectorPainter$vector$1$1(this));
        this.vector = vectorComponent;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.isDirty$delegate = mutableStateOf$default3;
        this.currentAlpha = 1.0f;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    private final Composition composeVector(CompositionContext compositionContext, InterfaceC45269o<? super Float, ? super Float, ? super Composer, ? super Integer, Unit> interfaceC45269o) {
        Composition composition = this.composition;
        if (composition == null || composition.isDisposed()) {
            composition = CompositionKt.Composition(new VectorCompose(this.vector.getRoot()), compositionContext);
        }
        this.composition = composition;
        composition.setContent(ComposableLambdaKt.composableLambdaInstance(-1916507005, true, new VectorPainter$composeVector$1(interfaceC45269o, this)));
        return composition;
    }

    private final boolean isDirty() {
        return ((Boolean) this.isDirty$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDirty(boolean z) {
        this.isDirty$delegate.setValue(Boolean.valueOf(z));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void RenderVector$ui_release(@NotNull String name, float f, float f2, @NotNull InterfaceC45269o<? super Float, ? super Float, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1264894527);
        VectorComponent vectorComponent = this.vector;
        vectorComponent.setName(name);
        vectorComponent.setViewportWidth(f);
        vectorComponent.setViewportHeight(f2);
        Composition composeVector = composeVector(ComposablesKt.rememberCompositionContext(startRestartGroup, 0), content);
        EffectsKt.DisposableEffect(composeVector, new VectorPainter$RenderVector$2(composeVector), startRestartGroup, 8);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new VectorPainter$RenderVector$3(this, name, f, f2, content, i));
        }
    }

    @Override // androidx.compose.p015ui.graphics.painter.Painter
    protected boolean applyAlpha(float f) {
        this.currentAlpha = f;
        return true;
    }

    @Override // androidx.compose.p015ui.graphics.painter.Painter
    protected boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    public final boolean getAutoMirror$ui_release() {
        return ((Boolean) this.autoMirror$delegate.getValue()).booleanValue();
    }

    @Nullable
    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return this.vector.getIntrinsicColorFilter$ui_release();
    }

    @Override // androidx.compose.p015ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo108090getIntrinsicSizeNHjbRc() {
        return m108128getSizeNHjbRc$ui_release();
    }

    /* renamed from: getSize-NH-jbRc$ui_release  reason: not valid java name */
    public final long m108128getSizeNHjbRc$ui_release() {
        return ((Size) this.size$delegate.getValue()).m107365unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.p015ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        VectorComponent vectorComponent = this.vector;
        ColorFilter colorFilter = this.currentColorFilter;
        if (colorFilter == null) {
            colorFilter = vectorComponent.getIntrinsicColorFilter$ui_release();
        }
        if (getAutoMirror$ui_release() && drawScope.getLayoutDirection() == LayoutDirection.Rtl) {
            long mo108020getCenterF1C5BW0 = drawScope.mo108020getCenterF1C5BW0();
            DrawContext drawContext = drawScope.getDrawContext();
            long mo107946getSizeNHjbRc = drawContext.mo107946getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo107953scale0AR0LA0(-1.0f, 1.0f, mo108020getCenterF1C5BW0);
            vectorComponent.draw(drawScope, this.currentAlpha, colorFilter);
            drawContext.getCanvas().restore();
            drawContext.mo107947setSizeuvyYCjk(mo107946getSizeNHjbRc);
        } else {
            vectorComponent.draw(drawScope, this.currentAlpha, colorFilter);
        }
        if (isDirty()) {
            setDirty(false);
        }
    }

    public final void setAutoMirror$ui_release(boolean z) {
        this.autoMirror$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setIntrinsicColorFilter$ui_release(@Nullable ColorFilter colorFilter) {
        this.vector.setIntrinsicColorFilter$ui_release(colorFilter);
    }

    /* renamed from: setSize-uvyYCjk$ui_release  reason: not valid java name */
    public final void m108129setSizeuvyYCjk$ui_release(long j) {
        this.size$delegate.setValue(Size.m107348boximpl(j));
    }
}
