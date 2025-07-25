package com.applovin.impl;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.zk */
/* loaded from: classes2.dex */
public final class C5976zk {

    /* renamed from: a */
    public final String f12572a;

    /* renamed from: b */
    public final int f12573b;

    /* renamed from: c */
    public final Integer f12574c;

    /* renamed from: d */
    public final float f12575d;

    /* renamed from: e */
    public final boolean f12576e;

    /* renamed from: f */
    public final boolean f12577f;

    /* renamed from: g */
    public final boolean f12578g;

    /* renamed from: h */
    public final boolean f12579h;

    /* renamed from: com.applovin.impl.zk$a */
    /* loaded from: classes2.dex */
    static final class C5977a {

        /* renamed from: a */
        public final int f12580a;

        /* renamed from: b */
        public final int f12581b;

        /* renamed from: c */
        public final int f12582c;

        /* renamed from: d */
        public final int f12583d;

        /* renamed from: e */
        public final int f12584e;

        /* renamed from: f */
        public final int f12585f;

        /* renamed from: g */
        public final int f12586g;

        /* renamed from: h */
        public final int f12587h;

        /* renamed from: i */
        public final int f12588i;

        private C5977a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f12580a = i;
            this.f12581b = i2;
            this.f12582c = i3;
            this.f12583d = i4;
            this.f12584e = i5;
            this.f12585f = i6;
            this.f12586g = i7;
            this.f12587h = i8;
            this.f12588i = i9;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        public static C5977a m92363a(String str) {
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
            for (int i9 = 0; i9 < split.length; i9++) {
                String lowerCase = Ascii.toLowerCase(split[i9].trim());
                lowerCase.hashCode();
                switch (lowerCase.hashCode()) {
                    case -1178781136:
                        if (lowerCase.equals("italic")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1026963764:
                        if (lowerCase.equals("underline")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -192095652:
                        if (lowerCase.equals("strikeout")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -70925746:
                        if (lowerCase.equals("primarycolour")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3029637:
                        if (lowerCase.equals("bold")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3373707:
                        if (lowerCase.equals("name")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 366554320:
                        if (lowerCase.equals("fontsize")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1767875043:
                        if (lowerCase.equals("alignment")) {
                            c = 7;
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
                        i6 = i9;
                        break;
                    case 1:
                        i7 = i9;
                        break;
                    case 2:
                        i8 = i9;
                        break;
                    case 3:
                        i3 = i9;
                        break;
                    case 4:
                        i5 = i9;
                        break;
                    case 5:
                        i = i9;
                        break;
                    case 6:
                        i4 = i9;
                        break;
                    case 7:
                        i2 = i9;
                        break;
                }
            }
            if (i != -1) {
                return new C5977a(i, i2, i3, i4, i5, i6, i7, i8, split.length);
            }
            return null;
        }
    }

    /* renamed from: com.applovin.impl.zk$b */
    /* loaded from: classes2.dex */
    static final class C5978b {

        /* renamed from: c */
        private static final Pattern f12589c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d */
        private static final Pattern f12590d = Pattern.compile(AbstractC5863xp.m93012a("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e */
        private static final Pattern f12591e = Pattern.compile(AbstractC5863xp.m93012a("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f */
        private static final Pattern f12592f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a */
        public final int f12593a;

        /* renamed from: b */
        public final PointF f12594b;

        private C5978b(int i, PointF pointF) {
            this.f12593a = i;
            this.f12594b = pointF;
        }

        /* renamed from: a */
        private static int m92362a(String str) {
            Matcher matcher = f12592f.matcher(str);
            if (matcher.find()) {
                return C5976zk.m92367b((String) AbstractC4100b1.m100583a((Object) matcher.group(1)));
            }
            return -1;
        }

        /* renamed from: b */
        public static C5978b m92361b(String str) {
            Matcher matcher = f12589c.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String str2 = (String) AbstractC4100b1.m100583a((Object) matcher.group(1));
                try {
                    PointF m92360c = m92360c(str2);
                    if (m92360c != null) {
                        pointF = m92360c;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int m92362a = m92362a(str2);
                    if (m92362a != -1) {
                        i = m92362a;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new C5978b(i, pointF);
        }

        /* renamed from: c */
        private static PointF m92360c(String str) {
            String group;
            String group2;
            Matcher matcher = f12590d.matcher(str);
            Matcher matcher2 = f12591e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    AbstractC5063oc.m96802c("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else if (find2) {
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            } else {
                return null;
            }
            return new PointF(Float.parseFloat(((String) AbstractC4100b1.m100583a((Object) group)).trim()), Float.parseFloat(((String) AbstractC4100b1.m100583a((Object) group2)).trim()));
        }

        /* renamed from: d */
        public static String m92359d(String str) {
            return f12589c.matcher(str).replaceAll("");
        }
    }

    private C5976zk(String str, int i, Integer num, float f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f12572a = str;
        this.f12573b = i;
        this.f12574c = num;
        this.f12575d = f;
        this.f12576e = z;
        this.f12577f = z2;
        this.f12578g = z3;
        this.f12579h = z4;
    }

    /* renamed from: a */
    private static boolean m92370a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m92367b(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (m92370a(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC5063oc.m96800d("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    /* renamed from: c */
    private static boolean m92366c(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            AbstractC5063oc.m96801c("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    /* renamed from: d */
    public static Integer m92365d(String str) {
        long parseLong;
        boolean z;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z = true;
            } else {
                z = false;
            }
            AbstractC4100b1.m100580a(z);
            int m94482a = AbstractC5555tb.m94482a(((parseLong >> 24) & 255) ^ 255);
            int m94482a2 = AbstractC5555tb.m94482a((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(m94482a, AbstractC5555tb.m94482a(parseLong & 255), AbstractC5555tb.m94482a((parseLong >> 8) & 255), m94482a2));
        } catch (IllegalArgumentException e) {
            AbstractC5063oc.m96801c("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* renamed from: e */
    private static float m92364e(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            AbstractC5063oc.m96801c("SsaStyle", "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }

    /* renamed from: a */
    public static C5976zk m92368a(String str, C5977a c5977a) {
        AbstractC4100b1.m100580a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i = c5977a.f12588i;
        if (length != i) {
            AbstractC5063oc.m96800d("SsaStyle", AbstractC5863xp.m93012a("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[c5977a.f12580a].trim();
            int i2 = c5977a.f12581b;
            int m92367b = i2 != -1 ? m92367b(split[i2].trim()) : -1;
            int i3 = c5977a.f12582c;
            Integer m92365d = i3 != -1 ? m92365d(split[i3].trim()) : null;
            int i4 = c5977a.f12583d;
            float m92364e = i4 != -1 ? m92364e(split[i4].trim()) : -3.4028235E38f;
            int i5 = c5977a.f12584e;
            boolean z = i5 != -1 && m92366c(split[i5].trim());
            int i6 = c5977a.f12585f;
            boolean z2 = i6 != -1 && m92366c(split[i6].trim());
            int i7 = c5977a.f12586g;
            boolean z3 = i7 != -1 && m92366c(split[i7].trim());
            int i8 = c5977a.f12587h;
            return new C5976zk(trim, m92367b, m92365d, m92364e, z, z2, z3, i8 != -1 && m92366c(split[i8].trim()));
        } catch (RuntimeException e) {
            AbstractC5063oc.m96801c("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
            return null;
        }
    }
}
