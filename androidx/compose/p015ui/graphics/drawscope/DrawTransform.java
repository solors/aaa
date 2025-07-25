package androidx.compose.p015ui.graphics.drawscope;

import androidx.compose.p015ui.geometry.OffsetKt;
import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.graphics.ClipOp;
import androidx.compose.p015ui.graphics.Path;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DrawTransform.kt */
@DrawScopeMarker
@Metadata
/* renamed from: androidx.compose.ui.graphics.drawscope.DrawTransform */
/* loaded from: classes.dex */
public interface DrawTransform {

    /* compiled from: DrawTransform.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.drawscope.DrawTransform$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
        public static long m108077getCenterF1C5BW0(@NotNull DrawTransform drawTransform) {
            return DrawTransform.super.mo107950getCenterF1C5BW0();
        }
    }

    /* renamed from: clipPath-mtrdD-E$default  reason: not valid java name */
    static /* synthetic */ void m108071clipPathmtrdDE$default(DrawTransform drawTransform, Path path, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = ClipOp.Companion.m107516getIntersectrtfAjoo();
            }
            drawTransform.mo107948clipPathmtrdDE(path, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
    }

    /* renamed from: clipRect-N_I0leg$default  reason: not valid java name */
    static /* synthetic */ void m108072clipRectN_I0leg$default(DrawTransform drawTransform, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                f = 0.0f;
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f3 = Size.m107360getWidthimpl(drawTransform.mo107951getSizeNHjbRc());
            }
            if ((i2 & 8) != 0) {
                f4 = Size.m107357getHeightimpl(drawTransform.mo107951getSizeNHjbRc());
            }
            if ((i2 & 16) != 0) {
                i = ClipOp.Companion.m107516getIntersectrtfAjoo();
            }
            drawTransform.mo107949clipRectN_I0leg(f, f2, f3, f4, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
    }

    /* renamed from: rotate-Uv8p0NA$default  reason: not valid java name */
    static /* synthetic */ void m108073rotateUv8p0NA$default(DrawTransform drawTransform, float f, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = drawTransform.mo107950getCenterF1C5BW0();
            }
            drawTransform.mo107952rotateUv8p0NA(f, j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
    }

    /* renamed from: scale-0AR0LA0$default  reason: not valid java name */
    static /* synthetic */ void m108074scale0AR0LA0$default(DrawTransform drawTransform, float f, float f2, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                j = drawTransform.mo107950getCenterF1C5BW0();
            }
            drawTransform.mo107953scale0AR0LA0(f, f2, j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
    }

    static /* synthetic */ void translate$default(DrawTransform drawTransform, float f, float f2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                f = 0.0f;
            }
            if ((i & 2) != 0) {
                f2 = 0.0f;
            }
            drawTransform.translate(f, f2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo107948clipPathmtrdDE(@NotNull Path path, int i);

    /* renamed from: clipRect-N_I0leg */
    void mo107949clipRectN_I0leg(float f, float f2, float f3, float f4, int i);

    /* renamed from: getCenter-F1C5BW0 */
    default long mo107950getCenterF1C5BW0() {
        float f = 2;
        return OffsetKt.Offset(Size.m107360getWidthimpl(mo107951getSizeNHjbRc()) / f, Size.m107357getHeightimpl(mo107951getSizeNHjbRc()) / f);
    }

    /* renamed from: getSize-NH-jbRc */
    long mo107951getSizeNHjbRc();

    void inset(float f, float f2, float f3, float f4);

    /* renamed from: rotate-Uv8p0NA */
    void mo107952rotateUv8p0NA(float f, long j);

    /* renamed from: scale-0AR0LA0 */
    void mo107953scale0AR0LA0(float f, float f2, long j);

    /* renamed from: transform-58bKbWc */
    void mo107954transform58bKbWc(@NotNull float[] fArr);

    void translate(float f, float f2);
}
