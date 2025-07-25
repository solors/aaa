package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.config.global.AbstractC14386p;
import com.fyber.inneractive.sdk.config.global.C14381k;
import com.fyber.inneractive.sdk.config.global.InterfaceC14384n;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.fyber.inneractive.sdk.config.global.features.h */
/* loaded from: classes4.dex */
public abstract class AbstractC14361h extends AbstractC14386p {

    /* renamed from: b */
    public String f27198b;

    /* renamed from: c */
    public HashMap f27199c = new HashMap();

    /* renamed from: d */
    public HashMap f27200d = new HashMap();

    public AbstractC14361h(String str) {
        this.f27198b = str;
    }

    @Override // com.fyber.inneractive.sdk.config.global.AbstractC14386p, com.fyber.inneractive.sdk.config.global.InterfaceC14384n
    /* renamed from: a */
    public final String mo77933a(String str, String str2) {
        String str3;
        Iterator it = this.f27200d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = null;
                break;
            }
            str3 = ((C14381k) this.f27200d.get((String) it.next())).mo77931b(str);
            if (str3 != null) {
                break;
            }
        }
        if (str3 == null) {
            InterfaceC14384n interfaceC14384n = this.f27214a;
            return interfaceC14384n != null ? interfaceC14384n.mo77933a(str, str2) : str2;
        }
        return str3;
    }

    @Override // com.fyber.inneractive.sdk.config.global.AbstractC14386p, com.fyber.inneractive.sdk.config.global.InterfaceC14384n
    /* renamed from: b */
    public final String mo77931b(String str) {
        return mo77933a(str, null);
    }

    /* renamed from: c */
    public abstract AbstractC14361h mo77947c();

    @Override // com.fyber.inneractive.sdk.config.global.AbstractC14386p, com.fyber.inneractive.sdk.config.global.InterfaceC14384n
    /* renamed from: c */
    public final Boolean mo77930c(String str) {
        Boolean bool;
        Iterator it = this.f27200d.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                bool = ((C14381k) this.f27200d.get((String) it.next())).mo77930c(str);
                if (bool != null) {
                    break;
                }
            } else {
                bool = null;
                break;
            }
        }
        if (bool == null) {
            return super.mo77930c(str);
        }
        return bool;
    }

    public final String toString() {
        return String.format("id: %s, params: %s exp: %s", this.f27198b, this.f27214a, this.f27199c);
    }

    @Override // com.fyber.inneractive.sdk.config.global.AbstractC14386p, com.fyber.inneractive.sdk.config.global.InterfaceC14384n
    /* renamed from: a */
    public final Double mo77935a() {
        Double d;
        Iterator it = this.f27200d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                d = null;
                break;
            }
            d = ((C14381k) this.f27200d.get((String) it.next())).mo77935a();
            if (d != null) {
                break;
            }
        }
        return d == null ? super.mo77935a() : d;
    }

    @Override // com.fyber.inneractive.sdk.config.global.AbstractC14386p, com.fyber.inneractive.sdk.config.global.InterfaceC14384n
    /* renamed from: a */
    public final Integer mo77934a(String str) {
        Integer num;
        Iterator it = this.f27200d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = ((C14381k) this.f27200d.get((String) it.next())).mo77934a(str);
            if (num != null) {
                break;
            }
        }
        return num == null ? super.mo77934a(str) : num;
    }

    /* renamed from: a */
    public final void m77954a(AbstractC14361h abstractC14361h) {
        abstractC14361h.f27198b = this.f27198b;
        abstractC14361h.f27214a = this.f27214a;
        abstractC14361h.f27199c = new HashMap(this.f27199c);
        abstractC14361h.f27200d = new HashMap(this.f27200d);
    }
}
