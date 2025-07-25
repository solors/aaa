package com.fyber.inneractive.sdk.util;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.fyber.inneractive.sdk.util.i */
/* loaded from: classes4.dex */
public final class C15451i {

    /* renamed from: a */
    public final ConcurrentLinkedQueue f30600a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public final InterfaceC15449h f30601b;

    public C15451i(int i, InterfaceC15449h interfaceC15449h) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f30600a.offer(interfaceC15449h.mo76503a());
        }
        this.f30601b = interfaceC15449h;
    }
}
