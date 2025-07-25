package com.taurusx.tax.p594e;

import com.taurusx.tax.p594e.C28363r0;
import java.util.Map;

/* renamed from: com.taurusx.tax.e.p */
/* loaded from: classes7.dex */
public abstract class AbstractC28356p {

    /* renamed from: a */
    public Map<String, String> f73617a;

    /* renamed from: b */
    public C28363r0 f73618b;

    public AbstractC28356p(Map<String, String> map, C28363r0 c28363r0) {
        this.f73617a = map;
        this.f73618b = c28363r0;
    }

    /* renamed from: a */
    public abstract void mo38207a();

    /* renamed from: a */
    public boolean mo38206a(C28363r0.EnumC28373j enumC28373j) {
        return false;
    }

    /* renamed from: a */
    public int m38221a(String str) {
        String str2 = this.f73617a.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str2, 10);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
