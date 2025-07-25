package com.applovin.impl;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.ip */
/* loaded from: classes2.dex */
public abstract class AbstractC4607ip {
    /* renamed from: a */
    public static void m98382a(Spannable spannable, int i, int i2, C4670jp c4670jp, C4485gp c4485gp, Map map, int i3) {
        C4485gp m98377b;
        C4670jp m98379a;
        int i4;
        if (c4670jp.m98111k() != -1) {
            spannable.setSpan(new StyleSpan(c4670jp.m98111k()), i, i2, 33);
        }
        if (c4670jp.m98105q()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (c4670jp.m98104r()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (c4670jp.m98106p()) {
            AbstractC5127pk.m96534a(spannable, new ForegroundColorSpan(c4670jp.m98131b()), i, i2, 33);
        }
        if (c4670jp.m98107o()) {
            AbstractC5127pk.m96534a(spannable, new BackgroundColorSpan(c4670jp.m98140a()), i, i2, 33);
        }
        if (c4670jp.m98125c() != null) {
            AbstractC5127pk.m96534a(spannable, new TypefaceSpan(c4670jp.m98125c()), i, i2, 33);
        }
        if (c4670jp.m98108n() != null) {
            C5861xn c5861xn = (C5861xn) AbstractC4100b1.m100583a(c4670jp.m98108n());
            int i5 = c5861xn.f12148a;
            if (i5 == -1) {
                i5 = (i3 == 2 || i3 == 1) ? 3 : 1;
                i4 = 1;
            } else {
                i4 = c5861xn.f12149b;
            }
            int i6 = c5861xn.f12150c;
            if (i6 == -2) {
                i6 = 1;
            }
            AbstractC5127pk.m96534a(spannable, new C5925yn(i5, i4, i6), i, i2, 33);
        }
        int m98113i = c4670jp.m98113i();
        if (m98113i == 2) {
            C4485gp m98380a = m98380a(c4485gp, map);
            if (m98380a != null && (m98377b = m98377b(m98380a, map)) != null) {
                if (m98377b.m98891a() == 1 && m98377b.m98890a(0).f6461b != null) {
                    String str = (String) AbstractC5863xp.m93017a((Object) m98377b.m98890a(0).f6461b);
                    C4670jp m98379a2 = m98379a(m98377b.f6465f, m98377b.m98876c(), map);
                    int m98114h = m98379a2 != null ? m98379a2.m98114h() : -1;
                    if (m98114h == -1 && (m98379a = m98379a(m98380a.f6465f, m98380a.m98876c(), map)) != null) {
                        m98114h = m98379a.m98114h();
                    }
                    spannable.setSpan(new C5974zi(str, m98114h), i, i2, 33);
                } else {
                    AbstractC5063oc.m96802c("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                }
            }
        } else if (m98113i == 3 || m98113i == 4) {
            spannable.setSpan(new C4992n6(), i, i2, 33);
        }
        if (c4670jp.m98109m()) {
            AbstractC5127pk.m96534a(spannable, new C5061oa(), i, i2, 33);
        }
        int m98119e = c4670jp.m98119e();
        if (m98119e == 1) {
            AbstractC5127pk.m96534a(spannable, new AbsoluteSizeSpan((int) c4670jp.m98122d(), true), i, i2, 33);
        } else if (m98119e == 2) {
            AbstractC5127pk.m96534a(spannable, new RelativeSizeSpan(c4670jp.m98122d()), i, i2, 33);
        } else if (m98119e != 3) {
        } else {
            AbstractC5127pk.m96534a(spannable, new RelativeSizeSpan(c4670jp.m98122d() / 100.0f), i, i2, 33);
        }
    }

    /* renamed from: b */
    private static C4485gp m98377b(C4485gp c4485gp, Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c4485gp);
        while (!arrayDeque.isEmpty()) {
            C4485gp c4485gp2 = (C4485gp) arrayDeque.pop();
            C4670jp m98379a = m98379a(c4485gp2.f6465f, c4485gp2.m98876c(), map);
            if (m98379a != null && m98379a.m98113i() == 3) {
                return c4485gp2;
            }
            for (int m98891a = c4485gp2.m98891a() - 1; m98891a >= 0; m98891a--) {
                arrayDeque.push(c4485gp2.m98890a(m98891a));
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m98378a(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    /* renamed from: a */
    public static void m98381a(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    /* renamed from: a */
    private static C4485gp m98380a(C4485gp c4485gp, Map map) {
        while (c4485gp != null) {
            C4670jp m98379a = m98379a(c4485gp.f6465f, c4485gp.m98876c(), map);
            if (m98379a != null && m98379a.m98113i() == 1) {
                return c4485gp;
            }
            c4485gp = c4485gp.f6469j;
        }
        return null;
    }

    /* renamed from: a */
    public static C4670jp m98379a(C4670jp c4670jp, String[] strArr, Map map) {
        int i = 0;
        if (c4670jp == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C4670jp) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C4670jp c4670jp2 = new C4670jp();
                int length = strArr.length;
                while (i < length) {
                    c4670jp2.m98136a((C4670jp) map.get(strArr[i]));
                    i++;
                }
                return c4670jp2;
            }
        } else if (strArr != null && strArr.length == 1) {
            return c4670jp.m98136a((C4670jp) map.get(strArr[0]));
        } else {
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    c4670jp.m98136a((C4670jp) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return c4670jp;
    }
}
