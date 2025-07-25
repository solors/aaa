package com.iab.omid.library.taurusx.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.taurusx.adsession.C18621a;
import com.iab.omid.library.taurusx.internal.C18631c;
import com.iab.omid.library.taurusx.processor.InterfaceC18639a;
import com.iab.omid.library.taurusx.utils.C18651c;
import com.iab.omid.library.taurusx.utils.C18655e;
import com.iab.omid.library.taurusx.utils.C18659h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.taurusx.processor.c */
/* loaded from: classes6.dex */
public class C18642c implements InterfaceC18639a {

    /* renamed from: a */
    private final InterfaceC18639a f46652a;

    public C18642c(InterfaceC18639a interfaceC18639a) {
        this.f46652a = interfaceC18639a;
    }

    @NonNull
    /* renamed from: a */
    ArrayList<View> m61936a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C18631c m61984c = C18631c.m61984c();
        if (m61984c != null) {
            Collection<C18621a> m61988a = m61984c.m61988a();
            IdentityHashMap identityHashMap = new IdentityHashMap((m61988a.size() * 2) + 3);
            for (C18621a c18621a : m61988a) {
                View m62027c = c18621a.m62027c();
                if (m62027c != null && C18659h.m61854e(m62027c) && (rootView = m62027c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m61856c = C18659h.m61856c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C18659h.m61856c(arrayList.get(size - 1)) > m61856c) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.taurusx.processor.InterfaceC18639a
    /* renamed from: a */
    public JSONObject mo61935a(View view) {
        JSONObject m61898a = C18651c.m61898a(0, 0, 0, 0);
        C18651c.m61893a(m61898a, C18655e.m61876a());
        return m61898a;
    }

    @Override // com.iab.omid.library.taurusx.processor.InterfaceC18639a
    /* renamed from: a */
    public void mo61934a(View view, JSONObject jSONObject, InterfaceC18639a.InterfaceC18640a interfaceC18640a, boolean z, boolean z2) {
        Iterator<View> it = m61936a().iterator();
        while (it.hasNext()) {
            interfaceC18640a.mo61850a(it.next(), this.f46652a, jSONObject, z2);
        }
    }
}
