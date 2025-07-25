package com.iab.omid.library.appodeal.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.appodeal.adsession.C17867a;
import com.iab.omid.library.appodeal.internal.C17877c;
import com.iab.omid.library.appodeal.processor.InterfaceC17888a;
import com.iab.omid.library.appodeal.utils.C17900c;
import com.iab.omid.library.appodeal.utils.C17904e;
import com.iab.omid.library.appodeal.utils.C17908h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.appodeal.processor.c */
/* loaded from: classes6.dex */
public class C17891c implements InterfaceC17888a {

    /* renamed from: a */
    private final InterfaceC17888a f45095a;

    public C17891c(InterfaceC17888a interfaceC17888a) {
        this.f45095a = interfaceC17888a;
    }

    @NonNull
    /* renamed from: a */
    ArrayList<View> m64837a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C17877c m64898c = C17877c.m64898c();
        if (m64898c != null) {
            Collection<C17867a> m64902a = m64898c.m64902a();
            IdentityHashMap identityHashMap = new IdentityHashMap((m64902a.size() * 2) + 3);
            for (C17867a c17867a : m64902a) {
                View m64939c = c17867a.m64939c();
                if (m64939c != null && C17908h.m64750g(m64939c) && (rootView = m64939c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m64753d = C17908h.m64753d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C17908h.m64753d(arrayList.get(size - 1)) > m64753d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.appodeal.processor.InterfaceC17888a
    /* renamed from: a */
    public JSONObject mo64836a(View view) {
        JSONObject m64798a = C17900c.m64798a(0, 0, 0, 0);
        C17900c.m64793a(m64798a, C17904e.m64774a());
        return m64798a;
    }

    @Override // com.iab.omid.library.appodeal.processor.InterfaceC17888a
    /* renamed from: a */
    public void mo64835a(View view, JSONObject jSONObject, InterfaceC17888a.InterfaceC17889a interfaceC17889a, boolean z, boolean z2) {
        Iterator<View> it = m64837a().iterator();
        while (it.hasNext()) {
            interfaceC17889a.mo64744a(it.next(), this.f45095a, jSONObject, z2);
        }
    }
}
