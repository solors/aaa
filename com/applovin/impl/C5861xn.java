package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.regex.Pattern;

/* renamed from: com.applovin.impl.xn */
/* loaded from: classes2.dex */
final class C5861xn {

    /* renamed from: d */
    private static final Pattern f12143d = Pattern.compile("\\s+");

    /* renamed from: e */
    private static final AbstractC4518hb f12144e = AbstractC4518hb.m98745a("auto", "none");

    /* renamed from: f */
    private static final AbstractC4518hb f12145f = AbstractC4518hb.m98744a("dot", "sesame", "circle");

    /* renamed from: g */
    private static final AbstractC4518hb f12146g = AbstractC4518hb.m98745a("filled", "open");

    /* renamed from: h */
    private static final AbstractC4518hb f12147h = AbstractC4518hb.m98744a("after", "before", "outside");

    /* renamed from: a */
    public final int f12148a;

    /* renamed from: b */
    public final int f12149b;

    /* renamed from: c */
    public final int f12150c;

    private C5861xn(int i, int i2, int i3) {
        this.f12148a = i;
        this.f12149b = i2;
        this.f12150c = i3;
    }

    /* renamed from: a */
    public static C5861xn m93048a(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return m93049a(AbstractC4518hb.m98742a((Object[]) TextUtils.split(lowerCase, f12143d)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00eb, code lost:
        if (r9.equals("dot") != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.applovin.impl.C5861xn m93049a(com.applovin.impl.AbstractC4518hb r9) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C5861xn.m93049a(com.applovin.impl.hb):com.applovin.impl.xn");
    }
}
