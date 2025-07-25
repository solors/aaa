package se;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ArrayPools.kt */
@Metadata
/* renamed from: se.o */
/* loaded from: classes8.dex */
public final class C42720o extends C42718n {
    @NotNull

    /* renamed from: c */
    public static final C42720o f111870c = new C42720o();

    private C42720o() {
    }

    /* renamed from: c */
    public final void m6716c(@NotNull char[] array) {
        boolean z;
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length == 16384) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m6718a(array);
            return;
        }
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + array.length).toString());
    }

    @NotNull
    /* renamed from: d */
    public final char[] m6715d() {
        return super.m6717b(16384);
    }
}
