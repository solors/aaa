package com.bytedance.sdk.component.p228IL.p229bg;

import com.bytedance.sdk.component.p228IL.p229bg.p230IL.C7180WR;
import com.bytedance.sdk.component.p228IL.p229bg.p230IL.C7182bg;
import com.ironsource.C20517nb;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.IL.bg.iR */
/* loaded from: classes3.dex */
public final class C7216iR {
    private static final char[] eqN = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: IL */
    final String f15558IL;

    /* renamed from: Kg */
    private final List<String> f15559Kg;

    /* renamed from: WR */
    private final String f15560WR;

    /* renamed from: bX */
    final int f15561bX;

    /* renamed from: bg */
    final String f15562bg;

    /* renamed from: eo */
    private final String f15563eo;

    /* renamed from: iR */
    private final List<String> f15564iR;
    private final String ldr;

    /* renamed from: zx */
    private final String f15565zx;

    /* renamed from: com.bytedance.sdk.component.IL.bg.iR$bg */
    /* loaded from: classes3.dex */
    public static final class C7217bg {

        /* renamed from: Kg */
        String f15567Kg;

        /* renamed from: bg */
        String f15569bg;
        String eqN;

        /* renamed from: iR */
        List<String> f15570iR;
        final List<String> ldr;

        /* renamed from: IL */
        String f15566IL = "";

        /* renamed from: bX */
        String f15568bX = "";

        /* renamed from: zx */
        int f15571zx = -1;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.bytedance.sdk.component.IL.bg.iR$bg$bg */
        /* loaded from: classes3.dex */
        public enum EnumC7218bg {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public C7217bg() {
            ArrayList arrayList = new ArrayList();
            this.ldr = arrayList;
            arrayList.add("");
        }

        private boolean ldr(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: zx */
        private boolean m89570zx(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: IL */
        public C7217bg m89582IL(String str) {
            if (str != null) {
                String m89569zx = m89569zx(str, 0, str.length());
                if (m89569zx != null) {
                    this.eqN = m89569zx;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            throw new NullPointerException("host == null");
        }

        /* renamed from: bX */
        public C7217bg m89579bX(String str) {
            if (str != null) {
                return m89571bg(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        /* renamed from: bg */
        public C7217bg m89575bg(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.f15569bg = "http";
                } else if (str.equalsIgnoreCase("https")) {
                    this.f15569bg = "https";
                } else {
                    throw new IllegalArgumentException("unexpected scheme: ".concat(str));
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        public C7217bg eqN(String str) {
            this.f15570iR = str != null ? C7216iR.m89599IL(C7216iR.m89588bg(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f15569bg);
            sb2.append("://");
            if (!this.f15566IL.isEmpty() || !this.f15568bX.isEmpty()) {
                sb2.append(this.f15566IL);
                if (!this.f15568bX.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f15568bX);
                }
                sb2.append('@');
            }
            if (this.eqN.indexOf(58) != -1) {
                sb2.append('[');
                sb2.append(this.eqN);
                sb2.append(']');
            } else {
                sb2.append(this.eqN);
            }
            int m89577bg = m89577bg();
            if (m89577bg != C7216iR.m89592bg(this.f15569bg)) {
                sb2.append(':');
                sb2.append(m89577bg);
            }
            C7216iR.m89586bg(sb2, this.ldr);
            if (this.f15570iR != null) {
                sb2.append('?');
                C7216iR.m89598IL(sb2, this.f15570iR);
            }
            if (this.f15567Kg != null) {
                sb2.append('#');
                sb2.append(this.f15567Kg);
            }
            return sb2.toString();
        }

        /* renamed from: zx */
        private static String m89569zx(String str, int i, int i2) {
            return C7180WR.m89701bg(C7216iR.m89589bg(str, i, i2, false));
        }

        /* renamed from: bX */
        private void m89580bX() {
            List<String> list = this.ldr;
            if (list.remove(list.size() - 1).isEmpty() && !this.ldr.isEmpty()) {
                List<String> list2 = this.ldr;
                list2.set(list2.size() - 1, "");
                return;
            }
            this.ldr.add("");
        }

        private static int eqN(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i < i2) {
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        private static int ldr(String str, int i, int i2) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(C7216iR.m89590bg(str, i, i2, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        /* renamed from: IL */
        public C7216iR m89583IL() {
            if (this.f15569bg != null) {
                if (this.eqN != null) {
                    return new C7216iR(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* renamed from: bX */
        private static int m89578bX(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: bg */
        int m89577bg() {
            int i = this.f15571zx;
            return i != -1 ? i : C7216iR.m89592bg(this.f15569bg);
        }

        /* renamed from: bg */
        private C7217bg m89571bg(String str, boolean z) {
            int i = 0;
            do {
                int m89698bg = C7180WR.m89698bg(str, i, str.length(), "/\\");
                m89573bg(str, i, m89698bg, m89698bg < str.length(), z);
                i = m89698bg + 1;
            } while (i <= str.length());
            return this;
        }

        /* renamed from: IL */
        private static int m89581IL(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: bg */
        public C7217bg m89572bg(String str, String str2) {
            if (str != null) {
                if (this.f15570iR == null) {
                    this.f15570iR = new ArrayList();
                }
                this.f15570iR.add(C7216iR.m89588bg(str, " \"'<>#&=", true, false, true, true));
                this.f15570iR.add(str2 != null ? C7216iR.m89588bg(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        /* renamed from: bg */
        EnumC7218bg m89576bg(C7216iR c7216iR, String str) {
            int m89698bg;
            int i;
            int m89700bg = C7180WR.m89700bg(str, 0, str.length());
            int m89705IL = C7180WR.m89705IL(str, m89700bg, str.length());
            if (m89581IL(str, m89700bg, m89705IL) != -1) {
                if (str.regionMatches(true, m89700bg, "https:", 0, 6)) {
                    this.f15569bg = "https";
                    m89700bg += 6;
                } else if (str.regionMatches(true, m89700bg, "http:", 0, 5)) {
                    this.f15569bg = "http";
                    m89700bg += 5;
                } else {
                    return EnumC7218bg.UNSUPPORTED_SCHEME;
                }
            } else if (c7216iR != null) {
                this.f15569bg = c7216iR.f15562bg;
            } else {
                return EnumC7218bg.MISSING_SCHEME;
            }
            int m89578bX = m89578bX(str, m89700bg, m89705IL);
            char c = '?';
            char c2 = '#';
            if (m89578bX < 2 && c7216iR != null && c7216iR.f15562bg.equals(this.f15569bg)) {
                this.f15566IL = c7216iR.m89600IL();
                this.f15568bX = c7216iR.m89597bX();
                this.eqN = c7216iR.f15558IL;
                this.f15571zx = c7216iR.f15561bX;
                this.ldr.clear();
                this.ldr.addAll(c7216iR.eqN());
                if (m89700bg == m89705IL || str.charAt(m89700bg) == '#') {
                    eqN(c7216iR.m89584zx());
                }
            } else {
                boolean z = false;
                boolean z2 = false;
                int i2 = m89700bg + m89578bX;
                while (true) {
                    m89698bg = C7180WR.m89698bg(str, i2, m89705IL, "@/\\?#");
                    char charAt = m89698bg != m89705IL ? str.charAt(m89698bg) : (char) 65535;
                    if (charAt == 65535 || charAt == c2 || charAt == '/' || charAt == '\\' || charAt == c) {
                        break;
                    } else if (charAt == '@') {
                        if (!z) {
                            int m89699bg = C7180WR.m89699bg(str, i2, m89698bg, ':');
                            i = m89698bg;
                            String m89590bg = C7216iR.m89590bg(str, i2, m89699bg, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                m89590bg = this.f15566IL + "%40" + m89590bg;
                            }
                            this.f15566IL = m89590bg;
                            if (m89699bg != i) {
                                this.f15568bX = C7216iR.m89590bg(str, m89699bg + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            }
                            z2 = true;
                        } else {
                            i = m89698bg;
                            this.f15568bX += "%40" + C7216iR.m89590bg(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i2 = i + 1;
                        c = '?';
                        c2 = '#';
                    }
                }
                int eqN = eqN(str, i2, m89698bg);
                int i3 = eqN + 1;
                if (i3 < m89698bg) {
                    this.eqN = m89569zx(str, i2, eqN);
                    int ldr = ldr(str, i3, m89698bg);
                    this.f15571zx = ldr;
                    if (ldr == -1) {
                        return EnumC7218bg.INVALID_PORT;
                    }
                } else {
                    this.eqN = m89569zx(str, i2, eqN);
                    this.f15571zx = C7216iR.m89592bg(this.f15569bg);
                }
                if (this.eqN == null) {
                    return EnumC7218bg.INVALID_HOST;
                }
                m89700bg = m89698bg;
            }
            int m89698bg2 = C7180WR.m89698bg(str, m89700bg, m89705IL, "?#");
            m89574bg(str, m89700bg, m89698bg2);
            if (m89698bg2 < m89705IL && str.charAt(m89698bg2) == '?') {
                int m89699bg2 = C7180WR.m89699bg(str, m89698bg2, m89705IL, '#');
                this.f15570iR = C7216iR.m89599IL(C7216iR.m89590bg(str, m89698bg2 + 1, m89699bg2, " \"'<>#", true, false, true, true, null));
                m89698bg2 = m89699bg2;
            }
            if (m89698bg2 < m89705IL && str.charAt(m89698bg2) == '#') {
                this.f15567Kg = C7216iR.m89590bg(str, 1 + m89698bg2, m89705IL, "", true, false, false, false, null);
            }
            return EnumC7218bg.SUCCESS;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0028 -> B:12:0x002a). Please submit an issue!!! */
        /* renamed from: bg */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m89574bg(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L3
                return
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1e
                r1 = 92
                if (r0 != r1) goto L13
                goto L1e
            L13:
                java.util.List<java.lang.String> r0 = r10.ldr
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L2a
            L1e:
                java.util.List<java.lang.String> r0 = r10.ldr
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.ldr
                r0.add(r2)
            L28:
                int r12 = r12 + 1
            L2a:
                r6 = r12
                if (r6 >= r13) goto L43
                java.lang.String r12 = "/\\"
                int r12 = com.bytedance.sdk.component.p228IL.p229bg.p230IL.C7180WR.m89698bg(r11, r6, r13, r12)
                if (r12 >= r13) goto L37
                r0 = r3
                goto L38
            L37:
                r0 = 0
            L38:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.m89573bg(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L2a
                goto L28
            L43:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p228IL.p229bg.C7216iR.C7217bg.m89574bg(java.lang.String, int, int):void");
        }

        /* renamed from: bg */
        private void m89573bg(String str, int i, int i2, boolean z, boolean z2) {
            String m89590bg = C7216iR.m89590bg(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (m89570zx(m89590bg)) {
                return;
            }
            if (ldr(m89590bg)) {
                m89580bX();
                return;
            }
            List<String> list = this.ldr;
            if (list.get(list.size() - 1).isEmpty()) {
                List<String> list2 = this.ldr;
                list2.set(list2.size() - 1, m89590bg);
            } else {
                this.ldr.add(m89590bg);
            }
            if (z) {
                this.ldr.add("");
            }
        }
    }

    C7216iR(C7217bg c7217bg) {
        List<String> list;
        this.f15562bg = c7217bg.f15569bg;
        this.f15565zx = m89587bg(c7217bg.f15566IL, false);
        this.ldr = m89587bg(c7217bg.f15568bX, false);
        this.f15558IL = c7217bg.eqN;
        this.f15561bX = c7217bg.m89577bg();
        this.f15564iR = m89585bg(c7217bg.ldr, false);
        List<String> list2 = c7217bg.f15570iR;
        if (list2 != null) {
            list = m89585bg(list2, true);
        } else {
            list = null;
        }
        this.f15559Kg = list;
        String str = c7217bg.f15567Kg;
        this.f15560WR = str != null ? m89587bg(str, false) : null;
        this.f15563eo = c7217bg.toString();
    }

    /* renamed from: IL */
    public String m89600IL() {
        if (this.f15565zx.isEmpty()) {
            return "";
        }
        int length = this.f15562bg.length() + 3;
        String str = this.f15563eo;
        return this.f15563eo.substring(length, C7180WR.m89698bg(str, length, str.length(), ":@"));
    }

    /* renamed from: bX */
    public String m89597bX() {
        if (this.ldr.isEmpty()) {
            return "";
        }
        int indexOf = this.f15563eo.indexOf(64);
        return this.f15563eo.substring(this.f15563eo.indexOf(58, this.f15562bg.length() + 3) + 1, indexOf);
    }

    /* renamed from: bg */
    public URL m89595bg() {
        try {
            return new URL(this.f15563eo);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> eqN() {
        int indexOf = this.f15563eo.indexOf(47, this.f15562bg.length() + 3);
        String str = this.f15563eo;
        int m89698bg = C7180WR.m89698bg(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < m89698bg) {
            int i = indexOf + 1;
            int m89699bg = C7180WR.m89699bg(this.f15563eo, i, m89698bg, '/');
            arrayList.add(this.f15563eo.substring(i, m89699bg));
            indexOf = m89699bg;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C7216iR) && ((C7216iR) obj).f15563eo.equals(this.f15563eo)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f15563eo.hashCode();
    }

    public String toString() {
        return this.f15563eo;
    }

    /* renamed from: zx */
    public String m89584zx() {
        if (this.f15559Kg == null) {
            return null;
        }
        int indexOf = this.f15563eo.indexOf(63) + 1;
        String str = this.f15563eo;
        return this.f15563eo.substring(indexOf, C7180WR.m89699bg(str, indexOf, str.length(), '#'));
    }

    /* renamed from: bg */
    public static int m89592bg(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: IL */
    static void m89598IL(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append(C20517nb.f52173T);
                sb2.append(str2);
            }
        }
    }

    /* renamed from: bX */
    public static C7216iR m89596bX(String str) {
        C7217bg c7217bg = new C7217bg();
        if (c7217bg.m89576bg((C7216iR) null, str) == C7217bg.EnumC7218bg.SUCCESS) {
            return c7217bg.m89583IL();
        }
        return null;
    }

    /* renamed from: bg */
    static void m89586bg(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb2.append('/');
            sb2.append(list.get(i));
        }
    }

    /* renamed from: bg */
    static String m89587bg(String str, boolean z) {
        return m89589bg(str, 0, str.length(), z);
    }

    /* renamed from: bg */
    private List<String> m89585bg(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m89587bg(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: IL */
    static List<String> m89599IL(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: bg */
    static String m89589bg(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C7182bg c7182bg = new C7182bg();
                c7182bg.m89683bg(str, i, i3);
                m89593bg(c7182bg, str, i3, i2, z);
                return c7182bg.m89690bX();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: bg */
    static void m89593bg(C7182bg c7182bg, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int m89703bg = C7180WR.m89703bg(str.charAt(i + 1));
                int m89703bg2 = C7180WR.m89703bg(str.charAt(i3));
                if (m89703bg != -1 && m89703bg2 != -1) {
                    c7182bg.m89693IL((m89703bg << 4) + m89703bg2);
                    i = i3;
                }
                c7182bg.m89687bg(codePointAt);
            } else {
                if (codePointAt == 43 && z) {
                    c7182bg.m89693IL(32);
                }
                c7182bg.m89687bg(codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: bg */
    static boolean m89591bg(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && C7180WR.m89703bg(str.charAt(i + 1)) != -1 && C7180WR.m89703bg(str.charAt(i3)) != -1;
    }

    /* renamed from: bg */
    static String m89590bg(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z4)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || m89591bg(str, i3, i2)))) && (codePointAt != 43 || !z3))) {
                    i3 += Character.charCount(codePointAt);
                }
            }
            C7182bg c7182bg = new C7182bg();
            c7182bg.m89683bg(str, i, i3);
            m89594bg(c7182bg, str, i3, i2, str2, z, z2, z3, z4, charset);
            return c7182bg.m89690bX();
        }
        return str.substring(i, i2);
    }

    /* renamed from: bg */
    static void m89594bg(C7182bg c7182bg, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        C7182bg c7182bg2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z3) {
                    c7182bg.m89684bg(z ? "+" : "%2B");
                } else if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z4) && str2.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z && (!z2 || m89591bg(str, i, i2)))))) {
                    c7182bg.m89687bg(codePointAt);
                } else {
                    if (c7182bg2 == null) {
                        c7182bg2 = new C7182bg();
                    }
                    if (charset != null && !charset.equals(C7180WR.f15482bg)) {
                        c7182bg2.m89682bg(str, i, Character.charCount(codePointAt) + i, charset);
                    } else {
                        c7182bg2.m89687bg(codePointAt);
                    }
                    while (!c7182bg2.m89688bg()) {
                        int m89694IL = c7182bg2.m89694IL() & 255;
                        c7182bg.m89693IL(37);
                        char[] cArr = eqN;
                        c7182bg.m89693IL((int) cArr[(m89694IL >> 4) & 15]);
                        c7182bg.m89693IL((int) cArr[m89694IL & 15]);
                    }
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: bg */
    static String m89588bg(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m89590bg(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
