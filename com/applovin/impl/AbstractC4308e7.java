package com.applovin.impl;

import com.applovin.impl.C4310e9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.applovin.impl.e7 */
/* loaded from: classes2.dex */
public abstract class AbstractC4308e7 {

    /* renamed from: a */
    private static final int[] f5785a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f5786b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    private static final int[] f5787c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, IronSourceConstants.IS_AD_UNIT_CAPPED, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: a */
    public static boolean m99654a(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    /* renamed from: b */
    private static C5971zg m99650b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new C5971zg(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (m99649c(copyOf)) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b;
            }
        }
        C5971zg c5971zg = new C5971zg(copyOf);
        if (copyOf[0] == 31) {
            C5971zg c5971zg2 = new C5971zg(copyOf);
            while (c5971zg2.m92396b() >= 16) {
                c5971zg2.m92390d(2);
                c5971zg.m92402a(c5971zg2.m92403a(14), 14);
            }
        }
        c5971zg.m92399a(copyOf);
        return c5971zg;
    }

    /* renamed from: c */
    private static boolean m99649c(byte[] bArr) {
        byte b = bArr[0];
        if (b != -2 && b != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static int m99648d(byte[] bArr) {
        int i;
        byte b;
        int i2;
        byte b2;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 != -1) {
                if (b3 != 31) {
                    i = (bArr[4] & 1) << 6;
                    b = bArr[5];
                } else {
                    i = (bArr[5] & 7) << 4;
                    b2 = bArr[6];
                }
            } else {
                i = (bArr[4] & 7) << 4;
                b2 = bArr[7];
            }
            i2 = b2 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (bArr[5] & 1) << 6;
        b = bArr[4];
        i2 = b & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m99652a(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4a
            r2 = -1
            if (r1 == r2) goto L32
            r2 = 31
            if (r1 == r2) goto L21
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L58
        L21:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
            goto L42
        L32:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
        L42:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5d
        L4a:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L58:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
        L5d:
            if (r0 == 0) goto L63
            int r7 = r7 * 16
            int r7 = r7 / 14
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.AbstractC4308e7.m99652a(byte[]):int");
    }

    /* renamed from: a */
    public static int m99653a(ByteBuffer byteBuffer) {
        int i;
        byte b;
        int i2;
        byte b2;
        int position = byteBuffer.position();
        byte b3 = byteBuffer.get(position);
        if (b3 != -2) {
            if (b3 == -1) {
                i = (byteBuffer.get(position + 4) & 7) << 4;
                b2 = byteBuffer.get(position + 7);
            } else if (b3 != 31) {
                i = (byteBuffer.get(position + 4) & 1) << 6;
                b = byteBuffer.get(position + 5);
            } else {
                i = (byteBuffer.get(position + 5) & 7) << 4;
                b2 = byteBuffer.get(position + 6);
            }
            i2 = b2 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (byteBuffer.get(position + 5) & 1) << 6;
        b = byteBuffer.get(position + 4);
        i2 = b & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    /* renamed from: a */
    public static C4310e9 m99651a(byte[] bArr, String str, String str2, C5829x6 c5829x6) {
        C5971zg m99650b = m99650b(bArr);
        m99650b.m92390d(60);
        int i = f5785a[m99650b.m92403a(6)];
        int i2 = f5786b[m99650b.m92403a(4)];
        int m92403a = m99650b.m92403a(5);
        int[] iArr = f5787c;
        int i3 = m92403a >= iArr.length ? -1 : (iArr[m92403a] * 1000) / 2;
        m99650b.m92390d(10);
        return new C4310e9.C4312b().m99615c(str).m99606f("audio/vnd.dts").m99620b(i3).m99617c(i + (m99650b.m92403a(2) > 0 ? 1 : 0)).m99591n(i2).m99625a(c5829x6).m99609e(str2).m99632a();
    }
}
