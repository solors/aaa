package com.fyber.inneractive.sdk.config.global;

import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.config.global.p */
/* loaded from: classes4.dex */
public abstract class AbstractC14386p implements InterfaceC14384n {

    /* renamed from: a */
    public InterfaceC14384n f27214a;

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC14384n
    /* renamed from: a */
    public Integer mo77934a(String str) {
        InterfaceC14384n interfaceC14384n = this.f27214a;
        if (interfaceC14384n == null || interfaceC14384n.mo77932b() == null || this.f27214a.mo77932b().size() <= 0) {
            return null;
        }
        return this.f27214a.mo77934a(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC14384n
    /* renamed from: b */
    public String mo77931b(String str) {
        InterfaceC14384n interfaceC14384n = this.f27214a;
        if (interfaceC14384n == null || interfaceC14384n.mo77932b() == null || this.f27214a.mo77932b().size() <= 0) {
            return null;
        }
        return this.f27214a.mo77931b(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC14384n
    /* renamed from: c */
    public Boolean mo77930c(String str) {
        InterfaceC14384n interfaceC14384n = this.f27214a;
        if (interfaceC14384n != null && interfaceC14384n.mo77932b() != null && this.f27214a.mo77932b().size() > 0) {
            return this.f27214a.mo77930c(str);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC14384n
    /* renamed from: a */
    public String mo77933a(String str, String str2) {
        InterfaceC14384n interfaceC14384n = this.f27214a;
        return interfaceC14384n != null ? interfaceC14384n.mo77933a(str, str2) : str2;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC14384n
    /* renamed from: b */
    public final Map mo77932b() {
        InterfaceC14384n interfaceC14384n = this.f27214a;
        if (interfaceC14384n != null) {
            return interfaceC14384n.mo77932b();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC14384n
    /* renamed from: a */
    public Double mo77935a() {
        InterfaceC14384n interfaceC14384n = this.f27214a;
        if (interfaceC14384n == null || interfaceC14384n.mo77932b() == null || this.f27214a.mo77932b().size() <= 0) {
            return null;
        }
        return this.f27214a.mo77935a();
    }
}
