package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.zh2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class qi2 implements zh2 {

    /* renamed from: a */
    private final zh2 f84376a;

    public qi2(ui2 ui2Var) {
        this.f84376a = ui2Var;
    }

    @Override // com.yandex.mobile.ads.impl.zh2
    /* renamed from: a */
    public final JSONObject mo26161a(View view) {
        return ki2.m32543a(0, 0, 0, 0);
    }

    @Override // com.yandex.mobile.ads.impl.zh2
    /* renamed from: a */
    public final void mo26160a(View view, JSONObject jSONObject, zh2.InterfaceC31993a interfaceC31993a, boolean z, boolean z2) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        yh2 m26905a = yh2.m26905a();
        if (m26905a != null) {
            Collection<xh2> m26901c = m26905a.m26901c();
            IdentityHashMap identityHashMap = new IdentityHashMap((m26901c.size() * 2) + 3);
            for (xh2 xh2Var : m26901c) {
                View m27485f = xh2Var.m27485f();
                if (m27485f != null && cj2.m35225b(m27485f) && (rootView = m27485f.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m35226a = cj2.m35226a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && cj2.m35226a((View) arrayList.get(size - 1)) > m35226a) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b22) interfaceC31993a).m35679a((View) it.next(), this.f84376a, jSONObject, z2);
        }
    }
}
