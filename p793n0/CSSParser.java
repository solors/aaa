package p793n0;

import android.util.Log;
import androidx.webkit.ProxyConfig;
import com.ironsource.C20517nb;
import com.p552ot.pubsub.p553a.C26484a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p793n0.SVG;
import p793n0.SVGParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: n0.b */
/* loaded from: classes11.dex */
public class CSSParser {

    /* renamed from: a */
    private EnumC38304f f101206a;

    /* renamed from: b */
    private EnumC38319u f101207b;

    /* renamed from: c */
    private boolean f101208c;

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$a */
    /* loaded from: classes11.dex */
    public static /* synthetic */ class C38298a {

        /* renamed from: a */
        static final /* synthetic */ int[] f101209a;

        /* renamed from: b */
        static final /* synthetic */ int[] f101210b;

        static {
            int[] iArr = new int[EnumC38308j.values().length];
            f101210b = iArr;
            try {
                iArr[EnumC38308j.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f101210b[EnumC38308j.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f101210b[EnumC38308j.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f101210b[EnumC38308j.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f101210b[EnumC38308j.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f101210b[EnumC38308j.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f101210b[EnumC38308j.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f101210b[EnumC38308j.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f101210b[EnumC38308j.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f101210b[EnumC38308j.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f101210b[EnumC38308j.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f101210b[EnumC38308j.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f101210b[EnumC38308j.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f101210b[EnumC38308j.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f101210b[EnumC38308j.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f101210b[EnumC38308j.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f101210b[EnumC38308j.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f101210b[EnumC38308j.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f101210b[EnumC38308j.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f101210b[EnumC38308j.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f101210b[EnumC38308j.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f101210b[EnumC38308j.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f101210b[EnumC38308j.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f101210b[EnumC38308j.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[EnumC38300c.values().length];
            f101209a = iArr2;
            try {
                iArr2[EnumC38300c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f101209a[EnumC38300c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f101209a[EnumC38300c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$b */
    /* loaded from: classes11.dex */
    public static class C38299b {

        /* renamed from: a */
        public final String f101211a;

        /* renamed from: b */
        final EnumC38300c f101212b;

        /* renamed from: c */
        public final String f101213c;

        C38299b(String str, EnumC38300c enumC38300c, String str2) {
            this.f101211a = str;
            this.f101212b = enumC38300c;
            this.f101213c = str2;
        }
    }

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$c */
    /* loaded from: classes11.dex */
    public enum EnumC38300c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$d */
    /* loaded from: classes11.dex */
    public static class C38301d extends SVGParser.C38410i {

        /* compiled from: CSSParser.java */
        /* renamed from: n0.b$d$a */
        /* loaded from: classes11.dex */
        public static class C38302a {

            /* renamed from: a */
            public int f101219a;

            /* renamed from: b */
            public int f101220b;

            C38302a(int i, int i2) {
                this.f101219a = i;
                this.f101220b = i2;
            }
        }

        C38301d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        /* renamed from: C */
        private int m15087C(int i) {
            if (i >= 48 && i <= 57) {
                return i - 48;
            }
            int i2 = 65;
            if (i < 65 || i > 70) {
                i2 = 97;
                if (i < 97 || i > 102) {
                    return -1;
                }
            }
            return (i - i2) + 10;
        }

        /* renamed from: D */
        private C38302a m15086D() throws CSSParseException {
            int i;
            C38320c c38320c;
            int m15052d;
            C38302a c38302a;
            if (m14750h()) {
                return null;
            }
            int i2 = this.f101748b;
            if (!m14752f('(')) {
                return null;
            }
            m14758A();
            int i3 = 1;
            if (m14751g("odd")) {
                c38302a = new C38302a(2, 1);
            } else {
                int i4 = 0;
                if (m14751g("even")) {
                    c38302a = new C38302a(2, 0);
                } else {
                    if (!m14752f('+') && m14752f('-')) {
                        i = -1;
                    } else {
                        i = 1;
                    }
                    C38320c m15053c = C38320c.m15053c(this.f101747a, this.f101748b, this.f101749c, false);
                    if (m15053c != null) {
                        this.f101748b = m15053c.m15055a();
                    }
                    if (!m14752f('n') && !m14752f('N')) {
                        c38320c = m15053c;
                        m15053c = null;
                    } else {
                        if (m15053c == null) {
                            m15053c = new C38320c(1L, this.f101748b);
                        }
                        m14758A();
                        boolean m14752f = m14752f('+');
                        if (!m14752f && (m14752f = m14752f('-'))) {
                            i3 = -1;
                        }
                        if (m14752f) {
                            m14758A();
                            c38320c = C38320c.m15053c(this.f101747a, this.f101748b, this.f101749c, false);
                            if (c38320c != null) {
                                this.f101748b = c38320c.m15055a();
                            } else {
                                this.f101748b = i2;
                                return null;
                            }
                        } else {
                            c38320c = null;
                        }
                        int i5 = i3;
                        i3 = i;
                        i = i5;
                    }
                    if (m15053c == null) {
                        m15052d = 0;
                    } else {
                        m15052d = i3 * m15053c.m15052d();
                    }
                    if (c38320c != null) {
                        i4 = i * c38320c.m15052d();
                    }
                    c38302a = new C38302a(m15052d, i4);
                }
            }
            m14758A();
            if (m14752f(')')) {
                return c38302a;
            }
            this.f101748b = i2;
            return null;
        }

        /* renamed from: E */
        private String m15085E() {
            if (m14750h()) {
                return null;
            }
            String m14741q = m14741q();
            if (m14741q != null) {
                return m14741q;
            }
            return m15082H();
        }

        /* renamed from: G */
        private List<String> m15083G() throws CSSParseException {
            if (m14750h()) {
                return null;
            }
            int i = this.f101748b;
            if (!m14752f('(')) {
                return null;
            }
            m14758A();
            ArrayList arrayList = null;
            do {
                String m15082H = m15082H();
                if (m15082H == null) {
                    this.f101748b = i;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m15082H);
                m14758A();
            } while (m14732z());
            if (m14752f(')')) {
                return arrayList;
            }
            this.f101748b = i;
            return null;
        }

        /* renamed from: K */
        private List<C38317s> m15079K() throws CSSParseException {
            List<C38318t> list;
            List<InterfaceC38305g> list2;
            if (m14750h()) {
                return null;
            }
            int i = this.f101748b;
            if (!m14752f('(')) {
                return null;
            }
            m14758A();
            List<C38317s> m15078L = m15078L();
            if (m15078L == null) {
                this.f101748b = i;
                return null;
            } else if (!m14752f(')')) {
                this.f101748b = i;
                return null;
            } else {
                Iterator<C38317s> it = m15078L.iterator();
                while (it.hasNext() && (list = it.next().f101278a) != null) {
                    Iterator<C38318t> it2 = list.iterator();
                    while (it2.hasNext() && (list2 = it2.next().f101283d) != null) {
                        for (InterfaceC38305g interfaceC38305g : list2) {
                            if (interfaceC38305g instanceof C38309k) {
                                return null;
                            }
                        }
                    }
                }
                return m15078L;
            }
        }

        /* renamed from: L */
        public List<C38317s> m15078L() throws CSSParseException {
            if (m14750h()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            C38317s c38317s = new C38317s(null);
            while (!m14750h() && m15077M(c38317s)) {
                if (m14732z()) {
                    arrayList.add(c38317s);
                    c38317s = new C38317s(null);
                }
            }
            if (!c38317s.m15059f()) {
                arrayList.add(c38317s);
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: O */
        private void m15075O(C38317s c38317s, C38318t c38318t) throws CSSParseException {
            InterfaceC38305g c38306h;
            boolean z;
            boolean z2;
            C38306h c38306h2;
            String m15082H = m15082H();
            if (m15082H != null) {
                EnumC38308j m15073b = EnumC38308j.m15073b(m15082H);
                switch (C38298a.f101210b[m15073b.ordinal()]) {
                    case 1:
                        c38306h = new C38306h(0, 1, true, false, null);
                        c38317s.m15063b();
                        break;
                    case 2:
                        c38306h = new C38306h(0, 1, false, false, null);
                        c38317s.m15063b();
                        break;
                    case 3:
                        c38306h = new C38311m(false, null);
                        c38317s.m15063b();
                        break;
                    case 4:
                        c38306h = new C38306h(0, 1, true, true, c38318t.f101281b);
                        c38317s.m15063b();
                        break;
                    case 5:
                        c38306h = new C38306h(0, 1, false, true, c38318t.f101281b);
                        c38317s.m15063b();
                        break;
                    case 6:
                        c38306h = new C38311m(true, c38318t.f101281b);
                        c38317s.m15063b();
                        break;
                    case 7:
                        c38306h = new C38312n(null);
                        c38317s.m15063b();
                        break;
                    case 8:
                        c38306h = new C38307i(null);
                        c38317s.m15063b();
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        if (m15073b != EnumC38308j.nth_child && m15073b != EnumC38308j.nth_of_type) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (m15073b != EnumC38308j.nth_of_type && m15073b != EnumC38308j.nth_last_of_type) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        C38302a m15086D = m15086D();
                        if (m15086D != null) {
                            C38306h c38306h3 = new C38306h(m15086D.f101219a, m15086D.f101220b, z, z2, c38318t.f101281b);
                            c38317s.m15063b();
                            c38306h2 = c38306h3;
                            c38306h = c38306h2;
                            break;
                        } else {
                            throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + m15082H);
                        }
                        break;
                    case 13:
                        List<C38317s> m15079K = m15079K();
                        if (m15079K != null) {
                            C38309k c38309k = new C38309k(m15079K);
                            c38317s.f101279b = c38309k.m15072b();
                            c38306h2 = c38309k;
                            c38306h = c38306h2;
                            break;
                        } else {
                            throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + m15082H);
                        }
                    case 14:
                        c38306h = new C38313o(null);
                        c38317s.m15063b();
                        break;
                    case 15:
                        m15083G();
                        c38306h = new C38310l(m15082H);
                        c38317s.m15063b();
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        c38306h = new C38310l(m15082H);
                        c38317s.m15063b();
                        break;
                    default:
                        throw new CSSParseException("Unsupported pseudo class: " + m15082H);
                }
                c38318t.m15056b(c38306h);
                return;
            }
            throw new CSSParseException("Invalid pseudo class");
        }

        /* renamed from: P */
        private int m15074P() {
            int i;
            if (m14750h()) {
                return this.f101748b;
            }
            int i2 = this.f101748b;
            int charAt = this.f101747a.charAt(i2);
            if (charAt == 45) {
                charAt = m14757a();
            }
            if ((charAt >= 65 && charAt <= 90) || ((charAt >= 97 && charAt <= 122) || charAt == 95)) {
                int m14757a = m14757a();
                while (true) {
                    if ((m14757a < 65 || m14757a > 90) && ((m14757a < 97 || m14757a > 122) && !((m14757a >= 48 && m14757a <= 57) || m14757a == 45 || m14757a == 95))) {
                        break;
                    }
                    m14757a = m14757a();
                }
                i = this.f101748b;
            } else {
                i = i2;
            }
            this.f101748b = i2;
            return i;
        }

        /* renamed from: F */
        String m15084F() {
            int m15087C;
            if (m14750h()) {
                return null;
            }
            char charAt = this.f101747a.charAt(this.f101748b);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            this.f101748b++;
            int intValue = m14746l().intValue();
            while (intValue != -1 && intValue != charAt) {
                if (intValue == 92) {
                    intValue = m14746l().intValue();
                    if (intValue != -1) {
                        if (intValue != 10 && intValue != 13 && intValue != 12) {
                            int m15087C2 = m15087C(intValue);
                            if (m15087C2 != -1) {
                                for (int i = 1; i <= 5 && (m15087C = m15087C((intValue = m14746l().intValue()))) != -1; i++) {
                                    m15087C2 = (m15087C2 * 16) + m15087C;
                                }
                                sb2.append((char) m15087C2);
                            }
                        } else {
                            intValue = m14746l().intValue();
                        }
                    }
                }
                sb2.append((char) intValue);
                intValue = m14746l().intValue();
            }
            return sb2.toString();
        }

        /* renamed from: H */
        String m15082H() {
            int m15074P = m15074P();
            int i = this.f101748b;
            if (m15074P == i) {
                return null;
            }
            String substring = this.f101747a.substring(i, m15074P);
            this.f101748b = m15074P;
            return substring;
        }

        /* renamed from: I */
        String m15081I() {
            char charAt;
            int m15087C;
            StringBuilder sb2 = new StringBuilder();
            while (!m14750h() && (charAt = this.f101747a.charAt(this.f101748b)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !m14747k(charAt) && !Character.isISOControl((int) charAt)) {
                this.f101748b++;
                if (charAt == '\\') {
                    if (!m14750h()) {
                        String str = this.f101747a;
                        int i = this.f101748b;
                        this.f101748b = i + 1;
                        charAt = str.charAt(i);
                        if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                            int m15087C2 = m15087C(charAt);
                            if (m15087C2 != -1) {
                                for (int i2 = 1; i2 <= 5 && !m14750h() && (m15087C = m15087C(this.f101747a.charAt(this.f101748b))) != -1; i2++) {
                                    this.f101748b++;
                                    m15087C2 = (m15087C2 * 16) + m15087C;
                                }
                                sb2.append((char) m15087C2);
                            }
                        }
                    }
                }
                sb2.append(charAt);
            }
            if (sb2.length() == 0) {
                return null;
            }
            return sb2.toString();
        }

        /* renamed from: J */
        String m15080J() {
            if (m14750h()) {
                return null;
            }
            int i = this.f101748b;
            int charAt = this.f101747a.charAt(i);
            int i2 = i;
            while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && !m14748j(charAt)) {
                if (!m14747k(charAt)) {
                    i2 = this.f101748b + 1;
                }
                charAt = m14757a();
            }
            if (this.f101748b > i) {
                return this.f101747a.substring(i, i2);
            }
            this.f101748b = i;
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:118:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:181:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:183:0x0133  */
        /* renamed from: M */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        boolean m15077M(p793n0.CSSParser.C38317s r11) throws p793n0.CSSParseException {
            /*
                Method dump skipped, instructions count: 310
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p793n0.CSSParser.C38301d.m15077M(n0.b$s):boolean");
        }

        /* renamed from: N */
        String m15076N() {
            if (m14750h()) {
                return null;
            }
            int i = this.f101748b;
            if (!m14751g("url(")) {
                return null;
            }
            m14758A();
            String m15084F = m15084F();
            if (m15084F == null) {
                m15084F = m15081I();
            }
            if (m15084F == null) {
                this.f101748b = i;
                return null;
            }
            m14758A();
            if (!m14750h() && !m14751g(")")) {
                this.f101748b = i;
                return null;
            }
            return m15084F;
        }
    }

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$e */
    /* loaded from: classes11.dex */
    public enum EnumC38303e {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$f */
    /* loaded from: classes11.dex */
    public enum EnumC38304f {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$g */
    /* loaded from: classes11.dex */
    public interface InterfaceC38305g {
        /* renamed from: a */
        boolean mo15071a(C38315q c38315q, SVG.AbstractC38362l0 abstractC38362l0);
    }

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$h */
    /* loaded from: classes11.dex */
    public static class C38306h implements InterfaceC38305g {

        /* renamed from: a */
        private int f101237a;

        /* renamed from: b */
        private int f101238b;

        /* renamed from: c */
        private boolean f101239c;

        /* renamed from: d */
        private boolean f101240d;

        /* renamed from: e */
        private String f101241e;

        C38306h(int i, int i2, boolean z, boolean z2, String str) {
            this.f101237a = i;
            this.f101238b = i2;
            this.f101239c = z;
            this.f101240d = z2;
            this.f101241e = str;
        }

        @Override // p793n0.CSSParser.InterfaceC38305g
        /* renamed from: a */
        public boolean mo15071a(C38315q c38315q, SVG.AbstractC38362l0 abstractC38362l0) {
            String str;
            int i;
            int i2;
            int i3;
            if (this.f101240d && this.f101241e == null) {
                str = abstractC38362l0.mo14991b();
            } else {
                str = this.f101241e;
            }
            SVG.InterfaceC38358j0 interfaceC38358j0 = abstractC38362l0.f101491b;
            if (interfaceC38358j0 != null) {
                Iterator<SVG.C38366n0> it = interfaceC38358j0.getChildren().iterator();
                i = 0;
                i2 = 0;
                while (it.hasNext()) {
                    SVG.AbstractC38362l0 abstractC38362l02 = (SVG.AbstractC38362l0) it.next();
                    if (abstractC38362l02 == abstractC38362l0) {
                        i = i2;
                    }
                    if (str == null || abstractC38362l02.mo14991b().equals(str)) {
                        i2++;
                    }
                }
            } else {
                i = 0;
                i2 = 1;
            }
            if (this.f101239c) {
                i3 = i + 1;
            } else {
                i3 = i2 - i;
            }
            int i4 = this.f101237a;
            if (i4 == 0) {
                if (i3 != this.f101238b) {
                    return false;
                }
                return true;
            }
            int i5 = this.f101238b;
            if ((i3 - i5) % i4 != 0) {
                return false;
            }
            if (Integer.signum(i3 - i5) != 0 && Integer.signum(i3 - this.f101238b) != Integer.signum(this.f101237a)) {
                return false;
            }
            return true;
        }

        public String toString() {
            String str;
            if (this.f101239c) {
                str = "";
            } else {
                str = "last-";
            }
            if (this.f101240d) {
                return String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.f101237a), Integer.valueOf(this.f101238b), this.f101241e);
            }
            return String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.f101237a), Integer.valueOf(this.f101238b));
        }
    }

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$i */
    /* loaded from: classes11.dex */
    public static class C38307i implements InterfaceC38305g {
        private C38307i() {
        }

        /* synthetic */ C38307i(C38298a c38298a) {
            this();
        }

        @Override // p793n0.CSSParser.InterfaceC38305g
        /* renamed from: a */
        public boolean mo15071a(C38315q c38315q, SVG.AbstractC38362l0 abstractC38362l0) {
            if (!(abstractC38362l0 instanceof SVG.InterfaceC38358j0) || ((SVG.InterfaceC38358j0) abstractC38362l0).getChildren().size() == 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "empty";
        }
    }

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$j */
    /* loaded from: classes11.dex */
    public enum EnumC38308j {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;
        

        /* renamed from: B */
        private static final Map<String, EnumC38308j> f101243B = new HashMap();

        static {
            EnumC38308j[] values;
            for (EnumC38308j enumC38308j : values()) {
                if (enumC38308j != UNSUPPORTED) {
                    f101243B.put(enumC38308j.name().replace('_', '-'), enumC38308j);
                }
            }
        }

        /* renamed from: b */
        public static EnumC38308j m15073b(String str) {
            EnumC38308j enumC38308j = f101243B.get(str);
            if (enumC38308j != null) {
                return enumC38308j;
            }
            return UNSUPPORTED;
        }
    }

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$k */
    /* loaded from: classes11.dex */
    public static class C38309k implements InterfaceC38305g {

        /* renamed from: a */
        private List<C38317s> f101269a;

        C38309k(List<C38317s> list) {
            this.f101269a = list;
        }

        @Override // p793n0.CSSParser.InterfaceC38305g
        /* renamed from: a */
        public boolean mo15071a(C38315q c38315q, SVG.AbstractC38362l0 abstractC38362l0) {
            for (C38317s c38317s : this.f101269a) {
                if (CSSParser.m15093l(c38315q, c38317s, abstractC38362l0)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        int m15072b() {
            int i = Integer.MIN_VALUE;
            for (C38317s c38317s : this.f101269a) {
                int i2 = c38317s.f101279b;
                if (i2 > i) {
                    i = i2;
                }
            }
            return i;
        }

        public String toString() {
            return "not(" + this.f101269a + ")";
        }
    }

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$l */
    /* loaded from: classes11.dex */
    public static class C38310l implements InterfaceC38305g {

        /* renamed from: a */
        private String f101270a;

        C38310l(String str) {
            this.f101270a = str;
        }

        @Override // p793n0.CSSParser.InterfaceC38305g
        /* renamed from: a */
        public boolean mo15071a(C38315q c38315q, SVG.AbstractC38362l0 abstractC38362l0) {
            return false;
        }

        public String toString() {
            return this.f101270a;
        }
    }

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$m */
    /* loaded from: classes11.dex */
    public static class C38311m implements InterfaceC38305g {

        /* renamed from: a */
        private boolean f101271a;

        /* renamed from: b */
        private String f101272b;

        public C38311m(boolean z, String str) {
            this.f101271a = z;
            this.f101272b = str;
        }

        @Override // p793n0.CSSParser.InterfaceC38305g
        /* renamed from: a */
        public boolean mo15071a(C38315q c38315q, SVG.AbstractC38362l0 abstractC38362l0) {
            String str;
            int i;
            if (this.f101271a && this.f101272b == null) {
                str = abstractC38362l0.mo14991b();
            } else {
                str = this.f101272b;
            }
            SVG.InterfaceC38358j0 interfaceC38358j0 = abstractC38362l0.f101491b;
            if (interfaceC38358j0 != null) {
                Iterator<SVG.C38366n0> it = interfaceC38358j0.getChildren().iterator();
                i = 0;
                while (it.hasNext()) {
                    SVG.AbstractC38362l0 abstractC38362l02 = (SVG.AbstractC38362l0) it.next();
                    if (str == null || abstractC38362l02.mo14991b().equals(str)) {
                        i++;
                    }
                }
            } else {
                i = 1;
            }
            if (i != 1) {
                return false;
            }
            return true;
        }

        public String toString() {
            if (this.f101271a) {
                return String.format("only-of-type <%s>", this.f101272b);
            }
            return String.format("only-child", new Object[0]);
        }
    }

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$n */
    /* loaded from: classes11.dex */
    public static class C38312n implements InterfaceC38305g {
        private C38312n() {
        }

        /* synthetic */ C38312n(C38298a c38298a) {
            this();
        }

        @Override // p793n0.CSSParser.InterfaceC38305g
        /* renamed from: a */
        public boolean mo15071a(C38315q c38315q, SVG.AbstractC38362l0 abstractC38362l0) {
            if (abstractC38362l0.f101491b == null) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "root";
        }
    }

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$o */
    /* loaded from: classes11.dex */
    public static class C38313o implements InterfaceC38305g {
        private C38313o() {
        }

        /* synthetic */ C38313o(C38298a c38298a) {
            this();
        }

        @Override // p793n0.CSSParser.InterfaceC38305g
        /* renamed from: a */
        public boolean mo15071a(C38315q c38315q, SVG.AbstractC38362l0 abstractC38362l0) {
            if (c38315q == null || abstractC38362l0 != c38315q.f101276a) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "target";
        }
    }

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$p */
    /* loaded from: classes11.dex */
    public static class C38314p {

        /* renamed from: a */
        C38317s f101273a;

        /* renamed from: b */
        SVG.C38337e0 f101274b;

        /* renamed from: c */
        EnumC38319u f101275c;

        C38314p(C38317s c38317s, SVG.C38337e0 c38337e0, EnumC38319u enumC38319u) {
            this.f101273a = c38317s;
            this.f101274b = c38337e0;
            this.f101275c = enumC38319u;
        }

        public String toString() {
            return String.valueOf(this.f101273a) + " {...} (src=" + this.f101275c + ")";
        }
    }

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$q */
    /* loaded from: classes11.dex */
    public static class C38315q {

        /* renamed from: a */
        SVG.AbstractC38362l0 f101276a;

        public String toString() {
            SVG.AbstractC38362l0 abstractC38362l0 = this.f101276a;
            if (abstractC38362l0 != null) {
                return String.format("<%s id=\"%s\">", abstractC38362l0.mo14991b(), this.f101276a.f101480c);
            }
            return "";
        }
    }

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$r */
    /* loaded from: classes11.dex */
    public static class C38316r {

        /* renamed from: a */
        private List<C38314p> f101277a = null;

        /* renamed from: a */
        void m15070a(C38314p c38314p) {
            if (this.f101277a == null) {
                this.f101277a = new ArrayList();
            }
            for (int i = 0; i < this.f101277a.size(); i++) {
                if (this.f101277a.get(i).f101273a.f101279b > c38314p.f101273a.f101279b) {
                    this.f101277a.add(i, c38314p);
                    return;
                }
            }
            this.f101277a.add(c38314p);
        }

        /* renamed from: b */
        public void m15069b(C38316r c38316r) {
            if (c38316r.f101277a == null) {
                return;
            }
            if (this.f101277a == null) {
                this.f101277a = new ArrayList(c38316r.f101277a.size());
            }
            for (C38314p c38314p : c38316r.f101277a) {
                m15070a(c38314p);
            }
        }

        /* renamed from: c */
        public List<C38314p> m15068c() {
            return this.f101277a;
        }

        /* renamed from: d */
        public boolean m15067d() {
            List<C38314p> list = this.f101277a;
            if (list != null && !list.isEmpty()) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public void m15066e(EnumC38319u enumC38319u) {
            List<C38314p> list = this.f101277a;
            if (list == null) {
                return;
            }
            Iterator<C38314p> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f101275c == enumC38319u) {
                    it.remove();
                }
            }
        }

        /* renamed from: f */
        public int m15065f() {
            List<C38314p> list = this.f101277a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.f101277a == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            for (C38314p c38314p : this.f101277a) {
                sb2.append(c38314p.toString());
                sb2.append('\n');
            }
            return sb2.toString();
        }
    }

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$t */
    /* loaded from: classes11.dex */
    public static class C38318t {

        /* renamed from: a */
        EnumC38303e f101280a;

        /* renamed from: b */
        String f101281b;

        /* renamed from: c */
        List<C38299b> f101282c = null;

        /* renamed from: d */
        List<InterfaceC38305g> f101283d = null;

        C38318t(EnumC38303e enumC38303e, String str) {
            this.f101280a = null;
            this.f101281b = null;
            this.f101280a = enumC38303e == null ? EnumC38303e.DESCENDANT : enumC38303e;
            this.f101281b = str;
        }

        /* renamed from: a */
        void m15057a(String str, EnumC38300c enumC38300c, String str2) {
            if (this.f101282c == null) {
                this.f101282c = new ArrayList();
            }
            this.f101282c.add(new C38299b(str, enumC38300c, str2));
        }

        /* renamed from: b */
        void m15056b(InterfaceC38305g interfaceC38305g) {
            if (this.f101283d == null) {
                this.f101283d = new ArrayList();
            }
            this.f101283d.add(interfaceC38305g);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            EnumC38303e enumC38303e = this.f101280a;
            if (enumC38303e == EnumC38303e.CHILD) {
                sb2.append("> ");
            } else if (enumC38303e == EnumC38303e.FOLLOWS) {
                sb2.append("+ ");
            }
            String str = this.f101281b;
            if (str == null) {
                str = ProxyConfig.MATCH_ALL_SCHEMES;
            }
            sb2.append(str);
            List<C38299b> list = this.f101282c;
            if (list != null) {
                for (C38299b c38299b : list) {
                    sb2.append('[');
                    sb2.append(c38299b.f101211a);
                    int i = C38298a.f101209a[c38299b.f101212b.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                sb2.append("|=");
                                sb2.append(c38299b.f101213c);
                            }
                        } else {
                            sb2.append("~=");
                            sb2.append(c38299b.f101213c);
                        }
                    } else {
                        sb2.append(C20517nb.f52173T);
                        sb2.append(c38299b.f101213c);
                    }
                    sb2.append(']');
                }
            }
            List<InterfaceC38305g> list2 = this.f101283d;
            if (list2 != null) {
                for (InterfaceC38305g interfaceC38305g : list2) {
                    sb2.append(':');
                    sb2.append(interfaceC38305g);
                }
            }
            return sb2.toString();
        }
    }

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$u */
    /* loaded from: classes11.dex */
    public enum EnumC38319u {
        Document,
        RenderOptions
    }

    public CSSParser(EnumC38319u enumC38319u) {
        this(EnumC38304f.screen, enumC38319u);
    }

    /* renamed from: a */
    private static int m15104a(List<SVG.InterfaceC38358j0> list, int i, SVG.AbstractC38362l0 abstractC38362l0) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        SVG.InterfaceC38358j0 interfaceC38358j0 = list.get(i);
        SVG.InterfaceC38358j0 interfaceC38358j02 = abstractC38362l0.f101491b;
        if (interfaceC38358j0 != interfaceC38358j02) {
            return -1;
        }
        for (SVG.C38366n0 c38366n0 : interfaceC38358j02.getChildren()) {
            if (c38366n0 == abstractC38362l0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: b */
    public static boolean m15103b(String str, EnumC38304f enumC38304f) {
        C38301d c38301d = new C38301d(str);
        c38301d.m14758A();
        return m15102c(m15097h(c38301d), enumC38304f);
    }

    /* renamed from: c */
    private static boolean m15102c(List<EnumC38304f> list, EnumC38304f enumC38304f) {
        for (EnumC38304f enumC38304f2 : list) {
            if (enumC38304f2 != EnumC38304f.all) {
                if (enumC38304f2 == enumC38304f) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m15100e(C38316r c38316r, C38301d c38301d) throws CSSParseException {
        String m15082H = c38301d.m15082H();
        c38301d.m14758A();
        if (m15082H != null) {
            if (!this.f101208c && m15082H.equals("media")) {
                List<EnumC38304f> m15097h = m15097h(c38301d);
                if (c38301d.m14752f('{')) {
                    c38301d.m14758A();
                    if (m15102c(m15097h, this.f101206a)) {
                        this.f101208c = true;
                        c38316r.m15069b(m15095j(c38301d));
                        this.f101208c = false;
                    } else {
                        m15095j(c38301d);
                    }
                    if (!c38301d.m14750h() && !c38301d.m14752f('}')) {
                        throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
                    }
                } else {
                    throw new CSSParseException("Invalid @media rule: missing rule set");
                }
            } else if (!this.f101208c && m15082H.equals("import")) {
                String m15076N = c38301d.m15076N();
                if (m15076N == null) {
                    m15076N = c38301d.m15084F();
                }
                if (m15076N != null) {
                    c38301d.m14758A();
                    m15097h(c38301d);
                    if (!c38301d.m14750h() && !c38301d.m14752f(';')) {
                        throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
                    }
                    SVG.m15029k();
                } else {
                    throw new CSSParseException("Invalid @import rule: expected string or url()");
                }
            } else {
                m15089p("Ignoring @%s rule", m15082H);
                m15090o(c38301d);
            }
            c38301d.m14758A();
            return;
        }
        throw new CSSParseException("Invalid '@' rule");
    }

    /* renamed from: f */
    public static List<String> m15099f(String str) {
        C38301d c38301d = new C38301d(str);
        ArrayList arrayList = null;
        while (!c38301d.m14750h()) {
            String m14740r = c38301d.m14740r();
            if (m14740r != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m14740r);
                c38301d.m14758A();
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private SVG.C38337e0 m15098g(C38301d c38301d) throws CSSParseException {
        SVG.C38337e0 c38337e0 = new SVG.C38337e0();
        do {
            String m15082H = c38301d.m15082H();
            c38301d.m14758A();
            if (c38301d.m14752f(':')) {
                c38301d.m14758A();
                String m15080J = c38301d.m15080J();
                if (m15080J != null) {
                    c38301d.m14758A();
                    if (c38301d.m14752f('!')) {
                        c38301d.m14758A();
                        if (c38301d.m14751g("important")) {
                            c38301d.m14758A();
                        } else {
                            throw new CSSParseException("Malformed rule set: found unexpected '!'");
                        }
                    }
                    c38301d.m14752f(';');
                    SVGParser.m14842S0(c38337e0, m15082H, m15080J);
                    c38301d.m14758A();
                    if (c38301d.m14750h()) {
                        break;
                    }
                } else {
                    throw new CSSParseException("Expected property value");
                }
            } else {
                throw new CSSParseException("Expected ':'");
            }
        } while (!c38301d.m14752f('}'));
        return c38337e0;
    }

    /* renamed from: h */
    private static List<EnumC38304f> m15097h(C38301d c38301d) {
        String m14735w;
        ArrayList arrayList = new ArrayList();
        while (!c38301d.m14750h() && (m14735w = c38301d.m14735w()) != null) {
            try {
                arrayList.add(EnumC38304f.valueOf(m14735w));
            } catch (IllegalArgumentException unused) {
            }
            if (!c38301d.m14732z()) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    private boolean m15096i(C38316r c38316r, C38301d c38301d) throws CSSParseException {
        List<C38317s> m15078L = c38301d.m15078L();
        if (m15078L != null && !m15078L.isEmpty()) {
            if (c38301d.m14752f('{')) {
                c38301d.m14758A();
                SVG.C38337e0 m15098g = m15098g(c38301d);
                c38301d.m14758A();
                for (C38317s c38317s : m15078L) {
                    c38316r.m15070a(new C38314p(c38317s, m15098g, this.f101207b));
                }
                return true;
            }
            throw new CSSParseException("Malformed rule block: expected '{'");
        }
        return false;
    }

    /* renamed from: j */
    private C38316r m15095j(C38301d c38301d) {
        C38316r c38316r = new C38316r();
        while (!c38301d.m14750h()) {
            try {
                if (!c38301d.m14751g("<!--") && !c38301d.m14751g("-->")) {
                    if (c38301d.m14752f('@')) {
                        m15100e(c38316r, c38301d);
                    } else if (!m15096i(c38316r, c38301d)) {
                        break;
                    }
                }
            } catch (CSSParseException e) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e.getMessage());
            }
        }
        return c38316r;
    }

    /* renamed from: k */
    private static boolean m15094k(C38315q c38315q, C38317s c38317s, int i, List<SVG.InterfaceC38358j0> list, int i2, SVG.AbstractC38362l0 abstractC38362l0) {
        C38318t m15060e = c38317s.m15060e(i);
        if (!m15091n(c38315q, m15060e, list, i2, abstractC38362l0)) {
            return false;
        }
        EnumC38303e enumC38303e = m15060e.f101280a;
        if (enumC38303e == EnumC38303e.DESCENDANT) {
            if (i == 0) {
                return true;
            }
            while (i2 >= 0) {
                if (m15092m(c38315q, c38317s, i - 1, list, i2)) {
                    return true;
                }
                i2--;
            }
            return false;
        } else if (enumC38303e == EnumC38303e.CHILD) {
            return m15092m(c38315q, c38317s, i - 1, list, i2);
        } else {
            int m15104a = m15104a(list, i2, abstractC38362l0);
            if (m15104a <= 0) {
                return false;
            }
            return m15094k(c38315q, c38317s, i - 1, list, i2, (SVG.AbstractC38362l0) abstractC38362l0.f101491b.getChildren().get(m15104a - 1));
        }
    }

    /* renamed from: l */
    public static boolean m15093l(C38315q c38315q, C38317s c38317s, SVG.AbstractC38362l0 abstractC38362l0) {
        ArrayList arrayList = new ArrayList();
        for (SVG.InterfaceC38358j0 interfaceC38358j0 = abstractC38362l0.f101491b; interfaceC38358j0 != null; interfaceC38358j0 = ((SVG.C38366n0) interfaceC38358j0).f101491b) {
            arrayList.add(0, interfaceC38358j0);
        }
        int size = arrayList.size() - 1;
        if (c38317s.m15058g() == 1) {
            return m15091n(c38315q, c38317s.m15060e(0), arrayList, size, abstractC38362l0);
        }
        return m15094k(c38315q, c38317s, c38317s.m15058g() - 1, arrayList, size, abstractC38362l0);
    }

    /* renamed from: m */
    private static boolean m15092m(C38315q c38315q, C38317s c38317s, int i, List<SVG.InterfaceC38358j0> list, int i2) {
        C38318t m15060e = c38317s.m15060e(i);
        SVG.AbstractC38362l0 abstractC38362l0 = (SVG.AbstractC38362l0) list.get(i2);
        if (!m15091n(c38315q, m15060e, list, i2, abstractC38362l0)) {
            return false;
        }
        EnumC38303e enumC38303e = m15060e.f101280a;
        if (enumC38303e == EnumC38303e.DESCENDANT) {
            if (i == 0) {
                return true;
            }
            while (i2 > 0) {
                i2--;
                if (m15092m(c38315q, c38317s, i - 1, list, i2)) {
                    return true;
                }
            }
            return false;
        } else if (enumC38303e == EnumC38303e.CHILD) {
            return m15092m(c38315q, c38317s, i - 1, list, i2 - 1);
        } else {
            int m15104a = m15104a(list, i2, abstractC38362l0);
            if (m15104a <= 0) {
                return false;
            }
            return m15094k(c38315q, c38317s, i - 1, list, i2, (SVG.AbstractC38362l0) abstractC38362l0.f101491b.getChildren().get(m15104a - 1));
        }
    }

    /* renamed from: n */
    private static boolean m15091n(C38315q c38315q, C38318t c38318t, List<SVG.InterfaceC38358j0> list, int i, SVG.AbstractC38362l0 abstractC38362l0) {
        List<String> list2;
        String str = c38318t.f101281b;
        if (str != null && !str.equals(abstractC38362l0.mo14991b().toLowerCase(Locale.US))) {
            return false;
        }
        List<C38299b> list3 = c38318t.f101282c;
        if (list3 != null) {
            for (C38299b c38299b : list3) {
                String str2 = c38299b.f101211a;
                str2.hashCode();
                if (!str2.equals("id")) {
                    if (!str2.equals(C26484a.f69235r) || (list2 = abstractC38362l0.f101484g) == null || !list2.contains(c38299b.f101213c)) {
                        return false;
                    }
                } else if (!c38299b.f101213c.equals(abstractC38362l0.f101480c)) {
                    return false;
                }
            }
        }
        List<InterfaceC38305g> list4 = c38318t.f101283d;
        if (list4 != null) {
            for (InterfaceC38305g interfaceC38305g : list4) {
                if (!interfaceC38305g.mo15071a(c38315q, abstractC38362l0)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: o */
    private void m15090o(C38301d c38301d) {
        int i = 0;
        while (!c38301d.m14750h()) {
            int intValue = c38301d.m14746l().intValue();
            if (intValue == 59 && i == 0) {
                return;
            }
            if (intValue == 123) {
                i++;
            } else if (intValue == 125 && i > 0 && i - 1 == 0) {
                return;
            }
        }
    }

    /* renamed from: p */
    private static void m15089p(String str, Object... objArr) {
        Log.w("CSSParser", String.format(str, objArr));
    }

    /* renamed from: d */
    public C38316r m15101d(String str) {
        C38301d c38301d = new C38301d(str);
        c38301d.m14758A();
        return m15095j(c38301d);
    }

    public CSSParser(EnumC38304f enumC38304f, EnumC38319u enumC38319u) {
        this.f101208c = false;
        this.f101206a = enumC38304f;
        this.f101207b = enumC38319u;
    }

    /* compiled from: CSSParser.java */
    /* renamed from: n0.b$s */
    /* loaded from: classes11.dex */
    public static class C38317s {

        /* renamed from: a */
        List<C38318t> f101278a;

        /* renamed from: b */
        int f101279b;

        private C38317s() {
            this.f101278a = null;
            this.f101279b = 0;
        }

        /* renamed from: a */
        void m15064a(C38318t c38318t) {
            if (this.f101278a == null) {
                this.f101278a = new ArrayList();
            }
            this.f101278a.add(c38318t);
        }

        /* renamed from: b */
        void m15063b() {
            this.f101279b += 1000;
        }

        /* renamed from: c */
        void m15062c() {
            this.f101279b++;
        }

        /* renamed from: d */
        void m15061d() {
            this.f101279b += 1000000;
        }

        /* renamed from: e */
        C38318t m15060e(int i) {
            return this.f101278a.get(i);
        }

        /* renamed from: f */
        boolean m15059f() {
            List<C38318t> list = this.f101278a;
            if (list != null && !list.isEmpty()) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        int m15058g() {
            List<C38318t> list = this.f101278a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            for (C38318t c38318t : this.f101278a) {
                sb2.append(c38318t);
                sb2.append(' ');
            }
            sb2.append('[');
            sb2.append(this.f101279b);
            sb2.append(']');
            return sb2.toString();
        }

        /* synthetic */ C38317s(C38298a c38298a) {
            this();
        }
    }
}
