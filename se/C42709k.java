package se;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ArrayPools.kt */
@Metadata
/* renamed from: se.k */
/* loaded from: classes8.dex */
public final class C42709k extends C42713l {
    @NotNull

    /* renamed from: c */
    public static final C42709k f111847c = new C42709k();

    private C42709k() {
    }

    /* renamed from: c */
    public final void m6760c(@NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        m6743a(array);
    }

    @NotNull
    /* renamed from: d */
    public final byte[] m6759d() {
        return super.m6742b(512);
    }
}
