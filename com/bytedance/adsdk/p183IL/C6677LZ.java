package com.bytedance.adsdk.p183IL;

import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.Map;

/* renamed from: com.bytedance.adsdk.IL.LZ */
/* loaded from: classes3.dex */
public class C6677LZ {

    /* renamed from: IL */
    private boolean f14166IL;

    /* renamed from: bg */
    private final Map<String, String> f14167bg;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: IL */
    public final String m91166IL(String str, String str2) {
        if (this.f14166IL && this.f14167bg.containsKey(str2)) {
            return this.f14167bg.get(str2);
        }
        String m91164bg = m91164bg(str, str2);
        if (this.f14166IL) {
            this.f14167bg.put(str2, m91164bg);
        }
        return m91164bg;
    }

    /* renamed from: bg */
    public String m91165bg(String str) {
        return str;
    }

    /* renamed from: bg */
    public String m91164bg(String str, String str2) {
        return m91165bg(str2);
    }
}
