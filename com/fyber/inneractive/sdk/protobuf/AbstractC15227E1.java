package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.E1 */
/* loaded from: classes4.dex */
public abstract class AbstractC15227E1 {

    /* renamed from: a */
    public static final AbstractC15215A1 f30154a;

    static {
        AbstractC15215A1 c15218b1;
        if (AbstractC15356y1.f30348e && AbstractC15356y1.f30347d && !AbstractC15291d.m76886a()) {
            c15218b1 = new C15224D1();
        } else {
            c15218b1 = new C15218B1();
        }
        f30154a = c15218b1;
    }

    /* renamed from: a */
    public static int m77007a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: a */
    public static int m77006a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: a */
    public static int m77005a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new C15221C1(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }
}
