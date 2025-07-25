package p032b9;

import android.view.animation.Interpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: b9.f */
/* loaded from: classes8.dex */
public final class ReverseInterpolator implements Interpolator {
    @NotNull

    /* renamed from: a */
    private final Interpolator f1615a;

    public ReverseInterpolator(@NotNull Interpolator base) {
        Intrinsics.checkNotNullParameter(base, "base");
        this.f1615a = base;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return 1.0f - this.f1615a.getInterpolation(1.0f - f);
    }
}
