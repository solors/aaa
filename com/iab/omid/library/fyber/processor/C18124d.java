package com.iab.omid.library.fyber.processor;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.fyber.processor.InterfaceC18120a;
import com.iab.omid.library.fyber.utils.C18132c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.processor.d */
/* loaded from: classes6.dex */
public class C18124d implements InterfaceC18120a {

    /* renamed from: a */
    private final int[] f45595a = new int[2];

    @TargetApi(21)
    /* renamed from: b */
    private void m63916b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18120a.InterfaceC18121a interfaceC18121a, boolean z) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                interfaceC18121a.mo63827a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.fyber.processor.InterfaceC18120a
    /* renamed from: a */
    public JSONObject mo63919a(View view) {
        if (view == null) {
            return C18132c.m63881a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f45595a);
        int[] iArr = this.f45595a;
        return C18132c.m63881a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.fyber.processor.InterfaceC18120a
    /* renamed from: a */
    public void mo63918a(View view, JSONObject jSONObject, InterfaceC18120a.InterfaceC18121a interfaceC18121a, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m63916b(viewGroup, jSONObject, interfaceC18121a, z2);
            } else {
                m63917a(viewGroup, jSONObject, interfaceC18121a, z2);
            }
        }
    }

    /* renamed from: a */
    private void m63917a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18120a.InterfaceC18121a interfaceC18121a, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC18121a.mo63827a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }
}
