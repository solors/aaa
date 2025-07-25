package com.iab.omid.library.amazon.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.amazon.adsession.C17738a;
import com.iab.omid.library.amazon.internal.C17748c;
import com.iab.omid.library.amazon.processor.InterfaceC17757a;
import com.iab.omid.library.amazon.utils.C17769c;
import com.iab.omid.library.amazon.utils.C17773e;
import com.iab.omid.library.amazon.utils.C17777h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.processor.c */
/* loaded from: classes6.dex */
public class C17760c implements InterfaceC17757a {

    /* renamed from: a */
    private final InterfaceC17757a f44832a;

    public C17760c(InterfaceC17757a interfaceC17757a) {
        this.f44832a = interfaceC17757a;
    }

    @NonNull
    /* renamed from: a */
    ArrayList<View> m65326a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C17748c m65380c = C17748c.m65380c();
        if (m65380c != null) {
            Collection<C17738a> m65384a = m65380c.m65384a();
            IdentityHashMap identityHashMap = new IdentityHashMap((m65384a.size() * 2) + 3);
            for (C17738a c17738a : m65384a) {
                View m65421c = c17738a.m65421c();
                if (m65421c != null && C17777h.m65243e(m65421c) && (rootView = m65421c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m65245c = C17777h.m65245c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C17777h.m65245c(arrayList.get(size - 1)) > m65245c) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.amazon.processor.InterfaceC17757a
    /* renamed from: a */
    public JSONObject mo65325a(View view) {
        JSONObject m65288a = C17769c.m65288a(0, 0, 0, 0);
        C17769c.m65283a(m65288a, C17773e.m65265a());
        return m65288a;
    }

    @Override // com.iab.omid.library.amazon.processor.InterfaceC17757a
    /* renamed from: a */
    public void mo65324a(View view, JSONObject jSONObject, InterfaceC17757a.InterfaceC17758a interfaceC17758a, boolean z, boolean z2) {
        Iterator<View> it = m65326a().iterator();
        while (it.hasNext()) {
            interfaceC17758a.mo65237a(it.next(), this.f44832a, jSONObject, z2);
        }
    }
}
