package com.fyber.inneractive.sdk.config.global.features;

import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.config.global.features.r */
/* loaded from: classes4.dex */
public final class C14371r extends AbstractC14361h {
    public C14371r() {
        super("store_webpage");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.AbstractC14361h
    /* renamed from: c */
    public final AbstractC14361h mo77947c() {
        C14371r c14371r = new C14371r();
        m77954a(c14371r);
        return c14371r;
    }

    /* renamed from: d */
    public final EnumC14370q m77948d() {
        EnumC14370q[] values;
        String mo77933a = mo77933a("presentation_mode", null);
        if (mo77933a != null) {
            for (EnumC14370q enumC14370q : EnumC14370q.values()) {
                Locale locale = Locale.US;
                if (mo77933a.toLowerCase(locale).equals(enumC14370q.value.toLowerCase(locale))) {
                    return enumC14370q;
                }
            }
        }
        return EnumC14370q.FullScreen;
    }
}
