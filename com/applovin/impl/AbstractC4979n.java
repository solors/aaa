package com.applovin.impl;

import com.amazon.device.ads.DtbConstants;
import com.applovin.impl.C4310e9;
import com.google.common.primitives.SignedBytes;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.n */
/* loaded from: classes2.dex */
public abstract class AbstractC4979n {

    /* renamed from: a */
    private static final int[] f8480a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, DtbConstants.DEFAULT_PLAYER_HEIGHT, 400, 400, 2048};

    /* renamed from: com.applovin.impl.n$b */
    /* loaded from: classes2.dex */
    public static final class C4981b {

        /* renamed from: a */
        public final int f8481a;

        /* renamed from: b */
        public final int f8482b;

        /* renamed from: c */
        public final int f8483c;

        /* renamed from: d */
        public final int f8484d;

        /* renamed from: e */
        public final int f8485e;

        private C4981b(int i, int i2, int i3, int i4, int i5) {
            this.f8481a = i;
            this.f8483c = i2;
            this.f8482b = i3;
            this.f8484d = i4;
            this.f8485e = i5;
        }
    }

    /* renamed from: a */
    public static void m97052a(int i, C4066ah c4066ah) {
        c4066ah.m100784d(7);
        byte[] m100787c = c4066ah.m100787c();
        m100787c[0] = -84;
        m100787c[1] = SignedBytes.MAX_POWER_OF_TWO;
        m100787c[2] = -1;
        m100787c[3] = -1;
        m100787c[4] = (byte) ((i >> 16) & 255);
        m100787c[5] = (byte) ((i >> 8) & 255);
        m100787c[6] = (byte) (i & 255);
    }

    /* renamed from: a */
    public static C4310e9 m97051a(C4066ah c4066ah, String str, String str2, C5829x6 c5829x6) {
        c4066ah.m100778g(1);
        return new C4310e9.C4312b().m99615c(str).m99606f("audio/ac4").m99617c(2).m99591n(((c4066ah.m100762w() & 32) >> 5) == 1 ? 48000 : 44100).m99625a(c5829x6).m99609e(str2).m99632a();
    }

    /* renamed from: a */
    public static int m97048a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return m97050a(new C5971zg(bArr)).f8485e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
        if (r11 != 11) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
        if (r11 != 11) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008a, code lost:
        if (r11 != 8) goto L39;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.applovin.impl.AbstractC4979n.C4981b m97050a(com.applovin.impl.C5971zg r11) {
        /*
            r0 = 16
            int r1 = r11.m92403a(r0)
            int r0 = r11.m92403a(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.m92403a(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.m92403a(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = m97049a(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.m92403a(r1)
            boolean r4 = r11.m92387f()
            if (r4 == 0) goto L45
            int r4 = r11.m92403a(r2)
            if (r4 <= 0) goto L45
            r11.m92390d(r0)
        L45:
            boolean r4 = r11.m92387f()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r7 = 44100(0xac44, float:6.1797E-41)
            if (r4 == 0) goto L53
            r9 = r6
            goto L54
        L53:
            r9 = r7
        L54:
            int r11 = r11.m92403a(r3)
            if (r9 != r7) goto L63
            r4 = 13
            if (r11 != r4) goto L63
            int[] r0 = com.applovin.impl.AbstractC4979n.f8480a
            r11 = r0[r11]
            goto L93
        L63:
            if (r9 != r6) goto L92
            int[] r4 = com.applovin.impl.AbstractC4979n.f8480a
            int r6 = r4.length
            if (r11 >= r6) goto L92
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 1
            r7 = 8
            if (r1 == r6) goto L88
            r6 = 11
            if (r1 == r0) goto L83
            if (r1 == r2) goto L88
            if (r1 == r3) goto L7c
            goto L8d
        L7c:
            if (r11 == r2) goto L8f
            if (r11 == r7) goto L8f
            if (r11 != r6) goto L8d
            goto L8f
        L83:
            if (r11 == r7) goto L8f
            if (r11 != r6) goto L8d
            goto L8f
        L88:
            if (r11 == r2) goto L8f
            if (r11 != r7) goto L8d
            goto L8f
        L8d:
            r11 = r4
            goto L93
        L8f:
            int r4 = r4 + 1
            goto L8d
        L92:
            r11 = 0
        L93:
            com.applovin.impl.n$b r0 = new com.applovin.impl.n$b
            r6 = 2
            r10 = 0
            r4 = r0
            r7 = r9
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.AbstractC4979n.m97050a(com.applovin.impl.zg):com.applovin.impl.n$b");
    }

    /* renamed from: a */
    public static int m97047a(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i3 == 65535) {
            i3 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    /* renamed from: a */
    private static int m97049a(C5971zg c5971zg, int i) {
        int i2 = 0;
        while (true) {
            int m92403a = i2 + c5971zg.m92403a(i);
            if (!c5971zg.m92387f()) {
                return m92403a;
            }
            i2 = (m92403a + 1) << i;
        }
    }
}
