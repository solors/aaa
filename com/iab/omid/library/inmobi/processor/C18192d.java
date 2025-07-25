package com.iab.omid.library.inmobi.processor;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.processor.InterfaceC18188a;
import com.iab.omid.library.inmobi.utils.C18200c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.processor.d */
/* loaded from: classes6.dex */
public class C18192d implements InterfaceC18188a {

    /* renamed from: a */
    private final int[] f45725a = new int[2];

    @TargetApi(21)
    /* renamed from: b */
    private void m63670b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18188a.InterfaceC18189a interfaceC18189a, boolean z) {
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
                interfaceC18189a.mo63585a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.inmobi.processor.InterfaceC18188a
    /* renamed from: a */
    public JSONObject mo63673a(View view) {
        if (view == null) {
            return C18200c.m63636a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f45725a);
        int[] iArr = this.f45725a;
        return C18200c.m63636a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.inmobi.processor.InterfaceC18188a
    /* renamed from: a */
    public void mo63672a(View view, JSONObject jSONObject, InterfaceC18188a.InterfaceC18189a interfaceC18189a, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m63670b(viewGroup, jSONObject, interfaceC18189a, z2);
            } else {
                m63671a(viewGroup, jSONObject, interfaceC18189a, z2);
            }
        }
    }

    /* renamed from: a */
    private void m63671a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18188a.InterfaceC18189a interfaceC18189a, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC18189a.mo63585a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }
}
