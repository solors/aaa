package com.p551my.target;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.f5 */
/* loaded from: classes7.dex */
public abstract class AbstractC25749f5 {

    /* renamed from: a */
    public final Map f66837a = new HashMap();

    /* renamed from: com.my.target.f5$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC25750a {
        /* renamed from: a */
        void mo42889a();

        /* renamed from: a */
        void mo42888a(Object obj);
    }

    /* renamed from: a */
    public boolean m43932a(String str, InterfaceC25750a interfaceC25750a) {
        boolean z;
        synchronized (this.f66837a) {
            if (this.f66837a.containsKey(str)) {
                List list = (List) this.f66837a.get(str);
                if (list != null) {
                    list.add(interfaceC25750a);
                }
                z = true;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(interfaceC25750a);
                this.f66837a.put(str, arrayList);
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void m43931a(String str, Object obj) {
        synchronized (this.f66837a) {
            List<InterfaceC25750a> list = (List) this.f66837a.get(str);
            if (list == null) {
                return;
            }
            if (obj == null) {
                for (InterfaceC25750a interfaceC25750a : list) {
                    interfaceC25750a.mo42889a();
                }
            } else {
                for (InterfaceC25750a interfaceC25750a2 : list) {
                    interfaceC25750a2.mo42888a(obj);
                }
            }
            this.f66837a.remove(str);
        }
    }
}
