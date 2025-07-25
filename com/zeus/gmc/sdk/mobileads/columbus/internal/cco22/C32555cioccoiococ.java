package com.zeus.gmc.sdk.mobileads.columbus.internal.cco22;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cco22.InterfaceC32557coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32604c2oc2i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cco22.cioccoiococ */
/* loaded from: classes8.dex */
public class C32555cioccoiococ implements InterfaceC32557coo2iico {
    private final int[] coo2iico = new int[2];

    @TargetApi(21)
    private void coi222o222(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC32557coo2iico.InterfaceC32558coo2iico interfaceC32558coo2iico, boolean z) {
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
                interfaceC32558coo2iico.coo2iico((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cco22.InterfaceC32557coo2iico
    public JSONObject coo2iico(View view) {
        if (view == null) {
            return C32604c2oc2i.coo2iico(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.coo2iico);
        int[] iArr = this.coo2iico;
        return C32604c2oc2i.coo2iico(iArr[0], iArr[1], width, height);
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cco22.InterfaceC32557coo2iico
    public void coo2iico(View view, JSONObject jSONObject, InterfaceC32557coo2iico.InterfaceC32558coo2iico interfaceC32558coo2iico, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                coi222o222(viewGroup, jSONObject, interfaceC32558coo2iico, z2);
            } else {
                coo2iico(viewGroup, jSONObject, interfaceC32558coo2iico, z2);
            }
        }
    }

    private void coo2iico(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC32557coo2iico.InterfaceC32558coo2iico interfaceC32558coo2iico, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC32558coo2iico.coo2iico(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }
}
