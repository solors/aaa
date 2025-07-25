package androidx.compose.p015ui.graphics.drawscope;

import androidx.compose.p015ui.graphics.Degrees;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DrawTransform.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.drawscope.DrawTransformKt */
/* loaded from: classes.dex */
public final class DrawTransformKt {
    public static final void inset(@NotNull DrawTransform drawTransform, float f, float f2) {
        Intrinsics.checkNotNullParameter(drawTransform, "<this>");
        drawTransform.inset(f, f2, f, f2);
    }

    public static /* synthetic */ void inset$default(DrawTransform drawTransform, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(drawTransform, "<this>");
        drawTransform.inset(f, f2, f, f2);
    }

    /* renamed from: rotateRad-0AR0LA0  reason: not valid java name */
    public static final void m108080rotateRad0AR0LA0(@NotNull DrawTransform rotateRad, float f, long j) {
        Intrinsics.checkNotNullParameter(rotateRad, "$this$rotateRad");
        rotateRad.mo107952rotateUv8p0NA(Degrees.degrees(f), j);
    }

    /* renamed from: rotateRad-0AR0LA0$default  reason: not valid java name */
    public static /* synthetic */ void m108081rotateRad0AR0LA0$default(DrawTransform rotateRad, float f, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = rotateRad.mo107950getCenterF1C5BW0();
        }
        Intrinsics.checkNotNullParameter(rotateRad, "$this$rotateRad");
        rotateRad.mo107952rotateUv8p0NA(Degrees.degrees(f), j);
    }

    /* renamed from: scale-0AR0LA0  reason: not valid java name */
    public static final void m108082scale0AR0LA0(@NotNull DrawTransform scale, float f, long j) {
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        scale.mo107953scale0AR0LA0(f, f, j);
    }

    /* renamed from: scale-0AR0LA0$default  reason: not valid java name */
    public static /* synthetic */ void m108083scale0AR0LA0$default(DrawTransform scale, float f, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = scale.mo107950getCenterF1C5BW0();
        }
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        scale.mo107953scale0AR0LA0(f, f, j);
    }

    public static final void inset(@NotNull DrawTransform drawTransform, float f) {
        Intrinsics.checkNotNullParameter(drawTransform, "<this>");
        drawTransform.inset(f, f, f, f);
    }
}
