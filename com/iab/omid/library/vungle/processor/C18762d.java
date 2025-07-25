package com.iab.omid.library.vungle.processor;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.vungle.processor.InterfaceC18758a;
import com.iab.omid.library.vungle.utils.C18770c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.processor.d */
/* loaded from: classes6.dex */
public class C18762d implements InterfaceC18758a {

    /* renamed from: a */
    private final int[] f46915a = new int[2];

    @TargetApi(21)
    /* renamed from: b */
    private void m61453b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18758a.InterfaceC18759a interfaceC18759a, boolean z) {
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
                interfaceC18759a.mo61364a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.vungle.processor.InterfaceC18758a
    /* renamed from: a */
    public JSONObject mo61456a(View view) {
        if (view == null) {
            return C18770c.m61418a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f46915a);
        int[] iArr = this.f46915a;
        return C18770c.m61418a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.vungle.processor.InterfaceC18758a
    /* renamed from: a */
    public void mo61455a(View view, JSONObject jSONObject, InterfaceC18758a.InterfaceC18759a interfaceC18759a, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m61453b(viewGroup, jSONObject, interfaceC18759a, z2);
            } else {
                m61454a(viewGroup, jSONObject, interfaceC18759a, z2);
            }
        }
    }

    /* renamed from: a */
    private void m61454a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18758a.InterfaceC18759a interfaceC18759a, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC18759a.mo61364a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }
}
