package p1029wc;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import p804nd.ExceptionsH;
import p804nd.UShort;

/* compiled from: UTF8.kt */
@Metadata
/* renamed from: wc.f */
/* loaded from: classes9.dex */
public final class C44653f {
    /* renamed from: a */
    public static final int m2131a(char c, char c2) {
        return ((c - 55232) << 10) | (c2 - 56320);
    }

    /* renamed from: b */
    public static final int m2130b(@NotNull ByteBuffer encodeUTF8, @NotNull CharSequence text, int i, int i2, int i3, int i4) {
        int m16912j;
        Intrinsics.checkNotNullParameter(encodeUTF8, "$this$encodeUTF8");
        Intrinsics.checkNotNullParameter(text, "text");
        int min = Math.min(i2, i + 65535);
        m16912j = _Ranges.m16912j(i4, 65535);
        int i5 = i;
        int i6 = i3;
        while (i6 < m16912j && i5 < min) {
            int i7 = i5 + 1;
            int charAt = text.charAt(i5) & 65535;
            if ((65408 & charAt) == 0) {
                encodeUTF8.put(i6, (byte) charAt);
                i5 = i7;
                i6++;
            } else {
                return m2129c(encodeUTF8, text, i7 - 1, min, i, i6, m16912j, i3);
            }
        }
        return EncodeResult.m2135d(UShort.m14590c((short) (i5 - i)), UShort.m14590c((short) (i6 - i3)));
    }

    /* renamed from: c */
    private static final int m2129c(ByteBuffer byteBuffer, CharSequence charSequence, int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        boolean z2;
        boolean z3;
        int i7 = i5 - 3;
        int i8 = i;
        int i9 = i4;
        while (i7 - i9 > 0 && i8 < i2) {
            int i10 = i8 + 1;
            char charAt = charSequence.charAt(i8);
            boolean isHighSurrogate = Character.isHighSurrogate(charAt);
            int i11 = charAt;
            if (isHighSurrogate) {
                if (i10 != i2 && Character.isLowSurrogate(charSequence.charAt(i10))) {
                    int m2131a = m2131a(charAt, charSequence.charAt(i10));
                    i10++;
                    i11 = m2131a;
                } else {
                    i11 = 63;
                }
            }
            boolean z4 = false;
            int i12 = 1;
            if (i11 >= 0 && i11 < 128) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byteBuffer.put(i9, (byte) i11);
            } else {
                if (128 <= i11 && i11 < 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    byteBuffer.put(i9, (byte) (((i11 >> 6) & 31) | 192));
                    byteBuffer.put(i9 + 1, (byte) ((i11 & 63) | 128));
                    i12 = 2;
                } else {
                    if (2048 <= i11 && i11 < 65536) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        byteBuffer.put(i9, (byte) (((i11 >> 12) & 15) | 224));
                        byteBuffer.put(i9 + 1, (byte) ((63 & (i11 >> 6)) | 128));
                        byteBuffer.put(i9 + 2, (byte) ((i11 & 63) | 128));
                        i12 = 3;
                    } else {
                        if (65536 <= i11 && i11 < 1114112) {
                            z4 = true;
                        }
                        if (z4) {
                            byteBuffer.put(i9, (byte) (((i11 >> 18) & 7) | 240));
                            byteBuffer.put(i9 + 1, (byte) (((i11 >> 12) & 63) | 128));
                            byteBuffer.put(i9 + 2, (byte) ((63 & (i11 >> 6)) | 128));
                            byteBuffer.put(i9 + 3, (byte) ((i11 & 63) | 128));
                            i12 = 4;
                        } else {
                            m2122j(i11);
                            throw new ExceptionsH();
                        }
                    }
                }
            }
            i9 += i12;
            i8 = i10;
        }
        if (i9 == i7) {
            return m2128d(byteBuffer, charSequence, i8, i2, i3, i9, i5, i6);
        }
        return EncodeResult.m2135d(UShort.m14590c((short) (i8 - i3)), UShort.m14590c((short) (i9 - i6)));
    }

    /* renamed from: d */
    private static final int m2128d(ByteBuffer byteBuffer, CharSequence charSequence, int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i7;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i8 = i;
        int i9 = i4;
        while (true) {
            int i10 = i5 - i9;
            if (i10 <= 0 || i8 >= i2) {
                break;
            }
            int i11 = i8 + 1;
            char charAt = charSequence.charAt(i8);
            boolean isHighSurrogate = Character.isHighSurrogate(charAt);
            int i12 = charAt;
            if (isHighSurrogate) {
                if (i11 != i2 && Character.isLowSurrogate(charSequence.charAt(i11))) {
                    int m2131a = m2131a(charAt, charSequence.charAt(i11));
                    i11++;
                    i12 = m2131a;
                } else {
                    i12 = 63;
                }
            }
            int i13 = 1;
            if (1 <= i12 && i12 < 128) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i7 = 1;
            } else {
                if (128 <= i12 && i12 < 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i7 = 2;
                } else {
                    if (2048 <= i12 && i12 < 65536) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i7 = 3;
                    } else {
                        if (65536 <= i12 && i12 < 1114112) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            i7 = 4;
                        } else {
                            m2122j(i12);
                            throw new ExceptionsH();
                        }
                    }
                }
            }
            if (i7 > i10) {
                i8 = i11 - 1;
                break;
            }
            if (i12 >= 0 && i12 < 128) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                byteBuffer.put(i9, (byte) i12);
            } else {
                if (128 <= i12 && i12 < 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    byteBuffer.put(i9, (byte) (((i12 >> 6) & 31) | 192));
                    byteBuffer.put(i9 + 1, (byte) ((i12 & 63) | 128));
                    i13 = 2;
                } else {
                    if (2048 <= i12 && i12 < 65536) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        byteBuffer.put(i9, (byte) (((i12 >> 12) & 15) | 224));
                        byteBuffer.put(i9 + 1, (byte) ((63 & (i12 >> 6)) | 128));
                        byteBuffer.put(i9 + 2, (byte) ((i12 & 63) | 128));
                        i13 = 3;
                    } else {
                        if (65536 <= i12 && i12 < 1114112) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            byteBuffer.put(i9, (byte) (((i12 >> 18) & 7) | 240));
                            byteBuffer.put(i9 + 1, (byte) (((i12 >> 12) & 63) | 128));
                            byteBuffer.put(i9 + 2, (byte) ((63 & (i12 >> 6)) | 128));
                            byteBuffer.put(i9 + 3, (byte) ((i12 & 63) | 128));
                            i13 = 4;
                        } else {
                            m2122j(i12);
                            throw new ExceptionsH();
                        }
                    }
                }
            }
            i9 += i13;
            i8 = i11;
        }
        return EncodeResult.m2135d(UShort.m14590c((short) (i8 - i3)), UShort.m14590c((short) (i9 - i6)));
    }

    /* renamed from: e */
    public static final int m2127e(int i) {
        return (i >>> 10) + 55232;
    }

    /* renamed from: f */
    public static final boolean m2126f(int i) {
        if ((i >>> 16) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m2125g(int i) {
        if (i <= 1114111) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final int m2124h(int i) {
        return (i & 1023) + 56320;
    }

    @NotNull
    /* renamed from: i */
    public static final Void m2123i(int i) {
        throw new UTF8("Expected " + i + " more character bytes");
    }

    @NotNull
    /* renamed from: j */
    public static final Void m2122j(int i) {
        throw new IllegalArgumentException("Malformed code-point " + i + " found");
    }
}
