package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.monetization.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.v90;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class h20 {

    /* renamed from: a */
    private static final int[] f79849a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f79850b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    private static final int[] f79851c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, IronSourceConstants.IS_AD_UNIT_CAPPED, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: a */
    public static v90 m33721a(byte[] bArr, @Nullable String str, @Nullable String str2) {
        bc1 bc1Var;
        int i = 0;
        int i2 = -1;
        if (bArr[0] == Byte.MAX_VALUE) {
            bc1Var = new bc1(bArr.length, bArr);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b = copyOf[0];
            if (b == -2 || b == -1) {
                for (int i3 = 0; i3 < copyOf.length - 1; i3 += 2) {
                    byte b2 = copyOf[i3];
                    int i4 = i3 + 1;
                    copyOf[i3] = copyOf[i4];
                    copyOf[i4] = b2;
                }
            }
            bc1Var = new bc1(copyOf.length, copyOf);
            if (copyOf[0] == 31) {
                bc1 bc1Var2 = new bc1(copyOf.length, copyOf);
                while (bc1Var2.m35503b() >= 16) {
                    bc1Var2.m35497d(2);
                    bc1Var.m35507a(bc1Var2.m35502b(14));
                }
            }
            bc1Var.m35505a(copyOf.length, copyOf);
        }
        bc1Var.m35497d(60);
        int i5 = f79849a[bc1Var.m35502b(6)];
        int i6 = f79850b[bc1Var.m35502b(4)];
        int m35502b = bc1Var.m35502b(5);
        int[] iArr = f79851c;
        if (m35502b < 29) {
            i2 = (iArr[m35502b] * 1000) / 2;
        }
        bc1Var.m35497d(10);
        if (bc1Var.m35502b(2) > 0) {
            i = 1;
        }
        return new v90.C31640a().m28438b(str).m28426e("audio/vnd.dts").m28440b(i2).m28436c(i5 + i).m28409l(i6).m28450a((DrmInitData) null).m28430d(str2).m28454a();
    }
}
