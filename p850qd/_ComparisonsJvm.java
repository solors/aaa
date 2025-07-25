package p850qd;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: qd.d */
/* loaded from: classes7.dex */
public class _ComparisonsJvm extends C39385c {
    /* renamed from: h */
    public static float m12774h(float f, @NotNull float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f2 : other) {
            f = Math.max(f, f2);
        }
        return f;
    }

    @NotNull
    /* renamed from: i */
    public static <T extends Comparable<? super T>> T m12773i(@NotNull T a, @NotNull T b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        if (a.compareTo(b) < 0) {
            return b;
        }
        return a;
    }

    /* renamed from: j */
    public static float m12772j(float f, @NotNull float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f2 : other) {
            f = Math.min(f, f2);
        }
        return f;
    }
}
