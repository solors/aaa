package com.fyber.inneractive.sdk.protobuf;

import com.amazon.device.ads.DtbConstants;
import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.protobuf.D1 */
/* loaded from: classes4.dex */
public final class C15224D1 extends AbstractC15215A1 {
    /* renamed from: a */
    public static int m77010a(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            AbstractC15215A1 abstractC15215A1 = AbstractC15227E1.f30154a;
            if (i > -12) {
                return -1;
            }
            return i;
        } else if (i2 != 1) {
            if (i2 == 2) {
                AbstractC15353x1 abstractC15353x1 = AbstractC15356y1.f30346c;
                long j2 = AbstractC15356y1.f30349f;
                return AbstractC15227E1.m77006a(i, abstractC15353x1.mo76699b(bArr, j2 + j), abstractC15353x1.mo76699b(bArr, j + 1 + j2));
            }
            throw new AssertionError();
        } else {
            return AbstractC15227E1.m77007a(i, AbstractC15356y1.f30346c.mo76699b(bArr, AbstractC15356y1.f30349f + j));
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15215A1
    /* renamed from: b */
    public final String mo77009b(ByteBuffer byteBuffer, int i, int i2) {
        long j;
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            long j2 = AbstractC15356y1.f30346c.f30338a.getLong(byteBuffer, AbstractC15356y1.f30350g) + i;
            long j3 = i2 + j2;
            char[] cArr = new char[i2];
            int i3 = 0;
            while (true) {
                j = 1;
                if (j2 >= j3) {
                    break;
                }
                byte mo76707a = AbstractC15356y1.f30346c.mo76707a(j2);
                if (!AbstractC15359z1.m76660a(mo76707a)) {
                    break;
                }
                j2++;
                cArr[i3] = (char) mo76707a;
                i3++;
            }
            while (j2 < j3) {
                long j4 = j2 + j;
                AbstractC15353x1 abstractC15353x1 = AbstractC15356y1.f30346c;
                byte mo76707a2 = abstractC15353x1.mo76707a(j2);
                if (AbstractC15359z1.m76660a(mo76707a2)) {
                    cArr[i3] = (char) mo76707a2;
                    i3++;
                    j2 = j4;
                    while (j2 < j3) {
                        byte mo76707a3 = AbstractC15356y1.f30346c.mo76707a(j2);
                        if (!AbstractC15359z1.m76660a(mo76707a3)) {
                            break;
                        }
                        j2 += j;
                        cArr[i3] = (char) mo76707a3;
                        i3++;
                    }
                } else if (mo76707a2 < -32) {
                    if (j4 < j3) {
                        j2 += 2;
                        AbstractC15359z1.m76657a(mo76707a2, abstractC15353x1.mo76707a(j4), cArr, i3);
                        i3++;
                    } else {
                        throw new C15325o0("Protocol message had invalid UTF-8.");
                    }
                } else if (mo76707a2 < -16) {
                    if (j4 < j3 - j) {
                        long j5 = j2 + 2;
                        j2 += 3;
                        AbstractC15359z1.m76658a(mo76707a2, abstractC15353x1.mo76707a(j4), abstractC15353x1.mo76707a(j5), cArr, i3);
                        i3++;
                    } else {
                        throw new C15325o0("Protocol message had invalid UTF-8.");
                    }
                } else if (j4 < j3 - 2) {
                    long j6 = j2 + 3;
                    j2 += 4;
                    AbstractC15359z1.m76659a(mo76707a2, abstractC15353x1.mo76707a(j4), abstractC15353x1.mo76707a(j2 + 2), abstractC15353x1.mo76707a(j6), cArr, i3);
                    i3 += 2;
                    j = 1;
                } else {
                    throw new C15325o0("Protocol message had invalid UTF-8.");
                }
            }
            return new String(cArr, 0, i3);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15215A1
    /* renamed from: c */
    public final int mo77008c(byte[] bArr, int i, int i2) {
        int i3;
        if ((i | i2 | (bArr.length - i2)) >= 0) {
            long j = i;
            int i4 = (int) (i2 - j);
            long j2 = 1;
            if (i4 < 16) {
                i3 = 0;
            } else {
                i3 = 0;
                long j3 = j;
                while (true) {
                    if (i3 < i4) {
                        long j4 = j3 + 1;
                        if (AbstractC15356y1.f30346c.mo76699b(bArr, j3 + AbstractC15356y1.f30349f) < 0) {
                            break;
                        }
                        i3++;
                        j3 = j4;
                    } else {
                        i3 = i4;
                        break;
                    }
                }
            }
            int i5 = i4 - i3;
            long j5 = j + i3;
            while (true) {
                byte b = 0;
                while (true) {
                    if (i5 <= 0) {
                        break;
                    }
                    long j6 = j5 + j2;
                    byte mo76699b = AbstractC15356y1.f30346c.mo76699b(bArr, AbstractC15356y1.f30349f + j5);
                    if (mo76699b >= 0) {
                        i5--;
                        b = mo76699b;
                        j5 = j6;
                    } else {
                        b = mo76699b;
                        j5 = j6;
                        break;
                    }
                }
                if (i5 == 0) {
                    return 0;
                }
                int i6 = i5 - 1;
                if (b < -32) {
                    if (i6 == 0) {
                        return b;
                    }
                    i5 -= 2;
                    if (b < -62) {
                        break;
                    }
                    long j7 = j5 + j2;
                    if (AbstractC15356y1.f30346c.mo76699b(bArr, AbstractC15356y1.f30349f + j5) > -65) {
                        break;
                    }
                    j5 = j7;
                } else if (b < -16) {
                    if (i6 < 2) {
                        return m77010a(bArr, b, j5, i6);
                    }
                    i5 -= 3;
                    long j8 = j5 + j2;
                    AbstractC15353x1 abstractC15353x1 = AbstractC15356y1.f30346c;
                    long j9 = AbstractC15356y1.f30349f;
                    byte mo76699b2 = abstractC15353x1.mo76699b(bArr, j9 + j5);
                    if (mo76699b2 > -65 || ((b == -32 && mo76699b2 < -96) || (b == -19 && mo76699b2 >= -96))) {
                        break;
                    }
                    j5 += 2;
                    if (abstractC15353x1.mo76699b(bArr, j9 + j8) > -65) {
                        break;
                    }
                    j2 = 1;
                } else if (i6 < 3) {
                    return m77010a(bArr, b, j5, i6);
                } else {
                    i5 -= 4;
                    long j10 = j5 + 1;
                    AbstractC15353x1 abstractC15353x12 = AbstractC15356y1.f30346c;
                    long j11 = AbstractC15356y1.f30349f;
                    byte mo76699b3 = abstractC15353x12.mo76699b(bArr, j11 + j5);
                    if (mo76699b3 > -65 || (((mo76699b3 + 112) + (b << 28)) >> 30) != 0) {
                        break;
                    }
                    long j12 = 2 + j5;
                    if (abstractC15353x12.mo76699b(bArr, j11 + j10) > -65) {
                        break;
                    }
                    j5 += 3;
                    if (abstractC15353x12.mo76699b(bArr, j11 + j12) > -65) {
                        break;
                    }
                    j2 = 1;
                }
            }
            return -1;
        }
        throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15215A1
    /* renamed from: a */
    public final String mo77011a(byte[] bArr, int i, int i2) {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte mo76699b = AbstractC15356y1.f30346c.mo76699b(bArr, AbstractC15356y1.f30349f + i);
                if (!AbstractC15359z1.m76660a(mo76699b)) {
                    break;
                }
                i++;
                cArr[i4] = (char) mo76699b;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                AbstractC15353x1 abstractC15353x1 = AbstractC15356y1.f30346c;
                long j = AbstractC15356y1.f30349f;
                byte mo76699b2 = abstractC15353x1.mo76699b(bArr, i + j);
                if (AbstractC15359z1.m76660a(mo76699b2)) {
                    cArr[i5] = (char) mo76699b2;
                    i5++;
                    i = i6;
                    while (i < i3) {
                        byte mo76699b3 = AbstractC15356y1.f30346c.mo76699b(bArr, AbstractC15356y1.f30349f + i);
                        if (!AbstractC15359z1.m76660a(mo76699b3)) {
                            break;
                        }
                        i++;
                        cArr[i5] = (char) mo76699b3;
                        i5++;
                    }
                } else if (mo76699b2 < -32) {
                    if (i6 < i3) {
                        i += 2;
                        AbstractC15359z1.m76657a(mo76699b2, abstractC15353x1.mo76699b(bArr, j + i6), cArr, i5);
                        i5++;
                    } else {
                        throw new C15325o0("Protocol message had invalid UTF-8.");
                    }
                } else if (mo76699b2 < -16) {
                    if (i6 < i3 - 1) {
                        int i7 = i + 2;
                        i += 3;
                        AbstractC15359z1.m76658a(mo76699b2, abstractC15353x1.mo76699b(bArr, i6 + j), abstractC15353x1.mo76699b(bArr, j + i7), cArr, i5);
                        i5++;
                    } else {
                        throw new C15325o0("Protocol message had invalid UTF-8.");
                    }
                } else if (i6 < i3 - 2) {
                    int i8 = i + 3;
                    i += 4;
                    AbstractC15359z1.m76659a(mo76699b2, abstractC15353x1.mo76699b(bArr, i6 + j), abstractC15353x1.mo76699b(bArr, i + 2 + j), abstractC15353x1.mo76699b(bArr, j + i8), cArr, i5);
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
    /* renamed from: a */
    public final int mo77012a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        char c;
        String str;
        String str2;
        long j2;
        int i3;
        long j3;
        char charAt;
        long j4 = i;
        long j5 = i2 + j4;
        int length = charSequence.length();
        String str3 = " at index ";
        String str4 = "Failed writing ";
        if (length > i2 || bArr.length - i2 < i) {
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
        }
        int i4 = 0;
        while (true) {
            j = 1;
            c = 128;
            if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            AbstractC15356y1.f30346c.mo76704a((Object) bArr, AbstractC15356y1.f30349f + j4, (byte) charAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char charAt2 = charSequence.charAt(i4);
            if (charAt2 < c && j4 < j5) {
                j2 = j4 + j;
                AbstractC15356y1.f30346c.mo76704a((Object) bArr, AbstractC15356y1.f30349f + j4, (byte) charAt2);
                str = str3;
                str2 = str4;
            } else if (charAt2 >= 2048 || j4 > j5 - 2) {
                str = str3;
                str2 = str4;
                if ((charAt2 >= 55296 && 57343 >= charAt2) || j4 > j5 - 3) {
                    if (j4 <= j5 - 4) {
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char charAt3 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                j3 = 1;
                                AbstractC15353x1 abstractC15353x1 = AbstractC15356y1.f30346c;
                                long j6 = AbstractC15356y1.f30349f;
                                abstractC15353x1.mo76704a((Object) bArr, j6 + j4, (byte) ((codePoint >>> 18) | 240));
                                abstractC15353x1.mo76704a((Object) bArr, j6 + j4 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j7 = j4 + 3;
                                c = 128;
                                abstractC15353x1.mo76704a((Object) bArr, j6 + 2 + j4, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 += 4;
                                abstractC15353x1.mo76704a((Object) bArr, j6 + j7, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                                i4++;
                                str3 = str;
                                j = j3;
                                str4 = str2;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new C15221C1(i4 - 1, length);
                    } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                        throw new C15221C1(i4, length);
                    } else {
                        throw new ArrayIndexOutOfBoundsException(str2 + charAt2 + str + j4);
                    }
                }
                AbstractC15353x1 abstractC15353x12 = AbstractC15356y1.f30346c;
                long j8 = AbstractC15356y1.f30349f;
                abstractC15353x12.mo76704a((Object) bArr, j8 + j4, (byte) ((charAt2 >>> '\f') | DtbConstants.DEFAULT_PLAYER_HEIGHT));
                abstractC15353x12.mo76704a((Object) bArr, j8 + j4 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                abstractC15353x12.mo76704a((Object) bArr, j8 + 2 + j4, (byte) ((charAt2 & '?') | 128));
                j2 = j4 + 3;
            } else {
                long j9 = j4 + j;
                AbstractC15353x1 abstractC15353x13 = AbstractC15356y1.f30346c;
                long j10 = AbstractC15356y1.f30349f;
                str = str3;
                str2 = str4;
                abstractC15353x13.mo76704a((Object) bArr, j10 + j4, (byte) ((charAt2 >>> 6) | 960));
                j4 += 2;
                abstractC15353x13.mo76704a((Object) bArr, j10 + j9, (byte) ((charAt2 & '?') | 128));
                c = 128;
                j3 = 1;
                i4++;
                str3 = str;
                j = j3;
                str4 = str2;
            }
            j4 = j2;
            c = 128;
            j3 = 1;
            i4++;
            str3 = str;
            j = j3;
            str4 = str2;
        }
        return (int) j4;
    }
}
