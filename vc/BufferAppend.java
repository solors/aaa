package vc;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tc.MemoryJvm;

@Metadata
/* renamed from: vc.b */
/* loaded from: classes9.dex */
public final class BufferAppend {
    /* renamed from: a */
    public static final int m2497a(@NotNull C44557a c44557a, @NotNull C44557a other, int i) {
        Intrinsics.checkNotNullParameter(c44557a, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(other.m2507j() - other.m2509h(), i);
        if (c44557a.m2511f() - c44557a.m2507j() <= min) {
            m2496b(c44557a, min);
        }
        ByteBuffer m2510g = c44557a.m2510g();
        int m2507j = c44557a.m2507j();
        c44557a.m2511f();
        ByteBuffer m2510g2 = other.m2510g();
        int m2509h = other.m2509h();
        other.m2507j();
        MemoryJvm.m3120c(m2510g2, m2510g, m2509h, min, m2507j);
        other.m2514c(min);
        c44557a.m2516a(min);
        return min;
    }

    /* renamed from: b */
    private static final void m2496b(C44557a c44557a, int i) {
        if ((c44557a.m2511f() - c44557a.m2507j()) + (c44557a.m2512e() - c44557a.m2511f()) >= i) {
            if ((c44557a.m2507j() + i) - c44557a.m2511f() > 0) {
                c44557a.m2505l();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Can't append buffer: not enough free space at the end");
    }

    /* renamed from: c */
    public static final int m2495c(@NotNull C44557a c44557a, @NotNull C44557a other) {
        Intrinsics.checkNotNullParameter(c44557a, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int m2507j = other.m2507j() - other.m2509h();
        int m2509h = c44557a.m2509h();
        if (m2509h >= m2507j) {
            int i = m2509h - m2507j;
            MemoryJvm.m3120c(other.m2510g(), c44557a.m2510g(), other.m2509h(), m2507j, i);
            other.m2514c(m2507j);
            c44557a.m2503n(i);
            return m2507j;
        }
        throw new IllegalArgumentException("Not enough space in the beginning to prepend bytes");
    }
}
