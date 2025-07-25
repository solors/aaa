package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.bytedance.sdk.openadsdk.TTAdConstant;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.a */
/* loaded from: classes4.dex */
public abstract class AbstractC14797a {

    /* renamed from: a */
    public static final int[] f28098a = {1, 2, 3, 6};

    /* renamed from: b */
    public static final int[] f28099b = {48000, 44100, 32000};

    /* renamed from: c */
    public static final int[] f28100c = {24000, 22050, 16000};

    /* renamed from: d */
    public static final int[] f28101d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    public static final int[] f28102e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    public static final int[] f28103f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: a */
    public static int m77568a(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0) {
            int[] iArr = f28099b;
            if (i < 3 && i2 >= 0) {
                int[] iArr2 = f28103f;
                if (i3 < 19) {
                    int i4 = iArr[i];
                    if (i4 == 44100) {
                        return ((i2 % 2) + iArr2[i3]) * 2;
                    }
                    int i5 = f28102e[i3];
                    if (i4 == 32000) {
                        return i5 * 6;
                    }
                    return i5 * 4;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }
}
