package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.x02;

/* loaded from: classes8.dex */
public final class t02 {

    /* renamed from: a */
    public final boolean f85480a;
    @Nullable

    /* renamed from: b */
    public final String f85481b;

    /* renamed from: c */
    public final x02.C31785a f85482c;

    /* renamed from: d */
    public final int f85483d;
    @Nullable

    /* renamed from: e */
    public final byte[] f85484e;

    public t02(boolean z, @Nullable String str, int i, byte[] bArr, int i2, int i3, @Nullable byte[] bArr2) {
        boolean z2;
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C30937nf.m31567a((bArr2 == null) ^ z2);
        this.f85480a = z;
        this.f85481b = str;
        this.f85483d = i;
        this.f85484e = bArr2;
        this.f85482c = new x02.C31785a(m29320a(str), i2, i3, bArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private static int m29320a(@Nullable String str) {
        if (str == null) {
            return 1;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            case 2:
            case 3:
                break;
            default:
                gq0.m33792d("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                break;
        }
        return 1;
    }
}
