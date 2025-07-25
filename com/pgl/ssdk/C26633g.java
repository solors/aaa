package com.pgl.ssdk;

import com.pgl.ssdk.C26622d;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.pgl.ssdk.g */
/* loaded from: classes7.dex */
public class C26633g {

    /* renamed from: a */
    private static final char[] f69901a = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    public static C26636h m40867a(InterfaceC26651o interfaceC26651o, C26658r c26658r, int i) throws IOException, C26638i {
        try {
            C26622d.C26623a m40890a = C26622d.m40890a(interfaceC26651o, c26658r);
            long m40888b = m40890a.m40888b();
            InterfaceC26651o m40889a = m40890a.m40889a();
            ByteBuffer mo40805a = m40889a.mo40805a(0L, (int) m40889a.mo40806a());
            mo40805a.order(ByteOrder.LITTLE_ENDIAN);
            return new C26636h(m40865a(mo40805a, i), m40888b, c26658r.m40786a(), c26658r.m40782e(), c26658r.m40783d());
        } catch (C26607b e) {
            throw new C26638i(e.getMessage(), e);
        }
    }

    /* renamed from: b */
    private static ByteBuffer m40862b(ByteBuffer byteBuffer, int i) {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 >= position && i2 <= limit) {
                byteBuffer.limit(i2);
                try {
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer.position(i2);
                    return slice;
                } finally {
                    byteBuffer.limit(limit);
                }
            }
            throw new BufferUnderflowException();
        }
        throw new IllegalArgumentException("size: ".concat(String.valueOf(i)));
    }

    /* renamed from: c */
    public static byte[] m40861c(ByteBuffer byteBuffer) throws C26602a {
        int i = byteBuffer.getInt();
        if (i >= 0) {
            if (i <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i];
                byteBuffer.get(bArr);
                return bArr;
            }
            throw new C26602a("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
        }
        throw new C26602a("Negative length");
    }

    /* renamed from: b */
    public static ByteBuffer m40863b(ByteBuffer byteBuffer) throws C26602a {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i >= 0) {
                if (i <= byteBuffer.remaining()) {
                    return m40862b(byteBuffer, i);
                }
                throw new C26602a("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new C26602a("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
    }

    /* renamed from: a */
    public static ByteBuffer m40865a(ByteBuffer byteBuffer, int i) throws C26638i {
        m40866a(byteBuffer);
        ByteBuffer m40864a = m40864a(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i2 = 0;
        while (m40864a.hasRemaining()) {
            i2++;
            if (m40864a.remaining() >= 8) {
                long j = m40864a.getLong();
                if (j >= 4 && j <= 2147483647L) {
                    int i3 = (int) j;
                    int position = m40864a.position() + i3;
                    if (i3 <= m40864a.remaining()) {
                        if (m40864a.getInt() == i) {
                            return m40862b(m40864a, i3 - 4);
                        }
                        m40864a.position(position);
                    } else {
                        throw new C26638i("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + m40864a.remaining());
                    }
                } else {
                    throw new C26638i("APK Signing Block entry #" + i2 + " size out of range: " + j);
                }
            } else {
                throw new C26638i("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i2)));
            }
        }
        throw new C26638i("No APK Signature Scheme block in APK Signing Block with ID: ".concat(String.valueOf(i)));
    }

    /* renamed from: a */
    public static void m40866a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* renamed from: a */
    private static ByteBuffer m40864a(ByteBuffer byteBuffer, int i, int i2) {
        if (i >= 0) {
            if (i2 >= i) {
                int capacity = byteBuffer.capacity();
                if (i2 <= byteBuffer.capacity()) {
                    int limit = byteBuffer.limit();
                    int position = byteBuffer.position();
                    try {
                        byteBuffer.position(0);
                        byteBuffer.limit(i2);
                        byteBuffer.position(i);
                        ByteBuffer slice = byteBuffer.slice();
                        slice.order(byteBuffer.order());
                        return slice;
                    } finally {
                        byteBuffer.position(0);
                        byteBuffer.limit(limit);
                        byteBuffer.position(position);
                    }
                }
                throw new IllegalArgumentException("end > capacity: " + i2 + " > " + capacity);
            }
            throw new IllegalArgumentException("end < start: " + i2 + " < " + i);
        }
        throw new IllegalArgumentException("start: ".concat(String.valueOf(i)));
    }
}
