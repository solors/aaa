package com.fyber.inneractive.sdk.config.global.features;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.config.global.features.k */
/* loaded from: classes4.dex */
public final class C14364k extends AbstractC14361h {
    public C14364k() {
        super("load_timeouts");
    }

    /* renamed from: a */
    public static String m77953a(String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = Arrays.asList(strArr).iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append("_");
            }
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public static boolean m77950d(String str) {
        if (!UnitDisplayType.INTERSTITIAL.name().equalsIgnoreCase(str) && !UnitDisplayType.REWARDED.name().equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static String m77949e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "all_mediators";
        }
        return str.toLowerCase(Locale.US);
    }

    /* renamed from: b */
    public final int m77952b(String str, String str2) {
        int i;
        String m77953a = m77953a(str, "bidding", "global_timeout", m77949e(str2));
        String m77953a2 = m77953a(str, "bidding", "global_timeout", "all_mediators");
        if (m77950d(str)) {
            i = 30000;
        } else {
            i = 10000;
        }
        Integer mo77934a = mo77934a(m77953a(str, "global_timeout", "all_mediators"));
        if (mo77934a != null) {
            i = mo77934a.intValue();
        }
        Integer mo77934a2 = mo77934a(m77953a2);
        if (mo77934a2 != null) {
            i = mo77934a2.intValue();
        }
        Integer mo77934a3 = mo77934a(m77953a);
        if (mo77934a3 != null) {
            return mo77934a3.intValue();
        }
        return i;
    }

    /* renamed from: c */
    public final int m77951c(String str, String str2) {
        String m77953a = m77953a(str, "global_timeout", m77949e(str2));
        String m77953a2 = m77953a(str, "global_timeout", "all_mediators");
        int i = m77950d(str) ? 30000 : 10000;
        Integer mo77934a = mo77934a(m77953a(str, "global_timeout", "all_mediators"));
        if (mo77934a != null) {
            i = mo77934a.intValue();
        }
        Integer mo77934a2 = mo77934a(m77953a2);
        if (mo77934a2 != null) {
            i = mo77934a2.intValue();
        }
        Integer mo77934a3 = mo77934a(m77953a);
        return mo77934a3 != null ? mo77934a3.intValue() : i;
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.AbstractC14361h
    /* renamed from: c */
    public final AbstractC14361h mo77947c() {
        C14364k c14364k = new C14364k();
        m77954a(c14364k);
        return c14364k;
    }
}
