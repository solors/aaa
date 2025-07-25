package com.iab.omid.library.ironsrc.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.ironsrc.adsession.C18228a;
import com.iab.omid.library.ironsrc.internal.C18238c;
import com.iab.omid.library.ironsrc.processor.InterfaceC18246a;
import com.iab.omid.library.ironsrc.utils.C18257c;
import com.iab.omid.library.ironsrc.utils.C18261e;
import com.iab.omid.library.ironsrc.utils.C18265h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.processor.c */
/* loaded from: classes6.dex */
public class C18249c implements InterfaceC18246a {

    /* renamed from: a */
    private final InterfaceC18246a f45851a;

    public C18249c(InterfaceC18246a interfaceC18246a) {
        this.f45851a = interfaceC18246a;
    }

    @NonNull
    /* renamed from: a */
    ArrayList<View> m63436a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C18238c m63484c = C18238c.m63484c();
        if (m63484c != null) {
            Collection<C18228a> m63488a = m63484c.m63488a();
            IdentityHashMap identityHashMap = new IdentityHashMap((m63488a.size() * 2) + 3);
            for (C18228a c18228a : m63488a) {
                View m63527c = c18228a.m63527c();
                if (m63527c != null && C18265h.m63354e(m63527c) && (rootView = m63527c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m63356c = C18265h.m63356c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C18265h.m63356c(arrayList.get(size - 1)) > m63356c) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.ironsrc.processor.InterfaceC18246a
    /* renamed from: a */
    public JSONObject mo63435a(View view) {
        JSONObject m63398a = C18257c.m63398a(0, 0, 0, 0);
        C18257c.m63393a(m63398a, C18261e.m63376a());
        return m63398a;
    }

    @Override // com.iab.omid.library.ironsrc.processor.InterfaceC18246a
    /* renamed from: a */
    public void mo63434a(View view, JSONObject jSONObject, InterfaceC18246a.InterfaceC18247a interfaceC18247a, boolean z, boolean z2) {
        Iterator<View> it = m63436a().iterator();
        while (it.hasNext()) {
            interfaceC18247a.mo63350a(it.next(), this.f45851a, jSONObject, z2);
        }
    }
}
