package com.five_corp.p372ad.internal.system;

import com.five_corp.p372ad.C13611f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.five_corp.ad.internal.system.k */
/* loaded from: classes4.dex */
public final class RunnableC14104k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List f26313a;

    public RunnableC14104k(ArrayList arrayList) {
        this.f26313a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (InterfaceC14096c interfaceC14096c : this.f26313a) {
            ((C13611f) interfaceC14096c).m78533o();
        }
    }
}
