package com.fyber.inneractive.sdk.flow.vast;

import com.fyber.inneractive.sdk.model.vast.C14610c;
import com.fyber.inneractive.sdk.model.vast.EnumC14616i;
import com.fyber.inneractive.sdk.util.AbstractC15471s;
import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.flow.vast.d */
/* loaded from: classes4.dex */
public final class C14544d implements Comparator {

    /* renamed from: a */
    public final int f27563a;

    /* renamed from: b */
    public final float f27564b;

    public C14544d(int i, int i2) {
        this.f27563a = i * i2;
        this.f27564b = i / i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        C14610c c14610c = (C14610c) obj;
        C14610c c14610c2 = (C14610c) obj2;
        int m76466a = AbstractC15471s.m76466a(c14610c.f27710h, c14610c2.f27710h);
        if (m76466a == 0) {
            EnumC14616i enumC14616i = c14610c.f27703a;
            EnumC14616i enumC14616i2 = EnumC14616i.Html;
            int i2 = 3;
            if (enumC14616i == enumC14616i2) {
                i = 1;
            } else if (enumC14616i == EnumC14616i.Iframe) {
                i = 2;
            } else if (enumC14616i == EnumC14616i.Static) {
                i = 3;
            } else {
                i = Integer.MAX_VALUE;
            }
            EnumC14616i enumC14616i3 = c14610c2.f27703a;
            if (enumC14616i3 == enumC14616i2) {
                i2 = 1;
            } else if (enumC14616i3 == EnumC14616i.Iframe) {
                i2 = 2;
            } else if (enumC14616i3 != EnumC14616i.Static) {
                i2 = Integer.MAX_VALUE;
            }
            int m76466a2 = AbstractC15471s.m76466a(i, i2);
            if (m76466a2 == 0) {
                int compare = Float.compare(Math.abs((c14610c.f27705c / c14610c.f27706d) - this.f27564b), Math.abs((c14610c2.f27705c / c14610c2.f27706d) - this.f27564b));
                if (compare == 0) {
                    return AbstractC15471s.m76466a(Math.abs((c14610c.f27705c * c14610c.f27706d) - this.f27563a), Math.abs((c14610c2.f27705c * c14610c2.f27706d) - this.f27563a));
                }
                return compare;
            }
            return m76466a2;
        }
        return m76466a;
    }
}
