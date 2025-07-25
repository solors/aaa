package com.yandex.mobile.ads.impl;

import com.ironsource.C20517nb;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.gr */
/* loaded from: classes8.dex */
public final class C30409gr {

    /* renamed from: j */
    private static final Pattern f79746j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    private static final Pattern f79747k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    private static final Pattern f79748l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    private static final Pattern f79749m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: n */
    public static final /* synthetic */ int f79750n = 0;
    @NotNull

    /* renamed from: a */
    private final String f79751a;
    @NotNull

    /* renamed from: b */
    private final String f79752b;

    /* renamed from: c */
    private final long f79753c;
    @NotNull

    /* renamed from: d */
    private final String f79754d;
    @NotNull

    /* renamed from: e */
    private final String f79755e;

    /* renamed from: f */
    private final boolean f79756f;

    /* renamed from: g */
    private final boolean f79757g;

    /* renamed from: h */
    private final boolean f79758h;

    /* renamed from: i */
    private final boolean f79759i;

    /* renamed from: com.yandex.mobile.ads.impl.gr$a */
    /* loaded from: classes8.dex */
    public static final class C30410a {
        /* renamed from: a */
        private static int m33784a(int i, int i2, String str, boolean z) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:113:0x0253, code lost:
            if (com.yandex.mobile.ads.impl.z32.m26417a(r0) == false) goto L118;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
            if (r1 != (-1)) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, "<this>");
            r1 = com.yandex.mobile.ads.impl.z32.m26427a(r15 + 1, r0, r10);
            r1 = r10.substring(r1, com.yandex.mobile.ads.impl.z32.m26400b(r1, r0, r10));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "substring(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, "<this>");
            r3 = r1.length();
            r4 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00c0, code lost:
            if (r4 >= r3) goto L154;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00c2, code lost:
            r13 = r1.charAt(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00cc, code lost:
            if (kotlin.jvm.internal.Intrinsics.m17071j(r13, 31) <= 0) goto L153;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00d4, code lost:
            if (kotlin.jvm.internal.Intrinsics.m17071j(r13, 127) < 0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00d7, code lost:
            r4 = r4 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00db, code lost:
            if (r4 == (-1)) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00de, code lost:
            r0 = r0 + 1;
            r3 = r10.length();
            r20 = com.mbridge.msdk.thrid.okhttp.internal.http.HttpDate.MAX_DATE;
            r22 = -1;
            r31 = 253402300799999L;
            r13 = null;
            r15 = null;
            r24 = false;
            r25 = false;
            r26 = false;
            r27 = true;
         */
        @org.jetbrains.annotations.NotNull
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.util.List m33782a(@org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.nf0 r40, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.zc0 r41) {
            /*
                Method dump skipped, instructions count: 731
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C30409gr.C30410a.m33782a(com.yandex.mobile.ads.impl.nf0, com.yandex.mobile.ads.impl.zc0):java.util.List");
        }

        /* renamed from: a */
        private static long m33783a(int i, String str) {
            int m16566e0;
            int m33784a = m33784a(0, i, str, false);
            Matcher matcher = C30409gr.f79749m.matcher(str);
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            while (m33784a < i) {
                int m33784a2 = m33784a(m33784a + 1, i, str, true);
                matcher.region(m33784a, m33784a2);
                if (i3 != -1 || !matcher.usePattern(C30409gr.f79749m).matches()) {
                    if (i4 != -1 || !matcher.usePattern(C30409gr.f79748l).matches()) {
                        if (i5 != -1 || !matcher.usePattern(C30409gr.f79747k).matches()) {
                            if (i2 == -1 && matcher.usePattern(C30409gr.f79746j).matches()) {
                                String group = matcher.group(1);
                                Intrinsics.checkNotNullExpressionValue(group, "group(...)");
                                i2 = Integer.parseInt(group);
                            }
                        } else {
                            String group2 = matcher.group(1);
                            Intrinsics.checkNotNullExpressionValue(group2, "group(...)");
                            Locale US = Locale.US;
                            Intrinsics.checkNotNullExpressionValue(US, "US");
                            String lowerCase = group2.toLowerCase(US);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            String pattern = C30409gr.f79747k.pattern();
                            Intrinsics.checkNotNullExpressionValue(pattern, "pattern(...)");
                            m16566e0 = C37690r.m16566e0(pattern, lowerCase, 0, false, 6, null);
                            i5 = m16566e0 / 4;
                        }
                    } else {
                        String group3 = matcher.group(1);
                        Intrinsics.checkNotNullExpressionValue(group3, "group(...)");
                        i4 = Integer.parseInt(group3);
                    }
                } else {
                    String group4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group4, "group(...)");
                    i3 = Integer.parseInt(group4);
                    String group5 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(group5, "group(...)");
                    i6 = Integer.parseInt(group5);
                    String group6 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(group6, "group(...)");
                    i7 = Integer.parseInt(group6);
                }
                m33784a = m33784a(m33784a2 + 1, i, str, false);
            }
            if (70 <= i2 && i2 < 100) {
                i2 += 1900;
            }
            if (i2 >= 0 && i2 < 70) {
                i2 += 2000;
            }
            if (i2 >= 1601) {
                if (i5 != -1) {
                    if (1 > i4 || i4 >= 32) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    if (i3 < 0 || i3 >= 24) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    if (i6 < 0 || i6 >= 60) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    if (i7 >= 0 && i7 < 60) {
                        GregorianCalendar gregorianCalendar = new GregorianCalendar(z32.f88700d);
                        gregorianCalendar.setLenient(false);
                        gregorianCalendar.set(1, i2);
                        gregorianCalendar.set(2, i5 - 1);
                        gregorianCalendar.set(5, i4);
                        gregorianCalendar.set(11, i3);
                        gregorianCalendar.set(12, i6);
                        gregorianCalendar.set(13, i7);
                        gregorianCalendar.set(14, 0);
                        return gregorianCalendar.getTimeInMillis();
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private C30409gr(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f79751a = str;
        this.f79752b = str2;
        this.f79753c = j;
        this.f79754d = str3;
        this.f79755e = str4;
        this.f79756f = z;
        this.f79757g = z2;
        this.f79758h = z3;
        this.f79759i = z4;
    }

    @NotNull
    /* renamed from: e */
    public final String m33786e() {
        return this.f79751a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C30409gr) {
            C30409gr c30409gr = (C30409gr) obj;
            if (Intrinsics.m17075f(c30409gr.f79751a, this.f79751a) && Intrinsics.m17075f(c30409gr.f79752b, this.f79752b) && c30409gr.f79753c == this.f79753c && Intrinsics.m17075f(c30409gr.f79754d, this.f79754d) && Intrinsics.m17075f(c30409gr.f79755e, this.f79755e) && c30409gr.f79756f == this.f79756f && c30409gr.f79757g == this.f79757g && c30409gr.f79758h == this.f79758h && c30409gr.f79759i == this.f79759i) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final String m33785f() {
        return this.f79752b;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        int m31189a = C31014o3.m31189a(this.f79752b, C31014o3.m31189a(this.f79751a, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31), 31);
        return Boolean.hashCode(this.f79759i) + C31331s6.m29848a(this.f79758h, C31331s6.m29848a(this.f79757g, C31331s6.m29848a(this.f79756f, C31014o3.m31189a(this.f79755e, C31014o3.m31189a(this.f79754d, (Long.hashCode(this.f79753c) + m31189a) * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f79751a);
        sb2.append(C20517nb.f52173T);
        sb2.append(this.f79752b);
        if (this.f79758h) {
            if (this.f79753c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(C31234qu.m30218a(new Date(this.f79753c)));
            }
        }
        if (!this.f79759i) {
            sb2.append("; domain=");
            sb2.append(this.f79754d);
        }
        sb2.append("; path=");
        sb2.append(this.f79755e);
        if (this.f79756f) {
            sb2.append("; secure");
        }
        if (this.f79757g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public /* synthetic */ C30409gr(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }
}
