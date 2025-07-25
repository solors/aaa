package me;

import ie.C33640k0;
import ie.Symbol;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Semaphore.kt */
@Metadata
/* renamed from: me.f */
/* loaded from: classes8.dex */
public final class C38294f {

    /* renamed from: a */
    private static final int f101194a;
    @NotNull

    /* renamed from: b */
    private static final Symbol f101195b;
    @NotNull

    /* renamed from: c */
    private static final Symbol f101196c;
    @NotNull

    /* renamed from: d */
    private static final Symbol f101197d;
    @NotNull

    /* renamed from: e */
    private static final Symbol f101198e;

    /* renamed from: f */
    private static final int f101199f;

    static {
        int m22954e;
        int m22954e2;
        m22954e = C33640k0.m22954e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f101194a = m22954e;
        f101195b = new Symbol("PERMIT");
        f101196c = new Symbol("TAKEN");
        f101197d = new Symbol("BROKEN");
        f101198e = new Symbol("CANCELLED");
        m22954e2 = C33640k0.m22954e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f101199f = m22954e2;
    }

    @NotNull
    /* renamed from: a */
    public static final Semaphore m15141a(int i, int i2) {
        return new C38290e(i, i2);
    }

    /* renamed from: b */
    public static /* synthetic */ Semaphore m15140b(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m15141a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final C38295g m15132j(long j, C38295g c38295g) {
        return new C38295g(j, c38295g, 0);
    }
}
