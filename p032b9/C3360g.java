package p032b9;

import android.view.animation.Interpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReverseInterpolator.kt */
@Metadata
/* renamed from: b9.g */
/* loaded from: classes8.dex */
public final class C3360g {
    @NotNull
    /* renamed from: a */
    public static final Interpolator m103896a(@NotNull Interpolator interpolator) {
        Intrinsics.checkNotNullParameter(interpolator, "<this>");
        return new ReverseInterpolator(interpolator);
    }
}
