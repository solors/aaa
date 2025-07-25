package com.iab.omid.library.pubnativenet.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.pubnativenet.adsession.C18496a;
import com.iab.omid.library.pubnativenet.internal.C18506c;
import com.iab.omid.library.pubnativenet.processor.InterfaceC18517a;
import com.iab.omid.library.pubnativenet.utils.C18529c;
import com.iab.omid.library.pubnativenet.utils.C18533e;
import com.iab.omid.library.pubnativenet.utils.C18537h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubnativenet.processor.c */
/* loaded from: classes6.dex */
public class C18520c implements InterfaceC18517a {

    /* renamed from: a */
    private final InterfaceC18517a f46388a;

    public C18520c(InterfaceC18517a interfaceC18517a) {
        this.f46388a = interfaceC18517a;
    }

    @NonNull
    /* renamed from: a */
    ArrayList<View> m62432a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C18506c m62493c = C18506c.m62493c();
        if (m62493c != null) {
            Collection<C18496a> m62497a = m62493c.m62497a();
            IdentityHashMap identityHashMap = new IdentityHashMap((m62497a.size() * 2) + 3);
            for (C18496a c18496a : m62497a) {
                View m62534c = c18496a.m62534c();
                if (m62534c != null && C18537h.m62345g(m62534c) && (rootView = m62534c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m62348d = C18537h.m62348d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C18537h.m62348d(arrayList.get(size - 1)) > m62348d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.pubnativenet.processor.InterfaceC18517a
    /* renamed from: a */
    public JSONObject mo62431a(View view) {
        JSONObject m62393a = C18529c.m62393a(0, 0, 0, 0);
        C18529c.m62388a(m62393a, C18533e.m62369a());
        return m62393a;
    }

    @Override // com.iab.omid.library.pubnativenet.processor.InterfaceC18517a
    /* renamed from: a */
    public void mo62430a(View view, JSONObject jSONObject, InterfaceC18517a.InterfaceC18518a interfaceC18518a, boolean z, boolean z2) {
        Iterator<View> it = m62432a().iterator();
        while (it.hasNext()) {
            interfaceC18518a.mo62339a(it.next(), this.f46388a, jSONObject, z2);
        }
    }
}
