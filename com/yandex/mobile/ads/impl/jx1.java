package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
final class jx1 {

    /* renamed from: a */
    public final int f81188a;

    /* renamed from: b */
    public final int f81189b;

    /* renamed from: c */
    public final int f81190c;

    /* renamed from: d */
    public final int f81191d;

    /* renamed from: e */
    public final int f81192e;

    private jx1(int i, int i2, int i3, int i4, int i5) {
        this.f81188a = i;
        this.f81189b = i2;
        this.f81190c = i3;
        this.f81191d = i4;
        this.f81192e = i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Nullable
    /* renamed from: a */
    public static jx1 m32712a(String str) {
        char c;
        if (str.startsWith("Format:")) {
            String[] split = TextUtils.split(str.substring(7), ",");
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            for (int i5 = 0; i5 < split.length; i5++) {
                String m32278b = C30784lf.m32278b(split[i5].trim());
                m32278b.getClass();
                switch (m32278b.hashCode()) {
                    case 100571:
                        if (m32278b.equals("end")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3556653:
                        if (m32278b.equals("text")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 109757538:
                        if (m32278b.equals("start")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 109780401:
                        if (m32278b.equals("style")) {
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
                return new jx1(i, i2, i3, i4, split.length);
            }
            return null;
        }
        throw new IllegalArgumentException();
    }
}
