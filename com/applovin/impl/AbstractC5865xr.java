package com.applovin.impl;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.applovin.impl.AbstractC5865xr;
import com.applovin.impl.C3989a5;
import com.ironsource.C21114v8;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.applovin.impl.xr */
/* loaded from: classes2.dex */
public abstract class AbstractC5865xr {

    /* renamed from: a */
    public static final Pattern f12172a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    private static final Pattern f12173b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    private static final Map f12174c;

    /* renamed from: d */
    private static final Map f12175d;

    /* renamed from: com.applovin.impl.xr$b */
    /* loaded from: classes2.dex */
    public static class C5867b {

        /* renamed from: c */
        private static final Comparator f12176c = new Comparator() { // from class: com.applovin.impl.v80
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m92928a;
                m92928a = AbstractC5865xr.C5867b.m92928a((AbstractC5865xr.C5867b) obj, (AbstractC5865xr.C5867b) obj2);
                return m92928a;
            }
        };

        /* renamed from: a */
        private final C5868c f12177a;

        /* renamed from: b */
        private final int f12178b;

        private C5867b(C5868c c5868c, int i) {
            this.f12177a = c5868c;
            this.f12178b = i;
        }

        /* renamed from: a */
        public static /* synthetic */ int m92928a(C5867b c5867b, C5867b c5867b2) {
            return Integer.compare(c5867b.f12177a.f12180b, c5867b2.f12177a.f12180b);
        }
    }

    /* renamed from: com.applovin.impl.xr$d */
    /* loaded from: classes2.dex */
    public static final class C5869d implements Comparable {

        /* renamed from: a */
        public final int f12183a;

        /* renamed from: b */
        public final C5725vr f12184b;

        public C5869d(int i, C5725vr c5725vr) {
            this.f12183a = i;
            this.f12184b = c5725vr;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C5869d c5869d) {
            return Integer.compare(this.f12183a, c5869d.f12183a);
        }
    }

    /* renamed from: com.applovin.impl.xr$e */
    /* loaded from: classes2.dex */
    public static final class C5870e {

        /* renamed from: c */
        public CharSequence f12187c;

        /* renamed from: a */
        public long f12185a = 0;

        /* renamed from: b */
        public long f12186b = 0;

        /* renamed from: d */
        public int f12188d = 2;

        /* renamed from: e */
        public float f12189e = -3.4028235E38f;

        /* renamed from: f */
        public int f12190f = 1;

        /* renamed from: g */
        public int f12191g = 0;

        /* renamed from: h */
        public float f12192h = -3.4028235E38f;

        /* renamed from: i */
        public int f12193i = Integer.MIN_VALUE;

        /* renamed from: j */
        public float f12194j = 1.0f;

        /* renamed from: k */
        public int f12195k = Integer.MIN_VALUE;

        /* renamed from: a */
        private static float m92921a(float f, int i) {
            int i2 = (f > (-3.4028235E38f) ? 1 : (f == (-3.4028235E38f) ? 0 : -1));
            if (i2 == 0 || i != 0 || (f >= 0.0f && f <= 1.0f)) {
                return i2 != 0 ? f : i == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        /* renamed from: b */
        private static float m92917b(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        /* renamed from: c */
        private static int m92916c(int i) {
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return 1;
                        }
                        return 2;
                    }
                    return 0;
                }
                return 2;
            }
            return 0;
        }

        /* renamed from: a */
        private static Layout.Alignment m92920a(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                AbstractC5063oc.m96800d("WebvttCueParser", "Unknown textAlignment: " + i);
                                return null;
                            }
                        }
                    }
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        /* renamed from: b */
        public C3989a5.C3991b m92918b() {
            float f = this.f12192h;
            if (f == -3.4028235E38f) {
                f = m92917b(this.f12188d);
            }
            int i = this.f12193i;
            if (i == Integer.MIN_VALUE) {
                i = m92916c(this.f12188d);
            }
            C3989a5.C3991b m101036c = new C3989a5.C3991b().m101039b(m92920a(this.f12188d)).m101048a(m92921a(this.f12189e, this.f12190f), this.f12190f).m101047a(this.f12191g).m101042b(f).m101040b(i).m101034d(Math.min(this.f12194j, m92919a(i, f))).m101036c(this.f12195k);
            CharSequence charSequence = this.f12187c;
            if (charSequence != null) {
                m101036c.m101044a(charSequence);
            }
            return m101036c;
        }

        /* renamed from: a */
        private static float m92919a(int i, float f) {
            if (i != 0) {
                if (i == 1) {
                    return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
                } else if (i == 2) {
                    return f;
                } else {
                    throw new IllegalStateException(String.valueOf(i));
                }
            }
            return 1.0f - f;
        }

        /* renamed from: a */
        public C5802wr m92922a() {
            return new C5802wr(m92918b().m101050a(), this.f12185a, this.f12186b);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f12174c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f12175d = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m92950a(SpannableStringBuilder spannableStringBuilder, Set set, int i, int i2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = f12174c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str)).intValue()), i, i2, 33);
            } else {
                Map map2 = f12175d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str)).intValue()), i, i2, 33);
                }
            }
        }
    }

    /* renamed from: b */
    private static int m92937b(List list, String str, C5868c c5868c) {
        List m92940a = m92940a(list, str, c5868c);
        for (int i = 0; i < m92940a.size(); i++) {
            C5725vr c5725vr = ((C5869d) m92940a.get(i)).f12184b;
            if (c5725vr.m93770g() != -1) {
                return c5725vr.m93770g();
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static C3989a5.C3991b m92936c(String str) {
        C5870e c5870e = new C5870e();
        m92943a(str, c5870e);
        return c5870e.m92918b();
    }

    /* renamed from: d */
    private static int m92934d(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                AbstractC5063oc.m96800d("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: e */
    private static int m92933e(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                AbstractC5063oc.m96800d("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: f */
    private static int m92932f(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            default:
                AbstractC5063oc.m96800d("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    /* renamed from: g */
    private static int m92931g(String str) {
        str.hashCode();
        if (!str.equals("lr")) {
            if (!str.equals("rl")) {
                AbstractC5063oc.m96800d("WebvttCueParser", "Invalid 'vertical' value: " + str);
                return Integer.MIN_VALUE;
            }
            return 1;
        }
        return 2;
    }

    /* renamed from: c */
    private static void m92935c(String str, C5870e c5870e) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            c5870e.f12193i = m92933e(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        c5870e.f12192h = AbstractC5993zr.m92308a(str);
    }

    /* renamed from: b */
    private static boolean m92939b(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals("b")) {
                    c = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM)) {
                    c = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals("i")) {
                    c = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals(ApsMetricsDataMap.APSMETRICS_FIELD_URL)) {
                    c = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals("v")) {
                    c = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    private static void m92938b(String str, C5870e c5870e) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            c5870e.f12191g = m92934d(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            c5870e.f12189e = AbstractC5993zr.m92308a(str);
            c5870e.f12190f = 0;
            return;
        }
        c5870e.f12189e = Integer.parseInt(str);
        c5870e.f12190f = 1;
    }

    /* renamed from: a */
    private static void m92945a(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                spannableStringBuilder.append('>');
                return;
            case 1:
                spannableStringBuilder.append('<');
                return;
            case 2:
                spannableStringBuilder.append('&');
                return;
            case 3:
                spannableStringBuilder.append(' ');
                return;
            default:
                AbstractC5063oc.m96800d("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
    }

    /* renamed from: com.applovin.impl.xr$c */
    /* loaded from: classes2.dex */
    public static final class C5868c {

        /* renamed from: a */
        public final String f12179a;

        /* renamed from: b */
        public final int f12180b;

        /* renamed from: c */
        public final String f12181c;

        /* renamed from: d */
        public final Set f12182d;

        private C5868c(String str, int i, String str2, Set set) {
            this.f12180b = i;
            this.f12179a = str;
            this.f12181c = str2;
            this.f12182d = set;
        }

        /* renamed from: a */
        public static C5868c m92924a(String str, int i) {
            String str2;
            String trim = str.trim();
            AbstractC4100b1.m100580a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] m93013a = AbstractC5863xp.m93013a(trim, "\\.");
            String str3 = m93013a[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < m93013a.length; i2++) {
                hashSet.add(m93013a[i2]);
            }
            return new C5868c(str3, i, str2, hashSet);
        }

        /* renamed from: a */
        public static C5868c m92925a() {
            return new C5868c("", 0, "", Collections.emptySet());
        }
    }

    /* renamed from: a */
    private static void m92951a(SpannableStringBuilder spannableStringBuilder, String str, C5868c c5868c, List list, List list2) {
        int m92937b = m92937b(list2, str, c5868c);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, C5867b.f12176c);
        int i = c5868c.f12180b;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if ("rt".equals(((C5867b) arrayList.get(i3)).f12177a.f12179a)) {
                C5867b c5867b = (C5867b) arrayList.get(i3);
                int m92953a = m92953a(m92937b(list2, str, c5867b.f12177a), m92937b, 1);
                int i4 = c5867b.f12177a.f12180b - i2;
                int i5 = c5867b.f12178b - i2;
                CharSequence subSequence = spannableStringBuilder.subSequence(i4, i5);
                spannableStringBuilder.delete(i4, i5);
                spannableStringBuilder.setSpan(new C5974zi(subSequence.toString(), m92953a), i, i4, 33);
                i2 += subSequence.length();
                i = i4;
            }
        }
    }

    /* renamed from: a */
    private static void m92944a(String str, C5868c c5868c, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i = c5868c.f12180b;
        int length = spannableStringBuilder.length();
        String str2 = c5868c.f12179a;
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c = 0;
                    break;
                }
                break;
            case 98:
                if (str2.equals("b")) {
                    c = 1;
                    break;
                }
                break;
            case 99:
                if (str2.equals(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM)) {
                    c = 2;
                    break;
                }
                break;
            case 105:
                if (str2.equals("i")) {
                    c = 3;
                    break;
                }
                break;
            case 117:
                if (str2.equals(ApsMetricsDataMap.APSMETRICS_FIELD_URL)) {
                    c = 4;
                    break;
                }
                break;
            case 118:
                if (str2.equals("v")) {
                    c = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c = 6;
                    break;
                }
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case 2:
                m92950a(spannableStringBuilder, c5868c.f12182d, i, length);
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 7:
                m92951a(spannableStringBuilder, str, c5868c, list, list2);
                break;
            default:
                return;
        }
        List m92940a = m92940a(list2, str, c5868c);
        for (int i2 = 0; i2 < m92940a.size(); i2++) {
            m92952a(spannableStringBuilder, ((C5869d) m92940a.get(i2)).f12184b, i, length);
        }
    }

    /* renamed from: a */
    private static void m92952a(SpannableStringBuilder spannableStringBuilder, C5725vr c5725vr, int i, int i2) {
        if (c5725vr == null) {
            return;
        }
        if (c5725vr.m93769h() != -1) {
            AbstractC5127pk.m96534a(spannableStringBuilder, new StyleSpan(c5725vr.m93769h()), i, i2, 33);
        }
        if (c5725vr.m93766k()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (c5725vr.m93765l()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (c5725vr.m93767j()) {
            AbstractC5127pk.m96534a(spannableStringBuilder, new ForegroundColorSpan(c5725vr.m93780c()), i, i2, 33);
        }
        if (c5725vr.m93768i()) {
            AbstractC5127pk.m96534a(spannableStringBuilder, new BackgroundColorSpan(c5725vr.m93792a()), i, i2, 33);
        }
        if (c5725vr.m93776d() != null) {
            AbstractC5127pk.m96534a(spannableStringBuilder, new TypefaceSpan(c5725vr.m93776d()), i, i2, 33);
        }
        int m93771f = c5725vr.m93771f();
        if (m93771f == 1) {
            AbstractC5127pk.m96534a(spannableStringBuilder, new AbsoluteSizeSpan((int) c5725vr.m93772e(), true), i, i2, 33);
        } else if (m93771f == 2) {
            AbstractC5127pk.m96534a(spannableStringBuilder, new RelativeSizeSpan(c5725vr.m93772e()), i, i2, 33);
        } else if (m93771f == 3) {
            AbstractC5127pk.m96534a(spannableStringBuilder, new RelativeSizeSpan(c5725vr.m93772e() / 100.0f), i, i2, 33);
        }
        if (c5725vr.m93784b()) {
            spannableStringBuilder.setSpan(new C5061oa(), i, i2, 33);
        }
    }

    /* renamed from: a */
    private static int m92946a(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    /* renamed from: a */
    private static int m92953a(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private static String m92947a(String str) {
        String trim = str.trim();
        AbstractC4100b1.m100580a(!trim.isEmpty());
        return AbstractC5863xp.m92984b(trim, "[ \\.]")[0];
    }

    /* renamed from: a */
    public static C5802wr m92949a(C4066ah c4066ah, List list) {
        String m100773l = c4066ah.m100773l();
        if (m100773l == null) {
            return null;
        }
        Pattern pattern = f12172a;
        Matcher matcher = pattern.matcher(m100773l);
        if (matcher.matches()) {
            return m92941a((String) null, matcher, c4066ah, list);
        }
        String m100773l2 = c4066ah.m100773l();
        if (m100773l2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(m100773l2);
        if (matcher2.matches()) {
            return m92941a(m100773l.trim(), matcher2, c4066ah, list);
        }
        return null;
    }

    /* renamed from: a */
    private static C5802wr m92941a(String str, Matcher matcher, C4066ah c4066ah, List list) {
        C5870e c5870e = new C5870e();
        try {
            c5870e.f12185a = AbstractC5993zr.m92306b((String) AbstractC4100b1.m100583a((Object) matcher.group(1)));
            c5870e.f12186b = AbstractC5993zr.m92306b((String) AbstractC4100b1.m100583a((Object) matcher.group(2)));
            m92943a((String) AbstractC4100b1.m100583a((Object) matcher.group(3)), c5870e);
            StringBuilder sb2 = new StringBuilder();
            String m100773l = c4066ah.m100773l();
            while (!TextUtils.isEmpty(m100773l)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(m100773l.trim());
                m100773l = c4066ah.m100773l();
            }
            c5870e.f12187c = m92942a(str, sb2.toString(), list);
            return c5870e.m92922a();
        } catch (NumberFormatException unused) {
            AbstractC5063oc.m96800d("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* renamed from: a */
    public static C3989a5 m92948a(CharSequence charSequence) {
        C5870e c5870e = new C5870e();
        c5870e.f12187c = charSequence;
        return c5870e.m92918b().m101050a();
    }

    /* renamed from: a */
    public static SpannedString m92942a(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    m92945a(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    boolean z = str2.charAt(i2) == '/';
                    i2 = m92946a(str2, i2);
                    int i3 = i2 - 2;
                    boolean z2 = str2.charAt(i3) == '/';
                    int i4 = i + (z ? 2 : 1);
                    if (!z2) {
                        i3 = i2 - 1;
                    }
                    String substring = str2.substring(i4, i3);
                    if (!substring.trim().isEmpty()) {
                        String m92947a = m92947a(substring);
                        if (m92939b(m92947a)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    C5868c c5868c = (C5868c) arrayDeque.pop();
                                    m92944a(str, c5868c, arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new C5867b(c5868c, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (c5868c.f12179a.equals(m92947a)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(C5868c.m92924a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m92944a(str, (C5868c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m92944a(str, C5868c.m92925a(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* renamed from: a */
    private static void m92943a(String str, C5870e c5870e) {
        Matcher matcher = f12173b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) AbstractC4100b1.m100583a((Object) matcher.group(1));
            String str3 = (String) AbstractC4100b1.m100583a((Object) matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    m92938b(str3, c5870e);
                } else if ("align".equals(str2)) {
                    c5870e.f12188d = m92932f(str3);
                } else if (C21114v8.C21122h.f54038L.equals(str2)) {
                    m92935c(str3, c5870e);
                } else if ("size".equals(str2)) {
                    c5870e.f12194j = AbstractC5993zr.m92308a(str3);
                } else if ("vertical".equals(str2)) {
                    c5870e.f12195k = m92931g(str3);
                } else {
                    AbstractC5063oc.m96800d("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                AbstractC5063oc.m96800d("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* renamed from: a */
    private static List m92940a(List list, String str, C5868c c5868c) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C5725vr c5725vr = (C5725vr) list.get(i);
            int m93787a = c5725vr.m93787a(str, c5868c.f12179a, c5868c.f12182d, c5868c.f12181c);
            if (m93787a > 0) {
                arrayList.add(new C5869d(m93787a, c5725vr));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
