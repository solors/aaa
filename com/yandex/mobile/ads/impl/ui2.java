package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.zh2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ui2 implements zh2 {

    /* renamed from: a */
    private final int[] f86291a = new int[2];

    @Override // com.yandex.mobile.ads.impl.zh2
    /* renamed from: a */
    public final JSONObject mo26161a(View view) {
        if (view == null) {
            return ki2.m32543a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f86291a);
        int[] iArr = this.f86291a;
        return ki2.m32543a(iArr[0], iArr[1], width, height);
    }

    @Override // com.yandex.mobile.ads.impl.zh2
    /* renamed from: a */
    public final void mo26160a(View view, JSONObject jSONObject, zh2.InterfaceC31993a interfaceC31993a, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            if (z) {
                HashMap hashMap = new HashMap();
                while (i < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i);
                    ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                    }
                    arrayList.add(childAt);
                    i++;
                }
                ArrayList arrayList2 = new ArrayList(hashMap.keySet());
                Collections.sort(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
                    while (it2.hasNext()) {
                        ((b22) interfaceC31993a).m35679a((View) it2.next(), this, jSONObject, z2);
                    }
                }
                return;
            }
            while (i < viewGroup.getChildCount()) {
                ((b22) interfaceC31993a).m35679a(viewGroup.getChildAt(i), this, jSONObject, z2);
                i++;
            }
        }
    }
}
