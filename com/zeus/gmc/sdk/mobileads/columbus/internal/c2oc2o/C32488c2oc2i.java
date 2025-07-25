package com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o;

import com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.C32707coiic;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.c2oc2i */
/* loaded from: classes8.dex */
public class C32488c2oc2i {
    private static C32488c2oc2i c2oc2i = new C32488c2oc2i();
    private final ArrayList<C32707coiic> coo2iico = new ArrayList<>();
    private final ArrayList<C32707coiic> coi222o222 = new ArrayList<>();

    private C32488c2oc2i() {
    }

    public static C32488c2oc2i c2oc2i() {
        return c2oc2i;
    }

    public boolean cioccoiococ() {
        if (this.coi222o222.size() > 0) {
            return true;
        }
        return false;
    }

    public Collection<C32707coiic> coi222o222() {
        return Collections.unmodifiableCollection(this.coo2iico);
    }

    public Collection<C32707coiic> coo2iico() {
        return Collections.unmodifiableCollection(this.coi222o222);
    }

    public void c2oc2i(C32707coiic c32707coiic) {
        boolean cioccoiococ = cioccoiococ();
        this.coi222o222.add(c32707coiic);
        if (cioccoiococ) {
            return;
        }
        C32499coiic.c2oc2i().cioccoiococ();
    }

    public void coi222o222(C32707coiic c32707coiic) {
        boolean cioccoiococ = cioccoiococ();
        this.coo2iico.remove(c32707coiic);
        this.coi222o222.remove(c32707coiic);
        if (!cioccoiococ || cioccoiococ()) {
            return;
        }
        C32499coiic.c2oc2i().c2oc2o();
    }

    public void coo2iico(C32707coiic c32707coiic) {
        this.coo2iico.add(c32707coiic);
    }
}
