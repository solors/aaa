package com.iab.omid.library.pubmatic.processor;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.pubmatic.processor.InterfaceC18447a;
import com.iab.omid.library.pubmatic.utils.C18459c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubmatic.processor.d */
/* loaded from: classes6.dex */
public class C18451d implements InterfaceC18447a {

    /* renamed from: a */
    private final int[] f46254a = new int[2];

    @TargetApi(21)
    /* renamed from: b */
    private void m62681b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18447a.InterfaceC18448a interfaceC18448a, boolean z) {
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
                interfaceC18448a.mo62592a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.pubmatic.processor.InterfaceC18447a
    /* renamed from: a */
    public JSONObject mo62684a(View view) {
        if (view == null) {
            return C18459c.m62646a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f46254a);
        int[] iArr = this.f46254a;
        return C18459c.m62646a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.pubmatic.processor.InterfaceC18447a
    /* renamed from: a */
    public void mo62683a(View view, JSONObject jSONObject, InterfaceC18447a.InterfaceC18448a interfaceC18448a, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m62681b(viewGroup, jSONObject, interfaceC18448a, z2);
            } else {
                m62682a(viewGroup, jSONObject, interfaceC18448a, z2);
            }
        }
    }

    /* renamed from: a */
    private void m62682a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18447a.InterfaceC18448a interfaceC18448a, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC18448a.mo62592a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }
}
