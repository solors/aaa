package com.iab.omid.library.ironsrc.processor;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.ironsrc.processor.InterfaceC18246a;
import com.iab.omid.library.ironsrc.utils.C18257c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.processor.d */
/* loaded from: classes6.dex */
public class C18250d implements InterfaceC18246a {

    /* renamed from: a */
    private final int[] f45852a = new int[2];

    @TargetApi(21)
    /* renamed from: b */
    private void m63432b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18246a.InterfaceC18247a interfaceC18247a, boolean z) {
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
                interfaceC18247a.mo63350a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.ironsrc.processor.InterfaceC18246a
    /* renamed from: a */
    public JSONObject mo63435a(View view) {
        if (view == null) {
            return C18257c.m63398a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f45852a);
        int[] iArr = this.f45852a;
        return C18257c.m63398a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.ironsrc.processor.InterfaceC18246a
    /* renamed from: a */
    public void mo63434a(View view, JSONObject jSONObject, InterfaceC18246a.InterfaceC18247a interfaceC18247a, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m63432b(viewGroup, jSONObject, interfaceC18247a, z2);
            } else {
                m63433a(viewGroup, jSONObject, interfaceC18247a, z2);
            }
        }
    }

    /* renamed from: a */
    private void m63433a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18246a.InterfaceC18247a interfaceC18247a, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC18247a.mo63350a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }
}
