package com.yandex.mobile.ads.impl;

import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class ie2 {

    /* renamed from: a */
    public static final /* synthetic */ int f80440a = 0;

    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    /* renamed from: a */
    public static long m33285a(String str) throws NumberFormatException {
        int i = y32.f88010a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str2 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            j2 += Long.parseLong(split[1]);
        }
        return j2 * 1000;
    }
}
