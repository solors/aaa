package com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o;

import android.annotation.SuppressLint;
import android.view.View;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.C32707coiic;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.coi222o222 */
/* loaded from: classes8.dex */
public class C32498coi222o222 extends C32496cioccoiococ {
    @SuppressLint({"StaticFieldLeak"})
    private static C32498coi222o222 cioccoiococ = new C32498coi222o222();

    private C32498coi222o222() {
    }

    public static C32498coi222o222 cii2c2() {
        return cioccoiococ;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.C32496cioccoiococ
    public boolean cioccoiococ() {
        for (C32707coiic c32707coiic : C32488c2oc2i.c2oc2i().coo2iico()) {
            View ciii2coi2 = c32707coiic.ciii2coi2();
            if (ciii2coi2 != null && ciii2coi2.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.C32496cioccoiococ
    public void coi222o222(boolean z) {
        for (C32707coiic c32707coiic : C32488c2oc2i.c2oc2i().coi222o222()) {
            c32707coiic.c2oc2i().coo2iico(z);
        }
    }
}
