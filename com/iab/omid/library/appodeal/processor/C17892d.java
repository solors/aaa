package com.iab.omid.library.appodeal.processor;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.appodeal.processor.InterfaceC17888a;
import com.iab.omid.library.appodeal.utils.C17900c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.appodeal.processor.d */
/* loaded from: classes6.dex */
public class C17892d implements InterfaceC17888a {

    /* renamed from: a */
    private final int[] f45096a = new int[2];

    @TargetApi(21)
    /* renamed from: b */
    private void m64833b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC17888a.InterfaceC17889a interfaceC17889a, boolean z) {
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
                interfaceC17889a.mo64744a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.appodeal.processor.InterfaceC17888a
    /* renamed from: a */
    public JSONObject mo64836a(View view) {
        if (view == null) {
            return C17900c.m64798a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f45096a);
        int[] iArr = this.f45096a;
        return C17900c.m64798a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.appodeal.processor.InterfaceC17888a
    /* renamed from: a */
    public void mo64835a(View view, JSONObject jSONObject, InterfaceC17888a.InterfaceC17889a interfaceC17889a, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m64833b(viewGroup, jSONObject, interfaceC17889a, z2);
            } else {
                m64834a(viewGroup, jSONObject, interfaceC17889a, z2);
            }
        }
    }

    /* renamed from: a */
    private void m64834a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC17888a.InterfaceC17889a interfaceC17889a, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC17889a.mo64744a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }
}
