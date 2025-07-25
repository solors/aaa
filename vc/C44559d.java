package vc;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Buffer.kt */
@Metadata
/* renamed from: vc.d */
/* loaded from: classes9.dex */
public final class C44559d {
    @NotNull
    /* renamed from: a */
    public static final Void m2493a(int i, int i2) {
        throw new EOFException("Unable to discard " + i + " bytes: only " + i2 + " available for writing");
    }

    @NotNull
    /* renamed from: b */
    public static final Void m2492b(int i, int i2) {
        throw new EOFException("Unable to discard " + i + " bytes: only " + i2 + " available for reading");
    }

    /* renamed from: c */
    public static final void m2491c(@NotNull C44557a c44557a, int i) {
        Intrinsics.checkNotNullParameter(c44557a, "<this>");
        throw new IllegalArgumentException("End gap " + i + " is too big: capacity is " + c44557a.m2512e());
    }

    /* renamed from: d */
    public static final void m2490d(@NotNull C44557a c44557a, int i) {
        Intrinsics.checkNotNullParameter(c44557a, "<this>");
        throw new IllegalArgumentException("Unable to reserve end gap " + i + ": there are already " + (c44557a.m2507j() - c44557a.m2509h()) + " content bytes at offset " + c44557a.m2509h());
    }

    /* renamed from: e */
    public static final void m2489e(@NotNull C44557a c44557a, int i) {
        Intrinsics.checkNotNullParameter(c44557a, "<this>");
        throw new IllegalArgumentException("End gap " + i + " is too big: there are already " + c44557a.m2508i() + " bytes reserved in the beginning");
    }

    /* renamed from: f */
    public static final void m2488f(@NotNull C44557a c44557a, int i) {
        Intrinsics.checkNotNullParameter(c44557a, "<this>");
        c44557a.m2503n(c44557a.m2509h() - i);
    }

    @NotNull
    /* renamed from: g */
    public static final Void m2487g(@NotNull C44557a c44557a, int i) {
        Intrinsics.checkNotNullParameter(c44557a, "<this>");
        throw new IllegalStateException("Unable to reserve " + i + " start gap: there are already " + (c44557a.m2507j() - c44557a.m2509h()) + " content bytes starting at offset " + c44557a.m2509h());
    }

    @NotNull
    /* renamed from: h */
    public static final Void m2486h(@NotNull C44557a c44557a, int i) {
        Intrinsics.checkNotNullParameter(c44557a, "<this>");
        if (i > c44557a.m2512e()) {
            throw new IllegalArgumentException("Start gap " + i + " is bigger than the capacity " + c44557a.m2512e());
        }
        throw new IllegalStateException("Unable to reserve " + i + " start gap: there are already " + (c44557a.m2512e() - c44557a.m2511f()) + " bytes reserved in the end");
    }
}
