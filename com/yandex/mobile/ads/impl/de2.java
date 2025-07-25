package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
final class de2 {

    /* renamed from: c */
    private static final Pattern f78051c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d */
    private static final Pattern f78052d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a */
    private final cc1 f78053a = new cc1();

    /* renamed from: b */
    private final StringBuilder f78054b = new StringBuilder();

    @Nullable
    /* renamed from: b */
    static String m34951b(cc1 cc1Var, StringBuilder sb2) {
        m34952b(cc1Var);
        if (cc1Var.m35299a() == 0) {
            return null;
        }
        String m34953a = m34953a(cc1Var, sb2);
        if ("".equals(m34953a)) {
            return "" + ((char) cc1Var.m35270t());
        }
        return m34953a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
        if (")".equals(m34951b(r3, r4)) == false) goto L192;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList m34954a(com.yandex.mobile.ads.impl.cc1 r18) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.de2.m34954a(com.yandex.mobile.ads.impl.cc1):java.util.ArrayList");
    }

    /* renamed from: b */
    static void m34952b(cc1 cc1Var) {
        while (true) {
            for (boolean z = true; cc1Var.m35299a() > 0 && z; z = false) {
                char c = (char) cc1Var.m35291c()[cc1Var.m35289d()];
                if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                    int m35289d = cc1Var.m35289d();
                    int m35287e = cc1Var.m35287e();
                    byte[] m35291c = cc1Var.m35291c();
                    int i = m35289d + 2;
                    if (i <= m35287e) {
                        int i2 = m35289d + 1;
                        if (m35291c[m35289d] == 47 && m35291c[i2] == 42) {
                            while (true) {
                                int i3 = i + 1;
                                if (i3 >= m35287e) {
                                    break;
                                } else if (((char) m35291c[i]) == '*' && ((char) m35291c[i3]) == '/') {
                                    i += 2;
                                    m35287e = i;
                                } else {
                                    i = i3;
                                }
                            }
                            cc1Var.m35284f(m35287e - cc1Var.m35289d());
                        }
                    }
                } else {
                    cc1Var.m35284f(1);
                }
            }
            return;
        }
    }

    /* renamed from: a */
    private static String m34953a(cc1 cc1Var, StringBuilder sb2) {
        boolean z = false;
        sb2.setLength(0);
        int m35289d = cc1Var.m35289d();
        int m35287e = cc1Var.m35287e();
        while (m35289d < m35287e && !z) {
            char c = (char) cc1Var.m35291c()[m35289d];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                m35289d++;
                sb2.append(c);
            }
        }
        cc1Var.m35284f(m35289d - cc1Var.m35289d());
        return sb2.toString();
    }
}
