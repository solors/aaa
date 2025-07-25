package com.applovin.exoplayer2.p132ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.applovin.exoplayer2.p132ui.AbstractC3957f;
import com.applovin.impl.AbstractC4100b1;
import com.applovin.impl.AbstractC4387fb;
import com.applovin.impl.AbstractC5863xp;
import com.applovin.impl.C5061oa;
import com.applovin.impl.C5925yn;
import com.applovin.impl.C5974zi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.exoplayer2.ui.f */
/* loaded from: classes2.dex */
public abstract class AbstractC3957f {

    /* renamed from: a */
    private static final Pattern f4391a = Pattern.compile("(&#13;)?&#10;");

    /* renamed from: com.applovin.exoplayer2.ui.f$b */
    /* loaded from: classes2.dex */
    public static class C3959b {

        /* renamed from: a */
        public final String f4392a;

        /* renamed from: b */
        public final Map f4393b;

        private C3959b(String str, Map map) {
            this.f4392a = str;
            this.f4393b = map;
        }
    }

    /* renamed from: com.applovin.exoplayer2.ui.f$c */
    /* loaded from: classes2.dex */
    public static final class C3960c {

        /* renamed from: e */
        private static final Comparator f4394e = new Comparator() { // from class: com.applovin.exoplayer2.ui.o
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m101127a;
                m101127a = AbstractC3957f.C3960c.m101127a((AbstractC3957f.C3960c) obj, (AbstractC3957f.C3960c) obj2);
                return m101127a;
            }
        };

        /* renamed from: f */
        private static final Comparator f4395f = new Comparator() { // from class: com.applovin.exoplayer2.ui.p
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m101125b;
                m101125b = AbstractC3957f.C3960c.m101125b((AbstractC3957f.C3960c) obj, (AbstractC3957f.C3960c) obj2);
                return m101125b;
            }
        };

        /* renamed from: a */
        public final int f4396a;

        /* renamed from: b */
        public final int f4397b;

        /* renamed from: c */
        public final String f4398c;

        /* renamed from: d */
        public final String f4399d;

        private C3960c(int i, int i2, String str, String str2) {
            this.f4396a = i;
            this.f4397b = i2;
            this.f4398c = str;
            this.f4399d = str2;
        }

        /* renamed from: a */
        public static /* synthetic */ int m101127a(C3960c c3960c, C3960c c3960c2) {
            int compare = Integer.compare(c3960c2.f4397b, c3960c.f4397b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = c3960c.f4398c.compareTo(c3960c2.f4398c);
            return compareTo != 0 ? compareTo : c3960c.f4399d.compareTo(c3960c2.f4399d);
        }

        /* renamed from: b */
        public static /* synthetic */ int m101125b(C3960c c3960c, C3960c c3960c2) {
            int compare = Integer.compare(c3960c2.f4396a, c3960c.f4396a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = c3960c2.f4398c.compareTo(c3960c.f4398c);
            return compareTo != 0 ? compareTo : c3960c2.f4399d.compareTo(c3960c.f4399d);
        }
    }

    /* renamed from: com.applovin.exoplayer2.ui.f$d */
    /* loaded from: classes2.dex */
    public static final class C3961d {

        /* renamed from: a */
        private final List f4400a = new ArrayList();

        /* renamed from: b */
        private final List f4401b = new ArrayList();
    }

    /* renamed from: a */
    private static String m101136a(int i) {
        return i != 2 ? "over right" : "under left";
    }

    /* renamed from: a */
    public static C3959b m101131a(CharSequence charSequence, float f) {
        if (charSequence == null) {
            return new C3959b("", AbstractC4387fb.m99379h());
        }
        if (!(charSequence instanceof Spanned)) {
            return new C3959b(m101132a(charSequence), AbstractC4387fb.m99379h());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet<Integer> hashSet = new HashSet();
        int i = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        for (Integer num : hashSet) {
            int intValue = num.intValue();
            hashMap.put(AbstractC3948c.m101229a("bg_" + intValue), AbstractC5863xp.m93012a("background-color:%s;", AbstractC3948c.m101230a(intValue)));
        }
        SparseArray m101134a = m101134a(spanned, f);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i2 = 0;
        while (i < m101134a.size()) {
            int keyAt = m101134a.keyAt(i);
            sb2.append(m101132a(spanned.subSequence(i2, keyAt)));
            C3961d c3961d = (C3961d) m101134a.get(keyAt);
            Collections.sort(c3961d.f4401b, C3960c.f4395f);
            for (C3960c c3960c : c3961d.f4401b) {
                sb2.append(c3960c.f4399d);
            }
            Collections.sort(c3961d.f4400a, C3960c.f4394e);
            for (C3960c c3960c2 : c3961d.f4400a) {
                sb2.append(c3960c2.f4398c);
            }
            i++;
            i2 = keyAt;
        }
        sb2.append(m101132a(spanned.subSequence(i2, spanned.length())));
        return new C3959b(sb2.toString(), hashMap);
    }

    /* renamed from: a */
    private static SparseArray m101134a(Spanned spanned, float f) {
        Object[] spans;
        SparseArray sparseArray = new SparseArray();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String m101129a = m101129a(obj, f);
            String m101130a = m101130a(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (m101129a != null) {
                AbstractC4100b1.m100583a((Object) m101130a);
                C3960c c3960c = new C3960c(spanStart, spanEnd, m101129a, m101130a);
                m101133a(sparseArray, spanStart).f4400a.add(c3960c);
                m101133a(sparseArray, spanEnd).f4401b.add(c3960c);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    private static String m101129a(Object obj, float f) {
        float size;
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return AbstractC5863xp.m93012a("<span style='color:%s;'>", AbstractC3948c.m101230a(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return AbstractC5863xp.m93012a("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof C5061oa) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            if (absoluteSizeSpan.getDip()) {
                size = absoluteSizeSpan.getSize();
            } else {
                size = absoluteSizeSpan.getSize() / f;
            }
            return AbstractC5863xp.m93012a("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
        } else if (obj instanceof RelativeSizeSpan) {
            return AbstractC5863xp.m93012a("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        } else {
            if (obj instanceof TypefaceSpan) {
                String family = ((TypefaceSpan) obj).getFamily();
                if (family != null) {
                    return AbstractC5863xp.m93012a("<span style='font-family:\"%s\";'>", family);
                }
                return null;
            } else if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style != 1) {
                    if (style != 2) {
                        if (style != 3) {
                            return null;
                        }
                        return "<b><i>";
                    }
                    return "<i>";
                }
                return "<b>";
            } else if (obj instanceof C5974zi) {
                int i = ((C5974zi) obj).f12571b;
                if (i != -1) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return "<ruby style='ruby-position:under;'>";
                    }
                    return "<ruby style='ruby-position:over;'>";
                }
                return "<ruby style='ruby-position:unset;'>";
            } else if (obj instanceof UnderlineSpan) {
                return "<u>";
            } else {
                if (obj instanceof C5925yn) {
                    C5925yn c5925yn = (C5925yn) obj;
                    return AbstractC5863xp.m93012a("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", m101135a(c5925yn.f12369a, c5925yn.f12370b), m101136a(c5925yn.f12371c));
                }
                return null;
            }
        }
    }

    /* renamed from: a */
    private static String m101130a(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof C5061oa) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof C5925yn)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else if (obj instanceof C5974zi) {
            return "<rt>" + m101132a((CharSequence) ((C5974zi) obj).f12570a) + "</rt></ruby>";
        } else if (obj instanceof UnderlineSpan) {
            return "</u>";
        }
        return null;
    }

    /* renamed from: a */
    private static String m101135a(int i, int i2) {
        StringBuilder sb2 = new StringBuilder();
        if (i2 == 1) {
            sb2.append("filled ");
        } else if (i2 == 2) {
            sb2.append("open ");
        }
        if (i == 0) {
            sb2.append("none");
        } else if (i == 1) {
            sb2.append("circle");
        } else if (i == 2) {
            sb2.append("dot");
        } else if (i != 3) {
            sb2.append("unset");
        } else {
            sb2.append("sesame");
        }
        return sb2.toString();
    }

    /* renamed from: a */
    private static C3961d m101133a(SparseArray sparseArray, int i) {
        C3961d c3961d = (C3961d) sparseArray.get(i);
        if (c3961d == null) {
            C3961d c3961d2 = new C3961d();
            sparseArray.put(i, c3961d2);
            return c3961d2;
        }
        return c3961d;
    }

    /* renamed from: a */
    private static String m101132a(CharSequence charSequence) {
        return f4391a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
