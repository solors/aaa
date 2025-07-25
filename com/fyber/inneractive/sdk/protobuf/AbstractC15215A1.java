package com.fyber.inneractive.sdk.protobuf;

import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.protobuf.A1 */
/* loaded from: classes4.dex */
public abstract class AbstractC15215A1 {
    /* renamed from: a */
    public static String m77030a(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (!AbstractC15359z1.m76660a(b)) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (AbstractC15359z1.m76660a(b2)) {
                    cArr[i5] = (char) b2;
                    i5++;
                    i = i6;
                    while (i < i3) {
                        byte b3 = byteBuffer.get(i);
                        if (!AbstractC15359z1.m76660a(b3)) {
                            break;
                        }
                        i++;
                        cArr[i5] = (char) b3;
                        i5++;
                    }
                } else if (b2 < -32) {
                    if (i6 < i3) {
                        i += 2;
                        AbstractC15359z1.m76657a(b2, byteBuffer.get(i6), cArr, i5);
                        i5++;
                    } else {
                        throw new C15325o0("Protocol message had invalid UTF-8.");
                    }
                } else if (b2 < -16) {
                    if (i6 < i3 - 1) {
                        int i7 = i + 2;
                        i += 3;
                        AbstractC15359z1.m76658a(b2, byteBuffer.get(i6), byteBuffer.get(i7), cArr, i5);
                        i5++;
                    } else {
                        throw new C15325o0("Protocol message had invalid UTF-8.");
                    }
                } else if (i6 < i3 - 2) {
                    byte b4 = byteBuffer.get(i6);
                    int i8 = i + 3;
                    i += 4;
                    AbstractC15359z1.m76659a(b2, b4, byteBuffer.get(i + 2), byteBuffer.get(i8), cArr, i5);
                    i5 += 2;
                } else {
                    throw new C15325o0("Protocol message had invalid UTF-8.");
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* renamed from: a */
    public abstract int mo77012a(CharSequence charSequence, byte[] bArr, int i, int i2);

    /* renamed from: a */
    public abstract String mo77011a(byte[] bArr, int i, int i2);

    /* renamed from: b */
    public abstract String mo77009b(ByteBuffer byteBuffer, int i, int i2);

    /* renamed from: b */
    public final boolean m77029b(byte[] bArr, int i, int i2) {
        if (mo77008c(bArr, i, i2) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public abstract int mo77008c(byte[] bArr, int i, int i2);
}
