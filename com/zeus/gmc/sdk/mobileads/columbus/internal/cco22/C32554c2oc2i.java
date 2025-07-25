package com.zeus.gmc.sdk.mobileads.columbus.internal.cco22;

import android.view.View;
import androidx.annotation.NonNull;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.C32488c2oc2i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cco22.InterfaceC32557coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32604c2oc2i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32607c2oc2o;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32611ciii2coi2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.C32707coiic;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cco22.c2oc2i */
/* loaded from: classes8.dex */
public class C32554c2oc2i implements InterfaceC32557coo2iico {
    private final InterfaceC32557coo2iico coo2iico;

    public C32554c2oc2i(InterfaceC32557coo2iico interfaceC32557coo2iico) {
        this.coo2iico = interfaceC32557coo2iico;
    }

    @NonNull
    ArrayList<View> coo2iico() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C32488c2oc2i c2oc2i = C32488c2oc2i.c2oc2i();
        if (c2oc2i != null) {
            Collection<C32707coiic> coo2iico = c2oc2i.coo2iico();
            IdentityHashMap identityHashMap = new IdentityHashMap((coo2iico.size() * 2) + 3);
            for (C32707coiic c32707coiic : coo2iico) {
                View ciii2coi2 = c32707coiic.ciii2coi2();
                if (ciii2coi2 != null && C32611ciii2coi2.cii2c2(ciii2coi2) && (rootView = ciii2coi2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float cioccoiococ = C32611ciii2coi2.cioccoiococ(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C32611ciii2coi2.cioccoiococ(arrayList.get(size - 1)) > cioccoiococ) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cco22.InterfaceC32557coo2iico
    public JSONObject coo2iico(View view) {
        JSONObject coo2iico = C32604c2oc2i.coo2iico(0, 0, 0, 0);
        C32604c2oc2i.coo2iico(coo2iico, C32607c2oc2o.coo2iico());
        return coo2iico;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.cco22.InterfaceC32557coo2iico
    public void coo2iico(View view, JSONObject jSONObject, InterfaceC32557coo2iico.InterfaceC32558coo2iico interfaceC32558coo2iico, boolean z, boolean z2) {
        Iterator<View> it = coo2iico().iterator();
        while (it.hasNext()) {
            interfaceC32558coo2iico.coo2iico(it.next(), this.coo2iico, jSONObject, z2);
        }
    }
}
