package com.applovin.impl;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.impl.C3989a5;
import java.util.List;

/* renamed from: com.applovin.impl.lp */
/* loaded from: classes2.dex */
public final class C4788lp extends AbstractC4336ek {

    /* renamed from: o */
    private final C4066ah f7797o;

    /* renamed from: p */
    private final boolean f7798p;

    /* renamed from: q */
    private final int f7799q;

    /* renamed from: r */
    private final int f7800r;

    /* renamed from: s */
    private final String f7801s;

    /* renamed from: t */
    private final float f7802t;

    /* renamed from: u */
    private final int f7803u;

    public C4788lp(List list) {
        super("Tx3gDecoder");
        this.f7797o = new C4066ah();
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f7799q = bArr[24];
            this.f7800r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f7801s = "Serif".equals(AbstractC5863xp.m93006a(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
            int i = bArr[25] * 20;
            this.f7803u = i;
            boolean z = (bArr[0] & 32) != 0;
            this.f7798p = z;
            if (z) {
                this.f7802t = AbstractC5863xp.m93042a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
                return;
            } else {
                this.f7802t = 0.85f;
                return;
            }
        }
        this.f7799q = 0;
        this.f7800r = -1;
        this.f7801s = "sans-serif";
        this.f7798p = false;
        this.f7802t = 0.85f;
        this.f7803u = -1;
    }

    /* renamed from: a */
    private void m97636a(C4066ah c4066ah, SpannableStringBuilder spannableStringBuilder) {
        m97635a(c4066ah.m100797a() >= 12);
        int m100799C = c4066ah.m100799C();
        int m100799C2 = c4066ah.m100799C();
        c4066ah.m100778g(2);
        int m100762w = c4066ah.m100762w();
        c4066ah.m100778g(1);
        int m100775j = c4066ah.m100775j();
        if (m100799C2 > spannableStringBuilder.length()) {
            AbstractC5063oc.m96800d("Tx3gDecoder", "Truncating styl end (" + m100799C2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            m100799C2 = spannableStringBuilder.length();
        }
        if (m100799C >= m100799C2) {
            AbstractC5063oc.m96800d("Tx3gDecoder", "Ignoring styl with start (" + m100799C + ") >= end (" + m100799C2 + ").");
            return;
        }
        int i = m100799C2;
        m97634b(spannableStringBuilder, m100762w, this.f7799q, m100799C, i, 0);
        m97639a(spannableStringBuilder, m100775j, this.f7800r, m100799C, i, 0);
    }

    /* renamed from: b */
    private static void m97634b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z3 = true;
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z3 = false;
            }
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z3 && !z && !z2) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* renamed from: a */
    private static void m97635a(boolean z) {
        if (!z) {
            throw new C5128pl("Unexpected subtitle format.");
        }
    }

    /* renamed from: a */
    private static void m97639a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* renamed from: a */
    private static void m97638a(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    @Override // com.applovin.impl.AbstractC4336ek
    /* renamed from: a */
    protected InterfaceC5019nl mo92614a(byte[] bArr, int i, boolean z) {
        this.f7797o.m100791a(bArr, i);
        String m97637a = m97637a(this.f7797o);
        if (m97637a.isEmpty()) {
            return C4968mp.f8458b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m97637a);
        m97634b(spannableStringBuilder, this.f7799q, 0, 0, spannableStringBuilder.length(), 16711680);
        m97639a(spannableStringBuilder, this.f7800r, -1, 0, spannableStringBuilder.length(), 16711680);
        m97638a(spannableStringBuilder, this.f7801s, 0, spannableStringBuilder.length());
        float f = this.f7802t;
        while (this.f7797o.m100797a() >= 8) {
            int m100785d = this.f7797o.m100785d();
            int m100775j = this.f7797o.m100775j();
            int m100775j2 = this.f7797o.m100775j();
            if (m100775j2 == 1937013100) {
                m97635a(this.f7797o.m100797a() >= 2);
                int m100799C = this.f7797o.m100799C();
                for (int i2 = 0; i2 < m100799C; i2++) {
                    m97636a(this.f7797o, spannableStringBuilder);
                }
            } else if (m100775j2 == 1952608120 && this.f7798p) {
                m97635a(this.f7797o.m100797a() >= 2);
                f = AbstractC5863xp.m93042a(this.f7797o.m100799C() / this.f7803u, 0.0f, 0.95f);
            }
            this.f7797o.m100780f(m100785d + m100775j);
        }
        return new C4968mp(new C3989a5.C3991b().m101044a(spannableStringBuilder).m101048a(f, 0).m101047a(0).m101050a());
    }

    /* renamed from: a */
    private static String m97637a(C4066ah c4066ah) {
        char m100781f;
        m97635a(c4066ah.m100797a() >= 2);
        int m100799C = c4066ah.m100799C();
        if (m100799C == 0) {
            return "";
        }
        if (c4066ah.m100797a() >= 2 && ((m100781f = c4066ah.m100781f()) == 65279 || m100781f == 65534)) {
            return c4066ah.m100794a(m100799C, Charsets.UTF_16);
        }
        return c4066ah.m100794a(m100799C, Charsets.UTF_8);
    }
}
