package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class my1 extends eu1 {

    /* renamed from: o */
    private static final Pattern f82490o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: p */
    private static final Pattern f82491p = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: m */
    private final StringBuilder f82492m = new StringBuilder();

    /* renamed from: n */
    private final ArrayList<String> f82493n = new ArrayList<>();

    /* renamed from: a */
    private static long m31742a(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0273, code lost:
        return new com.yandex.mobile.ads.impl.ny1((com.yandex.mobile.ads.impl.C31840xt[]) r2.toArray(new com.yandex.mobile.ads.impl.C31840xt[r4]), r3.m33150b());
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0226  */
    @Override // com.yandex.mobile.ads.impl.eu1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.yandex.mobile.ads.impl.oy1 mo26966a(byte[] r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.my1.mo26966a(byte[], int, boolean):com.yandex.mobile.ads.impl.oy1");
    }
}
