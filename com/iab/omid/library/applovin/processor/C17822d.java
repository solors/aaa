package com.iab.omid.library.applovin.processor;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.applovin.processor.InterfaceC17818a;
import com.iab.omid.library.applovin.utils.C17830c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.processor.d */
/* loaded from: classes6.dex */
public class C17822d implements InterfaceC17818a {

    /* renamed from: a */
    private final int[] f44962a = new int[2];

    @TargetApi(21)
    /* renamed from: b */
    private void m65081b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC17818a.InterfaceC17819a interfaceC17819a, boolean z) {
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
                interfaceC17819a.mo64996a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.applovin.processor.InterfaceC17818a
    /* renamed from: a */
    public JSONObject mo65084a(View view) {
        if (view == null) {
            return C17830c.m65047a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f44962a);
        int[] iArr = this.f44962a;
        return C17830c.m65047a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.applovin.processor.InterfaceC17818a
    /* renamed from: a */
    public void mo65083a(View view, JSONObject jSONObject, InterfaceC17818a.InterfaceC17819a interfaceC17819a, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m65081b(viewGroup, jSONObject, interfaceC17819a, z2);
            } else {
                m65082a(viewGroup, jSONObject, interfaceC17819a, z2);
            }
        }
    }

    /* renamed from: a */
    private void m65082a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC17818a.InterfaceC17819a interfaceC17819a, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC17819a.mo64996a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }
}
