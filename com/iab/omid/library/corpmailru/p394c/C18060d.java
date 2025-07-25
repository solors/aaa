package com.iab.omid.library.corpmailru.p394c;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.corpmailru.p394c.InterfaceC18056a;
import com.iab.omid.library.corpmailru.p395d.C18062b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.c.d */
/* loaded from: classes6.dex */
public class C18060d implements InterfaceC18056a {

    /* renamed from: a */
    private final int[] f45468a = new int[2];

    @TargetApi(21)
    /* renamed from: b */
    private void m64147b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18056a.InterfaceC18057a interfaceC18057a) {
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
                interfaceC18057a.mo64078a((View) it2.next(), this, jSONObject);
            }
        }
    }

    @Override // com.iab.omid.library.corpmailru.p394c.InterfaceC18056a
    /* renamed from: a */
    public JSONObject mo64150a(View view) {
        if (view == null) {
            return C18062b.m64141a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f45468a);
        int[] iArr = this.f45468a;
        return C18062b.m64141a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.corpmailru.p394c.InterfaceC18056a
    /* renamed from: a */
    public void mo64149a(View view, JSONObject jSONObject, InterfaceC18056a.InterfaceC18057a interfaceC18057a, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m64147b(viewGroup, jSONObject, interfaceC18057a);
            } else {
                m64148a(viewGroup, jSONObject, interfaceC18057a);
            }
        }
    }

    /* renamed from: a */
    private void m64148a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18056a.InterfaceC18057a interfaceC18057a) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC18057a.mo64078a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }
}
