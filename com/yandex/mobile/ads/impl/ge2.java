package com.yandex.mobile.ads.impl;

import android.graphics.Color;
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
import androidx.annotation.Nullable;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C21114v8;
import com.yandex.mobile.ads.impl.C31840xt;
import com.yandex.mobile.ads.impl.ge2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class ge2 {

    /* renamed from: a */
    public static final Pattern f79619a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    private static final Pattern f79620b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    private static final Map<String, Integer> f79621c;

    /* renamed from: d */
    private static final Map<String, Integer> f79622d;

    /* renamed from: com.yandex.mobile.ads.impl.ge2$a */
    /* loaded from: classes8.dex */
    public static class C30384a {

        /* renamed from: c */
        private static final Comparator<C30384a> f79623c = new Comparator() { // from class: com.yandex.mobile.ads.impl.hp2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m33851a;
                m33851a = ge2.C30384a.m33851a((ge2.C30384a) obj, (ge2.C30384a) obj2);
                return m33851a;
            }
        };

        /* renamed from: a */
        private final C30385b f79624a;

        /* renamed from: b */
        private final int f79625b;

        /* renamed from: a */
        public static /* synthetic */ int m33851a(C30384a c30384a, C30384a c30384a2) {
            return Integer.compare(c30384a.f79624a.f79627b, c30384a2.f79624a.f79627b);
        }

        private C30384a(C30385b c30385b, int i) {
            this.f79624a = c30385b;
            this.f79625b = i;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ge2$b */
    /* loaded from: classes8.dex */
    public static final class C30385b {

        /* renamed from: a */
        public final String f79626a;

        /* renamed from: b */
        public final int f79627b;

        /* renamed from: c */
        public final String f79628c;

        /* renamed from: d */
        public final Set<String> f79629d;

        private C30385b(String str, int i, String str2, Set<String> set) {
            this.f79627b = i;
            this.f79626a = str;
            this.f79628c = str2;
            this.f79629d = set;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ge2$c */
    /* loaded from: classes8.dex */
    public static final class C30386c implements Comparable<C30386c> {

        /* renamed from: b */
        public final int f79630b;

        /* renamed from: c */
        public final ee2 f79631c;

        public C30386c(int i, ee2 ee2Var) {
            this.f79630b = i;
            this.f79631c = ee2Var;
        }

        @Override // java.lang.Comparable
        public final int compareTo(C30386c c30386c) {
            return Integer.compare(this.f79630b, c30386c.f79630b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ge2$d */
    /* loaded from: classes8.dex */
    public static final class C30387d {

        /* renamed from: c */
        public CharSequence f79634c;

        /* renamed from: a */
        public long f79632a = 0;

        /* renamed from: b */
        public long f79633b = 0;

        /* renamed from: d */
        public int f79635d = 2;

        /* renamed from: e */
        public float f79636e = -3.4028235E38f;

        /* renamed from: f */
        public int f79637f = 1;

        /* renamed from: g */
        public int f79638g = 0;

        /* renamed from: h */
        public float f79639h = -3.4028235E38f;

        /* renamed from: i */
        public int f79640i = Integer.MIN_VALUE;

        /* renamed from: j */
        public float f79641j = 1.0f;

        /* renamed from: k */
        public int f79642k = Integer.MIN_VALUE;

        /* JADX WARN: Code restructure failed: missing block: B:102:0x0072, code lost:
            if (r8 == 0) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x00ba  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.yandex.mobile.ads.impl.C31840xt.C31841a m33846a() {
            /*
                r13 = this;
                float r0 = r13.f79639h
                r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                r3 = 1056964608(0x3f000000, float:0.5)
                r4 = 0
                r5 = 5
                r6 = 4
                r7 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L11
                goto L1c
            L11:
                int r0 = r13.f79635d
                if (r0 == r6) goto L1b
                if (r0 == r5) goto L19
                r0 = r3
                goto L1c
            L19:
                r0 = r7
                goto L1c
            L1b:
                r0 = r4
            L1c:
                int r2 = r13.f79640i
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 3
                r10 = 2
                r11 = 1
                if (r2 == r8) goto L26
                goto L35
            L26:
                int r2 = r13.f79635d
                if (r2 == r11) goto L34
                if (r2 == r9) goto L32
                if (r2 == r6) goto L34
                if (r2 == r5) goto L32
                r2 = r11
                goto L35
            L32:
                r2 = r10
                goto L35
            L34:
                r2 = 0
            L35:
                com.yandex.mobile.ads.impl.xt$a r8 = new com.yandex.mobile.ads.impl.xt$a
                r8.<init>()
                int r12 = r13.f79635d
                if (r12 == r11) goto L55
                if (r12 == r10) goto L52
                if (r12 == r9) goto L4f
                if (r12 == r6) goto L55
                if (r12 == r5) goto L4f
                java.lang.String r5 = "Unknown textAlignment: "
                java.lang.String r6 = "WebvttCueParser"
                com.yandex.mobile.ads.impl.zo0.m26074a(r5, r12, r6)
                r5 = 0
                goto L57
            L4f:
                android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L57
            L52:
                android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L57
            L55:
                android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            L57:
                com.yandex.mobile.ads.impl.xt$a r5 = r8.m27239b(r5)
                float r6 = r13.f79636e
                int r8 = r13.f79637f
                int r9 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r9 == 0) goto L6e
                if (r8 != 0) goto L6e
                int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r4 < 0) goto L74
                int r4 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r4 <= 0) goto L6e
                goto L74
            L6e:
                if (r9 == 0) goto L72
                r1 = r6
                goto L75
            L72:
                if (r8 != 0) goto L75
            L74:
                r1 = r7
            L75:
                com.yandex.mobile.ads.impl.xt$a r1 = r5.m27248a(r8, r1)
                int r4 = r13.f79638g
                com.yandex.mobile.ads.impl.xt$a r1 = r1.m27249a(r4)
                com.yandex.mobile.ads.impl.xt$a r1 = r1.m27242b(r0)
                com.yandex.mobile.ads.impl.xt$a r1 = r1.m27241b(r2)
                float r4 = r13.f79641j
                if (r2 == 0) goto La6
                if (r2 == r11) goto L9a
                if (r2 != r10) goto L90
                goto La8
            L90:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = java.lang.String.valueOf(r2)
                r0.<init>(r1)
                throw r0
            L9a:
                int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                r3 = 1073741824(0x40000000, float:2.0)
                if (r2 > 0) goto La2
                float r0 = r0 * r3
                goto La8
            La2:
                float r7 = r7 - r0
                float r0 = r7 * r3
                goto La8
            La6:
                float r0 = r7 - r0
            La8:
                float r0 = java.lang.Math.min(r4, r0)
                com.yandex.mobile.ads.impl.xt$a r0 = r1.m27232d(r0)
                int r1 = r13.f79642k
                com.yandex.mobile.ads.impl.xt$a r0 = r0.m27235c(r1)
                java.lang.CharSequence r1 = r13.f79634c
                if (r1 == 0) goto Lbd
                r0.m27244a(r1)
            Lbd:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ge2.C30387d.m33846a():com.yandex.mobile.ads.impl.xt$a");
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
        f79621c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f79622d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private static void m33858a(SpannableStringBuilder spannableStringBuilder, C30385b c30385b, @Nullable String str, List list, List list2) {
        char c;
        int i;
        ArrayList arrayList;
        List list3 = list2;
        int i2 = c30385b.f79627b;
        int length = spannableStringBuilder.length();
        String str2 = c30385b.f79626a;
        str2.getClass();
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99:
                if (str2.equals(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 117:
                if (str2.equals(ApsMetricsDataMap.APSMETRICS_FIELD_URL)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
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
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
                break;
            case 2:
                for (String str3 : c30385b.f79629d) {
                    Map<String, Integer> map = f79621c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str3).intValue()), i2, length, 33);
                    } else {
                        Map<String, Integer> map2 = f79622d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str3).intValue()), i2, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                break;
            case 7:
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    ee2 ee2Var = (ee2) list3.get(i3);
                    int m34625a = ee2Var.m34625a(str, c30385b.f79626a, c30385b.f79629d, c30385b.f79628c);
                    if (m34625a > 0) {
                        arrayList2.add(new C30386c(m34625a, ee2Var));
                    }
                }
                Collections.sort(arrayList2);
                for (int i4 = 0; i4 < arrayList2.size() && ((C30386c) arrayList2.get(i4)).f79631c.m34611g() == -1; i4++) {
                }
                ArrayList arrayList3 = new ArrayList(list.size());
                arrayList3.addAll(list);
                Collections.sort(arrayList3, C30384a.f79623c);
                int i5 = c30385b.f79627b;
                int i6 = 0;
                int i7 = 0;
                while (i6 < arrayList3.size()) {
                    if ("rt".equals(((C30384a) arrayList3.get(i6)).f79624a.f79626a)) {
                        C30384a c30384a = (C30384a) arrayList3.get(i6);
                        C30385b c30385b2 = c30384a.f79624a;
                        ArrayList arrayList4 = new ArrayList();
                        int i8 = 0;
                        while (i8 < list2.size()) {
                            ee2 ee2Var2 = (ee2) list3.get(i8);
                            ArrayList arrayList5 = arrayList3;
                            int m34625a2 = ee2Var2.m34625a(str, c30385b2.f79626a, c30385b2.f79629d, c30385b2.f79628c);
                            if (m34625a2 > 0) {
                                arrayList4.add(new C30386c(m34625a2, ee2Var2));
                            }
                            i8++;
                            list3 = list2;
                            arrayList3 = arrayList5;
                        }
                        arrayList = arrayList3;
                        Collections.sort(arrayList4);
                        int i9 = 0;
                        while (true) {
                            if (i9 < arrayList4.size()) {
                                ee2 ee2Var3 = ((C30386c) arrayList4.get(i9)).f79631c;
                                if (ee2Var3.m34611g() != -1) {
                                    ee2Var3.m34611g();
                                } else {
                                    i9++;
                                }
                            }
                        }
                        int i10 = c30384a.f79624a.f79627b - i7;
                        int i11 = c30384a.f79625b - i7;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i10, i11);
                        spannableStringBuilder.delete(i10, i11);
                        subSequence.toString();
                        spannableStringBuilder.setSpan(new oo1(), i5, i10, 33);
                        i7 += subSequence.length();
                        i5 = i10;
                    } else {
                        arrayList = arrayList3;
                    }
                    i6++;
                    list3 = list2;
                    arrayList3 = arrayList;
                }
                break;
            default:
                return;
        }
        ArrayList arrayList6 = new ArrayList();
        for (int i12 = 0; i12 < list2.size(); i12++) {
            ee2 ee2Var4 = (ee2) list2.get(i12);
            int m34625a3 = ee2Var4.m34625a(str, c30385b.f79626a, c30385b.f79629d, c30385b.f79628c);
            if (m34625a3 > 0) {
                arrayList6.add(new C30386c(m34625a3, ee2Var4));
            }
        }
        Collections.sort(arrayList6);
        for (int i13 = 0; i13 < arrayList6.size(); i13++) {
            ee2 ee2Var5 = ((C30386c) arrayList6.get(i13)).f79631c;
            if (ee2Var5 != null) {
                if (ee2Var5.m34610h() != -1) {
                    ww1.m27732a(spannableStringBuilder, new StyleSpan(ee2Var5.m34610h()), i2, length);
                }
                if (ee2Var5.m34607k()) {
                    i = 33;
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i2, length, 33);
                } else {
                    i = 33;
                }
                if (ee2Var5.m34606l()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, i);
                }
                if (ee2Var5.m34608j()) {
                    ww1.m27732a(spannableStringBuilder, new ForegroundColorSpan(ee2Var5.m34619c()), i2, length);
                }
                if (ee2Var5.m34609i()) {
                    ww1.m27732a(spannableStringBuilder, new BackgroundColorSpan(ee2Var5.m34629a()), i2, length);
                }
                if (ee2Var5.m34616d() != null) {
                    ww1.m27732a(spannableStringBuilder, new TypefaceSpan(ee2Var5.m34616d()), i2, length);
                }
                int m34612f = ee2Var5.m34612f();
                if (m34612f == 1) {
                    ww1.m27732a(spannableStringBuilder, new AbsoluteSizeSpan((int) ee2Var5.m34613e(), true), i2, length);
                } else if (m34612f == 2) {
                    ww1.m27732a(spannableStringBuilder, new RelativeSizeSpan(ee2Var5.m34613e()), i2, length);
                } else if (m34612f == 3) {
                    ww1.m27732a(spannableStringBuilder, new RelativeSizeSpan(ee2Var5.m34613e() / 100.0f), i2, length);
                }
                if (ee2Var5.m34622b()) {
                    spannableStringBuilder.setSpan(new hd0(), i2, length, 33);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m33852b(String str, C30387d c30387d) {
        int indexOf = str.indexOf(44);
        char c = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    i = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i = 0;
                    break;
                default:
                    gq0.m33792d("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            c30387d.f79638g = i;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            int i2 = ie2.f80440a;
            if (str.endsWith("%")) {
                c30387d.f79636e = Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
                c30387d.f79637f = 0;
                return;
            }
            throw new NumberFormatException("Percentages must end with %");
        }
        c30387d.f79636e = Integer.parseInt(str);
        c30387d.f79637f = 1;
    }

    @Nullable
    /* renamed from: a */
    public static fe2 m33857a(cc1 cc1Var, ArrayList arrayList) {
        String m35280j = cc1Var.m35280j();
        if (m35280j == null) {
            return null;
        }
        Pattern pattern = f79619a;
        Matcher matcher = pattern.matcher(m35280j);
        if (matcher.matches()) {
            return m33853a(null, matcher, cc1Var, arrayList);
        }
        String m35280j2 = cc1Var.m35280j();
        if (m35280j2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(m35280j2);
        if (matcher2.matches()) {
            return m33853a(m35280j.trim(), matcher2, cc1Var, arrayList);
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    private static fe2 m33853a(@Nullable String str, Matcher matcher, cc1 cc1Var, ArrayList arrayList) {
        C30387d c30387d = new C30387d();
        try {
            String group = matcher.group(1);
            group.getClass();
            c30387d.f79632a = ie2.m33285a(group);
            String group2 = matcher.group(2);
            group2.getClass();
            c30387d.f79633b = ie2.m33285a(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            m33855a(group3, c30387d);
            StringBuilder sb2 = new StringBuilder();
            String m35280j = cc1Var.m35280j();
            while (!TextUtils.isEmpty(m35280j)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(m35280j.trim());
                m35280j = cc1Var.m35280j();
            }
            c30387d.f79634c = m33854a(str, sb2.toString(), arrayList);
            return new fe2(c30387d.m33846a().m27251a(), c30387d.f79632a, c30387d.f79633b);
        } catch (NumberFormatException unused) {
            gq0.m33792d("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* renamed from: a */
    public static C31840xt.C31841a m33856a(String str) {
        C30387d c30387d = new C30387d();
        m33855a(str, c30387d);
        return c30387d.m33846a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static SpannedString m33854a(@Nullable String str, String str2, List<ee2> list) {
        int i;
        String str3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i3 < str2.length()) {
            char charAt = str2.charAt(i3);
            char c = 65535;
            if (charAt == '&') {
                i3++;
                int indexOf = str2.indexOf(59, i3);
                int indexOf2 = str2.indexOf(32, i3);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    String substring = str2.substring(i3, indexOf);
                    substring.getClass();
                    switch (substring.hashCode()) {
                        case 3309:
                            if (substring.equals("gt")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 3464:
                            if (substring.equals("lt")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 96708:
                            if (substring.equals("amp")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 3374865:
                            if (substring.equals("nbsp")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            spannableStringBuilder.append('>');
                            break;
                        case 1:
                            spannableStringBuilder.append('<');
                            break;
                        case 2:
                            spannableStringBuilder.append('&');
                            break;
                        case 3:
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            gq0.m33792d("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i3 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
                i2 = 0;
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i3++;
            } else {
                int i4 = i3 + 1;
                if (i4 < str2.length()) {
                    int i5 = str2.charAt(i4) == '/' ? 1 : i2;
                    int indexOf3 = str2.indexOf(62, i4);
                    i4 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                    int i6 = i4 - 2;
                    int i7 = str2.charAt(i6) == '/' ? 1 : i2;
                    int i8 = i3 + (i5 != 0 ? 2 : 1);
                    if (i7 == 0) {
                        i6 = i4 - 1;
                    }
                    String substring2 = str2.substring(i8, i6);
                    if (!substring2.trim().isEmpty()) {
                        String trim = substring2.trim();
                        if (!trim.isEmpty()) {
                            int i9 = y32.f88010a;
                            String str4 = trim.split("[ \\.]", 2)[i2];
                            str4.getClass();
                            switch (str4.hashCode()) {
                                case 98:
                                    if (str4.equals("b")) {
                                        i = i2;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 99:
                                    if (str4.equals(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM)) {
                                        i = 1;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 105:
                                    if (str4.equals("i")) {
                                        i = 2;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 117:
                                    if (str4.equals(ApsMetricsDataMap.APSMETRICS_FIELD_URL)) {
                                        i = 3;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 118:
                                    if (str4.equals("v")) {
                                        i = 4;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 3650:
                                    if (str4.equals("rt")) {
                                        i = 5;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 3314158:
                                    if (str4.equals("lang")) {
                                        i = 6;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 3511770:
                                    if (str4.equals("ruby")) {
                                        i = 7;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                default:
                                    i = -1;
                                    break;
                            }
                            switch (i) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    if (i5 != 0) {
                                        while (!arrayDeque.isEmpty()) {
                                            C30385b c30385b = (C30385b) arrayDeque.pop();
                                            m33858a(spannableStringBuilder, c30385b, str, arrayList, list);
                                            if (!arrayDeque.isEmpty()) {
                                                arrayList.add(new C30384a(c30385b, spannableStringBuilder.length()));
                                            } else {
                                                arrayList.clear();
                                            }
                                            if (c30385b.f79626a.equals(str4)) {
                                                break;
                                            }
                                        }
                                        break;
                                    } else if (i7 == 0) {
                                        int length = spannableStringBuilder.length();
                                        String trim2 = substring2.trim();
                                        if (!trim2.isEmpty()) {
                                            int indexOf4 = trim2.indexOf(" ");
                                            if (indexOf4 == -1) {
                                                str3 = "";
                                            } else {
                                                String trim3 = trim2.substring(indexOf4).trim();
                                                trim2 = trim2.substring(i2, indexOf4);
                                                str3 = trim3;
                                            }
                                            String[] split = trim2.split("\\.", -1);
                                            String str5 = split[i2];
                                            HashSet hashSet = new HashSet();
                                            for (int i10 = 1; i10 < split.length; i10++) {
                                                hashSet.add(split[i10]);
                                            }
                                            arrayDeque.push(new C30385b(str5, length, str3, hashSet));
                                            break;
                                        } else {
                                            throw new IllegalArgumentException();
                                        }
                                    }
                                    break;
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i3 = i4;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m33858a(spannableStringBuilder, (C30385b) arrayDeque.pop(), str, arrayList, list);
        }
        m33858a(spannableStringBuilder, new C30385b("", 0, "", Collections.emptySet()), str, Collections.emptyList(), list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private static void m33855a(String str, C30387d c30387d) {
        int i;
        Matcher matcher = f79620b.matcher(str);
        while (matcher.find()) {
            int i2 = 1;
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    m33852b(group2, c30387d);
                } else {
                    char c = 65535;
                    if ("align".equals(group)) {
                        switch (group2.hashCode()) {
                            case -1364013995:
                                if (group2.equals("center")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (group2.equals("middle")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 100571:
                                if (group2.equals("end")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (group2.equals("left")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (group2.equals("right")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (group2.equals("start")) {
                                    c = 5;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                                i2 = 2;
                                break;
                            case 2:
                                i2 = 3;
                                break;
                            case 3:
                                i2 = 4;
                                break;
                            case 4:
                                i2 = 5;
                                break;
                            case 5:
                                break;
                            default:
                                gq0.m33792d("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                i2 = 2;
                                break;
                        }
                        c30387d.f79635d = i2;
                    } else if (C21114v8.C21122h.f54038L.equals(group)) {
                        int indexOf = group2.indexOf(44);
                        if (indexOf != -1) {
                            String substring = group2.substring(indexOf + 1);
                            substring.getClass();
                            switch (substring.hashCode()) {
                                case -1842484672:
                                    if (substring.equals("line-left")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case -1364013995:
                                    if (substring.equals("center")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case -1276788989:
                                    if (substring.equals("line-right")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                                case -1074341483:
                                    if (substring.equals("middle")) {
                                        c = 3;
                                        break;
                                    }
                                    break;
                                case 100571:
                                    if (substring.equals("end")) {
                                        c = 4;
                                        break;
                                    }
                                    break;
                                case 109757538:
                                    if (substring.equals("start")) {
                                        c = 5;
                                        break;
                                    }
                                    break;
                            }
                            switch (c) {
                                case 0:
                                case 5:
                                    i = 0;
                                    break;
                                case 1:
                                case 3:
                                    i = 1;
                                    break;
                                case 2:
                                case 4:
                                    i = 2;
                                    break;
                                default:
                                    gq0.m33792d("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                    i = Integer.MIN_VALUE;
                                    break;
                            }
                            c30387d.f79640i = i;
                            group2 = group2.substring(0, indexOf);
                        }
                        int i3 = ie2.f80440a;
                        if (group2.endsWith("%")) {
                            c30387d.f79639h = Float.parseFloat(group2.substring(0, group2.length() - 1)) / 100.0f;
                        } else {
                            throw new NumberFormatException("Percentages must end with %");
                        }
                    } else if ("size".equals(group)) {
                        int i4 = ie2.f80440a;
                        if (group2.endsWith("%")) {
                            c30387d.f79641j = Float.parseFloat(group2.substring(0, group2.length() - 1)) / 100.0f;
                        } else {
                            throw new NumberFormatException("Percentages must end with %");
                        }
                    } else if ("vertical".equals(group)) {
                        if (group2.equals("lr")) {
                            i2 = 2;
                        } else if (!group2.equals("rl")) {
                            gq0.m33792d("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i2 = Integer.MIN_VALUE;
                        }
                        c30387d.f79642k = i2;
                    } else {
                        gq0.m33792d("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                    }
                }
            } catch (NumberFormatException unused) {
                gq0.m33792d("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }
}
