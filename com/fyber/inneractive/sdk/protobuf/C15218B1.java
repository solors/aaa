package com.fyber.inneractive.sdk.protobuf;

import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.protobuf.B1 */
/* loaded from: classes4.dex */
public final class C15218B1 extends AbstractC15215A1 {
    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15215A1
    /* renamed from: a */
    public final String mo77011a(byte[] bArr, int i, int i2) {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
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
                byte b2 = bArr[i];
                if (AbstractC15359z1.m76660a(b2)) {
                    cArr[i5] = (char) b2;
                    i5++;
                    i = i6;
                    while (i < i3) {
                        byte b3 = bArr[i];
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
                        AbstractC15359z1.m76657a(b2, bArr[i6], cArr, i5);
                        i5++;
                    } else {
                        throw new C15325o0("Protocol message had invalid UTF-8.");
                    }
                } else if (b2 < -16) {
                    if (i6 < i3 - 1) {
                        int i7 = i + 2;
                        i += 3;
                        AbstractC15359z1.m76658a(b2, bArr[i6], bArr[i7], cArr, i5);
                        i5++;
                    } else {
                        throw new C15325o0("Protocol message had invalid UTF-8.");
                    }
                } else if (i6 < i3 - 2) {
                    byte b4 = bArr[i6];
                    int i8 = i + 3;
                    i += 4;
                    AbstractC15359z1.m76659a(b2, b4, bArr[i + 2], bArr[i8], cArr, i5);
                    i5 += 2;
                } else {
                    throw new C15325o0("Protocol message had invalid UTF-8.");
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15215A1
    /* renamed from: b */
    public final String mo77009b(ByteBuffer byteBuffer, int i, int i2) {
        return AbstractC15215A1.m77030a(byteBuffer, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
        if (r1 > (-12)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0098, code lost:
        if (r1 > (-12)) goto L32;
     */
    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15215A1
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo77008c(byte[] r10, int r11, int r12) {
        /*
            r9 = this;
        L0:
            if (r11 >= r12) goto L9
            r0 = r10[r11]
            if (r0 < 0) goto L9
            int r11 = r11 + 1
            goto L0
        L9:
            if (r11 < r12) goto Lc
            goto Le
        Lc:
            if (r11 < r12) goto L11
        Le:
            r10 = 0
            goto Lb7
        L11:
            int r0 = r11 + 1
            r1 = r10[r11]
            if (r1 >= 0) goto Lb8
            r2 = -1
            r3 = -32
            r4 = -65
            if (r1 >= r3) goto L2f
            if (r0 < r12) goto L23
        L20:
            r10 = r1
            goto Lb7
        L23:
            r3 = -62
            if (r1 < r3) goto Lb6
            int r11 = r11 + 2
            r0 = r10[r0]
            if (r0 <= r4) goto Lc
            goto Lb6
        L2f:
            r5 = -16
            r6 = -12
            r7 = 1
            r8 = 2
            if (r1 >= r5) goto L76
            int r5 = r12 + (-1)
            if (r0 < r5) goto L5d
            int r12 = r12 - r0
            if (r12 == 0) goto L5a
            if (r12 == r7) goto L53
            if (r12 != r8) goto L4d
            r12 = r10[r0]
            int r11 = r11 + r8
            r10 = r10[r11]
            int r10 = com.fyber.inneractive.sdk.protobuf.AbstractC15227E1.m77006a(r1, r12, r10)
            goto Lb7
        L4d:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            r10.<init>()
            throw r10
        L53:
            r10 = r10[r0]
            int r10 = com.fyber.inneractive.sdk.protobuf.AbstractC15227E1.m77007a(r1, r10)
            goto Lb7
        L5a:
            if (r1 <= r6) goto L20
            goto L9a
        L5d:
            int r5 = r11 + 2
            r0 = r10[r0]
            if (r0 > r4) goto Lb6
            r6 = -96
            if (r1 != r3) goto L69
            if (r0 < r6) goto Lb6
        L69:
            r3 = -19
            if (r1 != r3) goto L6f
            if (r0 >= r6) goto Lb6
        L6f:
            int r11 = r11 + 3
            r0 = r10[r5]
            if (r0 <= r4) goto Lc
            goto Lb6
        L76:
            int r3 = r12 + (-2)
            if (r0 < r3) goto L9b
            int r12 = r12 - r0
            if (r12 == 0) goto L98
            if (r12 == r7) goto L91
            if (r12 != r8) goto L8b
            r12 = r10[r0]
            int r11 = r11 + r8
            r10 = r10[r11]
            int r10 = com.fyber.inneractive.sdk.protobuf.AbstractC15227E1.m77006a(r1, r12, r10)
            goto Lb7
        L8b:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            r10.<init>()
            throw r10
        L91:
            r10 = r10[r0]
            int r10 = com.fyber.inneractive.sdk.protobuf.AbstractC15227E1.m77007a(r1, r10)
            goto Lb7
        L98:
            if (r1 <= r6) goto L20
        L9a:
            goto Lb6
        L9b:
            int r3 = r11 + 2
            r0 = r10[r0]
            if (r0 > r4) goto Lb6
            int r1 = r1 << 28
            int r0 = r0 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto Lb6
            int r0 = r11 + 3
            r1 = r10[r3]
            if (r1 > r4) goto Lb6
            int r11 = r11 + 4
            r0 = r10[r0]
            if (r0 <= r4) goto Lc
        Lb6:
            r10 = r2
        Lb7:
            return r10
        Lb8:
            r11 = r0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C15218B1.mo77008c(byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r10 + r0;
     */
    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15215A1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo77012a(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C15218B1.mo77012a(java.lang.CharSequence, byte[], int, int):int");
    }
}
