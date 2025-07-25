package com.applovin.impl;

import java.util.regex.Pattern;

/* renamed from: com.applovin.impl.zr */
/* loaded from: classes2.dex */
public abstract class AbstractC5993zr {

    /* renamed from: a */
    private static final Pattern f12618a = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: a */
    public static boolean m92309a(C4066ah c4066ah) {
        String m100773l = c4066ah.m100773l();
        return m100773l != null && m100773l.startsWith("WEBVTT");
    }

    /* renamed from: b */
    public static long m92306b(String str) {
        String[] m92984b = AbstractC5863xp.m92984b(str, "\\.");
        long j = 0;
        for (String str2 : AbstractC5863xp.m93013a(m92984b[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (m92984b.length == 2) {
            j2 += Long.parseLong(m92984b[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: a */
    public static float m92308a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: b */
    public static void m92307b(C4066ah c4066ah) {
        int m100785d = c4066ah.m100785d();
        if (m92309a(c4066ah)) {
            return;
        }
        c4066ah.m100780f(m100785d);
        throw C4187ch.m100188a("Expected WEBVTT. Got " + c4066ah.m100773l(), null);
    }
}
