package com.iab.omid.library.corpmailru.p394c;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.corpmailru.adsession.C18045a;
import com.iab.omid.library.corpmailru.p393b.C18047a;
import com.iab.omid.library.corpmailru.p394c.InterfaceC18056a;
import com.iab.omid.library.corpmailru.p395d.C18062b;
import com.iab.omid.library.corpmailru.p395d.C18067f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.c.c */
/* loaded from: classes6.dex */
public class C18059c implements InterfaceC18056a {

    /* renamed from: a */
    private final InterfaceC18056a f45467a;

    public C18059c(InterfaceC18056a interfaceC18056a) {
        this.f45467a = interfaceC18056a;
    }

    @NonNull
    /* renamed from: a */
    public ArrayList<View> m64151a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C18047a m64206a = C18047a.m64206a();
        if (m64206a != null) {
            Collection<C18045a> m64202c = m64206a.m64202c();
            IdentityHashMap identityHashMap = new IdentityHashMap((m64202c.size() * 2) + 3);
            for (C18045a c18045a : m64202c) {
                View m64221d = c18045a.m64221d();
                if (m64221d != null && C18067f.m64108c(m64221d) && (rootView = m64221d.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m64110a = C18067f.m64110a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C18067f.m64110a(arrayList.get(size - 1)) > m64110a) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.corpmailru.p394c.InterfaceC18056a
    /* renamed from: a */
    public JSONObject mo64150a(View view) {
        return C18062b.m64141a(0, 0, 0, 0);
    }

    @Override // com.iab.omid.library.corpmailru.p394c.InterfaceC18056a
    /* renamed from: a */
    public void mo64149a(View view, JSONObject jSONObject, InterfaceC18056a.InterfaceC18057a interfaceC18057a, boolean z) {
        Iterator<View> it = m64151a().iterator();
        while (it.hasNext()) {
            interfaceC18057a.mo64078a(it.next(), this.f45467a, jSONObject);
        }
    }
}
