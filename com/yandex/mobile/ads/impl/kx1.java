package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
final class kx1 {

    /* renamed from: a */
    public final String f81604a;

    /* renamed from: b */
    public final int f81605b;
    @Nullable
    @ColorInt

    /* renamed from: c */
    public final Integer f81606c;
    @Nullable
    @ColorInt

    /* renamed from: d */
    public final Integer f81607d;

    /* renamed from: e */
    public final float f81608e;

    /* renamed from: f */
    public final boolean f81609f;

    /* renamed from: g */
    public final boolean f81610g;

    /* renamed from: h */
    public final boolean f81611h;

    /* renamed from: i */
    public final boolean f81612i;

    /* renamed from: j */
    public final int f81613j;

    /* renamed from: com.yandex.mobile.ads.impl.kx1$a */
    /* loaded from: classes8.dex */
    static final class C30755a {

        /* renamed from: a */
        public final int f81614a;

        /* renamed from: b */
        public final int f81615b;

        /* renamed from: c */
        public final int f81616c;

        /* renamed from: d */
        public final int f81617d;

        /* renamed from: e */
        public final int f81618e;

        /* renamed from: f */
        public final int f81619f;

        /* renamed from: g */
        public final int f81620g;

        /* renamed from: h */
        public final int f81621h;

        /* renamed from: i */
        public final int f81622i;

        /* renamed from: j */
        public final int f81623j;

        /* renamed from: k */
        public final int f81624k;

        private C30755a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f81614a = i;
            this.f81615b = i2;
            this.f81616c = i3;
            this.f81617d = i4;
            this.f81618e = i5;
            this.f81619f = i6;
            this.f81620g = i7;
            this.f81621h = i8;
            this.f81622i = i9;
            this.f81623j = i10;
            this.f81624k = i11;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Nullable
        /* renamed from: a */
        public static C30755a m32405a(String str) {
            char c;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < split.length; i11++) {
                String m32278b = C30784lf.m32278b(split[i11].trim());
                m32278b.getClass();
                switch (m32278b.hashCode()) {
                    case -1178781136:
                        if (m32278b.equals("italic")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1026963764:
                        if (m32278b.equals("underline")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -192095652:
                        if (m32278b.equals("strikeout")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -70925746:
                        if (m32278b.equals("primarycolour")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3029637:
                        if (m32278b.equals("bold")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3373707:
                        if (m32278b.equals("name")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 366554320:
                        if (m32278b.equals("fontsize")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 767321349:
                        if (m32278b.equals("borderstyle")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1767875043:
                        if (m32278b.equals("alignment")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1988365454:
                        if (m32278b.equals("outlinecolour")) {
                            c = '\t';
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
                        i7 = i11;
                        break;
                    case 1:
                        i8 = i11;
                        break;
                    case 2:
                        i9 = i11;
                        break;
                    case 3:
                        i3 = i11;
                        break;
                    case 4:
                        i6 = i11;
                        break;
                    case 5:
                        i = i11;
                        break;
                    case 6:
                        i5 = i11;
                        break;
                    case 7:
                        i10 = i11;
                        break;
                    case '\b':
                        i2 = i11;
                        break;
                    case '\t':
                        i4 = i11;
                        break;
                }
            }
            if (i != -1) {
                return new C30755a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, split.length);
            }
            return null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kx1$b */
    /* loaded from: classes8.dex */
    static final class C30756b {

        /* renamed from: c */
        private static final Pattern f81625c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d */
        private static final Pattern f81626d;

        /* renamed from: e */
        private static final Pattern f81627e;

        /* renamed from: f */
        private static final Pattern f81628f;

        /* renamed from: a */
        public final int f81629a;
        @Nullable

        /* renamed from: b */
        public final PointF f81630b;

        static {
            int i = y32.f88010a;
            Locale locale = Locale.US;
            f81626d = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f81627e = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f81628f = Pattern.compile("\\\\an(\\d+)");
        }

        private C30756b(int i, @Nullable PointF pointF) {
            this.f81629a = i;
            this.f81630b = pointF;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0052 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0009 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.yandex.mobile.ads.impl.kx1.C30756b m32404a(java.lang.String r7) {
            /*
                java.util.regex.Pattern r0 = com.yandex.mobile.ads.impl.kx1.C30756b.f81625c
                java.util.regex.Matcher r7 = r0.matcher(r7)
                r0 = -1
                r1 = 0
                r2 = r0
            L9:
                boolean r3 = r7.find()
                if (r3 == 0) goto L54
                r3 = 1
                java.lang.String r4 = r7.group(r3)
                r4.getClass()
                android.graphics.PointF r5 = m32403b(r4)     // Catch: java.lang.RuntimeException -> L1e
                if (r5 == 0) goto L1e
                r1 = r5
            L1e:
                java.util.regex.Pattern r5 = com.yandex.mobile.ads.impl.kx1.C30756b.f81628f     // Catch: java.lang.RuntimeException -> L9
                java.util.regex.Matcher r4 = r5.matcher(r4)     // Catch: java.lang.RuntimeException -> L9
                boolean r5 = r4.find()     // Catch: java.lang.RuntimeException -> L9
                if (r5 == 0) goto L4f
                java.lang.String r3 = r4.group(r3)     // Catch: java.lang.RuntimeException -> L9
                r3.getClass()     // Catch: java.lang.RuntimeException -> L9
                java.lang.String r4 = r3.trim()     // Catch: java.lang.RuntimeException -> L9 java.lang.NumberFormatException -> L3c
                int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.RuntimeException -> L9 java.lang.NumberFormatException -> L3c
                switch(r4) {
                    case 1: goto L50;
                    case 2: goto L50;
                    case 3: goto L50;
                    case 4: goto L50;
                    case 5: goto L50;
                    case 6: goto L50;
                    case 7: goto L50;
                    case 8: goto L50;
                    case 9: goto L50;
                    default: goto L3c;
                }
            L3c:
                java.lang.String r4 = "SsaStyle"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L9
                java.lang.String r6 = "Ignoring unknown alignment: "
                r5.<init>(r6)     // Catch: java.lang.RuntimeException -> L9
                r5.append(r3)     // Catch: java.lang.RuntimeException -> L9
                java.lang.String r3 = r5.toString()     // Catch: java.lang.RuntimeException -> L9
                com.yandex.mobile.ads.impl.gq0.m33792d(r4, r3)     // Catch: java.lang.RuntimeException -> L9
            L4f:
                r4 = r0
            L50:
                if (r4 == r0) goto L9
                r2 = r4
                goto L9
            L54:
                com.yandex.mobile.ads.impl.kx1$b r7 = new com.yandex.mobile.ads.impl.kx1$b
                r7.<init>(r2, r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.kx1.C30756b.m32404a(java.lang.String):com.yandex.mobile.ads.impl.kx1$b");
        }

        @Nullable
        /* renamed from: b */
        private static PointF m32403b(String str) {
            String group;
            String group2;
            Matcher matcher = f81626d.matcher(str);
            Matcher matcher2 = f81627e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    gq0.m33793c("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else if (find2) {
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            } else {
                return null;
            }
            group.getClass();
            float parseFloat = Float.parseFloat(group.trim());
            group2.getClass();
            return new PointF(parseFloat, Float.parseFloat(group2.trim()));
        }

        /* renamed from: c */
        public static String m32402c(String str) {
            return f81625c.matcher(str).replaceAll("");
        }
    }

    private kx1(String str, int i, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f81604a = str;
        this.f81605b = i;
        this.f81606c = num;
        this.f81607d = num2;
        this.f81608e = f;
        this.f81609f = z;
        this.f81610g = z2;
        this.f81611h = z3;
        this.f81612i = z4;
        this.f81613j = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0130, code lost:
        if (r3 != 3) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081 A[Catch: RuntimeException -> 0x0152, TryCatch #0 {RuntimeException -> 0x0152, blocks: (B:8:0x004b, B:10:0x005a, B:11:0x0060, B:15:0x007d, B:17:0x0081, B:19:0x008e, B:21:0x0092, B:23:0x009f, B:25:0x00a3, B:26:0x00a9, B:32:0x00c7, B:34:0x00cd, B:38:0x00dc, B:40:0x00e0, B:44:0x00f1, B:46:0x00f5, B:50:0x0106, B:52:0x010a, B:56:0x011b, B:58:0x011f, B:59:0x0125, B:65:0x0144, B:63:0x0132, B:30:0x00b0, B:13:0x006b), top: B:74:0x004b, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092 A[Catch: RuntimeException -> 0x0152, TryCatch #0 {RuntimeException -> 0x0152, blocks: (B:8:0x004b, B:10:0x005a, B:11:0x0060, B:15:0x007d, B:17:0x0081, B:19:0x008e, B:21:0x0092, B:23:0x009f, B:25:0x00a3, B:26:0x00a9, B:32:0x00c7, B:34:0x00cd, B:38:0x00dc, B:40:0x00e0, B:44:0x00f1, B:46:0x00f5, B:50:0x0106, B:52:0x010a, B:56:0x011b, B:58:0x011f, B:59:0x0125, B:65:0x0144, B:63:0x0132, B:30:0x00b0, B:13:0x006b), top: B:74:0x004b, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3 A[Catch: RuntimeException -> 0x0152, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0152, blocks: (B:8:0x004b, B:10:0x005a, B:11:0x0060, B:15:0x007d, B:17:0x0081, B:19:0x008e, B:21:0x0092, B:23:0x009f, B:25:0x00a3, B:26:0x00a9, B:32:0x00c7, B:34:0x00cd, B:38:0x00dc, B:40:0x00e0, B:44:0x00f1, B:46:0x00f5, B:50:0x0106, B:52:0x010a, B:56:0x011b, B:58:0x011f, B:59:0x0125, B:65:0x0144, B:63:0x0132, B:30:0x00b0, B:13:0x006b), top: B:74:0x004b, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd A[Catch: RuntimeException -> 0x0152, TryCatch #0 {RuntimeException -> 0x0152, blocks: (B:8:0x004b, B:10:0x005a, B:11:0x0060, B:15:0x007d, B:17:0x0081, B:19:0x008e, B:21:0x0092, B:23:0x009f, B:25:0x00a3, B:26:0x00a9, B:32:0x00c7, B:34:0x00cd, B:38:0x00dc, B:40:0x00e0, B:44:0x00f1, B:46:0x00f5, B:50:0x0106, B:52:0x010a, B:56:0x011b, B:58:0x011f, B:59:0x0125, B:65:0x0144, B:63:0x0132, B:30:0x00b0, B:13:0x006b), top: B:74:0x004b, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0 A[Catch: RuntimeException -> 0x0152, TryCatch #0 {RuntimeException -> 0x0152, blocks: (B:8:0x004b, B:10:0x005a, B:11:0x0060, B:15:0x007d, B:17:0x0081, B:19:0x008e, B:21:0x0092, B:23:0x009f, B:25:0x00a3, B:26:0x00a9, B:32:0x00c7, B:34:0x00cd, B:38:0x00dc, B:40:0x00e0, B:44:0x00f1, B:46:0x00f5, B:50:0x0106, B:52:0x010a, B:56:0x011b, B:58:0x011f, B:59:0x0125, B:65:0x0144, B:63:0x0132, B:30:0x00b0, B:13:0x006b), top: B:74:0x004b, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5 A[Catch: RuntimeException -> 0x0152, TryCatch #0 {RuntimeException -> 0x0152, blocks: (B:8:0x004b, B:10:0x005a, B:11:0x0060, B:15:0x007d, B:17:0x0081, B:19:0x008e, B:21:0x0092, B:23:0x009f, B:25:0x00a3, B:26:0x00a9, B:32:0x00c7, B:34:0x00cd, B:38:0x00dc, B:40:0x00e0, B:44:0x00f1, B:46:0x00f5, B:50:0x0106, B:52:0x010a, B:56:0x011b, B:58:0x011f, B:59:0x0125, B:65:0x0144, B:63:0x0132, B:30:0x00b0, B:13:0x006b), top: B:74:0x004b, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a A[Catch: RuntimeException -> 0x0152, TryCatch #0 {RuntimeException -> 0x0152, blocks: (B:8:0x004b, B:10:0x005a, B:11:0x0060, B:15:0x007d, B:17:0x0081, B:19:0x008e, B:21:0x0092, B:23:0x009f, B:25:0x00a3, B:26:0x00a9, B:32:0x00c7, B:34:0x00cd, B:38:0x00dc, B:40:0x00e0, B:44:0x00f1, B:46:0x00f5, B:50:0x0106, B:52:0x010a, B:56:0x011b, B:58:0x011f, B:59:0x0125, B:65:0x0144, B:63:0x0132, B:30:0x00b0, B:13:0x006b), top: B:74:0x004b, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011f A[Catch: RuntimeException -> 0x0152, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0152, blocks: (B:8:0x004b, B:10:0x005a, B:11:0x0060, B:15:0x007d, B:17:0x0081, B:19:0x008e, B:21:0x0092, B:23:0x009f, B:25:0x00a3, B:26:0x00a9, B:32:0x00c7, B:34:0x00cd, B:38:0x00dc, B:40:0x00e0, B:44:0x00f1, B:46:0x00f5, B:50:0x0106, B:52:0x010a, B:56:0x011b, B:58:0x011f, B:59:0x0125, B:65:0x0144, B:63:0x0132, B:30:0x00b0, B:13:0x006b), top: B:74:0x004b, inners: #2 }] */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.impl.kx1 m32407a(java.lang.String r20, com.yandex.mobile.ads.impl.kx1.C30755a r21) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.kx1.m32407a(java.lang.String, com.yandex.mobile.ads.impl.kx1$a):com.yandex.mobile.ads.impl.kx1");
    }

    @Nullable
    @ColorInt
    /* renamed from: b */
    public static Integer m32406b(String str) {
        long parseLong;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                int m32835a = jn0.m32835a(((parseLong >> 24) & 255) ^ 255);
                int m32835a2 = jn0.m32835a((parseLong >> 16) & 255);
                return Integer.valueOf(Color.argb(m32835a, jn0.m32835a(parseLong & 255), jn0.m32835a((parseLong >> 8) & 255), m32835a2));
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            gq0.m33794b("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m32408a(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            gq0.m33794b("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
