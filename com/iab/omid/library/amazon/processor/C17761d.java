package com.iab.omid.library.amazon.processor;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.amazon.processor.InterfaceC17757a;
import com.iab.omid.library.amazon.utils.C17769c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.processor.d */
/* loaded from: classes6.dex */
public class C17761d implements InterfaceC17757a {

    /* renamed from: a */
    private final int[] f44833a = new int[2];

    @TargetApi(21)
    /* renamed from: b */
    private void m65322b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC17757a.InterfaceC17758a interfaceC17758a, boolean z) {
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
                interfaceC17758a.mo65237a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.amazon.processor.InterfaceC17757a
    /* renamed from: a */
    public JSONObject mo65325a(View view) {
        if (view == null) {
            return C17769c.m65288a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f44833a);
        int[] iArr = this.f44833a;
        return C17769c.m65288a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.amazon.processor.InterfaceC17757a
    /* renamed from: a */
    public void mo65324a(View view, JSONObject jSONObject, InterfaceC17757a.InterfaceC17758a interfaceC17758a, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m65322b(viewGroup, jSONObject, interfaceC17758a, z2);
            } else {
                m65323a(viewGroup, jSONObject, interfaceC17758a, z2);
            }
        }
    }

    /* renamed from: a */
    private void m65323a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC17757a.InterfaceC17758a interfaceC17758a, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC17758a.mo65237a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }
}
