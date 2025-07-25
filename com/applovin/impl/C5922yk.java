package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;

/* renamed from: com.applovin.impl.yk */
/* loaded from: classes2.dex */
final class C5922yk {

    /* renamed from: a */
    public final int f12356a;

    /* renamed from: b */
    public final int f12357b;

    /* renamed from: c */
    public final int f12358c;

    /* renamed from: d */
    public final int f12359d;

    /* renamed from: e */
    public final int f12360e;

    private C5922yk(int i, int i2, int i3, int i4, int i5) {
        this.f12356a = i;
        this.f12357b = i2;
        this.f12358c = i3;
        this.f12359d = i4;
        this.f12360e = i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static C5922yk m92727a(String str) {
        char c;
        AbstractC4100b1.m100580a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < split.length; i5++) {
            String lowerCase = Ascii.toLowerCase(split[i5].trim());
            lowerCase.hashCode();
            switch (lowerCase.hashCode()) {
                case 100571:
                    if (lowerCase.equals("end")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (lowerCase.equals("text")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (lowerCase.equals("start")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (lowerCase.equals("style")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    i2 = i5;
                    break;
                case 1:
                    i4 = i5;
                    break;
                case 2:
                    i = i5;
                    break;
                case 3:
                    i3 = i5;
                    break;
            }
        }
        if (i != -1 && i2 != -1 && i4 != -1) {
            return new C5922yk(i, i2, i3, i4, split.length);
        }
        return null;
    }
}
