package p850qd;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Comparisons.kt */
@Metadata
/* renamed from: qd.g */
/* loaded from: classes7.dex */
final class C39387g implements Comparator<Comparable<? super Object>> {
    @NotNull

    /* renamed from: b */
    public static final C39387g f103594b = new C39387g();

    private C39387g() {
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(@NotNull Comparable<Object> a, @NotNull Comparable<Object> b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return b.compareTo(a);
    }

    @Override // java.util.Comparator
    @NotNull
    public final Comparator<Comparable<? super Object>> reversed() {
        return C39386f.f103593b;
    }
}
