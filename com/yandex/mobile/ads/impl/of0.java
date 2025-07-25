package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class of0 {

    /* renamed from: a */
    private static final Pattern f83475a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b */
    private static final Pattern f83476b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    /* renamed from: c */
    public static final /* synthetic */ int f83477c = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long m31037a(@androidx.annotation.Nullable java.lang.String r10, @androidx.annotation.Nullable java.lang.String r11) {
        /*
            java.lang.String r0 = "Inconsistent headers ["
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            java.lang.String r2 = "HttpUtil"
            java.lang.String r3 = "]"
            if (r1 != 0) goto L25
            long r4 = java.lang.Long.parseLong(r10)     // Catch: java.lang.NumberFormatException -> L11
            goto L27
        L11:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.<init>(r4)
            r1.append(r10)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.yandex.mobile.ads.impl.gq0.m33795b(r2, r1)
        L25:
            r4 = -1
        L27:
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 != 0) goto L94
            java.util.regex.Pattern r1 = com.yandex.mobile.ads.impl.of0.f83475a
            java.util.regex.Matcher r1 = r1.matcher(r11)
            boolean r6 = r1.matches()
            if (r6 == 0) goto L94
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch: java.lang.NumberFormatException -> L80
            r6.getClass()     // Catch: java.lang.NumberFormatException -> L80
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L80
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch: java.lang.NumberFormatException -> L80
            r1.getClass()     // Catch: java.lang.NumberFormatException -> L80
            long r8 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L80
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L5d
            r4 = r6
            goto L94
        L5d:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L94
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L80
            r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> L80
            r1.append(r10)     // Catch: java.lang.NumberFormatException -> L80
            java.lang.String r10 = "] ["
            r1.append(r10)     // Catch: java.lang.NumberFormatException -> L80
            r1.append(r11)     // Catch: java.lang.NumberFormatException -> L80
            r1.append(r3)     // Catch: java.lang.NumberFormatException -> L80
            java.lang.String r10 = r1.toString()     // Catch: java.lang.NumberFormatException -> L80
            com.yandex.mobile.ads.impl.gq0.m33792d(r2, r10)     // Catch: java.lang.NumberFormatException -> L80
            long r4 = java.lang.Math.max(r4, r6)     // Catch: java.lang.NumberFormatException -> L80
            goto L94
        L80:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Unexpected Content-Range ["
            r10.<init>(r0)
            r10.append(r11)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            com.yandex.mobile.ads.impl.gq0.m33795b(r2, r10)
        L94:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.of0.m31037a(java.lang.String, java.lang.String):long");
    }

    /* renamed from: a */
    public static long m31038a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f83476b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            return Long.parseLong(group);
        }
        return -1L;
    }
}
