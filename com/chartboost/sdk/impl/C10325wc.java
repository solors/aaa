package com.chartboost.sdk.impl;

import android.view.View;
import com.chartboost.sdk.impl.InterfaceC9836ec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.wc */
/* loaded from: classes3.dex */
public class C10325wc implements InterfaceC9836ec {

    /* renamed from: a */
    public final InterfaceC9836ec f23463a;

    public C10325wc(InterfaceC9836ec interfaceC9836ec) {
        this.f23463a = interfaceC9836ec;
    }

    /* renamed from: a */
    public ArrayList m80145a() {
        View rootView;
        ArrayList arrayList = new ArrayList();
        C10300vc m80229c = C10300vc.m80229c();
        if (m80229c != null) {
            Collection<C9746bc> m80233a = m80229c.m80233a();
            IdentityHashMap identityHashMap = new IdentityHashMap((m80233a.size() * 2) + 3);
            for (C9746bc c9746bc : m80233a) {
                View m81980e = c9746bc.m81980e();
                if (m81980e != null && AbstractC10156qd.m80708g(m81980e) && (rootView = m81980e.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m80711d = AbstractC10156qd.m80711d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && AbstractC10156qd.m80711d((View) arrayList.get(size - 1)) > m80711d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC9836ec
    /* renamed from: a */
    public JSONObject mo80144a(View view) {
        JSONObject m80058a = AbstractC10359xc.m80058a(0, 0, 0, 0);
        AbstractC10359xc.m80053a(m80058a, AbstractC9873gd.m81600a());
        return m80058a;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC9836ec
    /* renamed from: a */
    public void mo80143a(View view, JSONObject jSONObject, InterfaceC9836ec.InterfaceC9837a interfaceC9837a, boolean z, boolean z2) {
        Iterator it = m80145a().iterator();
        while (it.hasNext()) {
            interfaceC9837a.mo80514a((View) it.next(), this.f23463a, jSONObject, z2);
        }
    }
}
