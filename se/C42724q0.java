package se;

import java.io.OutputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: JvmJsonStreams.kt */
@Metadata
/* renamed from: se.q0 */
/* loaded from: classes8.dex */
public final class C42724q0 implements InterfaceC42743z0 {
    @NotNull

    /* renamed from: a */
    private final OutputStream f111881a;
    @NotNull

    /* renamed from: b */
    private final byte[] f111882b;
    @NotNull

    /* renamed from: c */
    private char[] f111883c;

    /* renamed from: d */
    private int f111884d;

    public C42724q0(@NotNull OutputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.f111881a = stream;
        this.f111882b = C42709k.f111847c.m6759d();
        this.f111883c = C42715m.f111862c.m6728d();
    }

    /* renamed from: d */
    private final void m6701d(int i, String str) {
        int i2;
        int length = str.length();
        for (int i3 = i - 1; i3 < length; i3++) {
            int m6700e = m6700e(i, 2);
            char charAt = str.charAt(i3);
            if (charAt < StringOps.m6769a().length) {
                byte b = StringOps.m6769a()[charAt];
                if (b == 0) {
                    i2 = m6700e + 1;
                    this.f111883c[m6700e] = charAt;
                } else {
                    if (b == 1) {
                        String str2 = StringOps.m6768b()[charAt];
                        Intrinsics.m17074g(str2);
                        int m6700e2 = m6700e(m6700e, str2.length());
                        str2.getChars(0, str2.length(), this.f111883c, m6700e2);
                        i = m6700e2 + str2.length();
                    } else {
                        char[] cArr = this.f111883c;
                        cArr[m6700e] = '\\';
                        cArr[m6700e + 1] = (char) b;
                        i = m6700e + 2;
                    }
                }
            } else {
                i2 = m6700e + 1;
                this.f111883c[m6700e] = charAt;
            }
            i = i2;
        }
        m6700e(i, 1);
        char[] cArr2 = this.f111883c;
        cArr2[i] = '\"';
        m6697h(cArr2, i + 1);
        m6699f();
    }

    /* renamed from: e */
    private final int m6700e(int i, int i2) {
        int m16917e;
        int i3 = i2 + i;
        char[] cArr = this.f111883c;
        if (cArr.length <= i3) {
            m16917e = _Ranges.m16917e(i3, i * 2);
            char[] copyOf = Arrays.copyOf(cArr, m16917e);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f111883c = copyOf;
        }
        return i;
    }

    /* renamed from: f */
    private final void m6699f() {
        this.f111881a.write(this.f111882b, 0, this.f111884d);
        this.f111884d = 0;
    }

    /* renamed from: h */
    private final void m6697h(char[] cArr, int i) {
        boolean z;
        boolean z2;
        char c;
        boolean z3;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i <= cArr.length) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i2 = 0;
                while (i2 < i) {
                    char c2 = cArr[i2];
                    if (c2 < 128) {
                        if (this.f111882b.length - this.f111884d < 1) {
                            m6699f();
                        }
                        byte[] bArr = this.f111882b;
                        int i3 = this.f111884d;
                        int i4 = i3 + 1;
                        this.f111884d = i4;
                        bArr[i3] = (byte) c2;
                        i2++;
                        int min = Math.min(i, (bArr.length - i4) + i2);
                        while (i2 < min) {
                            char c3 = cArr[i2];
                            if (c3 < 128) {
                                byte[] bArr2 = this.f111882b;
                                int i5 = this.f111884d;
                                this.f111884d = i5 + 1;
                                bArr2[i5] = (byte) c3;
                                i2++;
                            }
                        }
                    } else {
                        if (c2 < 2048) {
                            if (this.f111882b.length - this.f111884d < 2) {
                                m6699f();
                            }
                            byte[] bArr3 = this.f111882b;
                            int i6 = this.f111884d;
                            int i7 = i6 + 1;
                            bArr3[i6] = (byte) ((c2 >> 6) | 192);
                            this.f111884d = i7 + 1;
                            bArr3[i7] = (byte) ((c2 & '?') | 128);
                        } else if (c2 >= 55296 && c2 <= 57343) {
                            int i8 = i2 + 1;
                            if (i8 < i) {
                                c = cArr[i8];
                            } else {
                                c = 0;
                            }
                            if (c2 <= 56319) {
                                if (56320 <= c && c < 57344) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    int i9 = (((c2 & 1023) << 10) | (c & 1023)) + 65536;
                                    if (this.f111882b.length - this.f111884d < 4) {
                                        m6699f();
                                    }
                                    byte[] bArr4 = this.f111882b;
                                    int i10 = this.f111884d;
                                    int i11 = i10 + 1;
                                    bArr4[i10] = (byte) ((i9 >> 18) | 240);
                                    int i12 = i11 + 1;
                                    bArr4[i11] = (byte) (((i9 >> 12) & 63) | 128);
                                    int i13 = i12 + 1;
                                    bArr4[i12] = (byte) (((i9 >> 6) & 63) | 128);
                                    this.f111884d = i13 + 1;
                                    bArr4[i13] = (byte) ((i9 & 63) | 128);
                                    i2 += 2;
                                }
                            }
                            if (this.f111882b.length - this.f111884d < 1) {
                                m6699f();
                            }
                            byte[] bArr5 = this.f111882b;
                            int i14 = this.f111884d;
                            this.f111884d = i14 + 1;
                            bArr5[i14] = (byte) 63;
                            i2 = i8;
                        } else {
                            if (this.f111882b.length - this.f111884d < 3) {
                                m6699f();
                            }
                            byte[] bArr6 = this.f111882b;
                            int i15 = this.f111884d;
                            int i16 = i15 + 1;
                            bArr6[i15] = (byte) ((c2 >> '\f') | 224);
                            int i17 = i16 + 1;
                            bArr6[i16] = (byte) (((c2 >> 6) & 63) | 128);
                            this.f111884d = i17 + 1;
                            bArr6[i17] = (byte) ((c2 & '?') | 128);
                        }
                        i2++;
                    }
                }
                return;
            }
            throw new IllegalArgumentException(("count > string.length: " + i + " > " + cArr.length).toString());
        }
        throw new IllegalArgumentException("count < 0".toString());
    }

    /* renamed from: i */
    private final void m6696i(int i) {
        if (i < 128) {
            if (this.f111882b.length - this.f111884d < 1) {
                m6699f();
            }
            byte[] bArr = this.f111882b;
            int i2 = this.f111884d;
            this.f111884d = i2 + 1;
            bArr[i2] = (byte) i;
        } else if (i < 2048) {
            if (this.f111882b.length - this.f111884d < 2) {
                m6699f();
            }
            byte[] bArr2 = this.f111882b;
            int i3 = this.f111884d;
            int i4 = i3 + 1;
            bArr2[i3] = (byte) ((i >> 6) | 192);
            this.f111884d = i4 + 1;
            bArr2[i4] = (byte) ((i & 63) | 128);
        } else {
            boolean z = false;
            if (55296 <= i && i < 57344) {
                z = true;
            }
            if (z) {
                if (this.f111882b.length - this.f111884d < 1) {
                    m6699f();
                }
                byte[] bArr3 = this.f111882b;
                int i5 = this.f111884d;
                this.f111884d = i5 + 1;
                bArr3[i5] = (byte) 63;
            } else if (i < 65536) {
                if (this.f111882b.length - this.f111884d < 3) {
                    m6699f();
                }
                byte[] bArr4 = this.f111882b;
                int i6 = this.f111884d;
                int i7 = i6 + 1;
                bArr4[i6] = (byte) ((i >> 12) | 224);
                int i8 = i7 + 1;
                bArr4[i7] = (byte) (((i >> 6) & 63) | 128);
                this.f111884d = i8 + 1;
                bArr4[i8] = (byte) ((i & 63) | 128);
            } else if (i <= 1114111) {
                if (this.f111882b.length - this.f111884d < 4) {
                    m6699f();
                }
                byte[] bArr5 = this.f111882b;
                int i9 = this.f111884d;
                int i10 = i9 + 1;
                bArr5[i9] = (byte) ((i >> 18) | 240);
                int i11 = i10 + 1;
                bArr5[i10] = (byte) (((i >> 12) & 63) | 128);
                int i12 = i11 + 1;
                bArr5[i11] = (byte) (((i >> 6) & 63) | 128);
                this.f111884d = i12 + 1;
                bArr5[i12] = (byte) ((i & 63) | 128);
            } else {
                throw new C42705i0("Unexpected code point: " + i);
            }
        }
    }

    @Override // se.InterfaceC42743z0
    /* renamed from: a */
    public void mo6642a(char c) {
        m6696i(c);
    }

    @Override // se.InterfaceC42743z0
    /* renamed from: b */
    public void mo6641b(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        m6700e(0, text.length() + 2);
        char[] cArr = this.f111883c;
        cArr[0] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, 1);
        int i = length + 1;
        for (int i2 = 1; i2 < i; i2++) {
            char c = cArr[i2];
            if (c < StringOps.m6769a().length && StringOps.m6769a()[c] != 0) {
                m6701d(i2, text);
                return;
            }
        }
        cArr[i] = '\"';
        m6697h(cArr, length + 2);
        m6699f();
    }

    @Override // se.InterfaceC42743z0
    /* renamed from: c */
    public void mo6640c(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        m6700e(0, length);
        text.getChars(0, length, this.f111883c, 0);
        m6697h(this.f111883c, length);
    }

    /* renamed from: g */
    public void m6698g() {
        m6699f();
        C42715m.f111862c.m6729c(this.f111883c);
        C42709k.f111847c.m6760c(this.f111882b);
    }

    @Override // se.InterfaceC42743z0
    public void writeLong(long j) {
        mo6640c(String.valueOf(j));
    }
}
