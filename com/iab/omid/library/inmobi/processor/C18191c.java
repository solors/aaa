package com.iab.omid.library.inmobi.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.inmobi.adsession.C18169a;
import com.iab.omid.library.inmobi.internal.C18179c;
import com.iab.omid.library.inmobi.processor.InterfaceC18188a;
import com.iab.omid.library.inmobi.utils.C18200c;
import com.iab.omid.library.inmobi.utils.C18204e;
import com.iab.omid.library.inmobi.utils.C18208h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.processor.c */
/* loaded from: classes6.dex */
public class C18191c implements InterfaceC18188a {

    /* renamed from: a */
    private final InterfaceC18188a f45724a;

    public C18191c(InterfaceC18188a interfaceC18188a) {
        this.f45724a = interfaceC18188a;
    }

    @NonNull
    /* renamed from: a */
    ArrayList<View> m63674a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C18179c m63728c = C18179c.m63728c();
        if (m63728c != null) {
            Collection<C18169a> m63732a = m63728c.m63732a();
            IdentityHashMap identityHashMap = new IdentityHashMap((m63732a.size() * 2) + 3);
            for (C18169a c18169a : m63732a) {
                View m63769c = c18169a.m63769c();
                if (m63769c != null && C18208h.m63591e(m63769c) && (rootView = m63769c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m63593c = C18208h.m63593c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C18208h.m63593c(arrayList.get(size - 1)) > m63593c) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.inmobi.processor.InterfaceC18188a
    /* renamed from: a */
    public JSONObject mo63673a(View view) {
        JSONObject m63636a = C18200c.m63636a(0, 0, 0, 0);
        C18200c.m63631a(m63636a, C18204e.m63613a());
        return m63636a;
    }

    @Override // com.iab.omid.library.inmobi.processor.InterfaceC18188a
    /* renamed from: a */
    public void mo63672a(View view, JSONObject jSONObject, InterfaceC18188a.InterfaceC18189a interfaceC18189a, boolean z, boolean z2) {
        Iterator<View> it = m63674a().iterator();
        while (it.hasNext()) {
            interfaceC18189a.mo63585a(it.next(), this.f45724a, jSONObject, z2);
        }
    }
}
