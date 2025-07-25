package com.iab.omid.library.fyber.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.fyber.adsession.C18099a;
import com.iab.omid.library.fyber.internal.C18109c;
import com.iab.omid.library.fyber.processor.InterfaceC18120a;
import com.iab.omid.library.fyber.utils.C18132c;
import com.iab.omid.library.fyber.utils.C18136e;
import com.iab.omid.library.fyber.utils.C18140h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.processor.c */
/* loaded from: classes6.dex */
public class C18123c implements InterfaceC18120a {

    /* renamed from: a */
    private final InterfaceC18120a f45594a;

    public C18123c(InterfaceC18120a interfaceC18120a) {
        this.f45594a = interfaceC18120a;
    }

    @NonNull
    /* renamed from: a */
    ArrayList<View> m63920a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C18109c m63981c = C18109c.m63981c();
        if (m63981c != null) {
            Collection<C18099a> m63985a = m63981c.m63985a();
            IdentityHashMap identityHashMap = new IdentityHashMap((m63985a.size() * 2) + 3);
            for (C18099a c18099a : m63985a) {
                View m64022c = c18099a.m64022c();
                if (m64022c != null && C18140h.m63833g(m64022c) && (rootView = m64022c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m63836d = C18140h.m63836d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C18140h.m63836d(arrayList.get(size - 1)) > m63836d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.fyber.processor.InterfaceC18120a
    /* renamed from: a */
    public JSONObject mo63919a(View view) {
        JSONObject m63881a = C18132c.m63881a(0, 0, 0, 0);
        C18132c.m63876a(m63881a, C18136e.m63857a());
        return m63881a;
    }

    @Override // com.iab.omid.library.fyber.processor.InterfaceC18120a
    /* renamed from: a */
    public void mo63918a(View view, JSONObject jSONObject, InterfaceC18120a.InterfaceC18121a interfaceC18121a, boolean z, boolean z2) {
        Iterator<View> it = m63920a().iterator();
        while (it.hasNext()) {
            interfaceC18121a.mo63827a(it.next(), this.f45594a, jSONObject, z2);
        }
    }
}
