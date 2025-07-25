package com.iab.omid.library.mmadbridge.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.mmadbridge.adsession.C18286a;
import com.iab.omid.library.mmadbridge.internal.C18296c;
import com.iab.omid.library.mmadbridge.processor.InterfaceC18307a;
import com.iab.omid.library.mmadbridge.utils.C18319c;
import com.iab.omid.library.mmadbridge.utils.C18323e;
import com.iab.omid.library.mmadbridge.utils.C18327h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.processor.c */
/* loaded from: classes6.dex */
public class C18310c implements InterfaceC18307a {

    /* renamed from: a */
    private final InterfaceC18307a f45983a;

    public C18310c(InterfaceC18307a interfaceC18307a) {
        this.f45983a = interfaceC18307a;
    }

    @NonNull
    /* renamed from: a */
    ArrayList<View> m63191a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C18296c m63252c = C18296c.m63252c();
        if (m63252c != null) {
            Collection<C18286a> m63256a = m63252c.m63256a();
            IdentityHashMap identityHashMap = new IdentityHashMap((m63256a.size() * 2) + 3);
            for (C18286a c18286a : m63256a) {
                View m63293c = c18286a.m63293c();
                if (m63293c != null && C18327h.m63104g(m63293c) && (rootView = m63293c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m63107d = C18327h.m63107d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C18327h.m63107d(arrayList.get(size - 1)) > m63107d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.mmadbridge.processor.InterfaceC18307a
    /* renamed from: a */
    public JSONObject mo63190a(View view) {
        JSONObject m63152a = C18319c.m63152a(0, 0, 0, 0);
        C18319c.m63147a(m63152a, C18323e.m63128a());
        return m63152a;
    }

    @Override // com.iab.omid.library.mmadbridge.processor.InterfaceC18307a
    /* renamed from: a */
    public void mo63189a(View view, JSONObject jSONObject, InterfaceC18307a.InterfaceC18308a interfaceC18308a, boolean z, boolean z2) {
        Iterator<View> it = m63191a().iterator();
        while (it.hasNext()) {
            interfaceC18308a.mo63098a(it.next(), this.f45983a, jSONObject, z2);
        }
    }
}
