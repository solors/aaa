package com.iab.omid.library.unity3d.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.unity3d.adsession.C18678a;
import com.iab.omid.library.unity3d.internal.C18688c;
import com.iab.omid.library.unity3d.processor.InterfaceC18696a;
import com.iab.omid.library.unity3d.utils.C18708c;
import com.iab.omid.library.unity3d.utils.C18712e;
import com.iab.omid.library.unity3d.utils.C18716h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.processor.c */
/* loaded from: classes6.dex */
public class C18699c implements InterfaceC18696a {

    /* renamed from: a */
    private final InterfaceC18696a f46780a;

    public C18699c(InterfaceC18696a interfaceC18696a) {
        this.f46780a = interfaceC18696a;
    }

    @NonNull
    /* renamed from: a */
    ArrayList<View> m61702a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C18688c m61749c = C18688c.m61749c();
        if (m61749c != null) {
            Collection<C18678a> m61753a = m61749c.m61753a();
            IdentityHashMap identityHashMap = new IdentityHashMap((m61753a.size() * 2) + 3);
            for (C18678a c18678a : m61753a) {
                View m61792c = c18678a.m61792c();
                if (m61792c != null && C18716h.m61620e(m61792c) && (rootView = m61792c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m61622c = C18716h.m61622c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C18716h.m61622c(arrayList.get(size - 1)) > m61622c) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.unity3d.processor.InterfaceC18696a
    /* renamed from: a */
    public JSONObject mo61701a(View view) {
        JSONObject m61664a = C18708c.m61664a(0, 0, 0, 0);
        C18708c.m61659a(m61664a, C18712e.m61642a());
        return m61664a;
    }

    @Override // com.iab.omid.library.unity3d.processor.InterfaceC18696a
    /* renamed from: a */
    public void mo61700a(View view, JSONObject jSONObject, InterfaceC18696a.InterfaceC18697a interfaceC18697a, boolean z, boolean z2) {
        Iterator<View> it = m61702a().iterator();
        while (it.hasNext()) {
            interfaceC18697a.mo61616a(it.next(), this.f46780a, jSONObject, z2);
        }
    }
}
