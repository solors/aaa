package vc;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tc.C44400d;
import tc.MemoryJvm;

@Metadata
/* renamed from: vc.f */
/* loaded from: classes9.dex */
public final class BufferPrimitives {
    /* renamed from: a */
    public static final int m2484a(@NotNull C44557a c44557a, @NotNull C44557a dst, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(c44557a, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i > dst.m2511f() - dst.m2507j()) {
                z2 = false;
            }
            if (z2) {
                ByteBuffer m2510g = c44557a.m2510g();
                int m2509h = c44557a.m2509h();
                if (c44557a.m2507j() - m2509h >= i) {
                    MemoryJvm.m3120c(m2510g, dst.m2510g(), m2509h, i, dst.m2507j());
                    dst.m2516a(i);
                    Unit unit = Unit.f99208a;
                    c44557a.m2514c(i);
                    return i;
                }
                throw new EOFException("Not enough bytes to read a buffer content of size " + i + '.');
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: b */
    public static final void m2483b(@NotNull C44557a c44557a, @NotNull byte[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(c44557a, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ByteBuffer m2510g = c44557a.m2510g();
        int m2509h = c44557a.m2509h();
        if (c44557a.m2507j() - m2509h >= i2) {
            C44400d.m3116b(m2510g, destination, m2509h, i2, i);
            Unit unit = Unit.f99208a;
            c44557a.m2514c(i2);
            return;
        }
        throw new EOFException("Not enough bytes to read a byte array of size " + i2 + '.');
    }

    /* renamed from: c */
    public static final void m2482c(@NotNull C44557a c44557a, @NotNull C44557a src, int i) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(c44557a, "<this>");
        Intrinsics.checkNotNullParameter(src, "src");
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i <= src.m2507j() - src.m2509h()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i > c44557a.m2511f() - c44557a.m2507j()) {
                    z3 = false;
                }
                if (z3) {
                    ByteBuffer m2510g = c44557a.m2510g();
                    int m2507j = c44557a.m2507j();
                    int m2511f = c44557a.m2511f() - m2507j;
                    if (m2511f >= i) {
                        MemoryJvm.m3120c(src.m2510g(), m2510g, src.m2509h(), i, m2507j);
                        src.m2514c(i);
                        c44557a.m2516a(i);
                        return;
                    }
                    throw new C44564o("buffer readable content", i, m2511f);
                }
                throw new IllegalArgumentException(("length shouldn't be greater than the destination write remaining space: " + i + " > " + (c44557a.m2511f() - c44557a.m2507j())).toString());
            }
            throw new IllegalArgumentException(("length shouldn't be greater than the source read remaining: " + i + " > " + (src.m2507j() - src.m2509h())).toString());
        }
        throw new IllegalArgumentException(("length shouldn't be negative: " + i).toString());
    }

    /* renamed from: d */
    public static final void m2481d(@NotNull C44557a c44557a, @NotNull byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(c44557a, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer m2510g = c44557a.m2510g();
        int m2507j = c44557a.m2507j();
        int m2511f = c44557a.m2511f() - m2507j;
        if (m2511f >= i2) {
            ByteBuffer order = ByteBuffer.wrap(source, i, i2).slice().order(ByteOrder.BIG_ENDIAN);
            Intrinsics.checkNotNullExpressionValue(order, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
            MemoryJvm.m3120c(MemoryJvm.m3121b(order), m2510g, 0, i2, m2507j);
            c44557a.m2516a(i2);
            return;
        }
        throw new C44564o("byte array", i2, m2511f);
    }
}
