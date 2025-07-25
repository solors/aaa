package com.iab.omid.library.vungle.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.vungle.adsession.C18737a;
import com.iab.omid.library.vungle.internal.C18747c;
import com.iab.omid.library.vungle.processor.InterfaceC18758a;
import com.iab.omid.library.vungle.utils.C18770c;
import com.iab.omid.library.vungle.utils.C18774e;
import com.iab.omid.library.vungle.utils.C18778h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.processor.c */
/* loaded from: classes6.dex */
public class C18761c implements InterfaceC18758a {

    /* renamed from: a */
    private final InterfaceC18758a f46914a;

    public C18761c(InterfaceC18758a interfaceC18758a) {
        this.f46914a = interfaceC18758a;
    }

    @NonNull
    /* renamed from: a */
    ArrayList<View> m61457a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C18747c m61518c = C18747c.m61518c();
        if (m61518c != null) {
            Collection<C18737a> m61522a = m61518c.m61522a();
            IdentityHashMap identityHashMap = new IdentityHashMap((m61522a.size() * 2) + 3);
            for (C18737a c18737a : m61522a) {
                View m61559c = c18737a.m61559c();
                if (m61559c != null && C18778h.m61370g(m61559c) && (rootView = m61559c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m61373d = C18778h.m61373d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C18778h.m61373d(arrayList.get(size - 1)) > m61373d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.vungle.processor.InterfaceC18758a
    /* renamed from: a */
    public JSONObject mo61456a(View view) {
        JSONObject m61418a = C18770c.m61418a(0, 0, 0, 0);
        C18770c.m61413a(m61418a, C18774e.m61394a());
        return m61418a;
    }

    @Override // com.iab.omid.library.vungle.processor.InterfaceC18758a
    /* renamed from: a */
    public void mo61455a(View view, JSONObject jSONObject, InterfaceC18758a.InterfaceC18759a interfaceC18759a, boolean z, boolean z2) {
        Iterator<View> it = m61457a().iterator();
        while (it.hasNext()) {
            interfaceC18759a.mo61364a(it.next(), this.f46914a, jSONObject, z2);
        }
    }
}
