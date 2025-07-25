package androidx.compose.foundation.shape;

import androidx.compose.p015ui.unit.C1059Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: RoundedCornerShape.kt */
@Metadata
/* loaded from: classes.dex */
public final class RoundedCornerShapeKt {
    @NotNull
    private static final RoundedCornerShape CircleShape = RoundedCornerShape(50);

    @NotNull
    public static final RoundedCornerShape RoundedCornerShape(@NotNull CornerSize corner) {
        Intrinsics.checkNotNullParameter(corner, "corner");
        return new RoundedCornerShape(corner, corner, corner, corner);
    }

    public static /* synthetic */ RoundedCornerShape RoundedCornerShape$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return RoundedCornerShape(f, f2, f3, f4);
    }

    @NotNull
    /* renamed from: RoundedCornerShape-0680j_4  reason: not valid java name */
    public static final RoundedCornerShape m106569RoundedCornerShape0680j_4(float f) {
        return RoundedCornerShape(CornerSizeKt.m106561CornerSize0680j_4(f));
    }

    @NotNull
    /* renamed from: RoundedCornerShape-a9UjIt4  reason: not valid java name */
    public static final RoundedCornerShape m106570RoundedCornerShapea9UjIt4(float f, float f2, float f3, float f4) {
        return new RoundedCornerShape(CornerSizeKt.m106561CornerSize0680j_4(f), CornerSizeKt.m106561CornerSize0680j_4(f2), CornerSizeKt.m106561CornerSize0680j_4(f3), CornerSizeKt.m106561CornerSize0680j_4(f4));
    }

    /* renamed from: RoundedCornerShape-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ RoundedCornerShape m106571RoundedCornerShapea9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C1059Dp.m109734constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = C1059Dp.m109734constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = C1059Dp.m109734constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = C1059Dp.m109734constructorimpl(0);
        }
        return m106570RoundedCornerShapea9UjIt4(f, f2, f3, f4);
    }

    @NotNull
    public static final RoundedCornerShape getCircleShape() {
        return CircleShape;
    }

    @NotNull
    public static final RoundedCornerShape RoundedCornerShape(float f) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(f));
    }

    public static /* synthetic */ RoundedCornerShape RoundedCornerShape$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return RoundedCornerShape(i, i2, i3, i4);
    }

    @NotNull
    public static final RoundedCornerShape RoundedCornerShape(int i) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(i));
    }

    @NotNull
    public static final RoundedCornerShape RoundedCornerShape(float f, float f2, float f3, float f4) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize(f), CornerSizeKt.CornerSize(f2), CornerSizeKt.CornerSize(f3), CornerSizeKt.CornerSize(f4));
    }

    @NotNull
    public static final RoundedCornerShape RoundedCornerShape(int i, int i2, int i3, int i4) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize(i), CornerSizeKt.CornerSize(i2), CornerSizeKt.CornerSize(i3), CornerSizeKt.CornerSize(i4));
    }
}
