package com.iab.omid.library.bytedance2.processor;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.bytedance2.processor.InterfaceC18000a;
import com.iab.omid.library.bytedance2.utils.C18012c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance2.processor.d */
/* loaded from: classes6.dex */
public class C18004d implements InterfaceC18000a {

    /* renamed from: a */
    private final int[] f45347a = new int[2];

    @TargetApi(21)
    /* renamed from: b */
    private void m64373b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18000a.InterfaceC18001a interfaceC18001a, boolean z) {
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
                interfaceC18001a.mo64288a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.bytedance2.processor.InterfaceC18000a
    /* renamed from: a */
    public JSONObject mo64376a(View view) {
        if (view == null) {
            return C18012c.m64339a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f45347a);
        int[] iArr = this.f45347a;
        return C18012c.m64339a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.bytedance2.processor.InterfaceC18000a
    /* renamed from: a */
    public void mo64375a(View view, JSONObject jSONObject, InterfaceC18000a.InterfaceC18001a interfaceC18001a, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m64373b(viewGroup, jSONObject, interfaceC18001a, z2);
            } else {
                m64374a(viewGroup, jSONObject, interfaceC18001a, z2);
            }
        }
    }

    /* renamed from: a */
    private void m64374a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18000a.InterfaceC18001a interfaceC18001a, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC18001a.mo64288a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }
}
