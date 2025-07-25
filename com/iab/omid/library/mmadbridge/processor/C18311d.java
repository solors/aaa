package com.iab.omid.library.mmadbridge.processor;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.mmadbridge.processor.InterfaceC18307a;
import com.iab.omid.library.mmadbridge.utils.C18319c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.processor.d */
/* loaded from: classes6.dex */
public class C18311d implements InterfaceC18307a {

    /* renamed from: a */
    private final int[] f45984a = new int[2];

    @TargetApi(21)
    /* renamed from: b */
    private void m63187b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18307a.InterfaceC18308a interfaceC18308a, boolean z) {
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
                interfaceC18308a.mo63098a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.mmadbridge.processor.InterfaceC18307a
    /* renamed from: a */
    public JSONObject mo63190a(View view) {
        if (view == null) {
            return C18319c.m63152a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f45984a);
        int[] iArr = this.f45984a;
        return C18319c.m63152a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.mmadbridge.processor.InterfaceC18307a
    /* renamed from: a */
    public void mo63189a(View view, JSONObject jSONObject, InterfaceC18307a.InterfaceC18308a interfaceC18308a, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m63187b(viewGroup, jSONObject, interfaceC18308a, z2);
            } else {
                m63188a(viewGroup, jSONObject, interfaceC18308a, z2);
            }
        }
    }

    /* renamed from: a */
    private void m63188a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18307a.InterfaceC18308a interfaceC18308a, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC18308a.mo63098a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }
}
