package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public final class x10 {

    /* renamed from: a */
    public final String f87487a;

    private x10(String str) {
        this.f87487a = str;
    }

    @Nullable
    /* renamed from: a */
    public static x10 m27706a(cc1 cc1Var) {
        String str;
        cc1Var.m35284f(2);
        int m35270t = cc1Var.m35270t();
        int i = m35270t >> 1;
        int m35270t2 = ((cc1Var.m35270t() >> 3) & 31) | ((m35270t & 1) << 5);
        if (i != 4 && i != 5 && i != 7) {
            if (i == 8) {
                str = "hev1";
            } else if (i == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ".0";
        sb2.append(".0");
        sb2.append(i);
        if (m35270t2 >= 10) {
            str2 = ".";
        }
        sb2.append(str2);
        sb2.append(m35270t2);
        return new x10(sb2.toString());
    }
}
