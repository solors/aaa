package mc;

import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: mc.j */
/* loaded from: classes9.dex */
public final class CollectionsJvm {
    @NotNull
    /* renamed from: a */
    public static final <T> Set<T> m15231a(@NotNull Set<? extends T> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Set<T> unmodifiableSet = Collections.unmodifiableSet(set);
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(this)");
        return unmodifiableSet;
    }
}
