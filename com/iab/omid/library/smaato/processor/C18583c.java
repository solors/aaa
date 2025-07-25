package com.iab.omid.library.smaato.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.smaato.adsession.C18559a;
import com.iab.omid.library.smaato.internal.C18569c;
import com.iab.omid.library.smaato.processor.InterfaceC18580a;
import com.iab.omid.library.smaato.utils.C18592c;
import com.iab.omid.library.smaato.utils.C18596e;
import com.iab.omid.library.smaato.utils.C18600h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.processor.c */
/* loaded from: classes6.dex */
public class C18583c implements InterfaceC18580a {

    /* renamed from: a */
    private final InterfaceC18580a f46523a;

    public C18583c(InterfaceC18580a interfaceC18580a) {
        this.f46523a = interfaceC18580a;
    }

    @NonNull
    /* renamed from: a */
    ArrayList<View> m62179a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C18569c m62240c = C18569c.m62240c();
        if (m62240c != null) {
            Collection<C18559a> m62244a = m62240c.m62244a();
            IdentityHashMap identityHashMap = new IdentityHashMap((m62244a.size() * 2) + 3);
            for (C18559a c18559a : m62244a) {
                View m62281c = c18559a.m62281c();
                if (m62281c != null && C18600h.m62092g(m62281c) && (rootView = m62281c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m62095d = C18600h.m62095d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C18600h.m62095d(arrayList.get(size - 1)) > m62095d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.smaato.processor.InterfaceC18580a
    /* renamed from: a */
    public JSONObject mo62178a(View view) {
        JSONObject m62140a = C18592c.m62140a(0, 0, 0, 0);
        C18592c.m62135a(m62140a, C18596e.m62116a());
        return m62140a;
    }

    @Override // com.iab.omid.library.smaato.processor.InterfaceC18580a
    /* renamed from: a */
    public void mo62177a(View view, JSONObject jSONObject, InterfaceC18580a.InterfaceC18581a interfaceC18581a, boolean z, boolean z2) {
        Iterator<View> it = m62179a().iterator();
        while (it.hasNext()) {
            interfaceC18581a.mo62086a(it.next(), this.f46523a, jSONObject, z2);
        }
    }
}
