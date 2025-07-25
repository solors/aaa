package com.yandex.mobile.ads.impl;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.yandex.mobile.ads.impl.C31840xt;
import java.util.List;

/* loaded from: classes8.dex */
public final class s22 extends eu1 {

    /* renamed from: m */
    private final cc1 f84991m = new cc1();

    /* renamed from: n */
    private final boolean f84992n;

    /* renamed from: o */
    private final int f84993o;

    /* renamed from: p */
    private final int f84994p;

    /* renamed from: q */
    private final String f84995q;

    /* renamed from: r */
    private final float f84996r;

    /* renamed from: s */
    private final int f84997s;

    public s22(List<byte[]> list) {
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f84993o = bArr[24];
            this.f84994p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f84995q = "Serif".equals(y32.m27070a(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
            int i = bArr[25] * 20;
            this.f84997s = i;
            boolean z = (bArr[0] & 32) != 0;
            this.f84992n = z;
            if (z) {
                this.f84996r = y32.m27095a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i);
                return;
            } else {
                this.f84996r = 0.85f;
                return;
            }
        }
        this.f84993o = 0;
        this.f84994p = -1;
        this.f84995q = "sans-serif";
        this.f84992n = false;
        this.f84996r = 0.85f;
        this.f84997s = -1;
    }

    /* renamed from: a */
    private static void m29878a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    @Override // com.yandex.mobile.ads.impl.eu1
    /* renamed from: a */
    protected final oy1 mo26966a(byte[] bArr, int i, boolean z) throws qy1 {
        String m35297a;
        char m35285f;
        int i2;
        int i3;
        this.f84991m.m35296a(i, bArr);
        cc1 cc1Var = this.f84991m;
        int i4 = 2;
        if (cc1Var.m35299a() >= 2) {
            int m35264z = cc1Var.m35264z();
            if (m35264z == 0) {
                m35297a = "";
            } else if (cc1Var.m35299a() >= 2 && ((m35285f = cc1Var.m35285f()) == 65279 || m35285f == 65534)) {
                m35297a = cc1Var.m35297a(m35264z, C30572in.f80566e);
            } else {
                m35297a = cc1Var.m35297a(m35264z, C30572in.f80564c);
            }
            if (m35297a.isEmpty()) {
                return t22.f85491c;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m35297a);
            m29878a(spannableStringBuilder, this.f84993o, 0, 0, spannableStringBuilder.length(), 16711680);
            int i5 = this.f84994p;
            int length = spannableStringBuilder.length();
            int i6 = 8;
            int i7 = 0;
            if (i5 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan((i5 >>> 8) | ((i5 & 255) << 24)), 0, length, 16711713);
            }
            String str = this.f84995q;
            int length2 = spannableStringBuilder.length();
            if (str != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
            }
            float f = this.f84996r;
            while (this.f84991m.m35299a() >= i6) {
                int m35289d = this.f84991m.m35289d();
                int m35282h = this.f84991m.m35282h();
                int m35282h2 = this.f84991m.m35282h();
                if (m35282h2 == 1937013100) {
                    if (this.f84991m.m35299a() >= i4) {
                        int m35264z2 = this.f84991m.m35264z();
                        int i8 = i7;
                        while (i8 < m35264z2) {
                            cc1 cc1Var2 = this.f84991m;
                            if (cc1Var2.m35299a() >= 12) {
                                int m35264z3 = cc1Var2.m35264z();
                                int m35264z4 = cc1Var2.m35264z();
                                cc1Var2.m35284f(i4);
                                int m35270t = cc1Var2.m35270t();
                                cc1Var2.m35284f(1);
                                int m35282h3 = cc1Var2.m35282h();
                                if (m35264z4 > spannableStringBuilder.length()) {
                                    gq0.m33792d("Tx3gDecoder", "Truncating styl end (" + m35264z4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                                    m35264z4 = spannableStringBuilder.length();
                                }
                                int i9 = m35264z4;
                                if (m35264z3 >= i9) {
                                    gq0.m33792d("Tx3gDecoder", "Ignoring styl with start (" + m35264z3 + ") >= end (" + i9 + ").");
                                    i3 = i8;
                                    i2 = m35264z2;
                                } else {
                                    i2 = m35264z2;
                                    i3 = i8;
                                    m29878a(spannableStringBuilder, m35270t, this.f84993o, m35264z3, i9, 0);
                                    if (m35282h3 != this.f84994p) {
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((m35282h3 & 255) << 24) | (m35282h3 >>> 8)), m35264z3, i9, 33);
                                    }
                                }
                                i8 = i3 + 1;
                                m35264z2 = i2;
                                i4 = 2;
                            } else {
                                throw new qy1("Unexpected subtitle format.");
                            }
                        }
                        continue;
                    } else {
                        throw new qy1("Unexpected subtitle format.");
                    }
                } else if (m35282h2 == 1952608120 && this.f84992n) {
                    i4 = 2;
                    if (this.f84991m.m35299a() >= 2) {
                        float m35264z5 = this.f84991m.m35264z() / this.f84997s;
                        int i10 = y32.f88010a;
                        f = Math.max(0.0f, Math.min(m35264z5, 0.95f));
                    } else {
                        throw new qy1("Unexpected subtitle format.");
                    }
                } else {
                    i4 = 2;
                }
                this.f84991m.m35286e(m35289d + m35282h);
                i6 = 8;
                i7 = 0;
            }
            return new t22(new C31840xt.C31841a().m27244a(spannableStringBuilder).m27248a(0, f).m27249a(0).m27251a());
        }
        throw new qy1("Unexpected subtitle format.");
    }
}
