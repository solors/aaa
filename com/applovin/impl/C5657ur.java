package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.appevents.UserDataStore;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.applovin.impl.ur */
/* loaded from: classes2.dex */
final class C5657ur {

    /* renamed from: c */
    private static final Pattern f11402c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d */
    private static final Pattern f11403d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a */
    private final C4066ah f11404a = new C4066ah();

    /* renamed from: b */
    private final StringBuilder f11405b = new StringBuilder();

    /* renamed from: a */
    private static boolean m94003a(C4066ah c4066ah) {
        int m100785d = c4066ah.m100785d();
        int m100783e = c4066ah.m100783e();
        byte[] m100787c = c4066ah.m100787c();
        int i = m100785d + 2;
        if (i > m100783e) {
            return false;
        }
        int i2 = m100785d + 1;
        if (m100787c[m100785d] != 47 || m100787c[i2] != 42) {
            return false;
        }
        while (true) {
            int i3 = i + 1;
            if (i3 < m100783e) {
                if (((char) m100787c[i]) == '*' && ((char) m100787c[i3]) == '/') {
                    i += 2;
                    m100783e = i;
                } else {
                    i = i3;
                }
            } else {
                c4066ah.m100778g(m100783e - c4066ah.m100785d());
                return true;
            }
        }
    }

    /* renamed from: b */
    private static boolean m93997b(C4066ah c4066ah) {
        char m94002a = m94002a(c4066ah, c4066ah.m100785d());
        if (m94002a == '\t' || m94002a == '\n' || m94002a == '\f' || m94002a == '\r' || m94002a == ' ') {
            c4066ah.m100778g(1);
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static String m93992d(C4066ah c4066ah, StringBuilder sb2) {
        m93990f(c4066ah);
        if (c4066ah.m100797a() >= 5 && "::cue".equals(c4066ah.m100786c(5))) {
            int m100785d = c4066ah.m100785d();
            String m93996b = m93996b(c4066ah, sb2);
            if (m93996b == null) {
                return null;
            }
            if ("{".equals(m93996b)) {
                c4066ah.m100780f(m100785d);
                return "";
            }
            String m93993d = "(".equals(m93996b) ? m93993d(c4066ah) : null;
            if (")".equals(m93996b(c4066ah, sb2))) {
                return m93993d;
            }
            return null;
        }
        return null;
    }

    /* renamed from: e */
    static void m93991e(C4066ah c4066ah) {
        do {
        } while (!TextUtils.isEmpty(c4066ah.m100773l()));
    }

    /* renamed from: f */
    static void m93990f(C4066ah c4066ah) {
        while (true) {
            for (boolean z = true; c4066ah.m100797a() > 0 && z; z = false) {
                if (!m93997b(c4066ah) && !m94003a(c4066ah)) {
                }
            }
            return;
        }
    }

    /* renamed from: c */
    public List m93995c(C4066ah c4066ah) {
        this.f11405b.setLength(0);
        int m100785d = c4066ah.m100785d();
        m93991e(c4066ah);
        this.f11404a.m100791a(c4066ah.m100787c(), c4066ah.m100785d());
        this.f11404a.m100780f(m100785d);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String m93992d = m93992d(this.f11404a, this.f11405b);
            if (m93992d == null || !"{".equals(m93996b(this.f11404a, this.f11405b))) {
                return arrayList;
            }
            C5725vr c5725vr = new C5725vr();
            m93999a(c5725vr, m93992d);
            String str = null;
            boolean z = false;
            while (!z) {
                int m100785d2 = this.f11404a.m100785d();
                String m93996b = m93996b(this.f11404a, this.f11405b);
                boolean z2 = m93996b == null || "}".equals(m93996b);
                if (!z2) {
                    this.f11404a.m100780f(m100785d2);
                    m94001a(this.f11404a, c5725vr, this.f11405b);
                }
                str = m93996b;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(c5725vr);
            }
        }
    }

    /* renamed from: b */
    static String m93996b(C4066ah c4066ah, StringBuilder sb2) {
        m93990f(c4066ah);
        if (c4066ah.m100797a() == 0) {
            return null;
        }
        String m94000a = m94000a(c4066ah, sb2);
        if ("".equals(m94000a)) {
            return "" + ((char) c4066ah.m100762w());
        }
        return m94000a;
    }

    /* renamed from: a */
    private static String m94000a(C4066ah c4066ah, StringBuilder sb2) {
        boolean z = false;
        sb2.setLength(0);
        int m100785d = c4066ah.m100785d();
        int m100783e = c4066ah.m100783e();
        while (m100785d < m100783e && !z) {
            char c = (char) c4066ah.m100787c()[m100785d];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                m100785d++;
                sb2.append(c);
            }
        }
        c4066ah.m100778g(m100785d - c4066ah.m100785d());
        return sb2.toString();
    }

    /* renamed from: d */
    private static String m93993d(C4066ah c4066ah) {
        int m100785d = c4066ah.m100785d();
        int m100783e = c4066ah.m100783e();
        boolean z = false;
        while (m100785d < m100783e && !z) {
            int i = m100785d + 1;
            z = ((char) c4066ah.m100787c()[m100785d]) == ')';
            m100785d = i;
        }
        return c4066ah.m100786c((m100785d - 1) - c4066ah.m100785d()).trim();
    }

    /* renamed from: a */
    private static void m94001a(C4066ah c4066ah, C5725vr c5725vr, StringBuilder sb2) {
        m93990f(c4066ah);
        String m94000a = m94000a(c4066ah, sb2);
        if (!"".equals(m94000a) && ":".equals(m93996b(c4066ah, sb2))) {
            m93990f(c4066ah);
            String m93994c = m93994c(c4066ah, sb2);
            if (m93994c == null || "".equals(m93994c)) {
                return;
            }
            int m100785d = c4066ah.m100785d();
            String m93996b = m93996b(c4066ah, sb2);
            if (!";".equals(m93996b)) {
                if (!"}".equals(m93996b)) {
                    return;
                }
                c4066ah.m100780f(m100785d);
            }
            if ("color".equals(m94000a)) {
                c5725vr.m93783b(AbstractC5302s3.m95717a(m93994c));
            } else if ("background-color".equals(m94000a)) {
                c5725vr.m93790a(AbstractC5302s3.m95717a(m93994c));
            } else {
                boolean z = true;
                if ("ruby-position".equals(m94000a)) {
                    if ("over".equals(m93994c)) {
                        c5725vr.m93775d(1);
                    } else if ("under".equals(m93994c)) {
                        c5725vr.m93775d(2);
                    }
                } else if ("text-combine-upright".equals(m94000a)) {
                    if (!"all".equals(m93994c) && !m93994c.startsWith("digits")) {
                        z = false;
                    }
                    c5725vr.m93781b(z);
                } else if ("text-decoration".equals(m94000a)) {
                    if ("underline".equals(m93994c)) {
                        c5725vr.m93773d(true);
                    }
                } else if ("font-family".equals(m94000a)) {
                    c5725vr.m93788a(m93994c);
                } else if ("font-weight".equals(m94000a)) {
                    if ("bold".equals(m93994c)) {
                        c5725vr.m93786a(true);
                    }
                } else if ("font-style".equals(m94000a)) {
                    if ("italic".equals(m93994c)) {
                        c5725vr.m93777c(true);
                    }
                } else if ("font-size".equals(m94000a)) {
                    m93998a(m93994c, c5725vr);
                }
            }
        }
    }

    /* renamed from: c */
    private static String m93994c(C4066ah c4066ah, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int m100785d = c4066ah.m100785d();
            String m93996b = m93996b(c4066ah, sb2);
            if (m93996b == null) {
                return null;
            }
            if (!"}".equals(m93996b) && !";".equals(m93996b)) {
                sb3.append(m93996b);
            } else {
                c4066ah.m100780f(m100785d);
                z = true;
            }
        }
        return sb3.toString();
    }

    /* renamed from: a */
    private static char m94002a(C4066ah c4066ah, int i) {
        return (char) c4066ah.m100787c()[i];
    }

    /* renamed from: a */
    private static void m93998a(String str, C5725vr c5725vr) {
        Matcher matcher = f11403d.matcher(Ascii.toLowerCase(str));
        if (!matcher.matches()) {
            AbstractC5063oc.m96800d("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) AbstractC4100b1.m100583a((Object) matcher.group(2));
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals(UserDataStore.EMAIL)) {
                    c = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                c5725vr.m93779c(3);
                break;
            case 1:
                c5725vr.m93779c(2);
                break;
            case 2:
                c5725vr.m93779c(1);
                break;
            default:
                throw new IllegalStateException();
        }
        c5725vr.m93791a(Float.parseFloat((String) AbstractC4100b1.m100583a((Object) matcher.group(1))));
    }

    /* renamed from: a */
    private void m93999a(C5725vr c5725vr, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f11402c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                c5725vr.m93774d((String) AbstractC4100b1.m100583a((Object) matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] m93013a = AbstractC5863xp.m93013a(str, "\\.");
        String str2 = m93013a[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            c5725vr.m93778c(str2.substring(0, indexOf2));
            c5725vr.m93782b(str2.substring(indexOf2 + 1));
        } else {
            c5725vr.m93778c(str2);
        }
        if (m93013a.length > 1) {
            c5725vr.m93785a((String[]) AbstractC5863xp.m92998a(m93013a, 1, m93013a.length));
        }
    }
}
