package com.iab.omid.library.pubnativenet.processor;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.pubnativenet.processor.InterfaceC18517a;
import com.iab.omid.library.pubnativenet.utils.C18529c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubnativenet.processor.d */
/* loaded from: classes6.dex */
public class C18521d implements InterfaceC18517a {

    /* renamed from: a */
    private final int[] f46389a = new int[2];

    @TargetApi(21)
    /* renamed from: b */
    private void m62428b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18517a.InterfaceC18518a interfaceC18518a, boolean z) {
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
                interfaceC18518a.mo62339a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.pubnativenet.processor.InterfaceC18517a
    /* renamed from: a */
    public JSONObject mo62431a(View view) {
        if (view == null) {
            return C18529c.m62393a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f46389a);
        int[] iArr = this.f46389a;
        return C18529c.m62393a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.pubnativenet.processor.InterfaceC18517a
    /* renamed from: a */
    public void mo62430a(View view, JSONObject jSONObject, InterfaceC18517a.InterfaceC18518a interfaceC18518a, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m62428b(viewGroup, jSONObject, interfaceC18518a, z2);
            } else {
                m62429a(viewGroup, jSONObject, interfaceC18518a, z2);
            }
        }
    }

    /* renamed from: a */
    private void m62429a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18517a.InterfaceC18518a interfaceC18518a, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC18518a.mo62339a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }
}
