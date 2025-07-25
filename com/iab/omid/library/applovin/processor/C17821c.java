package com.iab.omid.library.applovin.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.applovin.adsession.C17799a;
import com.iab.omid.library.applovin.internal.C17809c;
import com.iab.omid.library.applovin.processor.InterfaceC17818a;
import com.iab.omid.library.applovin.utils.C17830c;
import com.iab.omid.library.applovin.utils.C17834e;
import com.iab.omid.library.applovin.utils.C17838h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.processor.c */
/* loaded from: classes6.dex */
public class C17821c implements InterfaceC17818a {

    /* renamed from: a */
    private final InterfaceC17818a f44961a;

    public C17821c(InterfaceC17818a interfaceC17818a) {
        this.f44961a = interfaceC17818a;
    }

    @NonNull
    /* renamed from: a */
    ArrayList<View> m65085a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C17809c m65139c = C17809c.m65139c();
        if (m65139c != null) {
            Collection<C17799a> m65143a = m65139c.m65143a();
            IdentityHashMap identityHashMap = new IdentityHashMap((m65143a.size() * 2) + 3);
            for (C17799a c17799a : m65143a) {
                View m65180c = c17799a.m65180c();
                if (m65180c != null && C17838h.m65002e(m65180c) && (rootView = m65180c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m65004c = C17838h.m65004c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C17838h.m65004c(arrayList.get(size - 1)) > m65004c) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.applovin.processor.InterfaceC17818a
    /* renamed from: a */
    public JSONObject mo65084a(View view) {
        JSONObject m65047a = C17830c.m65047a(0, 0, 0, 0);
        C17830c.m65042a(m65047a, C17834e.m65024a());
        return m65047a;
    }

    @Override // com.iab.omid.library.applovin.processor.InterfaceC17818a
    /* renamed from: a */
    public void mo65083a(View view, JSONObject jSONObject, InterfaceC17818a.InterfaceC17819a interfaceC17819a, boolean z, boolean z2) {
        Iterator<View> it = m65085a().iterator();
        while (it.hasNext()) {
            interfaceC17819a.mo64996a(it.next(), this.f44961a, jSONObject, z2);
        }
    }
}
