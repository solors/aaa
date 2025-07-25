package com.iab.omid.library.unity3d.processor;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.unity3d.processor.InterfaceC18696a;
import com.iab.omid.library.unity3d.utils.C18708c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.processor.d */
/* loaded from: classes6.dex */
public class C18700d implements InterfaceC18696a {

    /* renamed from: a */
    private final int[] f46781a = new int[2];

    @TargetApi(21)
    /* renamed from: b */
    private void m61698b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18696a.InterfaceC18697a interfaceC18697a, boolean z) {
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
                interfaceC18697a.mo61616a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.unity3d.processor.InterfaceC18696a
    /* renamed from: a */
    public JSONObject mo61701a(View view) {
        if (view == null) {
            return C18708c.m61664a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f46781a);
        int[] iArr = this.f46781a;
        return C18708c.m61664a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.unity3d.processor.InterfaceC18696a
    /* renamed from: a */
    public void mo61700a(View view, JSONObject jSONObject, InterfaceC18696a.InterfaceC18697a interfaceC18697a, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m61698b(viewGroup, jSONObject, interfaceC18697a, z2);
            } else {
                m61699a(viewGroup, jSONObject, interfaceC18697a, z2);
            }
        }
    }

    /* renamed from: a */
    private void m61699a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18696a.InterfaceC18697a interfaceC18697a, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC18697a.mo61616a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }
}
