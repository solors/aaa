package com.iab.omid.library.pubmatic.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.pubmatic.adsession.C18426a;
import com.iab.omid.library.pubmatic.internal.C18436c;
import com.iab.omid.library.pubmatic.processor.InterfaceC18447a;
import com.iab.omid.library.pubmatic.utils.C18459c;
import com.iab.omid.library.pubmatic.utils.C18463e;
import com.iab.omid.library.pubmatic.utils.C18467h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubmatic.processor.c */
/* loaded from: classes6.dex */
public class C18450c implements InterfaceC18447a {

    /* renamed from: a */
    private final InterfaceC18447a f46253a;

    public C18450c(InterfaceC18447a interfaceC18447a) {
        this.f46253a = interfaceC18447a;
    }

    @NonNull
    /* renamed from: a */
    ArrayList<View> m62685a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C18436c m62746c = C18436c.m62746c();
        if (m62746c != null) {
            Collection<C18426a> m62750a = m62746c.m62750a();
            IdentityHashMap identityHashMap = new IdentityHashMap((m62750a.size() * 2) + 3);
            for (C18426a c18426a : m62750a) {
                View m62787c = c18426a.m62787c();
                if (m62787c != null && C18467h.m62598g(m62787c) && (rootView = m62787c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m62601d = C18467h.m62601d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C18467h.m62601d(arrayList.get(size - 1)) > m62601d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.pubmatic.processor.InterfaceC18447a
    /* renamed from: a */
    public JSONObject mo62684a(View view) {
        JSONObject m62646a = C18459c.m62646a(0, 0, 0, 0);
        C18459c.m62641a(m62646a, C18463e.m62622a());
        return m62646a;
    }

    @Override // com.iab.omid.library.pubmatic.processor.InterfaceC18447a
    /* renamed from: a */
    public void mo62683a(View view, JSONObject jSONObject, InterfaceC18447a.InterfaceC18448a interfaceC18448a, boolean z, boolean z2) {
        Iterator<View> it = m62685a().iterator();
        while (it.hasNext()) {
            interfaceC18448a.mo62592a(it.next(), this.f46253a, jSONObject, z2);
        }
    }
}
