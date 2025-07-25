package androidx.compose.p015ui.geometry;

import androidx.compose.p015ui.util.MathHelpers;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;

/* compiled from: CornerRadius.kt */
@Metadata
/* renamed from: androidx.compose.ui.geometry.CornerRadiusKt */
/* loaded from: classes.dex */
public final class CornerRadiusKt {
    @Stable
    public static final long CornerRadius(float f, float f2) {
        return CornerRadius.m107260constructorimpl((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    public static /* synthetic */ long CornerRadius$default(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return CornerRadius(f, f2);
    }

    @Stable
    /* renamed from: lerp-3Ry4LBc  reason: not valid java name */
    public static final long m107277lerp3Ry4LBc(long j, long j2, float f) {
        return CornerRadius(MathHelpers.lerp(CornerRadius.m107266getXimpl(j), CornerRadius.m107266getXimpl(j2), f), MathHelpers.lerp(CornerRadius.m107267getYimpl(j), CornerRadius.m107267getYimpl(j2), f));
    }
}
