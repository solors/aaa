package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections._Collections;

/* renamed from: io.appmetrica.analytics.impl.qf */
/* loaded from: classes9.dex */
public final class C34833qf implements InterfaceC34725mf {

    /* renamed from: a */
    public final /* synthetic */ C34937uf f95225a;

    public C34833qf(C34937uf c34937uf) {
        this.f95225a = c34937uf;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34725mf
    @WorkerThread
    /* renamed from: a */
    public final void mo21079a() {
        List m17534m0;
        String str;
        boolean z;
        C34937uf c34937uf = this.f95225a;
        ArrayList arrayList = c34937uf.f95472g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C33896Ff c33896Ff = (C33896Ff) next;
            c34937uf.f95468c.getClass();
            if (c33896Ff != null) {
                str = c33896Ff.f92839a;
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                arrayList2.add(next);
            }
        }
        m17534m0 = _Collections.m17534m0(arrayList2);
        c34937uf.m20913a(c34937uf.f95468c.m22375a(m17534m0));
    }
}
