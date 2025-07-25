package com.iab.omid.library.taurusx.processor;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.taurusx.processor.InterfaceC18639a;
import com.iab.omid.library.taurusx.utils.C18651c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.taurusx.processor.d */
/* loaded from: classes6.dex */
public class C18643d implements InterfaceC18639a {

    /* renamed from: a */
    private final int[] f46653a = new int[2];

    @TargetApi(21)
    /* renamed from: b */
    private void m61932b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18639a.InterfaceC18640a interfaceC18640a, boolean z) {
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
                interfaceC18640a.mo61850a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.taurusx.processor.InterfaceC18639a
    /* renamed from: a */
    public JSONObject mo61935a(View view) {
        if (view == null) {
            return C18651c.m61898a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f46653a);
        int[] iArr = this.f46653a;
        return C18651c.m61898a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.taurusx.processor.InterfaceC18639a
    /* renamed from: a */
    public void mo61934a(View view, JSONObject jSONObject, InterfaceC18639a.InterfaceC18640a interfaceC18640a, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m61932b(viewGroup, jSONObject, interfaceC18640a, z2);
            } else {
                m61933a(viewGroup, jSONObject, interfaceC18640a, z2);
            }
        }
    }

    /* renamed from: a */
    private void m61933a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18639a.InterfaceC18640a interfaceC18640a, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC18640a.mo61850a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }
}
