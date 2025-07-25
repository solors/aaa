package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Pair;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.d */
/* loaded from: classes4.dex */
public abstract class AbstractC15111d {

    /* renamed from: a */
    public static final byte[] f29774a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final int[] f29775b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    public static final int[] f29776c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static Pair m77222a(byte[] bArr) {
        int i;
        int i2;
        C15120m c15120m = new C15120m(bArr);
        int m77211a = c15120m.m77211a(5);
        if (m77211a == 31) {
            m77211a = c15120m.m77211a(6) + 32;
        }
        int m77211a2 = c15120m.m77211a(4);
        if (m77211a2 == 15) {
            i = c15120m.m77211a(24);
        } else if (m77211a2 < 13) {
            i = f29775b[m77211a2];
        } else {
            throw new IllegalArgumentException();
        }
        int m77211a3 = c15120m.m77211a(4);
        if (m77211a == 5 || m77211a == 29) {
            int m77211a4 = c15120m.m77211a(4);
            if (m77211a4 == 15) {
                i2 = c15120m.m77211a(24);
            } else if (m77211a4 < 13) {
                i2 = f29775b[m77211a4];
            } else {
                throw new IllegalArgumentException();
            }
            i = i2;
            int m77211a5 = c15120m.m77211a(5);
            if (m77211a5 == 31) {
                m77211a5 = c15120m.m77211a(6) + 32;
            }
            if (m77211a5 == 22) {
                m77211a3 = c15120m.m77211a(4);
            }
        }
        int i3 = f29776c[m77211a3];
        if (i3 != -1) {
            return Pair.create(Integer.valueOf(i), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException();
    }
}
