package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GraphicsLayerModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.GraphicsLayerModifierKt */
/* loaded from: classes.dex */
public final class GraphicsLayerModifierKt {
    @Stable
    @NotNull
    public static final Modifier graphicsLayer(@NotNull Modifier modifier, @NotNull Function1<? super GraphicsLayerScope, Unit> block) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new C0837x2d9a6f60(block);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new GraphicsLayerModifier(block, noInspectorInfo));
    }

    @Stable
    /* renamed from: graphicsLayer-2Xn7asI  reason: not valid java name */
    public static final /* synthetic */ Modifier m107661graphicsLayer2Xn7asI(Modifier graphicsLayer, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return m107663graphicsLayerpANQ8Wg(graphicsLayer, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* renamed from: graphicsLayer-2Xn7asI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m107662graphicsLayer2Xn7asI$default(Modifier modifier, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, int i, Object obj) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        long j2;
        Shape shape2;
        boolean z2;
        RenderEffect renderEffect2;
        float f19 = 1.0f;
        if ((i & 1) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f;
        }
        if ((i & 2) != 0) {
            f12 = 1.0f;
        } else {
            f12 = f2;
        }
        if ((i & 4) == 0) {
            f19 = f3;
        }
        float f20 = 0.0f;
        if ((i & 8) != 0) {
            f13 = 0.0f;
        } else {
            f13 = f4;
        }
        if ((i & 16) != 0) {
            f14 = 0.0f;
        } else {
            f14 = f5;
        }
        if ((i & 32) != 0) {
            f15 = 0.0f;
        } else {
            f15 = f6;
        }
        if ((i & 64) != 0) {
            f16 = 0.0f;
        } else {
            f16 = f7;
        }
        if ((i & 128) != 0) {
            f17 = 0.0f;
        } else {
            f17 = f8;
        }
        if ((i & 256) == 0) {
            f20 = f9;
        }
        if ((i & 512) != 0) {
            f18 = 8.0f;
        } else {
            f18 = f10;
        }
        if ((i & 1024) != 0) {
            j2 = TransformOrigin.Companion.m107869getCenterSzJe1aQ();
        } else {
            j2 = j;
        }
        if ((i & 2048) != 0) {
            shape2 = RectangleShape.getRectangleShape();
        } else {
            shape2 = shape;
        }
        if ((i & 4096) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 8192) != 0) {
            renderEffect2 = null;
        } else {
            renderEffect2 = renderEffect;
        }
        return m107661graphicsLayer2Xn7asI(modifier, f11, f12, f19, f13, f14, f15, f16, f17, f20, f18, j2, shape2, z2, renderEffect2);
    }

    @Stable
    @NotNull
    /* renamed from: graphicsLayer-pANQ8Wg  reason: not valid java name */
    public static final Modifier m107663graphicsLayerpANQ8Wg(@NotNull Modifier graphicsLayer, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, @NotNull Shape shape, boolean z, @Nullable RenderEffect renderEffect, long j2, long j3) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        Intrinsics.checkNotNullParameter(shape, "shape");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new C0838x366829a7(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return graphicsLayer.then(new SimpleGraphicsLayerModifier(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, noInspectorInfo, null));
    }

    /* renamed from: graphicsLayer-pANQ8Wg$default  reason: not valid java name */
    public static /* synthetic */ Modifier m107664graphicsLayerpANQ8Wg$default(Modifier modifier, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, Object obj) {
        return m107663graphicsLayerpANQ8Wg(modifier, (i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1.0f : f2, (i & 4) == 0 ? f3 : 1.0f, (i & 8) != 0 ? 0.0f : f4, (i & 16) != 0 ? 0.0f : f5, (i & 32) != 0 ? 0.0f : f6, (i & 64) != 0 ? 0.0f : f7, (i & 128) != 0 ? 0.0f : f8, (i & 256) == 0 ? f9 : 0.0f, (i & 512) != 0 ? 8.0f : f10, (i & 1024) != 0 ? TransformOrigin.Companion.m107869getCenterSzJe1aQ() : j, (i & 2048) != 0 ? RectangleShape.getRectangleShape() : shape, (i & 4096) != 0 ? false : z, (i & 8192) != 0 ? null : renderEffect, (i & 16384) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j2, (i & 32768) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j3);
    }

    @Stable
    /* renamed from: graphicsLayer-sKFY_QE  reason: not valid java name */
    public static final /* synthetic */ Modifier m107665graphicsLayersKFY_QE(Modifier graphicsLayer, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return m107664graphicsLayerpANQ8Wg$default(graphicsLayer, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, null, 0L, 0L, 49152, null);
    }

    /* renamed from: graphicsLayer-sKFY_QE$default  reason: not valid java name */
    public static /* synthetic */ Modifier m107666graphicsLayersKFY_QE$default(Modifier modifier, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, int i, Object obj) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        long j2;
        Shape shape2;
        boolean z2;
        float f19 = 1.0f;
        if ((i & 1) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f;
        }
        if ((i & 2) != 0) {
            f12 = 1.0f;
        } else {
            f12 = f2;
        }
        if ((i & 4) == 0) {
            f19 = f3;
        }
        float f20 = 0.0f;
        if ((i & 8) != 0) {
            f13 = 0.0f;
        } else {
            f13 = f4;
        }
        if ((i & 16) != 0) {
            f14 = 0.0f;
        } else {
            f14 = f5;
        }
        if ((i & 32) != 0) {
            f15 = 0.0f;
        } else {
            f15 = f6;
        }
        if ((i & 64) != 0) {
            f16 = 0.0f;
        } else {
            f16 = f7;
        }
        if ((i & 128) != 0) {
            f17 = 0.0f;
        } else {
            f17 = f8;
        }
        if ((i & 256) == 0) {
            f20 = f9;
        }
        if ((i & 512) != 0) {
            f18 = 8.0f;
        } else {
            f18 = f10;
        }
        if ((i & 1024) != 0) {
            j2 = TransformOrigin.Companion.m107869getCenterSzJe1aQ();
        } else {
            j2 = j;
        }
        if ((i & 2048) != 0) {
            shape2 = RectangleShape.getRectangleShape();
        } else {
            shape2 = shape;
        }
        if ((i & 4096) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        return m107665graphicsLayersKFY_QE(modifier, f11, f12, f19, f13, f14, f15, f16, f17, f20, f18, j2, shape2, z2);
    }

    @Stable
    @NotNull
    public static final Modifier toolingGraphicsLayer(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        if (!InspectableValueKt.isDebugInspectorInfoEnabled()) {
            return modifier;
        }
        return modifier.then(m107664graphicsLayerpANQ8Wg$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65535, null));
    }
}
