package com.yandex.mobile.ads.impl;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class p22 {
    /* renamed from: a */
    public static void m30853a(SpannableStringBuilder spannableStringBuilder, int i, int i2, q22 q22Var, @Nullable n22 n22Var, Map map, int i3) {
        n22 n22Var2;
        if (q22Var.m30508k() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(q22Var.m30508k()), i, i2, 33);
        }
        if (q22Var.m30502q()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (q22Var.m30501r()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (q22Var.m30503p()) {
            ww1.m27732a(spannableStringBuilder, new ForegroundColorSpan(q22Var.m30528b()), i, i2);
        }
        if (q22Var.m30504o()) {
            ww1.m27732a(spannableStringBuilder, new BackgroundColorSpan(q22Var.m30536a()), i, i2);
        }
        if (q22Var.m30522c() != null) {
            ww1.m27732a(spannableStringBuilder, new TypefaceSpan(q22Var.m30522c()), i, i2);
        }
        if (q22Var.m30505n() != null) {
            sz1 m30505n = q22Var.m30505n();
            m30505n.getClass();
            int i4 = m30505n.f85457a;
            ww1.m27732a(spannableStringBuilder, new tz1(), i, i2);
        }
        int m30510i = q22Var.m30510i();
        if (m30510i == 2) {
            while (true) {
                n22Var2 = null;
                if (n22Var == null) {
                    n22Var = null;
                    break;
                }
                q22 m30852a = m30852a(n22Var.f82589f, n22Var.m31678c(), map);
                if (m30852a != null && m30852a.m30510i() == 1) {
                    break;
                }
                n22Var = n22Var.f82593j;
            }
            if (n22Var != null) {
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(n22Var);
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        break;
                    }
                    n22 n22Var3 = (n22) arrayDeque.pop();
                    q22 m30852a2 = m30852a(n22Var3.f82589f, n22Var3.m31678c(), map);
                    if (m30852a2 != null && m30852a2.m30510i() == 3) {
                        n22Var2 = n22Var3;
                        break;
                    }
                    for (int m31691a = n22Var3.m31691a() - 1; m31691a >= 0; m31691a--) {
                        arrayDeque.push(n22Var3.m31690a(m31691a));
                    }
                }
                if (n22Var2 != null) {
                    if (n22Var2.m31691a() == 1 && n22Var2.m31690a(0).f82585b != null) {
                        String str = n22Var2.m31690a(0).f82585b;
                        int i5 = y32.f88010a;
                        q22 m30852a3 = m30852a(n22Var2.f82589f, n22Var2.m31678c(), map);
                        if (m30852a3 == null || m30852a3.m30511h() == -1) {
                            m30852a(n22Var.f82589f, n22Var.m31678c(), map);
                        }
                        spannableStringBuilder.setSpan(new oo1(), i, i2, 33);
                    } else {
                        gq0.m33793c("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                    }
                }
            }
        } else if (m30510i == 3 || m30510i == 4) {
            spannableStringBuilder.setSpan(new C30759kz(), i, i2, 33);
        }
        if (q22Var.m30506m()) {
            ww1.m27732a(spannableStringBuilder, new hd0(), i, i2);
        }
        int m30516e = q22Var.m30516e();
        if (m30516e == 1) {
            ww1.m27732a(spannableStringBuilder, new AbsoluteSizeSpan((int) q22Var.m30519d(), true), i, i2);
        } else if (m30516e == 2) {
            ww1.m27732a(spannableStringBuilder, new RelativeSizeSpan(q22Var.m30519d()), i, i2);
        } else if (m30516e == 3) {
            ww1.m27732a(spannableStringBuilder, new RelativeSizeSpan(q22Var.m30519d() / 100.0f), i, i2);
        }
    }

    @Nullable
    /* renamed from: a */
    public static q22 m30852a(@Nullable q22 q22Var, @Nullable String[] strArr, Map<String, q22> map) {
        int i = 0;
        if (q22Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                q22 q22Var2 = new q22();
                int length = strArr.length;
                while (i < length) {
                    q22Var2.m30532a(map.get(strArr[i]));
                    i++;
                }
                return q22Var2;
            }
        } else if (strArr != null && strArr.length == 1) {
            return q22Var.m30532a(map.get(strArr[0]));
        } else {
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    q22Var.m30532a(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return q22Var;
    }
}
