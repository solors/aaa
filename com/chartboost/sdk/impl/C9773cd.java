package com.chartboost.sdk.impl;

import android.view.View;
import android.view.ViewGroup;
import com.chartboost.sdk.impl.InterfaceC9836ec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.cd */
/* loaded from: classes3.dex */
public class C9773cd implements InterfaceC9836ec {

    /* renamed from: a */
    public final int[] f21817a = new int[2];

    @Override // com.chartboost.sdk.impl.InterfaceC9836ec
    /* renamed from: a */
    public JSONObject mo80144a(View view) {
        if (view == null) {
            return AbstractC10359xc.m80058a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f21817a);
        int[] iArr = this.f21817a;
        return AbstractC10359xc.m80058a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: b */
    public final void m81893b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC9836ec.InterfaceC9837a interfaceC9837a, boolean z) {
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
                interfaceC9837a.mo80514a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC9836ec
    /* renamed from: a */
    public void mo80143a(View view, JSONObject jSONObject, InterfaceC9836ec.InterfaceC9837a interfaceC9837a, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m81893b(viewGroup, jSONObject, interfaceC9837a, z2);
            } else {
                m81894a(viewGroup, jSONObject, interfaceC9837a, z2);
            }
        }
    }

    /* renamed from: a */
    public final void m81894a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC9836ec.InterfaceC9837a interfaceC9837a, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC9837a.mo80514a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }
}
