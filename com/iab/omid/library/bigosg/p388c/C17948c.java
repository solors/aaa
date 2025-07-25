package com.iab.omid.library.bigosg.p388c;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.bigosg.adsession.C17933a;
import com.iab.omid.library.bigosg.p387b.C17935a;
import com.iab.omid.library.bigosg.p388c.InterfaceC17945a;
import com.iab.omid.library.bigosg.p389d.C17951b;
import com.iab.omid.library.bigosg.p389d.C17956f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bigosg.c.c */
/* loaded from: classes6.dex */
public class C17948c implements InterfaceC17945a {

    /* renamed from: a */
    private final InterfaceC17945a f45225a;

    public C17948c(InterfaceC17945a interfaceC17945a) {
        this.f45225a = interfaceC17945a;
    }

    @NonNull
    /* renamed from: a */
    ArrayList<View> m64601a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C17935a m64659a = C17935a.m64659a();
        if (m64659a != null) {
            Collection<C17933a> m64655c = m64659a.m64655c();
            IdentityHashMap identityHashMap = new IdentityHashMap((m64655c.size() * 2) + 3);
            for (C17933a c17933a : m64655c) {
                View m64676d = c17933a.m64676d();
                if (m64676d != null && C17956f.m64558c(m64676d) && (rootView = m64676d.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m64560a = C17956f.m64560a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C17956f.m64560a(arrayList.get(size - 1)) > m64560a) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.bigosg.p388c.InterfaceC17945a
    /* renamed from: a */
    public JSONObject mo64600a(View view) {
        return C17951b.m64591a(0, 0, 0, 0);
    }

    @Override // com.iab.omid.library.bigosg.p388c.InterfaceC17945a
    /* renamed from: a */
    public void mo64599a(View view, JSONObject jSONObject, InterfaceC17945a.InterfaceC17946a interfaceC17946a, boolean z) {
        Iterator<View> it = m64601a().iterator();
        while (it.hasNext()) {
            interfaceC17946a.mo64528a(it.next(), this.f45225a, jSONObject);
        }
    }
}
