package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.r7 */
/* loaded from: classes8.dex */
public final class C31264r7 {
    @NotNull

    /* renamed from: a */
    private final C30836ma f84655a = new C30836ma();
    @NotNull

    /* renamed from: b */
    private final if1 f84656b = new if1();

    @NotNull
    /* renamed from: a */
    public final gl1 m30128a(@Nullable C30705k7 c30705k7) {
        boolean z;
        String str = null;
        gl1 gl1Var = new gl1((Map) null, 3);
        if (c30705k7 != null) {
            Map<String, String> m32655h = c30705k7.m32655h();
            this.f84655a.getClass();
            gl1 gl1Var2 = new gl1(new HashMap(), 2);
            if (m32655h != null) {
                gl1Var2.m33818a((String) m32655h.get("adapter_network_name"), "adapter_network_name");
                gl1Var2.m33818a((String) m32655h.get("adapter_version"), "adapter_version");
                gl1Var2.m33818a((String) m32655h.get("adapter_network_sdk_version"), "adapter_network_sdk_version");
            }
            Map<String, Object> m33815b = gl1Var2.m33815b();
            this.f84656b.getClass();
            gl1 gl1Var3 = new gl1(new HashMap(), 2);
            if (m32655h != null) {
                gl1Var3.m33818a((String) m32655h.get("plugin_type"), "plugin_type");
                gl1Var3.m33818a((String) m32655h.get("plugin_version"), "plugin_version");
            }
            Map<String, Object> m33815b2 = gl1Var3.m33815b();
            String m32653j = c30705k7.m32653j();
            gl1Var.m33816a(m33815b);
            gl1Var.m33816a(m33815b2);
            gl1Var.m33818a(m32653j, "preload_type");
        }
        if (c30705k7 != null) {
            str = c30705k7.m32656g();
        }
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = true ^ z;
        gl1Var.m33814b(Boolean.valueOf(z2), "open_bidding");
        if (z2) {
            gl1Var.m33818a("openbidding", "integration_type");
        }
        return gl1Var;
    }
}
