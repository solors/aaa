package androidx.compose.foundation.shape;

import androidx.compose.p015ui.unit.C1059Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AbsoluteRoundedCornerShape.kt */
@Metadata
/* loaded from: classes.dex */
public final class AbsoluteRoundedCornerShapeKt {
    @NotNull
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(@NotNull CornerSize corner) {
        Intrinsics.checkNotNullParameter(corner, "corner");
        return new AbsoluteRoundedCornerShape(corner, corner, corner, corner);
    }

    public static /* synthetic */ AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape$default(float f, float f2, float f3, float f4, int i, Object obj) {
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
        return AbsoluteRoundedCornerShape(f, f2, f3, f4);
    }

    @NotNull
    /* renamed from: AbsoluteRoundedCornerShape-0680j_4  reason: not valid java name */
    public static final AbsoluteRoundedCornerShape m106557AbsoluteRoundedCornerShape0680j_4(float f) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.m106561CornerSize0680j_4(f));
    }

    @NotNull
    /* renamed from: AbsoluteRoundedCornerShape-a9UjIt4  reason: not valid java name */
    public static final AbsoluteRoundedCornerShape m106558AbsoluteRoundedCornerShapea9UjIt4(float f, float f2, float f3, float f4) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.m106561CornerSize0680j_4(f), CornerSizeKt.m106561CornerSize0680j_4(f2), CornerSizeKt.m106561CornerSize0680j_4(f3), CornerSizeKt.m106561CornerSize0680j_4(f4));
    }

    /* renamed from: AbsoluteRoundedCornerShape-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ AbsoluteRoundedCornerShape m106559AbsoluteRoundedCornerShapea9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
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
        return m106558AbsoluteRoundedCornerShapea9UjIt4(f, f2, f3, f4);
    }

    @NotNull
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(float f) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(f));
    }

    public static /* synthetic */ AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape$default(int i, int i2, int i3, int i4, int i5, Object obj) {
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
        return AbsoluteRoundedCornerShape(i, i2, i3, i4);
    }

    @NotNull
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(int i) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(i));
    }

    @NotNull
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(float f, float f2, float f3, float f4) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(f), CornerSizeKt.CornerSize(f2), CornerSizeKt.CornerSize(f3), CornerSizeKt.CornerSize(f4));
    }

    @NotNull
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(int i, int i2, int i3, int i4) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(i), CornerSizeKt.CornerSize(i2), CornerSizeKt.CornerSize(i3), CornerSizeKt.CornerSize(i4));
    }
}
