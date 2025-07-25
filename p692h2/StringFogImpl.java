package p692h2;

import java.nio.charset.StandardCharsets;

/* renamed from: h2.a */
/* loaded from: classes4.dex */
public final class StringFogImpl {
    /* renamed from: b */
    private static byte[] m23823b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        return bArr;
    }

    /* renamed from: a */
    public String m23824a(byte[] bArr, byte[] bArr2) {
        return new String(m23823b(bArr, bArr2), StandardCharsets.UTF_8);
    }
}
