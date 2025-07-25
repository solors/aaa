package kotlin.ranges;

import de.Ranges;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Ranges.kt */
@Metadata
/* renamed from: kotlin.ranges.h */
/* loaded from: classes7.dex */
public class C37636h {
    /* renamed from: a */
    public static final void m16921a(boolean z, @NotNull Number step) {
        Intrinsics.checkNotNullParameter(step, "step");
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    @NotNull
    /* renamed from: b */
    public static Ranges<Float> m16920b(float f, float f2) {
        return new C37628c(f, f2);
    }
}
