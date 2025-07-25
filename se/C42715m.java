package se;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ArrayPools.kt */
@Metadata
/* renamed from: se.m */
/* loaded from: classes8.dex */
public final class C42715m extends C42718n {
    @NotNull

    /* renamed from: c */
    public static final C42715m f111862c = new C42715m();

    private C42715m() {
    }

    /* renamed from: c */
    public final void m6729c(@NotNull char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        m6718a(array);
    }

    @NotNull
    /* renamed from: d */
    public final char[] m6728d() {
        return super.m6717b(128);
    }
}
