package se;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ArrayPools.kt */
@Metadata
/* renamed from: se.j */
/* loaded from: classes8.dex */
public final class C42706j extends C42713l {
    @NotNull

    /* renamed from: c */
    public static final C42706j f111846c = new C42706j();

    private C42706j() {
    }

    /* renamed from: c */
    public final void m6764c(@NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        m6743a(array);
    }

    @NotNull
    /* renamed from: d */
    public final byte[] m6763d() {
        return super.m6742b(8196);
    }
}
