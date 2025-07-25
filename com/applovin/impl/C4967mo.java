package com.applovin.impl;

import com.applovin.impl.InterfaceC5209qo;

/* renamed from: com.applovin.impl.mo */
/* loaded from: classes2.dex */
public final class C4967mo {

    /* renamed from: a */
    public final boolean f8453a;

    /* renamed from: b */
    public final String f8454b;

    /* renamed from: c */
    public final InterfaceC5209qo.C5210a f8455c;

    /* renamed from: d */
    public final int f8456d;

    /* renamed from: e */
    public final byte[] f8457e;

    public C4967mo(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        boolean z2;
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        AbstractC4100b1.m100580a((bArr2 == null) ^ z2);
        this.f8453a = z;
        this.f8454b = str;
        this.f8456d = i;
        this.f8457e = bArr2;
        this.f8455c = new InterfaceC5209qo.C5210a(m97072a(str), bArr, i2, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private static int m97072a(String str) {
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
                AbstractC5063oc.m96800d("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                break;
        }
        return 1;
    }
}
