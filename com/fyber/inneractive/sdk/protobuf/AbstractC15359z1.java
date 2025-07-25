package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.z1 */
/* loaded from: classes4.dex */
public abstract class AbstractC15359z1 {
    /* renamed from: a */
    public static boolean m76660a(byte b) {
        return b >= 0;
    }

    /* renamed from: b */
    public static boolean m76656b(byte b) {
        if (b > -65) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m76657a(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !m76656b(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
            return;
        }
        throw new C15325o0("Protocol message had invalid UTF-8.");
    }

    /* renamed from: a */
    public static void m76658a(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m76656b(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !m76656b(b3)))) {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
            return;
        }
        throw new C15325o0("Protocol message had invalid UTF-8.");
    }

    /* renamed from: a */
    public static void m76659a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!m76656b(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m76656b(b3) && !m76656b(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw new C15325o0("Protocol message had invalid UTF-8.");
    }
}
