package com.iab.omid.library.bigosg.p388c;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.bigosg.p388c.InterfaceC17945a;
import com.iab.omid.library.bigosg.p389d.C17951b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bigosg.c.d */
/* loaded from: classes6.dex */
public class C17949d implements InterfaceC17945a {

    /* renamed from: a */
    private final int[] f45226a = new int[2];

    @TargetApi(21)
    /* renamed from: b */
    private void m64597b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC17945a.InterfaceC17946a interfaceC17946a) {
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
                interfaceC17946a.mo64528a((View) it2.next(), this, jSONObject);
            }
        }
    }

    @Override // com.iab.omid.library.bigosg.p388c.InterfaceC17945a
    /* renamed from: a */
    public JSONObject mo64600a(View view) {
        if (view == null) {
            return C17951b.m64591a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f45226a);
        int[] iArr = this.f45226a;
        return C17951b.m64591a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.bigosg.p388c.InterfaceC17945a
    /* renamed from: a */
    public void mo64599a(View view, JSONObject jSONObject, InterfaceC17945a.InterfaceC17946a interfaceC17946a, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m64597b(viewGroup, jSONObject, interfaceC17946a);
            } else {
                m64598a(viewGroup, jSONObject, interfaceC17946a);
            }
        }
    }

    /* renamed from: a */
    private void m64598a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC17945a.InterfaceC17946a interfaceC17946a) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC17946a.mo64528a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }
}
