package com.iab.omid.library.mobilefuse.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.mobilefuse.adsession.C18356a;
import com.iab.omid.library.mobilefuse.internal.C18366c;
import com.iab.omid.library.mobilefuse.processor.InterfaceC18377a;
import com.iab.omid.library.mobilefuse.utils.C18389c;
import com.iab.omid.library.mobilefuse.utils.C18393e;
import com.iab.omid.library.mobilefuse.utils.C18397h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mobilefuse.processor.c */
/* loaded from: classes6.dex */
public class C18380c implements InterfaceC18377a {

    /* renamed from: a */
    private final InterfaceC18377a f46118a;

    public C18380c(InterfaceC18377a interfaceC18377a) {
        this.f46118a = interfaceC18377a;
    }

    @NonNull
    /* renamed from: a */
    ArrayList<View> m62938a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C18366c m62999c = C18366c.m62999c();
        if (m62999c != null) {
            Collection<C18356a> m63003a = m62999c.m63003a();
            IdentityHashMap identityHashMap = new IdentityHashMap((m63003a.size() * 2) + 3);
            for (C18356a c18356a : m63003a) {
                View m63040c = c18356a.m63040c();
                if (m63040c != null && C18397h.m62851g(m63040c) && (rootView = m63040c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m62854d = C18397h.m62854d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C18397h.m62854d(arrayList.get(size - 1)) > m62854d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.mobilefuse.processor.InterfaceC18377a
    /* renamed from: a */
    public JSONObject mo62937a(View view) {
        JSONObject m62899a = C18389c.m62899a(0, 0, 0, 0);
        C18389c.m62894a(m62899a, C18393e.m62875a());
        return m62899a;
    }

    @Override // com.iab.omid.library.mobilefuse.processor.InterfaceC18377a
    /* renamed from: a */
    public void mo62936a(View view, JSONObject jSONObject, InterfaceC18377a.InterfaceC18378a interfaceC18378a, boolean z, boolean z2) {
        Iterator<View> it = m62938a().iterator();
        while (it.hasNext()) {
            interfaceC18378a.mo62845a(it.next(), this.f46118a, jSONObject, z2);
        }
    }
}
