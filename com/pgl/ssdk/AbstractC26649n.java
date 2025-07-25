package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.pgl.ssdk.n */
/* loaded from: classes7.dex */
public abstract class AbstractC26649n {
    /* renamed from: a */
    public static C26646m<ByteBuffer, Long> m40817a(InterfaceC26651o interfaceC26651o) throws IOException {
        if (interfaceC26651o.mo40806a() < 22) {
            return null;
        }
        C26646m<ByteBuffer, Long> m40816a = m40816a(interfaceC26651o, 0);
        return m40816a != null ? m40816a : m40816a(interfaceC26651o, 65535);
    }

    /* renamed from: b */
    private static int m40813b(ByteBuffer byteBuffer) {
        m40815a(byteBuffer);
        int capacity = byteBuffer.capacity();
        if (capacity < 22) {
            return -1;
        }
        int i = capacity - 22;
        int min = Math.min(i, 65535);
        for (int i2 = 0; i2 <= min; i2++) {
            int i3 = i - i2;
            if (byteBuffer.getInt(i3) == 101010256 && m40814a(byteBuffer, i3 + 20) == i2) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static long m40811c(ByteBuffer byteBuffer) {
        m40815a(byteBuffer);
        return m40812b(byteBuffer, byteBuffer.position() + 16);
    }

    /* renamed from: d */
    public static long m40810d(ByteBuffer byteBuffer) {
        m40815a(byteBuffer);
        return m40812b(byteBuffer, byteBuffer.position() + 12);
    }

    /* renamed from: e */
    public static int m40809e(ByteBuffer byteBuffer) {
        m40815a(byteBuffer);
        return m40814a(byteBuffer, byteBuffer.position() + 10);
    }

    /* renamed from: a */
    private static C26646m<ByteBuffer, Long> m40816a(InterfaceC26651o interfaceC26651o, int i) throws IOException {
        if (i >= 0 && i <= 65535) {
            long mo40806a = interfaceC26651o.mo40806a();
            if (mo40806a < 22) {
                return null;
            }
            int min = ((int) Math.min(i, mo40806a - 22)) + 22;
            long j = mo40806a - min;
            ByteBuffer mo40805a = interfaceC26651o.mo40805a(j, min);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            mo40805a.order(byteOrder);
            int m40813b = m40813b(mo40805a);
            if (m40813b == -1) {
                return null;
            }
            mo40805a.position(m40813b);
            ByteBuffer slice = mo40805a.slice();
            slice.order(byteOrder);
            return C26646m.m40830a(slice, Long.valueOf(j + m40813b));
        }
        throw new IllegalArgumentException("maxCommentSize: ".concat(String.valueOf(i)));
    }

    /* renamed from: b */
    static long m40812b(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getInt(i) & 4294967295L;
    }

    /* renamed from: a */
    static void m40815a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* renamed from: a */
    public static int m40814a(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getShort(i) & 65535;
    }
}
