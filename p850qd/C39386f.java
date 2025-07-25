package p850qd;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Comparisons.kt */
@Metadata
/* renamed from: qd.f */
/* loaded from: classes7.dex */
public final class C39386f implements Comparator<Comparable<? super Object>> {
    @NotNull

    /* renamed from: b */
    public static final C39386f f103593b = new C39386f();

    private C39386f() {
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(@NotNull Comparable<Object> a, @NotNull Comparable<Object> b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return a.compareTo(b);
    }

    @Override // java.util.Comparator
    @NotNull
    public final Comparator<Comparable<? super Object>> reversed() {
        return C39387g.f103594b;
    }
}
