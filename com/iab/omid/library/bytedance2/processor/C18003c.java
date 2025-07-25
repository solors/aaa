package com.iab.omid.library.bytedance2.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.adsession.C17981a;
import com.iab.omid.library.bytedance2.internal.C17991c;
import com.iab.omid.library.bytedance2.processor.InterfaceC18000a;
import com.iab.omid.library.bytedance2.utils.C18012c;
import com.iab.omid.library.bytedance2.utils.C18016e;
import com.iab.omid.library.bytedance2.utils.C18020h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance2.processor.c */
/* loaded from: classes6.dex */
public class C18003c implements InterfaceC18000a {

    /* renamed from: a */
    private final InterfaceC18000a f45346a;

    public C18003c(InterfaceC18000a interfaceC18000a) {
        this.f45346a = interfaceC18000a;
    }

    @NonNull
    /* renamed from: a */
    ArrayList<View> m64377a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C17991c m64431c = C17991c.m64431c();
        if (m64431c != null) {
            Collection<C17981a> m64435a = m64431c.m64435a();
            IdentityHashMap identityHashMap = new IdentityHashMap((m64435a.size() * 2) + 3);
            for (C17981a c17981a : m64435a) {
                View m64472c = c17981a.m64472c();
                if (m64472c != null && C18020h.m64294e(m64472c) && (rootView = m64472c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m64296c = C18020h.m64296c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C18020h.m64296c(arrayList.get(size - 1)) > m64296c) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.bytedance2.processor.InterfaceC18000a
    /* renamed from: a */
    public JSONObject mo64376a(View view) {
        JSONObject m64339a = C18012c.m64339a(0, 0, 0, 0);
        C18012c.m64334a(m64339a, C18016e.m64316a());
        return m64339a;
    }

    @Override // com.iab.omid.library.bytedance2.processor.InterfaceC18000a
    /* renamed from: a */
    public void mo64375a(View view, JSONObject jSONObject, InterfaceC18000a.InterfaceC18001a interfaceC18001a, boolean z, boolean z2) {
        Iterator<View> it = m64377a().iterator();
        while (it.hasNext()) {
            interfaceC18001a.mo64288a(it.next(), this.f45346a, jSONObject, z2);
        }
    }
}
