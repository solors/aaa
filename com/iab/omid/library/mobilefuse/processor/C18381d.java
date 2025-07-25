package com.iab.omid.library.mobilefuse.processor;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.mobilefuse.processor.InterfaceC18377a;
import com.iab.omid.library.mobilefuse.utils.C18389c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mobilefuse.processor.d */
/* loaded from: classes6.dex */
public class C18381d implements InterfaceC18377a {

    /* renamed from: a */
    private final int[] f46119a = new int[2];

    @TargetApi(21)
    /* renamed from: b */
    private void m62934b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18377a.InterfaceC18378a interfaceC18378a, boolean z) {
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
                interfaceC18378a.mo62845a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.mobilefuse.processor.InterfaceC18377a
    /* renamed from: a */
    public JSONObject mo62937a(View view) {
        if (view == null) {
            return C18389c.m62899a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f46119a);
        int[] iArr = this.f46119a;
        return C18389c.m62899a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.mobilefuse.processor.InterfaceC18377a
    /* renamed from: a */
    public void mo62936a(View view, JSONObject jSONObject, InterfaceC18377a.InterfaceC18378a interfaceC18378a, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m62934b(viewGroup, jSONObject, interfaceC18378a, z2);
            } else {
                m62935a(viewGroup, jSONObject, interfaceC18378a, z2);
            }
        }
    }

    /* renamed from: a */
    private void m62935a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC18377a.InterfaceC18378a interfaceC18378a, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC18378a.mo62845a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }
}
