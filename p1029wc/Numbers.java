package p1029wc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: wc.e */
/* loaded from: classes9.dex */
public final class Numbers {
    @NotNull
    /* renamed from: a */
    public static final Void m2132a(long j, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        throw new IllegalArgumentException("Long value " + j + " of " + name + " doesn't fit into 32-bit integer");
    }
}
