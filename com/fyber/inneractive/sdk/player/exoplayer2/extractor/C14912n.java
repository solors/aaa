package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.n */
/* loaded from: classes4.dex */
public final class C14912n {

    /* renamed from: h */
    public static final String[] f28940h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: i */
    public static final int[] f28941i = {44100, 48000, 32000};

    /* renamed from: j */
    public static final int[] f28942j = {32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448};

    /* renamed from: k */
    public static final int[] f28943k = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};

    /* renamed from: l */
    public static final int[] f28944l = {32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384};

    /* renamed from: m */
    public static final int[] f28945m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320};

    /* renamed from: n */
    public static final int[] f28946n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    /* renamed from: a */
    public int f28947a;

    /* renamed from: b */
    public String f28948b;

    /* renamed from: c */
    public int f28949c;

    /* renamed from: d */
    public int f28950d;

    /* renamed from: e */
    public int f28951e;

    /* renamed from: f */
    public int f28952f;

    /* renamed from: g */
    public int f28953g;

    /* renamed from: a */
    public static int m77440a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f28941i[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f28942j[i4 - 1] : f28943k[i4 - 1]) * 12000) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f28944l[i4 - 1] : f28945m[i4 - 1];
        } else {
            i6 = f28946n[i4 - 1];
        }
        if (i2 == 3) {
            return ((i6 * 144000) / i7) + i8;
        }
        return (((i3 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000) * i6) / i7) + i8;
    }

    /* renamed from: a */
    public static boolean m77439a(int i, C14912n c14912n) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i10 = f28941i[i5];
        if (i2 == 2) {
            i10 /= 2;
        } else if (i2 == 0) {
            i10 /= 4;
        }
        int i11 = (i >>> 9) & 1;
        if (i3 == 3) {
            i6 = i2 == 3 ? f28942j[i4 - 1] : f28943k[i4 - 1];
            i8 = (((i6 * 12000) / i10) + i11) * 4;
            i9 = 384;
        } else {
            if (i2 == 3) {
                i6 = i3 == 2 ? f28944l[i4 - 1] : f28945m[i4 - 1];
                i7 = (144000 * i6) / i10;
            } else {
                i6 = f28946n[i4 - 1];
                r9 = i3 == 1 ? 576 : 1152;
                i7 = ((i3 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000) * i6) / i10;
            }
            i8 = i7 + i11;
            i9 = r9;
        }
        String str = f28940h[3 - i3];
        int i12 = ((i >> 6) & 3) == 3 ? 1 : 2;
        c14912n.f28947a = i2;
        c14912n.f28948b = str;
        c14912n.f28949c = i8;
        c14912n.f28950d = i10;
        c14912n.f28951e = i12;
        c14912n.f28952f = i6 * 1000;
        c14912n.f28953g = i9;
        return true;
    }
}
